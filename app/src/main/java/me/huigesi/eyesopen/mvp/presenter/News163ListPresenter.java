package me.huigesi.eyesopen.mvp.presenter;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.utils.RxLifecycleUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import me.huigesi.eyesopen.app.utils.RetrofitHelper;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.entity.News163;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import me.huigesi.eyesopen.mvp.contract.News163ListContract;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import me.jessyan.rxerrorhandler.handler.RetryWithDelay;


@FragmentScope
public class News163ListPresenter extends BasePresenter<News163ListContract.Model, News163ListContract.View> {
    RxErrorHandler mErrorHandler;
    Application mApplication;
    ImageLoader mImageLoader;
    AppManager mAppManager;
    private int mStartPage;

    @Inject
    public News163ListPresenter(News163ListContract.Model model, News163ListContract.View rootView,
                                RxErrorHandler handler, AppManager appManager, Application application) {
        super(model, rootView);
        mErrorHandler = handler;
        mApplication = application;
        mAppManager = appManager;
    }

    public void requestNews163(String type, String id, boolean pullToRefresh) {
        if (pullToRefresh) {
            mStartPage = 0;
        } else {
            mStartPage += 20;
        }
        List<News163> news163List = new ArrayList<>();
       /* mModel.getNews163(type, id, mStartPage)
                .subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 1))
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
                .flatMap(new Function<Map<String, List<News163>>, ObservableSource<News163>>() {
                    @Override
                    public ObservableSource<News163> apply(Map<String, List<News163>> stringListMap) throws Exception {
                        return Observable.fromIterable(stringListMap.get(id));
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new ErrorHandleSubscriber<News163>(mErrorHandler) {
                    @Override
                    public void onNext(News163 news163) {
                        news163List.add(news163);
                    }

                    @Override
                    public void onComplete() {
                        super.onComplete();
                        if (pullToRefresh) {
                            mRootView.showData(news163List);
                        }else {
                            mRootView.showMoreData(news163List);
                        }
                    }
                });*/
        RetrofitHelper.getInstance(Api.NETEASE_NEWS)
                .getNews(type, id, mStartPage)
                .subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 1))
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
                .flatMap(new Function<Map<String, List<News163>>, ObservableSource<News163>>() {
                    @Override
                    public ObservableSource<News163> apply(Map<String, List<News163>> stringListMap) throws Exception {
                        return Observable.fromIterable(stringListMap.get(id));
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new ErrorHandleSubscriber<News163>(mErrorHandler) {
                    @Override
                    public void onNext(News163 news163) {
                        news163List.add(news163);
                    }

                    @Override
                    public void onComplete() {
                        super.onComplete();
                        if (pullToRefresh) {
                            mRootView.showData(news163List);
                        }else {
                            mRootView.showMoreData(news163List);
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
