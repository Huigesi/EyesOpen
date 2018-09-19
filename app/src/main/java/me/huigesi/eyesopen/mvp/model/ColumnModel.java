package me.huigesi.eyesopen.mvp.model;

import android.app.Application;
import android.util.Log;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import me.huigesi.eyesopen.app.App;
import me.huigesi.eyesopen.app.column.NewsChannelTableDao;
import me.huigesi.eyesopen.mvp.contract.ColumnContract;
import me.huigesi.eyesopen.mvp.model.entity.Column;
import rx.Subscriber;


@ActivityScope
public class ColumnModel extends BaseModel implements ColumnContract.Model {
    private static final String TAG = "ColumnModel";
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public ColumnModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable columnDbOperate(String columnName, Boolean selectState) {

        return Observable.create(new ObservableOnSubscribe<Map<Boolean, List<Column>>>() {
            @Override
            public void subscribe(ObservableEmitter<Map<Boolean, List<Column>>> subscriber) throws Exception {

                final NewsChannelTableDao dao = ((App) App.getContext())
                        .getDaoSession().getNewsChannelTableDao();

                if (selectState == null) {
                    // 初始化
                    //KLog.e("初始化取出选中的频道");
                    Log.i(TAG, "subscribe: 初始化取出选中的频道");
                    HashMap<Boolean, List<Column>> map = new HashMap<>();
                    map.put(true, dao.queryBuilder()
                            .where(NewsChannelTableDao.Properties.NewsChannelSelect
                                    .eq(true))
                            .orderAsc(NewsChannelTableDao.Properties.NewsChannelIndex)
                            .build().list());
                    map.put(false, dao.queryBuilder()
                            .where(NewsChannelTableDao.Properties.NewsChannelSelect
                                    .eq(false))
                            .orderAsc(NewsChannelTableDao.Properties.NewsChannelIndex)
                            .build().list());

                    // 只把数据传回去，不调用complete的原因是让RecyclerView把标题位置往下挪完自行关掉
                    subscriber.onNext(map);
                } else {

                    // 因为名称是唯一的查到即更新其选中状态即可

                    if (selectState) {
                        //KLog.e("做增操作: " + channelName + ";" + selectState);
                        Log.i(TAG, "做增操作: " + columnName + ";" + selectState);
                        // 找到它的信息
                        final Column table = dao.queryBuilder().where(NewsChannelTableDao.Properties.NewsChannelName.eq(columnName)).unique();
                        Log.i(TAG, "subscribe: "+dao.queryBuilder().where(NewsChannelTableDao.Properties.NewsChannelName.eq(columnName)).uniqueOrThrow()/*.unique()*/);
                        // 它原来的位置
                        final int originPos = table.getNewsColumnIndex();

                        // 得到现在应该所处位置
                        final long toPos = dao.queryBuilder()
                                .where(NewsChannelTableDao.Properties.NewsChannelSelect
                                        .eq(true)).buildCount().count();

                        // gt大于   lt小于   ge大于等于   le 小于等于

                        // 找到比它位置小的没被选中的
                        final List<Column> smallChannelTables = dao.queryBuilder()
                                .where(NewsChannelTableDao.Properties.NewsChannelIndex
                                                .lt(originPos),
                                        NewsChannelTableDao.Properties.NewsChannelSelect
                                                .eq(false)).build().list();
                        for (Column s : smallChannelTables) {
                            s.setNewsColumnIndex(s.getNewsColumnIndex() + 1);
                            dao.update(s);
                        }

                        // 更新它
                        table.setNewsColumnSelect(true);
                        table.setNewsColumnIndex((int) toPos);

                        dao.update(table);

                    } else {
                        //KLog.e("做删操作: " + channelName + ";" + selectState);
                        Log.i(TAG, "做删操作: " + columnName + ";" + selectState);
                        // 找到它的信息
                        final Column table = dao.queryBuilder()
                                .where(NewsChannelTableDao.Properties.NewsChannelName
                                        .eq(columnName)).unique();

                        // 它原来的位置
                        final int originPos = table.getNewsColumnIndex();

                        // 得到现在应该所处位置，就是末尾
                        final int nowPos = dao.loadAll().size() - 1;

                        // 未选中的
                        final List<Column> unSelectChannels = dao.queryBuilder()
                                .where(NewsChannelTableDao.Properties.NewsChannelSelect
                                        .eq(false)).build().list();
                        // 位置全部减1
                        for (Column s : unSelectChannels) {
                            s.setNewsColumnIndex(s.getNewsColumnIndex() - 1);
                            dao.update(s);
                        }

                        // 选中的并且比它位置大的
                        final List<Column> bigChannels = dao.queryBuilder()
                                .where(NewsChannelTableDao.Properties.NewsChannelSelect
                                                .eq(true),
                                        NewsChannelTableDao.Properties.NewsChannelIndex
                                                .gt(originPos)).build().list();
                        // 位置全部减1
                        for (Column b : bigChannels) {
                            b.setNewsColumnIndex(b.getNewsColumnIndex() - 1);
                            dao.update(b);
                        }


                        // 更新它
                        table.setNewsColumnSelect(false);
                        table.setNewsColumnIndex(nowPos);

                        dao.update(table);

                    }

                    // 只做数据库操作，不关心结果直接调用完成
                    subscriber.onComplete();
                }

            }
        });
    }

