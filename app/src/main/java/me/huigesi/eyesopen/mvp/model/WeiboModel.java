package me.huigesi.eyesopen.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.FragmentScope;

import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import me.huigesi.eyesopen.mvp.contract.WeiboContract;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.api.service.WeiboService;
import me.huigesi.eyesopen.mvp.model.entity.WeiboNews;
import me.huigesi.eyesopen.mvp.model.entity.WeiboUserInfo;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;


@FragmentScope
public class WeiboModel extends BaseModel implements WeiboContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public WeiboModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<WeiboNews> getWeiboNews(Map<String, String> params) {
        RetrofitUrlManager.getInstance().putDomain("weibo", Api.WEIBO_HOST);
        Observable<WeiboNews> weiboNewsObservable = mRepositoryManager
                .obtainRetrofitService(WeiboService.class)
                .getWeiBoNews(params);
        return weiboNewsObservable;
    }

    @Override
    public Observable<WeiboUserInfo> getGsid(String c, String s, String user, String password) {
        RetrofitUrlManager.getInstance().putDomain("weibo",Api.WEIBO_HOST);
        Observable<WeiboUserInfo> weiboUserInfoObservable = mRepositoryManager
                .obtainRetrofitService(WeiboService.class)
                .WeiboLogin(c, s, user, password);
        return weiboUserInfoObservable;
    }
}