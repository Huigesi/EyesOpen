package me.huigesi.eyesopen.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.FragmentScope;

import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.rx_cache2.DynamicKey;
import io.rx_cache2.EvictDynamicKey;
import me.huigesi.eyesopen.mvp.contract.NbaContract;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.api.cache.CommonCache;
import me.huigesi.eyesopen.mvp.model.api.service.NbaService;
import me.huigesi.eyesopen.mvp.model.entity.NbaNews;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;


@FragmentScope
public class NbaModel extends BaseModel implements NbaContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public NbaModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<NbaNews> getNbaNews(Map<String, String> params, String nid, boolean update) {
        RetrofitUrlManager.getInstance().putDomain("nba", Api.HUPU_HOST);
        Observable<NbaNews> nbaNewsObservable=mRepositoryManager
                .obtainRetrofitService(NbaService.class)
                .getNbaNews(params);
        return nbaNewsObservable;
        /*return Observable.just(mRepositoryManager
                .obtainRetrofitService(NbaService.class)
                .getNbaNews(params))
                .flatMap(new Function<Observable<NbaNews>, ObservableSource<NbaNews>>() {
                    @Override
                    public ObservableSource<NbaNews> apply(Observable<NbaNews> nbaNewsObservable) throws Exception {
                        return mRepositoryManager.obtainCacheService(CommonCache.class)
                                .getNbaNews(nbaNewsObservable
                                        , new DynamicKey(nid)
                                        , new EvictDynamicKey(update))
                                .map(listReply -> listReply.getData());
                    }
                });*/
    }
}