package me.huigesi.eyesopen.mvp.presenter;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.utils.RxLifecycleUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.huigesi.eyesopen.app.utils.SPreUtils;
import me.huigesi.eyesopen.mvp.model.entity.WeiboNews;
import me.huigesi.eyesopen.mvp.model.entity.WeiboUserSpace;
import me.huigesi.eyesopen.mvp.ui.activity.MainActivity;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import me.huigesi.eyesopen.mvp.contract.WeiboSpaceContract;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import me.jessyan.rxerrorhandler.handler.RetryWithDelay;

import static me.huigesi.eyesopen.app.Constant.WEIBO_C;
import static me.huigesi.eyesopen.app.Constant.WEIBO_FORM;
import static me.huigesi.eyesopen.app.Constant.WEIBO_S;
import static me.huigesi.eyesopen.app.Constant.WEIBO_SOURCE;
import static me.huigesi.eyesopen.app.Constant.WEIBO_WM;


@ActivityScope
public class WeiboSpacePresenter extends BasePresenter<WeiboSpaceContract.Model, WeiboSpaceContract.View> {

    RxErrorHandler mErrorHandler;
    Application mApplication;
    ImageLoader mImageLoader;
    AppManager mAppManager;
    private boolean isFirst = true;
    private int page = 1;
    private String gsId = "";

    @Inject
    public WeiboSpacePresenter(WeiboSpaceContract.Model model, WeiboSpaceContract.View rootView,
                               RxErrorHandler handler, AppManager appManager, Application application) {
        super(model, rootView);
        mErrorHandler=handler;
        mAppManager=appManager;
        mApplication=application;

    }

    public void requestHeader(String uid) {
        //gsId=SPreUtils.getWeiBoUserInfo(SPreUtils.WEIBO_GSID, mRootView.getActivity());
        Map<String, String> params = new HashMap<>();
        params.put("s", WEIBO_S);
        params.put("c", WEIBO_C);
        params.put("gsid", gsId);
        params.put("from", WEIBO_FORM);
        params.put("wm", WEIBO_WM);
        params.put("source", WEIBO_SOURCE);
        params.put("uid", uid);
        params.put("since_id", "0");
        mModel.getHeader(params).
        subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 2))
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<WeiboUserSpace>(mErrorHandler) {
                    @Override
                    public void onNext(WeiboUserSpace weiboUserSpace) {
                        mRootView.showHeader(weiboUserSpace);
                    }
                });
    }

    public void requestUserNews(boolean pullToRefresh,String gsId,String uid) {
        if (pullToRefresh) {
            page = 1;
        }else {
            page++;
        }

        if (pullToRefresh && isFirst) {
            isFirst = false;
        }
        Map<String, String> params = new HashMap<>();
        params.put("since_id", String.valueOf(0));
        params.put("s", WEIBO_S);
        params.put("c", WEIBO_C);
        params.put("page", String.valueOf(page));
        params.put("gsid", gsId);
        params.put("uid", uid);
        params.put("source", WEIBO_SOURCE);
        params.put("advance_enable", "false");
        params.put("count", String.valueOf(10));
        params.put("wm", WEIBO_WM);
        params.put("from", WEIBO_FORM);
        mModel.getWeiboNews(params)
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
                .subscribe(new ErrorHandleSubscriber<WeiboNews>(mErrorHandler) {
                    @Override
                    public void onNext(WeiboNews weiboNews) {
                        if (isFirst)
                            mRootView.showData(weiboNews);
                        else
                            mRootView.showMoreData(weiboNews);
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
