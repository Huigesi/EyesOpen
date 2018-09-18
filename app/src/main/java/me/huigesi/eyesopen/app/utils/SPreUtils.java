package me.huigesi.eyesopen.app.utils;

import android.content.Context;
import android.content.SharedPreferences;


import me.huigesi.eyesopen.app.App;
import me.huigesi.eyesopen.app.Constant;
import me.huigesi.eyesopen.mvp.model.entity.WeiboUserInfo;

public class SPreUtils {
    private static Context mContext;
    public static final String NAME_WEIBO_USERINFO = "userinfo";
    public static final String WEIBO_GSID= "WEIBO_GSID";
    public static final String WEIBO_UID= "WEIBO_UID";

    public static SharedPreferences getSharedPreferences() {
        return App.getContext()
                .getSharedPreferences(Constant.APP_NAME, Context.MODE_PRIVATE);
    }

    public SPreUtils(Context context) {
        mContext = context;
    }

    public static boolean readBoolean(String key) {
        return getSharedPreferences().getBoolean(key, false);
    }

    public static void writeBoolean(String key, boolean value) {
        getSharedPreferences().edit().putBoolean(key, value).apply();
    }

    public static void setWeiBoUserInfo(WeiboUserInfo data, Context context){
        SharedPreferences sharedPreferences =
                context.getSharedPreferences(NAME_WEIBO_USERINFO, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(WEIBO_GSID, data.getGsid());
        editor.putString(WEIBO_UID, data.getUid());
        editor.commit();
    }

    public static String getWeiBoUserInfo(String key,Context context){
        SharedPreferences sharedPreferences =
                context.getSharedPreferences(NAME_WEIBO_USERINFO, Context.MODE_PRIVATE);
        String result=sharedPreferences.getString(key, "");
        return result;
    }

}
