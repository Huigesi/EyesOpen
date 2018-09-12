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
import me.huigesi.eyesopen.mvp.model.entity.WeiboDetail;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import me.huigesi.eyesopen.mvp.contract.WeiboDetailContract;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import me.jessyan.rxerrorhandler.handler.RetryWithDelay;

import static me.huigesi.eyesopen.app.Constant.WEIBO_C;
import static me.huigesi.eyesopen.app.Constant.WEIBO_S;


@FragmentScope
public class WeiboDetailPresenter extends BasePresenter<WeiboDetailContract.Model, WeiboDetailContract.View> {
    RxErrorHandler mErrorHandler;
    Application mApplication;
    ImageLoader mImageLoader;
    AppManager mAppManager;
    private long mMaxId;

    @Inject
    public WeiboDetailPresenter(WeiboDetailContract.Model model, WeiboDetailContract.View rootView,
                                RxErrorHandler handler, AppManager appManager, Application application) {
        super(model, rootView);
        mErrorHandler=handler;
        mAppManager=appManager;
        mApplication=application;
    }

    public void requestWeiboDetail(String gsid,String sinceid,boolean pullToRefresh){
        if (pullToRefresh) {
            mMaxId=0;
        }
        Map<String, String> map = new HashMap<>();
        map.put("s", WEIBO_S);
        map.put("c", WEIBO_C);
        map.put("gsid", gsid);
        map.put("id", sinceid);
        map.put("max_id", String.valueOf(mMaxId));
        map.put("is_show_bulletin", String.valueOf(2));
        mModel.getWeiboDetail(map)
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
                .subscribe(new ErrorHandleSubscriber<WeiboDetail>(mErrorHandler) {
                    @Override
                    public void onNext(WeiboDetail weiboDetail) {
                        if (pullToRefresh) {
                            mRootView.showData(weiboDetail);
                        }else {
                            mRootView.showMoreData(weiboDetail);
                        }
                        mMaxId=weiboDetail.getMax_id();
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
