package me.huigesi.eyesopen.mvp.model;

import android.app.Application;
import android.nfc.Tag;
import android.util.Log;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.FragmentScope;

import org.greenrobot.greendao.query.Query;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.App;
import me.huigesi.eyesopen.app.column.NewsChannelTableDao;
import me.huigesi.eyesopen.app.utils.SPreUtils;
import me.huigesi.eyesopen.mvp.contract.News163Contract;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.entity.Column;


@FragmentScope
public class News163Model extends BaseModel implements News163Contract.Model {
    private static final String TAG = "News163Model";
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public News163Model(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable operateChannelDb() {
        return Observable.create(new ObservableOnSubscribe<List<Column>>() {
            @Override
            public void subscribe(ObservableEmitter<List<Column>> emitter) throws Exception {
                Log.i(TAG, "subscribe: "+((App) App.getContext()).getDaoSession().toString());
                final NewsChannelTableDao dao = ((App) App.getContext()).getDaoSession()
                        .getNewsChannelTableDao();
                Log.e(TAG,"初始化了数据库了吗？ " + SPreUtils.readBoolean("initDb"));
                if (!SPreUtils.readBoolean("initDb")) {

                    List<String> channelName = Arrays.asList(App.getContext().getResources()
                            .getStringArray(R.array.news_channel));

                    List<String> channelId = Arrays.asList(App.getContext().getResources()
                            .getStringArray(R.array.news_channel_id));

                    for (int i = 0; i < channelName.size(); i++) {
                        Column table = new Column(channelName.get(i),
                                channelId.get(i), Api.getType(channelId.get(i)), i <= 2,
                                // 前三是固定死的，默认选中状态
                                i, i <= 2);
                        dao.insert(table);
                    }
                    SPreUtils.writeBoolean("initDb", true);
                    Log.i(TAG, "数据库初始化完毕！ ");
                }

                final Query<Column> build = dao.queryBuilder()
                        .where(NewsChannelTableDao.Properties.NewsChannelSelect.eq(true))
                        .orderAsc(NewsChannelTableDao.Properties.NewsChannelIndex).build();
                emitter.onNext(build.list());
                emitter.onComplete();
            }
        });
    }
}