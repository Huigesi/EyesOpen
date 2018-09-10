package me.huigesi.eyesopen.mvp.model.api.service;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.entity.NbaNews;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import static me.jessyan.retrofiturlmanager.RetrofitUrlManager.DOMAIN_NAME_HEADER;

public interface NbaService {
    /*http://games.mobileapi.hupu.com/1/7.2.5/nba/getNews?&client=866493031799950
    *                                     @Query("client") String client,
                                          @Query("nid") String nid,
                                          @Query("count") int count
    * */
    @Headers({"Domain-Name: nba"})
    @GET("nba/getNews")
    Observable<NbaNews> getNbaNews(@QueryMap Map<String,String> params);
}
