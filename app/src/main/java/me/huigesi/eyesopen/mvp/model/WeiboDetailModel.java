package me.huigesi.eyesopen.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.FragmentScope;

import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import me.huigesi.eyesopen.mvp.contract.WeiboDetailContract;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.api.service.WeiboService;
import me.huigesi.eyesopen.mvp.model.entity.WeiboDetail;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;


@FragmentScope
public class WeiboDetailModel extends BaseModel implements WeiboDetailContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public WeiboDetailModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<WeiboDetail> getWeiboDetail(Map<String, String> params) {
        RetrofitUrlManager.getInstance().putDomain("weibo", Api.WEIBO_HOST);
        Observable<WeiboDetail> weiboDetailObservable = mRepositoryManager
                .obtainRetrofitService(WeiboService.class)
                .getWeiBoDetail(params);
        return weiboDetailObservable;
    }
}