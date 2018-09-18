package me.huigesi.eyesopen.mvp.presenter;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import java.util.List;
import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import me.huigesi.eyesopen.mvp.model.entity.Column;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import me.huigesi.eyesopen.mvp.contract.ColumnContract;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import rx.functions.Action0;


@ActivityScope
public class ColumnPresenter extends BasePresenter<ColumnContract.Model, ColumnContract.View> {
    RxErrorHandler mErrorHandler;
    Application mApplication;
    ImageLoader mImageLoader;
    AppManager mAppManager;

    @Inject
    public ColumnPresenter(ColumnContract.Model model, ColumnContract.View rootView,
                           RxErrorHandler handler, AppManager appManager, Application application) {
        super(model, rootView);
        mErrorHandler = handler;
        mApplication = application;
        mAppManager = appManager;
    }

    public void onItemAddOrRemove(String columnName, boolean selectState) {
        mModel.columnDbOperate(columnName, selectState)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        /*if (selectState == null) {

                        }*/
                    }
                }).subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new ErrorHandleSubscriber<Map<Boolean, List<Column>>>(mErrorHandler) {

                    @Override
                    public void onNext(Map<Boolean, List<Column>> data) {
                        mRootView.initData(data.get(true),data.get(false));
                    }
                });
    }

    public void onItemSwap(int fromPos, int toPos) {
        mModel.columnDbSwap(fromPos,toPos)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe();
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
