package me.huigesi.eyesopen.mvp.presenter;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.entity.NbaZhuanti;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import me.huigesi.eyesopen.mvp.contract.NbaZhuanTiContract;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import me.jessyan.rxerrorhandler.handler.RetryWithDelay;


@ActivityScope
public class NbaZhuanTiPresenter extends BasePresenter<NbaZhuanTiContract.Model, NbaZhuanTiContract.View> {
    RxErrorHandler mErrorHandler;
    Application mApplication;
    ImageLoader mImageLoader;
    AppManager mAppManager;

    @Inject
    public NbaZhuanTiPresenter(NbaZhuanTiContract.Model model, NbaZhuanTiContract.View rootView,
                               RxErrorHandler handler, AppManager appManager, Application application) {
        super(model, rootView);
        mErrorHandler=handler;
        mAppManager=appManager;
        mApplication=application;
    }

    public void requestZhuanTi(String nid) {
        Map<String, String> map = new HashMap<>();
        map.put("client", Api.HUPU_CLIENT_ID);
        map.put("nid", nid);
        mModel.getNbaZhuanTi(map)
                .subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 2))
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ErrorHandleSubscriber<NbaZhuanti>(mErrorHandler) {
                    @Override
                    public void onNext(NbaZhuanti nbaZhuanti) {
                        mRootView.showData(nbaZhuanti);
                    }
                });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }
}
