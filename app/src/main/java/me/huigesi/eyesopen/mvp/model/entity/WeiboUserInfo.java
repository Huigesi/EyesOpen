package me.huigesi.eyesopen.mvp.model.entity;

import java.util.List;

// FIXME generate failure  field _$Oauth2016
public class WeiboUserInfo {

    /**
     * screen_name : 双蛋肠粉
     * status : 1
     * gsid : _2A252h8arDeRxGeNH61cX8yvNyT6IHXVTFV1jrDV6PUJbkdAKLWf5kWpNSvDZSjdaHD6qHVybmd7vHrvWztYO43is
     * uid : 5905635122
     * url : http://weibo.cn
     * msg_url : http://weibo.cn/msg
     * passwdState : 0
     * malt :
     * user_type : 1
     * oauth_token : bcc50e8795c68a9cd5b7b8d1a0efc778
     * oauth_token_secret : 7cf3105e8201ab1a378d37ecd653ba7c
     * oauth2.0 : {"access_token":"2.005T8f8GhOxRbEd13d79dfebToK2LC","issued_at":1533787791,"expires":1074485}
     * interceptad_type :
     * goto_scheme :
     * user : {"id":5905635122,"idstr":"5905635122","class":1,"screen_name":"双蛋肠粉","name":"双蛋肠粉","province":"44","city":"1000","location":"广东","description":"私藏快乐","url":"","profile_image_url":"https://tvax2.sinaimg.cn/crop.206.229.270.270.50/006rFrtoly8frvvzh84mqj30ku0dwakj.jpg","cover_image_phone":"https://ww1.sinaimg.cn/crop.0.0.640.640.640/549d0121tw1egm1kjly3jj20hs0hsq4f.jpg","profile_url":"u/5905635122","domain":"","weihao":"","gender":"m","followers_count":27,"friends_count":55,"pagefriends_count":0,"statuses_count":56,"video_status_count":0,"favourites_count":1,"created_at":"Sun Apr 24 02:20:53 +0800 2016","following":false,"allow_all_act_msg":false,"geo_enabled":true,"verified":false,"verified_type":-1,"remark":"","insecurity":{"sexual_content":false},"status":{"created_at":"Mon Aug 27 08:04:56 +0800 2018","id":4277539264771621,"idstr":"4277539264771621","mid":"4277539264771621","can_edit":false,"text":"被不好的梦刺醒，闭眼睛伤心了好久。","textLength":34,"source_allowclick":0,"source_type":1,"source":"<a href=\"http://app.weibo.com/t/feed/6NndUT\" rel=\"nofollow\">Weibo.intl<\/a>","appid":2204484,"favorited":false,"truncated":false,"in_reply_to_status_id":"","in_reply_to_user_id":"","in_reply_to_screen_name":"","pic_ids":[],"geo":null,"is_paid":false,"mblog_vip_type":0,"annotations":[{"shooting":1},{"mapi_request":true}],"reposts_count":0,"comments_count":0,"attitudes_count":0,"pending_approval_count":0,"isLongText":false,"hide_flag":0,"mlevel":0,"visible":{"type":0,"list_id":0},"biz_feature":0,"hasActionTypeCard":0,"darwin_tags":[],"hot_weibo_tags":[],"text_tag_tips":[],"mblogtype":0,"rid":"0","userType":0,"more_info_type":0,"positive_recom_flag":0,"content_auth":0,"gif_ids":"","is_show_bulletin":2,"comment_manage_info":{"comment_permission_type":-1,"approval_comment_type":0}},"ptype":0,"allow_all_comment":true,"avatar_large":"https://tvax2.sinaimg.cn/crop.206.229.270.270.180/006rFrtoly8frvvzh84mqj30ku0dwakj.jpg","avatar_hd":"https://tvax2.sinaimg.cn/crop.206.229.270.270.1024/006rFrtoly8frvvzh84mqj30ku0dwakj.jpg","verified_reason":"","verified_trade":"","verified_reason_url":"","verified_source":"","verified_source_url":"","follow_me":false,"like":false,"like_me":false,"online_status":0,"bi_followers_count":2,"lang":"zh-cn","star":0,"mbtype":0,"mbrank":0,"block_word":0,"block_app":0,"level":1,"type":1,"ulevel":0,"user_limit":0,"badge":{"uc_domain":0,"enterprise":0,"anniversary":0,"taobao":0,"gongyi":0,"gongyi_level":0,"bind_taobao":0,"dailv":0,"zongyiji":0,"vip_activity1":0,"unread_pool":0,"daiyan":0,"ali_1688":0,"vip_activity2":0,"fools_day_2016":0,"uefa_euro_2016":0,"unread_pool_ext":0,"self_media":0,"dzwbqlx_2016":0,"discount_2016":0,"follow_whitelist_video":0,"league_badge":0,"lol_msi_2017":0,"super_star_2017":0,"video_attention":0,"travel_2017":0,"lol_gm_2017":0,"cz_wed_2017":0,"inspector":0,"panda":0,"uve_icon":0,"user_name_certificate":1,"suishoupai_2018":0,"wenda":0,"wenchuan_10th":0,"super_star_2018":0,"worldcup_2018":0,"wenda_v2":0,"league_badge_2018":0,"dailv_2018":0,"asiad_2018":0,"qixi_2018":0},"badge_top":"","has_ability_tag":0,"extend":{"privacy":{"mobile":1},"mbprivilege":"0000000000000000000000000000000000000000000000000000000000000000"},"credit_score":80,"user_ability":33554432,"urank":4,"story_read_state":-1,"vclub_member":0,"member_type":0,"pic_bg":""}
     * switch_unread_feed : 0
     */

