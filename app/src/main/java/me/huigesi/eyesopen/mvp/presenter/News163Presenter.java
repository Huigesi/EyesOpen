package me.huigesi.eyesopen.mvp.presenter;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import me.huigesi.eyesopen.mvp.model.entity.Column;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import me.huigesi.eyesopen.mvp.contract.News163Contract;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;


@FragmentScope
public class News163Presenter extends BasePresenter<News163Contract.Model, News163Contract.View> {
    RxErrorHandler mErrorHandler;
    Application mApplication;
    ImageLoader mImageLoader;
    AppManager mAppManager;

    @Inject
    public News163Presenter(News163Contract.Model model, News163Contract.View rootView,
                            RxErrorHandler handler, AppManager appManager, Application application) {
        super(model, rootView);
        mErrorHandler = handler;
        mApplication = application;
        mAppManager = appManager;
    }

    public void operateColumnDb(){
        mModel.operateChannelDb()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {

                    }
                }).subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new ErrorHandleSubscriber<List<Column>>(mErrorHandler) {
                    @Override
                    public void onNext(List<Column> data) {
                        mRootView.initViewPager(data);
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
