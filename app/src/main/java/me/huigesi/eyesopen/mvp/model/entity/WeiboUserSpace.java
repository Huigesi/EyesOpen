package me.huigesi.eyesopen.mvp.model.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeiboUserSpace {

    private long id;
    private String idstr;
    @SerializedName("class")
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
    private int credit_score;
    private int user_ability;
    private int urank;
    private int story_read_state;
    private int vclub_member;
    private String pic_bg;
    private int sunshine_rank;
    private String sunshine_scheme;
    private int cover_image_phone_level;
    private int is_new;
    private int add_top_follow_card;
    private int switch_unread_feed;
    private String verified_scheme;
    private String urank_scheme;
    private List<CoversData> covers;

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

    public String getPic_bg() {
        return pic_bg;
    }

    public void setPic_bg(String pic_bg) {
        this.pic_bg = pic_bg;
    }

    public int getSunshine_rank() {
        return sunshine_rank;
    }

    public void setSunshine_rank(int sunshine_rank) {
        this.sunshine_rank = sunshine_rank;
    }

    public String getSunshine_scheme() {
        return sunshine_scheme;
    }

    public void setSunshine_scheme(String sunshine_scheme) {
        this.sunshine_scheme = sunshine_scheme;
    }

    public int getCover_image_phone_level() {
        return cover_image_phone_level;
    }

    public void setCover_image_phone_level(int cover_image_phone_level) {
        this.cover_image_phone_level = cover_image_phone_level;
    }

    public int getIs_new() {
        return is_new;
    }

    public void setIs_new(int is_new) {
        this.is_new = is_new;
    }

    public int getAdd_top_follow_card() {
        return add_top_follow_card;
    }

    public void setAdd_top_follow_card(int add_top_follow_card) {
        this.add_top_follow_card = add_top_follow_card;
    }

    public int getSwitch_unread_feed() {
        return switch_unread_feed;
    }

    public void setSwitch_unread_feed(int switch_unread_feed) {
        this.switch_unread_feed = switch_unread_feed;
    }

    public String getVerified_scheme() {
        return verified_scheme;
    }

    public void setVerified_scheme(String verified_scheme) {
        this.verified_scheme = verified_scheme;
    }

    public String getUrank_scheme() {
        return urank_scheme;
    }

    public void setUrank_scheme(String urank_scheme) {
        this.urank_scheme = urank_scheme;
    }

    public List<CoversData> getCovers() {
        return covers;
    }

    public void setCovers(List<CoversData> covers) {
        this.covers = covers;
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
         * created_at : Fri Aug 24 14:44:02 +0800 2018
         * id : 4276552537295661
         * idstr : 4276552537295661
         * mid : 4276552537295661
         * can_edit : false
         * text : 好看。
         * source_allowclick : 0
         * source_type : 2
         * source : <a href="http://weibo.com/" rel="nofollow">iPhone X</a>
         * appid : 2453752
         * favorited : false
         * truncated : false
         * in_reply_to_status_id :
         * in_reply_to_user_id :
         * in_reply_to_screen_name :
         * pic_ids : []
         * geo : null
         * is_paid : false
         * mblog_vip_type : 0
         * annotations : [{"mapi_request":true}]
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
        private List<?> pic_ids;
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

        public List<?> getPic_ids() {
            return pic_ids;
        }

        public void setPic_ids(List<?> pic_ids) {
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
             * mapi_request : true
             */

            private boolean mapi_request;

            public boolean isMapi_request() {
                return mapi_request;
            }

            public void setMapi_request(boolean mapi_request) {
                this.mapi_request = mapi_request;
            }
        }
    }

    public static class CoversData {
        /**
         * pid : 48a8ceddly1fbiivn6cadj20ku0ktq4m
         * cover_thumbnails : https://wx2.sinaimg.cn/thumbnail/48a8ceddly1fbiivn6cadj20ku0ktq4m.jpg
         * cover : https://wx2.sinaimg.cn/woriginal/48a8ceddly1fbiivn6cadj20ku0ktq4m.jpg
         */

        private String pid;
        private String cover_thumbnails;
        private String cover;

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getCover_thumbnails() {
            return cover_thumbnails;
        }

        public void setCover_thumbnails(String cover_thumbnails) {
            this.cover_thumbnails = cover_thumbnails;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }
    }
}
