package me.huigesi.eyesopen.mvp.model.api.service;

import java.util.Map;

import io.reactivex.Observable;
import me.huigesi.eyesopen.mvp.model.entity.WeiboNews;
import me.huigesi.eyesopen.mvp.model.entity.WeiboUserInfo;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface WeiboService {
    @Headers({"Domain-Name: weibo"})
    @GET("statuses/friends_timeline")
    Observable<WeiboNews> getWeiBoNews(@QueryMap Map<String, String> params);

    @Headers({"Domain-Name: weibo"})
    @FormUrlEncoded
    @POST("account/login")
    Observable<WeiboUserInfo> WeiboLogin(@Field("c") String c,
                                    @Field("s") String s,
                                    @Field("u") String user,
                                    @Field("p") String password);
}
