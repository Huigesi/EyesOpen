package me.huigesi.eyesopen.mvp.presenter;

import android.app.Application;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.utils.PermissionUtil;
import com.jess.arms.utils.RxLifecycleUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.entity.NbaNews;

import javax.inject.Inject;

import me.huigesi.eyesopen.mvp.contract.NbaContract;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import me.jessyan.rxerrorhandler.handler.RetryWithDelay;


@FragmentScope
public class NbaPresenter extends BasePresenter<NbaContract.Model, NbaContract.View> {
    private RxErrorHandler mErrorHandler;
    private Application mApplication;
    private ImageLoader mImageLoader;
    private AppManager mAppManager;

    private String nid = "";
    private int count = 0;
    private boolean isFirst = true;
    private int preEndIndex;

    @Inject
    public NbaPresenter(NbaContract.Model model, NbaContract.View rootView, RxErrorHandler handler
            , AppManager appManager, Application application) {
        super(model, rootView);
        mErrorHandler=handler;
        mApplication=application;
        mAppManager=appManager;
        requestUsers(true);
    }
/*
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate() {
        requestUsers(true);//打开 App 时自动加载列表
    }*/

    public void requestUsers(boolean pullToRefresh) {
        if (pullToRefresh) {
            nid = "";
        }

        boolean isEvictCache = pullToRefresh;

        if (pullToRefresh && isFirst) {
            isFirst = false;
            isEvictCache = false;
            count+=20;
        }

        Map<String, String> params = new HashMap<>();
        params.put("client", Api.HUPU_CLIENT_ID);
        mModel.getNbaNews(params, nid, isEvictCache)
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
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))//使用 Rxlifecycle,使 Disposable 和 Activity 一起销毁
                .subscribe(new ErrorHandleSubscriber<NbaNews>(mErrorHandler) {
                    @Override
                    public void onNext(NbaNews nbaNews) {
                        List<NbaNews.ResultBean.DataBean> nbaDatas = nbaNews.getResult().getData();
                        nid = nbaDatas.get(nbaDatas.size() - 1).getNid();
                        mRootView.showData(nbaNews);
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
