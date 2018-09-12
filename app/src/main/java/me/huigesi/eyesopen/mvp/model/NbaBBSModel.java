package me.huigesi.eyesopen.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.FragmentScope;

import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import me.huigesi.eyesopen.mvp.contract.NbaBBSContract;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.api.service.NbaService;
import me.huigesi.eyesopen.mvp.model.entity.NbaBBSComment;
import me.huigesi.eyesopen.mvp.model.entity.NbaBBSLightComment;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;


@FragmentScope
public class NbaBBSModel extends BaseModel implements NbaBBSContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public NbaBBSModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<NbaBBSComment> getBBSComment(Map<String, String> map) {
        RetrofitUrlManager.getInstance().putDomain("hupubbs", Api.HUPU_BBS_HOST);
        Observable<NbaBBSComment> nbaCommentObservable=mRepositoryManager
                .obtainRetrofitService(NbaService.class)
                .getsThreadReplyList(map);
        return nbaCommentObservable;
    }

    @Override
    public Observable<NbaBBSLightComment> getBBSLightComment(Map<String, String> map) {
        RetrofitUrlManager.getInstance().putDomain("hupubbs", Api.HUPU_BBS_HOST);
        Observable<NbaBBSLightComment> lightCommentObservable = mRepositoryManager
                .obtainRetrofitService(NbaService.class)
                .getThreadLightReplyList(map);
        return lightCommentObservable;
    }
}