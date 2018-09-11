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
import me.huigesi.eyesopen.app.utils.SPreUtils;
import me.huigesi.eyesopen.mvp.model.entity.WeiboNews;
import me.huigesi.eyesopen.mvp.model.entity.WeiboUserInfo;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import me.huigesi.eyesopen.mvp.contract.WeiboContract;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import me.jessyan.rxerrorhandler.handler.RetryWithDelay;


@FragmentScope
public class WeiboPresenter extends BasePresenter<WeiboContract.Model, WeiboContract.View> {

    RxErrorHandler mErrorHandler;
    Application mApplication;
    ImageLoader mImageLoader;
    AppManager mAppManager;
    private boolean isFirst = true;
    private int page = 1;
    private String gsId = "";
    private static final String s = "606388e6";
    private static final String c = "weicoabroad";
    private static final String form = "1273095010";
    private static final String wm = "2468_1001";
    private static final String source = "4215535043";

    @Inject
    public WeiboPresenter(WeiboContract.Model model, WeiboContract.View rootView,RxErrorHandler handler
            , AppManager appManager, Application application) {
        super(model, rootView);
        mErrorHandler=handler;
        mApplication=application;
        mAppManager=appManager;
        loginWeibo();
    }

    private void loginWeibo() {
        mModel.getGsid(c,"18909f1e","13242317873", "huigesi")
                .subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 2))
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<WeiboUserInfo>(mErrorHandler) {
                    @Override
                    public void onNext(WeiboUserInfo weiboUserInfo) {
                        SPreUtils.setWeiBoUserInfo(weiboUserInfo, mRootView.getActivity());
                    }
                });
        requestWeibos(true);
    }

    public void requestWeibos(boolean pullToRefresh) {
        if (pullToRefresh) {
            page = 1;
        }

        if (pullToRefresh && isFirst) {
            isFirst = false;
        }
        gsId = SPreUtils.getWeiBoUserInfo(SPreUtils.WEIBO_GSID, mRootView.getActivity());
        Map<String, String> params = new HashMap<>();
        params.put("since_id", String.valueOf(0));
        params.put("s", s);
        params.put("c", c);
        params.put("page", String.valueOf(page));
        params.put("gsid", gsId);
        params.put("source", source);
        params.put("advance_enable", "false");
        params.put("wm", wm);
        params.put("from", form);
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
                        if (isFirst) {
                            mRootView.showData(weiboNews);
                        }else {
                            mRootView.showMoreData(weiboNews);
                        }
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
