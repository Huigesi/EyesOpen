/*
 * Copyright 2017 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.huigesi.eyesopen.mvp.model.api;

/**
 * ================================================
 * 存放一些与 API 有关的东西,如请求地址,请求码等
 * <p>
 * Created by JessYan on 08/05/2016 11:25
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
public class Api {
    public static final String APP_DOMAIN = "https://api.github.com";
    public static final String RequestSuccess = "0";
    public static final int NETEASE_NEWS = 0;
    public static final int DOUBAN_MOVIE = 1;
    public static final int TOADAY_NEWS = 2;
    public static final int HUPU_NBA = 3;
    public static final int WEIBO_LIST = 4;
    public static final int HUPU_BBS = 5;
    public static final String NEWS_HOST = "https://c.m.163.com/";
    public static final String MOVIE_HOST = "https://api.douban.com/";
    public static final String TODAY_HOST = "http://is.snssdk.com/api/";
    public static final String HUPU_HOST = "http://games.mobileapi.hupu.com/1/7.2.5/";
    public static final String HUPU_BBS_HOST = "http://bbs.mobileapi.hupu.com/1/7.2.8/";
    public static final String WEIBO_HOST = "http://api.weibo.cn/2/";

    public static final String HEADLINE_ID = "T1348647909107";
    public static final String NBA_ID = "T1348649145984";
    public static final String JOKE_ID = "T1350383429665";
    public static final String GAME_ID = "T1348654151579";
    public static final String HUPU_CLIENT_ID = "866493031799950";

    /*
     * 新浪微博图片链接
     * */
    public static final String IMG_WEIBO_WAP180 = "https://wx3.sinaimg.cn/wap180/";
    public static final String IMG_WEIBO_WAP360 = "https://wx3.sinaimg.cn/wap360/";
    public static final String IMG_WEIBO_WAP720 = "https://wx3.sinaimg.cn/wap720/";
    public static final String IMG_WEIBO_ORIGINAL = "https://wx4.sinaimg.cn/woriginal/";
    public static final String IMG_WEIBO_ORIGINAL_GIF = "https://wx3.sinaimg.cn/woriginal/";

    public static String getHost(int hostType) {
        switch (hostType) {
            case NETEASE_NEWS:
                return NEWS_HOST;
            case DOUBAN_MOVIE:
                return MOVIE_HOST;
            case TOADAY_NEWS:
                return TODAY_HOST;
            case HUPU_NBA:
                return HUPU_HOST;
            case WEIBO_LIST:
                return WEIBO_HOST;
            case HUPU_BBS:
                return HUPU_BBS_HOST;
        }
        return "";
    }
}
