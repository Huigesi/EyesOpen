package me.huigesi.eyesopen.mvp.contract;

import android.app.Activity;

import com.jess.arms.mvp.IView;
import com.jess.arms.mvp.IModel;


import java.util.Map;

import io.reactivex.Observable;
import me.huigesi.eyesopen.mvp.model.entity.WeiboNews;
import me.huigesi.eyesopen.mvp.model.entity.WeiboUserInfo;


public interface WeiboContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {
        void showData(WeiboNews data);

        void showMoreData(WeiboNews data);

        void endLoadMore();

        Activity getActivity();
    }

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        Observable<WeiboNews> getWeiboNews(Map<String, String> params);

        Observable<WeiboUserInfo> getGsid(String c,String s,String user, String password);
    }
}
