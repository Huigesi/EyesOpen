package me.huigesi.eyesopen.app.utils;


import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.api.service.WeiboService;
import me.huigesi.eyesopen.mvp.model.entity.WeiboUserSpace;
import me.huigesi.eyesopen.mvp.ui.adapter.IntegerDefault0Adapter;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import me.jessyan.rxerrorhandler.handler.listener.ResponseErrorListener;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpModule {
    public static void setmResultListener(ResultListener mResultListener) {
        HttpModule.mResultListener = mResultListener;
    }

    public static ResultListener mResultListener;

    //
    public static void getWeiBoUserShow(Map<String, String> params, Context context) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Integer.class, new IntegerDefault0Adapter());
        gsonBuilder.registerTypeAdapter(int.class, new IntegerDefault0Adapter());
        Gson mGson = gsonBuilder.create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.WEIBO_HOST)
                .addConverterFactory(GsonConverterFactory.create(mGson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        WeiboService retrofitService = retrofit.create(WeiboService.class);
        RxErrorHandler errorHandler = RxErrorHandler.builder()
                .with(context)
                .responseErrorListener(new ResponseErrorListener() {
                    @Override
                    public void handleResponseError(Context context, Throwable t) {

                    }
                }).build();
        retrofitService.getWeiboUserHead2(params)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new ErrorHandleSubscriber<WeiboUserSpace>(errorHandler) {
                    @Override
                    public void onNext(WeiboUserSpace weiboUserSpace) {
                        mResultListener.success(weiboUserSpace);
                    }
                });
    }

    public interface ResultListener {
        void success(WeiboUserSpace o);

        void fail(Throwable e);
    }
}