    @Override
    public Observable columnDbSwap(int fromPos, int toPos) {
        return  Observable.create(new ObservableOnSubscribe<Map<Boolean, List<Column>>>() {
            @Override
            public void subscribe(ObservableEmitter<Map<Boolean, List<Column>>> subscriber) throws Exception {

                final NewsChannelTableDao dao = ((App) App.getContext())
                        .getDaoSession().getNewsChannelTableDao();

                // 交换前此位置对应的频道
                final Column fromChannel = dao.queryBuilder()
                        .where(NewsChannelTableDao.Properties.NewsChannelIndex.eq(fromPos))
                        .unique();

                final int fromPosition = fromChannel.getNewsColumnIndex();

                // 交换前此位置将要去的对应的频道
                final Column toChannel = dao.queryBuilder()
                        .where(NewsChannelTableDao.Properties.NewsChannelIndex.eq(toPos)).unique();

                final int toPosition = toChannel.getNewsColumnIndex();

                if (Math.abs(fromPosition - toPosition) == 1) {
                    // 相邻的交换，只需要调整两个位置即可
                    //KLog.e("相邻的交换，只需要调整两个位置即可");
                    Log.i(TAG, "相邻的交换，只需要调整两个位置即可");
                    fromChannel.setNewsColumnIndex(toPosition);
                    toChannel.setNewsColumnIndex(fromPosition);
                    dao.update(fromChannel);
                    dao.update(toChannel);
                } else if (fromPosition - toPosition > 0) {
                    //  开始的位置大于要去的位置,往前移
                    //KLog.e("开始的位置大于要去的位置,往前移");
                    Log.i(TAG, "开始的位置大于要去的位置,往前移");
                    final List<Column> moveChannels = dao.queryBuilder()
                            .where(NewsChannelTableDao.Properties.NewsChannelIndex
                                    .between(toPosition, fromPosition - 1)).build().list();
                    // 全部加一
                    for (Column c : moveChannels) {
                        c.setNewsColumnIndex(c.getNewsColumnIndex() + 1);
                        dao.update(c);
                    }
                    fromChannel.setNewsColumnIndex(toPosition);
                    dao.update(fromChannel);
                } else if (fromPosition - toPosition < 0) {
                    //  开始的位置小于要去的位置,往后移
                    //KLog.e("开始的位置小于要去的位置,往后移: " + toPosition + ";" + fromPosition);
                    Log.i(TAG, "开始的位置小于要去的位置,往后移: " + toPosition + ";" + fromPosition);
                    final List<Column> moveChannels = dao.queryBuilder()
                            .where(NewsChannelTableDao.Properties.NewsChannelIndex
                                    .between(fromPosition + 1, toPosition)).build().list();
                   // KLog.e(moveChannels.size());
                    Log.i(TAG, "subscribe: "+moveChannels.size());
                    // 全部减一
                    for (Column c : moveChannels) {
                        c.setNewsColumnIndex(c.getNewsColumnIndex() - 1);
                        dao.update(c);
                    }
                    fromChannel.setNewsColumnIndex(toPosition);
                    dao.update(fromChannel);
                }

                subscriber.onComplete();

            }
        });
    }
}