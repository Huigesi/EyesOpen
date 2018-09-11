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
import me.huigesi.eyesopen.mvp.model.entity.NbaNewsComment;
import me.huigesi.eyesopen.mvp.model.entity.NbaNewsDetail;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import me.huigesi.eyesopen.mvp.contract.NbaDetailContract;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import me.jessyan.rxerrorhandler.handler.RetryWithDelay;


@FragmentScope
public class NbaDetailPresenter extends BasePresenter<NbaDetailContract.Model, NbaDetailContract.View> {

    RxErrorHandler mErrorHandler;
    Application mApplication;
    ImageLoader mImageLoader;
    AppManager mAppManager;
    public String mNcid, mCreateTime;
    private boolean isFirst = true;

    @Inject
    public NbaDetailPresenter(NbaDetailContract.Model model, NbaDetailContract.View rootView
            , RxErrorHandler handler, AppManager appManager, Application application) {
        super(model, rootView);
        mErrorHandler = handler;
        mApplication = application;
        mAppManager = appManager;
    }

    public void getNbaHeader(String nid) {
        Map<String, String> map = new HashMap<>();
        map.put("client", Api.HUPU_CLIENT_ID);
        map.put("nid", nid);
        mModel.getNbaDetail(map)
                .subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 2))
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ErrorHandleSubscriber<NbaNewsDetail>(mErrorHandler) {
                    @Override
                    public void onNext(NbaNewsDetail nbaNewsDetail) {
                        mRootView.showHeader(nbaNewsDetail);
                        requestComment(nid, true);
                    }
                });

    }

    public void requestComment(String nid, boolean pullToRefresh) {
        if (pullToRefresh) {
            mCreateTime = "";
            mNcid = "";
        }
        if (pullToRefresh && isFirst) {
            isFirst = false;
        }
        Map<String, String> map = new HashMap<>();
        map.put("client", Api.HUPU_CLIENT_ID);
        map.put("nid", nid);
        map.put("ncid", (mNcid == null) ? "" : mNcid);
        map.put("create_time", (mCreateTime == null) ? "" : mCreateTime);
        mModel.getComment(map)
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
                .subscribe(new ErrorHandleSubscriber<NbaNewsComment>(mErrorHandler) {
                    @Override
                    public void onNext(NbaNewsComment nbaNewsComment) {
                        if (pullToRefresh) {
                            mRootView.showData(nbaNewsComment);
                        } else {
                            mRootView.showMoreData(nbaNewsComment);
                        }
                        mNcid = nbaNewsComment.getData().get(nbaNewsComment.getData().size() - 1).getNcid();
                        mCreateTime = nbaNewsComment.getData().get(nbaNewsComment.getData().size() - 1)
                                .getCreate_time();
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
