package me.huigesi.eyesopen.mvp.model;

import android.app.Application;
import android.util.Log;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;
import com.me.greendao.gen.ColumnDao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import me.huigesi.eyesopen.app.App;
import me.huigesi.eyesopen.mvp.contract.ColumnContract;
import me.huigesi.eyesopen.mvp.model.entity.Column;


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

                final ColumnDao dao = ((App) App.getContext())
                        .getDaoSession().getColumnDao();

                if (selectState == null) {
                    // 初始化
                    //KLog.e("初始化取出选中的频道");
                    Log.i(TAG, "subscribe: 初始化取出选中的频道");
                    HashMap<Boolean, List<Column>> map = new HashMap<>();
                    map.put(true, dao.queryBuilder()
                            .where(ColumnDao.Properties.Select
                                    .eq(true))
                            .orderAsc(ColumnDao.Properties.Index)
                            .build().list());
                    map.put(false, dao.queryBuilder()
                            .where(ColumnDao.Properties.Select
                                    .eq(false))
                            .orderAsc(ColumnDao.Properties.Index)
                            .build().list());

                    // 只把数据传回去，不调用complete的原因是让RecyclerView把标题位置往下挪完自行关掉
                    subscriber.onNext(map);
                } else {

                    // 因为名称是唯一的查到即更新其选中状态即可

                    if (selectState) {
                        //KLog.e("做增操作: " + channelName + ";" + selectState);
                        Log.i(TAG, "做增操作: " + columnName + ";" + selectState);
                        List<Column> columnList = dao.queryBuilder()
                                .where(ColumnDao.Properties.Name
                                        .eq(columnName)).list();
                        Log.i(TAG, "subscribe: " + columnList.size());
                        // 找到它的信息
                        final Column table = dao.queryBuilder().where(
                                ColumnDao.Properties.Name.eq(columnName)).unique();
                        // 它原来的位置
                        final int originPos = table.getIndex();

                        // 得到现在应该所处位置
                        final long toPos = dao.queryBuilder()
                                .where(ColumnDao.Properties.Select
                                        .eq(true)).buildCount().count();

                        // gt大于   lt小于   ge大于等于   le 小于等于

                        // 找到比它位置小的没被选中的
                        final List<Column> smallChannelTables = dao.queryBuilder()
                                .where(ColumnDao.Properties.Index
                                                .lt(originPos),
                                        ColumnDao.Properties.Select
                                                .eq(false)).build().list();
                        for (Column s : smallChannelTables) {
                            s.setIndex(s.getIndex() + 1);
                            dao.update(s);
                        }

                        // 更新它
                        table.setSelect(true);
                        table.setIndex((int) toPos);

                        dao.update(table);

                    } else {
                        //KLog.e("做删操作: " + channelName + ";" + selectState);
                        Log.i(TAG, "做删操作: " + columnName + ";" + selectState);
                        // 找到它的信息
                        final Column table = dao.queryBuilder()
                                .where(ColumnDao.Properties.Name
                                        .eq(columnName)).unique();

                        // 它原来的位置
                        final int originPos = table.getIndex();

                        // 得到现在应该所处位置，就是末尾
                        final int nowPos = dao.loadAll().size() - 1;

                        // 未选中的
                        final List<Column> unSelectChannels = dao.queryBuilder()
                                .where(ColumnDao.Properties.Select
                                        .eq(false)).build().list();
                        // 位置全部减1
                        for (Column s : unSelectChannels) {
                            s.setIndex(s.getIndex() - 1);
                            dao.update(s);
                        }

                        // 选中的并且比它位置大的
                        final List<Column> bigChannels = dao.queryBuilder()
                                .where(ColumnDao.Properties.Select
                                                .eq(true),
                                        ColumnDao.Properties.Index
                                                .gt(originPos)).build().list();
                        // 位置全部减1
                        for (Column b : bigChannels) {
                            b.setIndex(b.getIndex() - 1);
                            dao.update(b);
                        }


                        // 更新它
                        table.setSelect(false);
                        table.setIndex(nowPos);

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
        return Observable.create(new ObservableOnSubscribe<Map<Boolean, List<Column>>>() {
            @Override
            public void subscribe(ObservableEmitter<Map<Boolean, List<Column>>> subscriber) throws Exception {

                final ColumnDao dao = ((App) App.getContext())
                        .getDaoSession().getColumnDao();

                // 交换前此位置对应的频道
                final Column fromChannel = dao.queryBuilder()
                        .where(ColumnDao.Properties.Index.eq(fromPos),
                                ColumnDao.Properties.Select.eq(true))
                        .unique();

                final int fromPosition = fromChannel.getIndex();

                // 交换前此位置将要去的对应的频道
                final Column toChannel = dao.queryBuilder()
                        .where(ColumnDao.Properties.Index.eq(toPos),
                                ColumnDao.Properties.Select.eq(true))
                        .unique();

                final int toPosition = toChannel.getIndex();

                if (Math.abs(fromPosition - toPosition) == 1) {
                    // 相邻的交换，只需要调整两个位置即可
                    //KLog.e("相邻的交换，只需要调整两个位置即可");
                    Log.i(TAG, "相邻的交换，只需要调整两个位置即可");
                    fromChannel.setIndex(toPosition);
                    toChannel.setIndex(fromPosition);
                    dao.update(fromChannel);
                    dao.update(toChannel);
                } else if (fromPosition - toPosition > 0) {
                    //  开始的位置大于要去的位置,往前移
                    Log.i(TAG, "开始的位置大于要去的位置,往前移");
                    final List<Column> moveChannels = dao.queryBuilder()
                            .where(ColumnDao.Properties.Index
                                    .between(toPosition, fromPosition - 1)).build().list();
                    // 全部加一
                    for (Column c : moveChannels) {
                        c.setIndex(c.getIndex() + 1);
                        dao.update(c);
                    }
                    fromChannel.setIndex(toPosition);
                    dao.update(fromChannel);
                } else if (fromPosition - toPosition < 0) {
                    //  开始的位置小于要去的位置,往后移
                    Log.i(TAG, "开始的位置小于要去的位置,往后移: " + toPosition + ";" + fromPosition);
                    final List<Column> moveChannels = dao.queryBuilder()
                            .where(ColumnDao.Properties.Index
                                    .between(fromPosition + 1, toPosition)).build().list();
                    Log.i(TAG, "subscribe: " + moveChannels.size());
                    // 全部减一
                    for (Column c : moveChannels) {
                        c.setIndex(c.getIndex() - 1);
                        dao.update(c);
                    }
                    fromChannel.setIndex(toPosition);
                    dao.update(fromChannel);
                }

                subscriber.onComplete();

            }
        });
    }
}