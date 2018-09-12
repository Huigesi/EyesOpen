package me.huigesi.eyesopen.mvp.presenter;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.utils.RxLifecycleUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.entity.NbaBBSComment;
import me.huigesi.eyesopen.mvp.model.entity.NbaBBSLightComment;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import me.huigesi.eyesopen.mvp.contract.NbaBBSContract;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import me.jessyan.rxerrorhandler.handler.RetryWithDelay;


@FragmentScope
public class NbaBBSPresenter extends BasePresenter<NbaBBSContract.Model, NbaBBSContract.View> {

    RxErrorHandler mErrorHandler;
    Application mApplication;
    ImageLoader mImageLoader;
    AppManager mAppManager;
    private int mPage = 1;

    @Inject
    public NbaBBSPresenter(NbaBBSContract.Model model, NbaBBSContract.View rootView,
                           RxErrorHandler handler, AppManager appManager, Application application) {
        super(model, rootView);
        mErrorHandler = handler;
        mApplication = application;
        mAppManager = appManager;
    }

    public void requestBBSComment(String tid, boolean pullToRefresh) {
        if (pullToRefresh) {
            mPage = 1;
        }else {
            mPage++;
        }
        Map<String, String> map = new HashMap<>();
        map.put("page", String.valueOf(mPage));
        map.put("tid", tid);
        map.put("client", Api.HUPU_CLIENT_ID);
        mModel.getBBSComment(map)
                .subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 2))
                .doOnSubscribe(disposable -> {
                    if (pullToRefresh)
                        mRootView.showLoading();//显示下拉刷新的进度条
                }).subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                    if (pullToRefresh)
                        mRootView.hideLoading();//隐藏下拉刷新的进度条
                    else
                        mRootView.endLoadMore();//隐藏上拉加载更多的进度条
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<NbaBBSComment>(mErrorHandler) {
                    @Override
                    public void onNext(NbaBBSComment nbaBBSComment) {
                        if (pullToRefresh)
                            mRootView.showCommentData(nbaBBSComment);
                        else
                            mRootView.showCommentMoreData(nbaBBSComment);
                    }
                });
    }

    public void requestLightBBSComment(String tid, boolean pullToRefresh) {
        if (pullToRefresh) {
            mPage = 1;
        }
        Map<String, String> map = new HashMap<>();
        map.put("page", String.valueOf(mPage));
        map.put("tid", tid);
        map.put("client", Api.HUPU_CLIENT_ID);
        mModel.getBBSLightComment(map)
                .subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 2))
                .doOnSubscribe(disposable -> {
                    if (pullToRefresh)
                        mRootView.showLoading();//显示下拉刷新的进度条
                }).subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                    if (pullToRefresh)
                        mRootView.hideLoading();//隐藏下拉刷新的进度条
                    else
                        mRootView.endLoadMore();//隐藏上拉加载更多的进度条
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<NbaBBSLightComment>(mErrorHandler) {
                    @Override
                    public void onNext(NbaBBSLightComment nbaBBSComment) {
                            mRootView.showLightCommentData(nbaBBSComment);
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
