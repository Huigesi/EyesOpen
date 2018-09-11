package me.huigesi.eyesopen.mvp.model.api.service;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.entity.NbaBBSComment;
import me.huigesi.eyesopen.mvp.model.entity.NbaBBSLightComment;
import me.huigesi.eyesopen.mvp.model.entity.NbaNews;
import me.huigesi.eyesopen.mvp.model.entity.NbaNewsComment;
import me.huigesi.eyesopen.mvp.model.entity.NbaNewsDetail;
import me.huigesi.eyesopen.mvp.model.entity.NbaZhuanti;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import static me.jessyan.retrofiturlmanager.RetrofitUrlManager.DOMAIN_NAME_HEADER;

public interface NbaService {

    @Headers({"Domain-Name: nba"})
    @GET("nba/getNews")
    Observable<NbaNews> getNbaNews(@QueryMap Map<String, String> params);

    @Headers({"Domain-Name: nba"})
    @GET("nba/getNewsDetailSchema")
    Observable<NbaNewsDetail> getNbaNewsDetail(@QueryMap Map<String, String> params);

    @Headers({"Domain-Name: nba"})
    @GET("news/getCommentH5")
    Observable<NbaNewsComment> getNbaComment(@QueryMap Map<String, String> params);

    @Headers({"Domain-Name: nba"})
    @GET("nba/getSubjectNewsDetail")
    Observable<NbaZhuanti> getNbaZhuanTi(@QueryMap Map<String, String> params);

    @Headers({"Domain-Name: hupubbs"})
    @GET("threads/getsThreadPostList")
    Observable<NbaBBSComment> getsThreadReplyList(@QueryMap Map<String, String> params);

    @Headers({"Domain-Name: hupubbs"})
    @GET("threads/getsThreadLightReplyList")
    Observable<NbaBBSLightComment> getThreadLightReplyList(@QueryMap Map<String, String> params);
}
