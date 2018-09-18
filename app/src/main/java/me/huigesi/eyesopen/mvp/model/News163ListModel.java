package me.huigesi.eyesopen.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.FragmentScope;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import me.huigesi.eyesopen.mvp.contract.News163ListContract;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.api.service.News163Service;
import me.huigesi.eyesopen.mvp.model.entity.News163;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;


@FragmentScope
public class News163ListModel extends BaseModel implements News163ListContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public News163ListModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<Map<String, List<News163>>> getNews163(String type, String id, int startPage) {
        RetrofitUrlManager.getInstance().putDomain("news163", Api.NEWS_HOST);
        Observable<Map<String, List<News163>>> observable = mRepositoryManager
                .obtainRetrofitService(News163Service.class)
                .getNews(type, id, startPage);
        return observable;
    }
}