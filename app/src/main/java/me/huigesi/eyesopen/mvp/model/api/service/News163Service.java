package me.huigesi.eyesopen.mvp.model.api.service;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import me.huigesi.eyesopen.mvp.model.entity.News163;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface News163Service {
    @Headers({"Domain-Name: news163"})
    @GET("nc/article/{type}/{id}/{startPage}-20.html")
    Observable<Map<String,List<News163>>> getNews(@Path("type") String type,
                                                  @Path("id") String id,
                                                  @Path("startPage") int startPage);
}
