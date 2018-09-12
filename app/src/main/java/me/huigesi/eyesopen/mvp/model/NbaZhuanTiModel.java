package me.huigesi.eyesopen.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import me.huigesi.eyesopen.mvp.contract.NbaZhuanTiContract;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.api.service.NbaService;
import me.huigesi.eyesopen.mvp.model.entity.NbaZhuanti;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;


@ActivityScope
public class NbaZhuanTiModel extends BaseModel implements NbaZhuanTiContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public NbaZhuanTiModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<NbaZhuanti> getNbaZhuanTi(Map<String, String> map) {
        RetrofitUrlManager.getInstance().putDomain("weibo", Api.WEIBO_HOST);
        Observable<NbaZhuanti> zhuantiObservable = mRepositoryManager
                .obtainRetrofitService(NbaService.class)
                .getNbaZhuanTi(map);
        return zhuantiObservable;
    }
}