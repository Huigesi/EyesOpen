package me.huigesi.eyesopen.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.FragmentScope;

import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import me.huigesi.eyesopen.mvp.contract.NbaDetailContract;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.api.service.NbaService;
import me.huigesi.eyesopen.mvp.model.entity.NbaNewsComment;
import me.huigesi.eyesopen.mvp.model.entity.NbaNewsDetail;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;


@FragmentScope
public class NbaDetailModel extends BaseModel implements NbaDetailContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public NbaDetailModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<NbaNewsDetail> getNbaDetail(Map<String, String> params) {
        RetrofitUrlManager.getInstance().putDomain("nba", Api.HUPU_HOST);
        Observable<NbaNewsDetail> nbadetailObservable=mRepositoryManager
                .obtainRetrofitService(NbaService.class)
                .getNbaNewsDetail(params);
        return nbadetailObservable;
    }

    @Override
    public Observable<NbaNewsComment> getComment(Map<String, String> params) {
        RetrofitUrlManager.getInstance().putDomain("nba", Api.HUPU_HOST);
        Observable<NbaNewsComment> nbaCommentObservable=mRepositoryManager
                .obtainRetrofitService(NbaService.class)
                .getNbaComment(params);
        return nbaCommentObservable;
    }
}