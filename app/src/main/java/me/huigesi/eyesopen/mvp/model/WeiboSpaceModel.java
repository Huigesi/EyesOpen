package me.huigesi.eyesopen.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import me.huigesi.eyesopen.mvp.contract.WeiboSpaceContract;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.api.service.WeiboService;
import me.huigesi.eyesopen.mvp.model.entity.WeiboNews;
import me.huigesi.eyesopen.mvp.model.entity.WeiboUserSpace;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;

import static me.huigesi.eyesopen.app.utils.GsonUtils.setGsonAdapter;


@ActivityScope
public class WeiboSpaceModel extends BaseModel implements WeiboSpaceContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public WeiboSpaceModel(IRepositoryManager repositoryManager) {
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
        mGson=setGsonAdapter();
        RetrofitUrlManager.getInstance().putDomain("weibo", Api.WEIBO_HOST);
        Observable<WeiboNews> weiboNewsObservable = mRepositoryManager
                .obtainRetrofitService(WeiboService.class)
                .getWeiBoNews(params);
        return weiboNewsObservable;
    }

    @Override
    public Observable<WeiboUserSpace> getHeader(Map<String, String> params) {
        mGson=setGsonAdapter();
        RetrofitUrlManager.getInstance().putDomain("weibo", Api.WEIBO_HOST);
        Observable<WeiboUserSpace> weiboUserObservable = mRepositoryManager
                .obtainRetrofitService(WeiboService.class)
                .getWeiboUserHead(params);
        return weiboUserObservable;
    }
}