package me.huigesi.eyesopen.mvp.model.api.service;

import java.util.List;

import io.reactivex.Observable;
import me.huigesi.eyesopen.mvp.model.entity.NbaNews;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NbaService {
    /*http://games.mobileapi.hupu.com/1/7.2.5/nba/getNews?&client=866493031799950*/
    @GET("nba/getNews")
    Observable<List<NbaNews>> getNbaNews(@Query("client") String client,
                                          @Query("nid") String nid,
                                          @Query("count") int count);
}