    private String screen_name;
    private int status;
    private String gsid;
    private String uid;
    private String url;
    private String msg_url;
    private String passwdState;
    private String malt;
    private String user_type;
    private String oauth_token;
    private String oauth_token_secret;
    private String interceptad_type;
    private String goto_scheme;
    private WeiboDetail.StatusData.UserData user;
    private int switch_unread_feed;

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getGsid() {
        return gsid;
    }

    public void setGsid(String gsid) {
        this.gsid = gsid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMsg_url() {
        return msg_url;
    }

    public void setMsg_url(String msg_url) {
        this.msg_url = msg_url;
    }

    public String getPasswdState() {
        return passwdState;
    }

    public void setPasswdState(String passwdState) {
        this.passwdState = passwdState;
    }

    public String getMalt() {
        return malt;
    }

    public void setMalt(String malt) {
        this.malt = malt;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getOauth_token() {
        return oauth_token;
    }

    public void setOauth_token(String oauth_token) {
        this.oauth_token = oauth_token;
    }

    public String getOauth_token_secret() {
        return oauth_token_secret;
    }

    public void setOauth_token_secret(String oauth_token_secret) {
        this.oauth_token_secret = oauth_token_secret;
    }

    public static class Oauth2{
            /**
             * access_token : 2.005T8f8GhOxRbEd13d79dfebToK2LC
             * issued_at : 1533787791
             * expires : 1074485
             */

            private String access_token;
            private int issued_at;
            private int expires;

            public String getAccess_token() {
                return access_token;
            }

            public void setAccess_token(String access_token) {
                this.access_token = access_token;
            }

            public int getIssued_at() {
                return issued_at;
            }

            public void setIssued_at(int issued_at) {
                this.issued_at = issued_at;
            }

            public int getExpires() {
                return expires;
            }

            public void setExpires(int expires) {
                this.expires = expires;
            }

    public static class UserData {
        /**
         * id : 5905635122
         * idstr : 5905635122
         * class : 1
         * screen_name : 双蛋肠粉
         * name : 双蛋肠粉
         * province : 44
         * city : 1000
         * location : 广东
         * description : 私藏快乐
         * url :
         * profile_image_url : https://tvax2.sinaimg.cn/crop.206.229.270.270.50/006rFrtoly8frvvzh84mqj30ku0dwakj.jpg
         * cover_image_phone : https://ww1.sinaimg.cn/crop.0.0.640.640.640/549d0121tw1egm1kjly3jj20hs0hsq4f.jpg
         * profile_url : u/5905635122
         * domain :
         * weihao :
         * gender : m
         * followers_count : 27
         * friends_count : 55
         * pagefriends_count : 0
         * statuses_count : 56
         * video_status_count : 0
         * favourites_count : 1
         * created_at : Sun Apr 24 02:20:53 +0800 2016
         * following : false
         * allow_all_act_msg : false
         * geo_enabled : true
         * verified : false
         * verified_type : -1
         * remark :
         * insecurity : {"sexual_content":false}
         * status : {"created_at":"Mon Aug 27 08:04:56 +0800 2018","id":4277539264771621,"idstr":"4277539264771621","mid":"4277539264771621","can_edit":false,"text":"被不好的梦刺醒，闭眼睛伤心了好久。","textLength":34,"source_allowclick":0,"source_type":1,"source":"<a href=\"http://app.weibo.com/t/feed/6NndUT\" rel=\"nofollow\">Weibo.intl<\/a>","appid":2204484,"favorited":false,"truncated":false,"in_reply_to_status_id":"","in_reply_to_user_id":"","in_reply_to_screen_name":"","pic_ids":[],"geo":null,"is_paid":false,"mblog_vip_type":0,"annotations":[{"shooting":1},{"mapi_request":true}],"reposts_count":0,"comments_count":0,"attitudes_count":0,"pending_approval_count":0,"isLongText":false,"hide_flag":0,"mlevel":0,"visible":{"type":0,"list_id":0},"biz_feature":0,"hasActionTypeCard":0,"darwin_tags":[],"hot_weibo_tags":[],"text_tag_tips":[],"mblogtype":0,"rid":"0","userType":0,"more_info_type":0,"positive_recom_flag":0,"content_auth":0,"gif_ids":"","is_show_bulletin":2,"comment_manage_info":{"comment_permission_type":-1,"approval_comment_type":0}}
         * ptype : 0
         * allow_all_comment : true
         * avatar_large : https://tvax2.sinaimg.cn/crop.206.229.270.270.180/006rFrtoly8frvvzh84mqj30ku0dwakj.jpg
         * avatar_hd : https://tvax2.sinaimg.cn/crop.206.229.270.270.1024/006rFrtoly8frvvzh84mqj30ku0dwakj.jpg
         * verified_reason :
         * verified_trade :
         * verified_reason_url :
         * verified_source :
         * verified_source_url :
         * follow_me : false
         * like : false
         * like_me : false
         * online_status : 0
         * bi_followers_count : 2
         * lang : zh-cn
         * star : 0
         * mbtype : 0
         * mbrank : 0
         * block_word : 0
         * block_app : 0
         * level : 1
         * type : 1
         * ulevel : 0
         * user_limit : 0
         * badge : {"uc_domain":0,"enterprise":0,"anniversary":0,"taobao":0,"gongyi":0,"gongyi_level":0,"bind_taobao":0,"dailv":0,"zongyiji":0,"vip_activity1":0,"unread_pool":0,"daiyan":0,"ali_1688":0,"vip_activity2":0,"fools_day_2016":0,"uefa_euro_2016":0,"unread_pool_ext":0,"self_media":0,"dzwbqlx_2016":0,"discount_2016":0,"follow_whitelist_video":0,"league_badge":0,"lol_msi_2017":0,"super_star_2017":0,"video_attention":0,"travel_2017":0,"lol_gm_2017":0,"cz_wed_2017":0,"inspector":0,"panda":0,"uve_icon":0,"user_name_certificate":1,"suishoupai_2018":0,"wenda":0,"wenchuan_10th":0,"super_star_2018":0,"worldcup_2018":0,"wenda_v2":0,"league_badge_2018":0,"dailv_2018":0,"asiad_2018":0,"qixi_2018":0}
         * badge_top :
         * has_ability_tag : 0
         * extend : {"privacy":{"mobile":1},"mbprivilege":"0000000000000000000000000000000000000000000000000000000000000000"}
         * credit_score : 80
         * user_ability : 33554432
         * urank : 4
         * story_read_state : -1
         * vclub_member : 0
         * member_type : 0
         * pic_bg :
         */

        private long id;
        private String idstr;
        @com.google.gson.annotations.SerializedName("class")
        private int classX;
        private String screen_name;
        private String name;
        private String province;
        private String city;
        private String location;
        private String description;
        private String url;
        private String profile_image_url;
        private String cover_image_phone;
        private String profile_url;
        private String domain;
        private String weihao;
        private String gender;
        private int followers_count;
        private int friends_count;
        private int pagefriends_count;
        private int statuses_count;
        private int video_status_count;
        private int favourites_count;
        private String created_at;
        private boolean following;
        private boolean allow_all_act_msg;
        private boolean geo_enabled;
        private boolean verified;
        private int verified_type;
        private String remark;
        private InsecurityData insecurity;
        private StatusData status;
        private int ptype;
        private boolean allow_all_comment;
        private String avatar_large;
        private String avatar_hd;
        private String verified_reason;
        private String verified_trade;
        private String verified_reason_url;
        private String verified_source;
        private String verified_source_url;
        private boolean follow_me;
        private boolean like;
        private boolean like_me;
        private int online_status;
        private int bi_followers_count;
        private String lang;
        private int star;
        private int mbtype;
        private int mbrank;
        private int block_word;
        private int block_app;
        private int level;
        private int type;
        private int ulevel;
        private int user_limit;
        private BadgeData badge;
        private String badge_top;
        private int has_ability_tag;
        private ExtendData extend;
        private int credit_score;
        private int user_ability;
        private int urank;
        private int story_read_state;
        private int vclub_member;
        private int member_type;
        private String pic_bg;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getIdstr() {
            return idstr;
        }

        public void setIdstr(String idstr) {
            this.idstr = idstr;
        }

        public int getClassX() {
            return classX;
        }

        public void setClassX(int classX) {
            this.classX = classX;
        }

        public String getScreen_name() {
            return screen_name;
        }

        public void setScreen_name(String screen_name) {
            this.screen_name = screen_name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getProfile_image_url() {
            return profile_image_url;
        }

        public void setProfile_image_url(String profile_image_url) {
            this.profile_image_url = profile_image_url;
        }

        public String getCover_image_phone() {
            return cover_image_phone;
        }

        public void setCover_image_phone(String cover_image_phone) {
            this.cover_image_phone = cover_image_phone;
        }

        public String getProfile_url() {
            return profile_url;
        }

        public void setProfile_url(String profile_url) {
            this.profile_url = profile_url;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getWeihao() {
            return weihao;
        }

        public void setWeihao(String weihao) {
            this.weihao = weihao;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getFollowers_count() {
            return followers_count;
        }

        public void setFollowers_count(int followers_count) {
            this.followers_count = followers_count;
        }

        public int getFriends_count() {
            return friends_count;
        }

        public void setFriends_count(int friends_count) {
            this.friends_count = friends_count;
        }

        public int getPagefriends_count() {
            return pagefriends_count;
        }

        public void setPagefriends_count(int pagefriends_count) {
            this.pagefriends_count = pagefriends_count;
        }

        public int getStatuses_count() {
            return statuses_count;
        }

        public void setStatuses_count(int statuses_count) {
            this.statuses_count = statuses_count;
        }

        public int getVideo_status_count() {
            return video_status_count;
        }

        public void setVideo_status_count(int video_status_count) {
            this.video_status_count = video_status_count;
        }

        public int getFavourites_count() {
            return favourites_count;
        }

        public void setFavourites_count(int favourites_count) {
            this.favourites_count = favourites_count;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public boolean isFollowing() {
            return following;
        }

        public void setFollowing(boolean following) {
            this.following = following;
        }

        public boolean isAllow_all_act_msg() {
            return allow_all_act_msg;
        }

        public void setAllow_all_act_msg(boolean allow_all_act_msg) {
            this.allow_all_act_msg = allow_all_act_msg;
        }

        public boolean isGeo_enabled() {
            return geo_enabled;
        }

        public void setGeo_enabled(boolean geo_enabled) {
            this.geo_enabled = geo_enabled;
        }

        public boolean isVerified() {
            return verified;
        }

        public void setVerified(boolean verified) {
            this.verified = verified;
        }

        public int getVerified_type() {
            return verified_type;
        }

        public void setVerified_type(int verified_type) {
            this.verified_type = verified_type;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public InsecurityData getInsecurity() {
            return insecurity;
        }

        public void setInsecurity(InsecurityData insecurity) {
            this.insecurity = insecurity;
        }

        public StatusData getStatus() {
            return status;
        }

        public void setStatus(StatusData status) {
            this.status = status;
        }

        public int getPtype() {
            return ptype;
        }

        public void setPtype(int ptype) {
            this.ptype = ptype;
        }

        public boolean isAllow_all_comment() {
            return allow_all_comment;
        }

        public void setAllow_all_comment(boolean allow_all_comment) {
            this.allow_all_comment = allow_all_comment;
        }

        public String getAvatar_large() {
            return avatar_large;
        }

        public void setAvatar_large(String avatar_large) {
            this.avatar_large = avatar_large;
        }

        public String getAvatar_hd() {
            return avatar_hd;
        }

        public void setAvatar_hd(String avatar_hd) {
            this.avatar_hd = avatar_hd;
        }

        public String getVerified_reason() {
            return verified_reason;
        }

        public void setVerified_reason(String verified_reason) {
            this.verified_reason = verified_reason;
        }

        public String getVerified_trade() {
            return verified_trade;
        }

        public void setVerified_trade(String verified_trade) {
            this.verified_trade = verified_trade;
        }

        public String getVerified_reason_url() {
            return verified_reason_url;
        }

        public void setVerified_reason_url(String verified_reason_url) {
            this.verified_reason_url = verified_reason_url;
        }

        public String getVerified_source() {
            return verified_source;
        }

        public void setVerified_source(String verified_source) {
            this.verified_source = verified_source;
        }

        public String getVerified_source_url() {
            return verified_source_url;
        }

        public void setVerified_source_url(String verified_source_url) {
            this.verified_source_url = verified_source_url;
        }

        public boolean isFollow_me() {
            return follow_me;
        }

        public void setFollow_me(boolean follow_me) {
            this.follow_me = follow_me;
        }

        public boolean isLike() {
            return like;
        }

        public void setLike(boolean like) {
            this.like = like;
        }

        public boolean isLike_me() {
            return like_me;
        }

        public void setLike_me(boolean like_me) {
            this.like_me = like_me;
        }

        public int getOnline_status() {
            return online_status;
        }

        public void setOnline_status(int online_status) {
            this.online_status = online_status;
        }

        public int getBi_followers_count() {
            return bi_followers_count;
        }

        public void setBi_followers_count(int bi_followers_count) {
            this.bi_followers_count = bi_followers_count;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public int getStar() {
            return star;
        }

        public void setStar(int star) {
            this.star = star;
        }

        public int getMbtype() {
            return mbtype;
        }

        public void setMbtype(int mbtype) {
            this.mbtype = mbtype;
        }

        public int getMbrank() {
            return mbrank;
        }

        public void setMbrank(int mbrank) {
            this.mbrank = mbrank;
        }

        public int getBlock_word() {
            return block_word;
        }

        public void setBlock_word(int block_word) {
            this.block_word = block_word;
        }

        public int getBlock_app() {
            return block_app;
        }

        public void setBlock_app(int block_app) {
            this.block_app = block_app;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getUlevel() {
            return ulevel;
        }

        public void setUlevel(int ulevel) {
            this.ulevel = ulevel;
        }

        public int getUser_limit() {
            return user_limit;
        }

        public void setUser_limit(int user_limit) {
            this.user_limit = user_limit;
        }

        public BadgeData getBadge() {
            return badge;
        }

        public void setBadge(BadgeData badge) {
            this.badge = badge;
        }

        public String getBadge_top() {
            return badge_top;
        }

        public void setBadge_top(String badge_top) {
            this.badge_top = badge_top;
        }

        public int getHas_ability_tag() {
            return has_ability_tag;
        }

        public void setHas_ability_tag(int has_ability_tag) {
            this.has_ability_tag = has_ability_tag;
        }

        public ExtendData getExtend() {
            return extend;
        }

        public void setExtend(ExtendData extend) {
            this.extend = extend;
        }

        public int getCredit_score() {
            return credit_score;
        }

        public void setCredit_score(int credit_score) {
            this.credit_score = credit_score;
        }

        public int getUser_ability() {
            return user_ability;
        }

        public void setUser_ability(int user_ability) {
            this.user_ability = user_ability;
        }

        public int getUrank() {
            return urank;
        }

        public void setUrank(int urank) {
            this.urank = urank;
        }

        public int getStory_read_state() {
            return story_read_state;
        }

        public void setStory_read_state(int story_read_state) {
            this.story_read_state = story_read_state;
        }

        public int getVclub_member() {
            return vclub_member;
        }

        public void setVclub_member(int vclub_member) {
            this.vclub_member = vclub_member;
        }

        public int getMember_type() {
            return member_type;
        }

        public void setMember_type(int member_type) {
            this.member_type = member_type;
        }

        public String getPic_bg() {
            return pic_bg;
        }

        public void setPic_bg(String pic_bg) {
            this.pic_bg = pic_bg;
        }

        public static class InsecurityData {
            /**
             * sexual_content : false
             */

            private boolean sexual_content;

            public boolean isSexual_content() {
                return sexual_content;
            }

            public void setSexual_content(boolean sexual_content) {
                this.sexual_content = sexual_content;
            }
        }

        public static class StatusData {
            /**
             * created_at : Mon Aug 27 08:04:56 +0800 2018
             * id : 4277539264771621
             * idstr : 4277539264771621
             * mid : 4277539264771621
             * can_edit : false
             * text : 被不好的梦刺醒，闭眼睛伤心了好久。
             * textLength : 34
             * source_allowclick : 0
             * source_type : 1
             * source : <a href="http://app.weibo.com/t/feed/6NndUT" rel="nofollow">Weibo.intl</a>
             * appid : 2204484
             * favorited : false
             * truncated : false
             * in_reply_to_status_id :
             * in_reply_to_user_id :
             * in_reply_to_screen_name :
             * pic_ids : []
             * geo : null
             * is_paid : false
             * mblog_vip_type : 0
             * annotations : [{"shooting":1},{"mapi_request":true}]
             * reposts_count : 0
             * comments_count : 0
             * attitudes_count : 0
             * pending_approval_count : 0
             * isLongText : false
             * hide_flag : 0
             * mlevel : 0
             * visible : {"type":0,"list_id":0}
             * biz_feature : 0
             * hasActionTypeCard : 0
             * darwin_tags : []
             * hot_weibo_tags : []
             * text_tag_tips : []
             * mblogtype : 0
             * rid : 0
             * userType : 0
             * more_info_type : 0
             * positive_recom_flag : 0
             * content_auth : 0
             * gif_ids :
             * is_show_bulletin : 2
             * comment_manage_info : {"comment_permission_type":-1,"approval_comment_type":0}
             */

            private String created_at;
            private long id;
            private String idstr;
            private String mid;
            private boolean can_edit;
            private String text;
            private int textLength;
            private int source_allowclick;
            private int source_type;
            private String source;
            private int appid;
            private boolean favorited;
            private boolean truncated;
            private String in_reply_to_status_id;
            private String in_reply_to_user_id;
            private String in_reply_to_screen_name;
            private Object geo;
            private boolean is_paid;
            private int mblog_vip_type;
            private int reposts_count;
            private int comments_count;
            private int attitudes_count;
            private int pending_approval_count;
            private boolean isLongText;
            private int hide_flag;
            private int mlevel;
            private VisibleData visible;
            private int biz_feature;
            private int hasActionTypeCard;
            private int mblogtype;
            private String rid;
            private int userType;
            private int more_info_type;
            private int positive_recom_flag;
            private int content_auth;
            private String gif_ids;
            private int is_show_bulletin;
            private CommentManageInfoData comment_manage_info;
            private List<String> pic_ids;
            private List<?> darwin_tags;
            private List<?> hot_weibo_tags;
            private List<?> text_tag_tips;

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public String getIdstr() {
                return idstr;
            }

            public void setIdstr(String idstr) {
                this.idstr = idstr;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public boolean isCan_edit() {
                return can_edit;
            }

            public void setCan_edit(boolean can_edit) {
                this.can_edit = can_edit;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public int getTextLength() {
                return textLength;
            }

            public void setTextLength(int textLength) {
                this.textLength = textLength;
            }

            public int getSource_allowclick() {
                return source_allowclick;
            }

            public void setSource_allowclick(int source_allowclick) {
                this.source_allowclick = source_allowclick;
            }

            public int getSource_type() {
                return source_type;
            }

            public void setSource_type(int source_type) {
                this.source_type = source_type;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public int getAppid() {
                return appid;
            }

            public void setAppid(int appid) {
                this.appid = appid;
            }

            public boolean isFavorited() {
                return favorited;
            }

            public void setFavorited(boolean favorited) {
                this.favorited = favorited;
            }

            public boolean isTruncated() {
                return truncated;
            }

            public void setTruncated(boolean truncated) {
                this.truncated = truncated;
            }

            public String getIn_reply_to_status_id() {
                return in_reply_to_status_id;
            }

            public void setIn_reply_to_status_id(String in_reply_to_status_id) {
                this.in_reply_to_status_id = in_reply_to_status_id;
            }

            public String getIn_reply_to_user_id() {
                return in_reply_to_user_id;
            }

            public void setIn_reply_to_user_id(String in_reply_to_user_id) {
                this.in_reply_to_user_id = in_reply_to_user_id;
            }

            public String getIn_reply_to_screen_name() {
                return in_reply_to_screen_name;
            }

            public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
                this.in_reply_to_screen_name = in_reply_to_screen_name;
            }

            public Object getGeo() {
                return geo;
            }

            public void setGeo(Object geo) {
                this.geo = geo;
            }

            public boolean isIs_paid() {
                return is_paid;
            }

            public void setIs_paid(boolean is_paid) {
                this.is_paid = is_paid;
            }

            public int getMblog_vip_type() {
                return mblog_vip_type;
            }

            public void setMblog_vip_type(int mblog_vip_type) {
                this.mblog_vip_type = mblog_vip_type;
            }

            public int getReposts_count() {
                return reposts_count;
            }

            public void setReposts_count(int reposts_count) {
                this.reposts_count = reposts_count;
            }

            public int getComments_count() {
                return comments_count;
            }

            public void setComments_count(int comments_count) {
                this.comments_count = comments_count;
            }

            public int getAttitudes_count() {
                return attitudes_count;
            }

            public void setAttitudes_count(int attitudes_count) {
                this.attitudes_count = attitudes_count;
            }

            public int getPending_approval_count() {
                return pending_approval_count;
            }

            public void setPending_approval_count(int pending_approval_count) {
                this.pending_approval_count = pending_approval_count;
            }

            public boolean isIsLongText() {
                return isLongText;
            }

            public void setIsLongText(boolean isLongText) {
                this.isLongText = isLongText;
            }

            public int getHide_flag() {
                return hide_flag;
            }

            public void setHide_flag(int hide_flag) {
                this.hide_flag = hide_flag;
            }

            public int getMlevel() {
                return mlevel;
            }

            public void setMlevel(int mlevel) {
                this.mlevel = mlevel;
            }

            public VisibleData getVisible() {
                return visible;
            }

            public void setVisible(VisibleData visible) {
                this.visible = visible;
            }

            public int getBiz_feature() {
                return biz_feature;
            }

            public void setBiz_feature(int biz_feature) {
                this.biz_feature = biz_feature;
            }

            public int getHasActionTypeCard() {
                return hasActionTypeCard;
            }

            public void setHasActionTypeCard(int hasActionTypeCard) {
                this.hasActionTypeCard = hasActionTypeCard;
            }

            public int getMblogtype() {
                return mblogtype;
            }

            public void setMblogtype(int mblogtype) {
                this.mblogtype = mblogtype;
            }

            public String getRid() {
                return rid;
            }

            public void setRid(String rid) {
                this.rid = rid;
            }

            public int getUserType() {
                return userType;
            }

            public void setUserType(int userType) {
                this.userType = userType;
            }

            public int getMore_info_type() {
                return more_info_type;
            }

            public void setMore_info_type(int more_info_type) {
                this.more_info_type = more_info_type;
            }

            public int getPositive_recom_flag() {
                return positive_recom_flag;
            }

            public void setPositive_recom_flag(int positive_recom_flag) {
                this.positive_recom_flag = positive_recom_flag;
            }

            public int getContent_auth() {
                return content_auth;
            }

            public void setContent_auth(int content_auth) {
                this.content_auth = content_auth;
            }

            public String getGif_ids() {
                return gif_ids;
            }

            public void setGif_ids(String gif_ids) {
                this.gif_ids = gif_ids;
            }

            public int getIs_show_bulletin() {
                return is_show_bulletin;
            }

            public void setIs_show_bulletin(int is_show_bulletin) {
                this.is_show_bulletin = is_show_bulletin;
            }

            public CommentManageInfoData getComment_manage_info() {
                return comment_manage_info;
            }

            public void setComment_manage_info(CommentManageInfoData comment_manage_info) {
                this.comment_manage_info = comment_manage_info;
            }

            public List<String> getPic_ids() {
                return pic_ids;
            }

            public void setPic_ids(List<String> pic_ids) {
                this.pic_ids = pic_ids;
            }

            public List<?> getDarwin_tags() {
                return darwin_tags;
            }

            public void setDarwin_tags(List<?> darwin_tags) {
                this.darwin_tags = darwin_tags;
            }

            public List<?> getHot_weibo_tags() {
                return hot_weibo_tags;
            }

            public void setHot_weibo_tags(List<?> hot_weibo_tags) {
                this.hot_weibo_tags = hot_weibo_tags;
            }

            public List<?> getText_tag_tips() {
                return text_tag_tips;
            }

            public void setText_tag_tips(List<?> text_tag_tips) {
                this.text_tag_tips = text_tag_tips;
            }

            public static class VisibleData {
                /**
                 * type : 0
                 * list_id : 0
                 */

                private int type;
                private int list_id;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public int getList_id() {
                    return list_id;
                }

                public void setList_id(int list_id) {
                    this.list_id = list_id;
                }
            }

            public static class CommentManageInfoData {
                /**
                 * comment_permission_type : -1
                 * approval_comment_type : 0
                 */

                private int comment_permission_type;
                private int approval_comment_type;

                public int getComment_permission_type() {
                    return comment_permission_type;
                }

                public void setComment_permission_type(int comment_permission_type) {
                    this.comment_permission_type = comment_permission_type;
                }

                public int getApproval_comment_type() {
                    return approval_comment_type;
                }

                public void setApproval_comment_type(int approval_comment_type) {
                    this.approval_comment_type = approval_comment_type;
                }
            }

            public static class AnnotationsData {
                /**
                 * shooting : 1
                 * mapi_request : true
                 */

                private int shooting;
                private boolean mapi_request;

                public int getShooting() {
                    return shooting;
                }

                public void setShooting(int shooting) {
                    this.shooting = shooting;
                }

                public boolean isMapi_request() {
                    return mapi_request;
                }

                public void setMapi_request(boolean mapi_request) {
                    this.mapi_request = mapi_request;
                }
            }
        }

        public static class BadgeData {
            /**
             * uc_domain : 0
             * enterprise : 0
             * anniversary : 0
             * taobao : 0
             * gongyi : 0
             * gongyi_level : 0
             * bind_taobao : 0
             * dailv : 0
             * zongyiji : 0
             * vip_activity1 : 0
             * unread_pool : 0
             * daiyan : 0
             * ali_1688 : 0
             * vip_activity2 : 0
             * fools_day_2016 : 0
             * uefa_euro_2016 : 0
             * unread_pool_ext : 0
             * self_media : 0
             * dzwbqlx_2016 : 0
             * discount_2016 : 0
             * follow_whitelist_video : 0
             * league_badge : 0
             * lol_msi_2017 : 0
             * super_star_2017 : 0
             * video_attention : 0
             * travel_2017 : 0
             * lol_gm_2017 : 0
             * cz_wed_2017 : 0
             * inspector : 0
             * panda : 0
             * uve_icon : 0
             * user_name_certificate : 1
             * suishoupai_2018 : 0
             * wenda : 0
             * wenchuan_10th : 0
             * super_star_2018 : 0
             * worldcup_2018 : 0
             * wenda_v2 : 0
             * league_badge_2018 : 0
             * dailv_2018 : 0
             * asiad_2018 : 0
             * qixi_2018 : 0
             */

            private int uc_domain;
            private int enterprise;
            private int anniversary;
            private int taobao;
            private int gongyi;
            private int gongyi_level;
            private int bind_taobao;
            private int dailv;
            private int zongyiji;
            private int vip_activity1;
            private int unread_pool;
            private int daiyan;
            private int ali_1688;
            private int vip_activity2;
            private int fools_day_2016;
            private int uefa_euro_2016;
            private int unread_pool_ext;
            private int self_media;
            private int dzwbqlx_2016;
            private int discount_2016;
            private int follow_whitelist_video;
            private int league_badge;
            private int lol_msi_2017;
            private int super_star_2017;
            private int video_attention;
            private int travel_2017;
            private int lol_gm_2017;
            private int cz_wed_2017;
            private int inspector;
            private int panda;
            private int uve_icon;
            private int user_name_certificate;
            private int suishoupai_2018;
            private int wenda;
            private int wenchuan_10th;
            private int super_star_2018;
            private int worldcup_2018;
            private int wenda_v2;
            private int league_badge_2018;
            private int dailv_2018;
            private int asiad_2018;
            private int qixi_2018;

            public int getUc_domain() {
                return uc_domain;
            }

            public void setUc_domain(int uc_domain) {
                this.uc_domain = uc_domain;
            }

            public int getEnterprise() {
                return enterprise;
            }

            public void setEnterprise(int enterprise) {
                this.enterprise = enterprise;
            }

            public int getAnniversary() {
                return anniversary;
            }

            public void setAnniversary(int anniversary) {
                this.anniversary = anniversary;
            }

            public int getTaobao() {
                return taobao;
            }

            public void setTaobao(int taobao) {
                this.taobao = taobao;
            }

            public int getGongyi() {
                return gongyi;
            }

            public void setGongyi(int gongyi) {
                this.gongyi = gongyi;
            }

            public int getGongyi_level() {
                return gongyi_level;
            }

            public void setGongyi_level(int gongyi_level) {
                this.gongyi_level = gongyi_level;
            }

            public int getBind_taobao() {
                return bind_taobao;
            }

            public void setBind_taobao(int bind_taobao) {
                this.bind_taobao = bind_taobao;
            }

            public int getDailv() {
                return dailv;
            }

            public void setDailv(int dailv) {
                this.dailv = dailv;
            }

            public int getZongyiji() {
                return zongyiji;
            }

            public void setZongyiji(int zongyiji) {
                this.zongyiji = zongyiji;
            }

            public int getVip_activity1() {
                return vip_activity1;
            }

            public void setVip_activity1(int vip_activity1) {
                this.vip_activity1 = vip_activity1;
            }

            public int getUnread_pool() {
                return unread_pool;
            }

            public void setUnread_pool(int unread_pool) {
                this.unread_pool = unread_pool;
            }

            public int getDaiyan() {
                return daiyan;
            }

            public void setDaiyan(int daiyan) {
                this.daiyan = daiyan;
            }

            public int getAli_1688() {
                return ali_1688;
            }

            public void setAli_1688(int ali_1688) {
                this.ali_1688 = ali_1688;
            }

            public int getVip_activity2() {
                return vip_activity2;
            }

            public void setVip_activity2(int vip_activity2) {
                this.vip_activity2 = vip_activity2;
            }

            public int getFools_day_2016() {
                return fools_day_2016;
            }

            public void setFools_day_2016(int fools_day_2016) {
                this.fools_day_2016 = fools_day_2016;
            }

            public int getUefa_euro_2016() {
                return uefa_euro_2016;
            }

            public void setUefa_euro_2016(int uefa_euro_2016) {
                this.uefa_euro_2016 = uefa_euro_2016;
            }

            public int getUnread_pool_ext() {
                return unread_pool_ext;
            }

            public void setUnread_pool_ext(int unread_pool_ext) {
                this.unread_pool_ext = unread_pool_ext;
            }

            public int getSelf_media() {
                return self_media;
            }

            public void setSelf_media(int self_media) {
                this.self_media = self_media;
            }

            public int getDzwbqlx_2016() {
                return dzwbqlx_2016;
            }

            public void setDzwbqlx_2016(int dzwbqlx_2016) {
                this.dzwbqlx_2016 = dzwbqlx_2016;
            }

            public int getDiscount_2016() {
                return discount_2016;
            }

            public void setDiscount_2016(int discount_2016) {
                this.discount_2016 = discount_2016;
            }

            public int getFollow_whitelist_video() {
                return follow_whitelist_video;
            }

            public void setFollow_whitelist_video(int follow_whitelist_video) {
                this.follow_whitelist_video = follow_whitelist_video;
            }

            public int getLeague_badge() {
                return league_badge;
            }

            public void setLeague_badge(int league_badge) {
                this.league_badge = league_badge;
            }

            public int getLol_msi_2017() {
                return lol_msi_2017;
            }

            public void setLol_msi_2017(int lol_msi_2017) {
                this.lol_msi_2017 = lol_msi_2017;
            }

            public int getSuper_star_2017() {
                return super_star_2017;
            }

            public void setSuper_star_2017(int super_star_2017) {
                this.super_star_2017 = super_star_2017;
            }

            public int getVideo_attention() {
                return video_attention;
            }

            public void setVideo_attention(int video_attention) {
                this.video_attention = video_attention;
            }

            public int getTravel_2017() {
                return travel_2017;
            }

            public void setTravel_2017(int travel_2017) {
                this.travel_2017 = travel_2017;
            }

            public int getLol_gm_2017() {
                return lol_gm_2017;
            }

            public void setLol_gm_2017(int lol_gm_2017) {
                this.lol_gm_2017 = lol_gm_2017;
            }

            public int getCz_wed_2017() {
                return cz_wed_2017;
            }

            public void setCz_wed_2017(int cz_wed_2017) {
                this.cz_wed_2017 = cz_wed_2017;
            }

            public int getInspector() {
                return inspector;
            }

            public void setInspector(int inspector) {
                this.inspector = inspector;
            }

            public int getPanda() {
                return panda;
            }

            public void setPanda(int panda) {
                this.panda = panda;
            }

            public int getUve_icon() {
                return uve_icon;
            }

            public void setUve_icon(int uve_icon) {
                this.uve_icon = uve_icon;
            }

            public int getUser_name_certificate() {
                return user_name_certificate;
            }

            public void setUser_name_certificate(int user_name_certificate) {
                this.user_name_certificate = user_name_certificate;
            }

            public int getSuishoupai_2018() {
                return suishoupai_2018;
            }

            public void setSuishoupai_2018(int suishoupai_2018) {
                this.suishoupai_2018 = suishoupai_2018;
            }

            public int getWenda() {
                return wenda;
            }

            public void setWenda(int wenda) {
                this.wenda = wenda;
            }

            public int getWenchuan_10th() {
                return wenchuan_10th;
            }

            public void setWenchuan_10th(int wenchuan_10th) {
                this.wenchuan_10th = wenchuan_10th;
            }

            public int getSuper_star_2018() {
                return super_star_2018;
            }

            public void setSuper_star_2018(int super_star_2018) {
                this.super_star_2018 = super_star_2018;
            }

            public int getWorldcup_2018() {
                return worldcup_2018;
            }

            public void setWorldcup_2018(int worldcup_2018) {
                this.worldcup_2018 = worldcup_2018;
            }

            public int getWenda_v2() {
                return wenda_v2;
            }

            public void setWenda_v2(int wenda_v2) {
                this.wenda_v2 = wenda_v2;
            }

            public int getLeague_badge_2018() {
                return league_badge_2018;
            }

            public void setLeague_badge_2018(int league_badge_2018) {
                this.league_badge_2018 = league_badge_2018;
            }

            public int getDailv_2018() {
                return dailv_2018;
            }

            public void setDailv_2018(int dailv_2018) {
                this.dailv_2018 = dailv_2018;
            }

            public int getAsiad_2018() {
                return asiad_2018;
            }

            public void setAsiad_2018(int asiad_2018) {
                this.asiad_2018 = asiad_2018;
            }

            public int getQixi_2018() {
                return qixi_2018;
            }

            public void setQixi_2018(int qixi_2018) {
                this.qixi_2018 = qixi_2018;
            }
        }

        public static class ExtendData {
            /**
             * privacy : {"mobile":1}
             * mbprivilege : 0000000000000000000000000000000000000000000000000000000000000000
             */

            private PrivacyData privacy;
            private String mbprivilege;

            public PrivacyData getPrivacy() {
                return privacy;
            }

            public void setPrivacy(PrivacyData privacy) {
                this.privacy = privacy;
            }

            public String getMbprivilege() {
                return mbprivilege;
            }

            public void setMbprivilege(String mbprivilege) {
                this.mbprivilege = mbprivilege;
            }

            public static class PrivacyData {
                /**
                 * mobile : 1
                 */

                private int mobile;

                public int getMobile() {
                    return mobile;
                }

                public void setMobile(int mobile) {
                    this.mobile = mobile;
                }
            }
        }
    }
}
}
