package me.huigesi.eyesopen.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.FragmentScope;

import javax.inject.Inject;

import me.huigesi.eyesopen.mvp.contract.NbaContract;


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
}