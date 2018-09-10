package me.huigesi.eyesopen.mvp.model.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeiboNews {

    private boolean hasvisible;
    private int previous_cursor;
    private long next_cursor;
    private int total_number;
    private int interval;
    private int uve_blank;
    private long since_id;
    private long max_id;
    private int has_unread;
    private String gsid;
    private List<StatusesData> statuses;
    private List<?> advertises;
    private List<Object> ad;

    public boolean isHasvisible() {
        return hasvisible;
    }

    public void setHasvisible(boolean hasvisible) {
        this.hasvisible = hasvisible;
    }

    public int getPrevious_cursor() {
        return previous_cursor;
    }

    public void setPrevious_cursor(int previous_cursor) {
        this.previous_cursor = previous_cursor;
    }

    public long getNext_cursor() {
        return next_cursor;
    }

    public void setNext_cursor(long next_cursor) {
        this.next_cursor = next_cursor;
    }

    public int getTotal_number() {
        return total_number;
    }

    public void setTotal_number(int total_number) {
        this.total_number = total_number;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getUve_blank() {
        return uve_blank;
    }

    public void setUve_blank(int uve_blank) {
        this.uve_blank = uve_blank;
    }

    public long getSince_id() {
        return since_id;
    }

    public void setSince_id(long since_id) {
        this.since_id = since_id;
    }

    public long getMax_id() {
        return max_id;
    }

    public void setMax_id(long max_id) {
        this.max_id = max_id;
    }

    public int getHas_unread() {
        return has_unread;
    }

    public void setHas_unread(int has_unread) {
        this.has_unread = has_unread;
    }

    public String getGsid() {
        return gsid;
    }

    public void setGsid(String gsid) {
        this.gsid = gsid;
    }

    public List<StatusesData> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<StatusesData> statuses) {
        this.statuses = statuses;
    }

    public List<?> getAdvertises() {
        return advertises;
    }

    public void setAdvertises(List<?> advertises) {
        this.advertises = advertises;
    }

    public List<Object> getAd() {
        return ad;
    }

    public void setAd(List<Object> ad) {
        this.ad = ad;
    }

    public static class StatusesData {

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
        private String thumbnail_pic;
        private String bmiddle_pic;
        private String original_pic;
        private Object geo;
        private boolean is_paid;
        private int mblog_vip_type;
        private UserData user;
        private int reposts_count;
        private int comments_count;
        private int attitudes_count;
        private int pending_approval_count;
        private boolean isLongText;
        private int hide_flag;
        private int mlevel;
        private VisibleData visible;
        private long biz_feature;
        private int hasActionTypeCard;
        private int mblogtype;
        private String rid;
        private int userType;
        private int more_info_type;
        private String cardid;
        private int positive_recom_flag;
        private int content_auth;
        private String gif_ids;
        private int is_show_bulletin;
        private CommentManageInfoData comment_manage_info;
        private String mblogtypename;
        private PicInfosData pic_infos;
        private String mblogid;
        private String scheme;
        private int attitudes_status;
        private int recom_state;
        private int weibo_position;
        private EditConfigData edit_config;
        private long pid;
        private RetweetedStatusData retweeted_status;
        private String obj_ext;
        private PageInfoData page_info;
        private int page_type;
        private int edit_count;
        private String edit_at;
        private String mlevelSource;
        private List<String> pic_ids;
        private List<?> text_tag_tips;
        private List<UrlStructData> url_struct;
        private List<TopicStructData> topic_struct;
        private List<TagStructData> tag_struct;

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

        public String getThumbnail_pic() {
            return thumbnail_pic;
        }

        public void setThumbnail_pic(String thumbnail_pic) {
            this.thumbnail_pic = thumbnail_pic;
        }

        public String getBmiddle_pic() {
            return bmiddle_pic;
        }

        public void setBmiddle_pic(String bmiddle_pic) {
            this.bmiddle_pic = bmiddle_pic;
        }

        public String getOriginal_pic() {
            return original_pic;
        }

        public void setOriginal_pic(String original_pic) {
            this.original_pic = original_pic;
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

        public UserData getUser() {
            return user;
        }

        public void setUser(UserData user) {
            this.user = user;
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

        public long getBiz_feature() {
            return biz_feature;
        }

        public void setBiz_feature(long biz_feature) {
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

        public String getCardid() {
            return cardid;
        }

        public void setCardid(String cardid) {
            this.cardid = cardid;
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

        public String getMblogtypename() {
            return mblogtypename;
        }

        public void setMblogtypename(String mblogtypename) {
            this.mblogtypename = mblogtypename;
        }

        public PicInfosData getPic_infos() {
            return pic_infos;
        }

        public void setPic_infos(PicInfosData pic_infos) {
            this.pic_infos = pic_infos;
        }

        public String getMblogid() {
            return mblogid;
        }

        public void setMblogid(String mblogid) {
            this.mblogid = mblogid;
        }

        public String getScheme() {
            return scheme;
        }

        public void setScheme(String scheme) {
            this.scheme = scheme;
        }

        public int getAttitudes_status() {
            return attitudes_status;
        }

        public void setAttitudes_status(int attitudes_status) {
            this.attitudes_status = attitudes_status;
        }

        public int getRecom_state() {
            return recom_state;
        }

        public void setRecom_state(int recom_state) {
            this.recom_state = recom_state;
        }

        public int getWeibo_position() {
            return weibo_position;
        }

        public void setWeibo_position(int weibo_position) {
            this.weibo_position = weibo_position;
        }

        public EditConfigData getEdit_config() {
            return edit_config;
        }

        public void setEdit_config(EditConfigData edit_config) {
            this.edit_config = edit_config;
        }

        public long getPid() {
            return pid;
        }

        public void setPid(long pid) {
            this.pid = pid;
        }

        public RetweetedStatusData getRetweeted_status() {
            return retweeted_status;
        }

        public void setRetweeted_status(RetweetedStatusData retweeted_status) {
            this.retweeted_status = retweeted_status;
        }

        public String getObj_ext() {
            return obj_ext;
        }

        public void setObj_ext(String obj_ext) {
            this.obj_ext = obj_ext;
        }

        public PageInfoData getPage_info() {
            return page_info;
        }

        public void setPage_info(PageInfoData page_info) {
            this.page_info = page_info;
        }

        public int getPage_type() {
            return page_type;
        }

        public void setPage_type(int page_type) {
            this.page_type = page_type;
        }

        public int getEdit_count() {
            return edit_count;
        }

        public void setEdit_count(int edit_count) {
            this.edit_count = edit_count;
        }

        public String getEdit_at() {
            return edit_at;
        }

        public void setEdit_at(String edit_at) {
            this.edit_at = edit_at;
        }

        public String getMlevelSource() {
            return mlevelSource;
        }

        public void setMlevelSource(String mlevelSource) {
            this.mlevelSource = mlevelSource;
        }

        public List<String> getPic_ids() {
            return pic_ids;
        }

        public void setPic_ids(List<String> pic_ids) {
            this.pic_ids = pic_ids;
        }

        public List<?> getText_tag_tips() {
            return text_tag_tips;
        }

        public void setText_tag_tips(List<?> text_tag_tips) {
            this.text_tag_tips = text_tag_tips;
        }

        public List<UrlStructData> getUrl_struct() {
            return url_struct;
        }

        public void setUrl_struct(List<UrlStructData> url_struct) {
            this.url_struct = url_struct;
        }

        public List<TopicStructData> getTopic_struct() {
            return topic_struct;
        }

        public void setTopic_struct(List<TopicStructData> topic_struct) {
            this.topic_struct = topic_struct;
        }

        public List<TagStructData> getTag_struct() {
            return tag_struct;
        }

        public void setTag_struct(List<TagStructData> tag_struct) {
            this.tag_struct = tag_struct;
        }

        public static class UserData {

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
            private String cover_image;
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
            private int ptype;
            private boolean allow_all_comment;
            private String avatar_large;
            private String avatar_hd;
            private String verified_reason;
            private String verified_trade;
            private String verified_reason_url;
            private String verified_source;
            private String verified_source_url;
            private int verified_state;
            private int verified_level;
            private int verified_type_ext;
            private boolean has_service_tel;
            private String verified_reason_modified;
            private String verified_contact_name;
            private String verified_contact_email;
            private String verified_contact_mobile;
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
            private String cardid;
            private String avatargj_id;
            private int urank;
            private int story_read_state;
            private String story_id;
            private int vclub_member;

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

            public String getCover_image() {
                return cover_image;
            }

            public void setCover_image(String cover_image) {
                this.cover_image = cover_image;
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

            public int getVerified_state() {
                return verified_state;
            }

            public void setVerified_state(int verified_state) {
                this.verified_state = verified_state;
            }

            public int getVerified_level() {
                return verified_level;
            }

            public void setVerified_level(int verified_level) {
                this.verified_level = verified_level;
            }

            public int getVerified_type_ext() {
                return verified_type_ext;
            }

            public void setVerified_type_ext(int verified_type_ext) {
                this.verified_type_ext = verified_type_ext;
            }

            public boolean isHas_service_tel() {
                return has_service_tel;
            }

            public void setHas_service_tel(boolean has_service_tel) {
                this.has_service_tel = has_service_tel;
            }

            public String getVerified_reason_modified() {
                return verified_reason_modified;
            }

            public void setVerified_reason_modified(String verified_reason_modified) {
                this.verified_reason_modified = verified_reason_modified;
            }

            public String getVerified_contact_name() {
                return verified_contact_name;
            }

            public void setVerified_contact_name(String verified_contact_name) {
                this.verified_contact_name = verified_contact_name;
            }

            public String getVerified_contact_email() {
                return verified_contact_email;
            }

            public void setVerified_contact_email(String verified_contact_email) {
                this.verified_contact_email = verified_contact_email;
            }

            public String getVerified_contact_mobile() {
                return verified_contact_mobile;
            }

            public void setVerified_contact_mobile(String verified_contact_mobile) {
                this.verified_contact_mobile = verified_contact_mobile;
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

            public String getCardid() {
                return cardid;
            }

            public void setCardid(String cardid) {
                this.cardid = cardid;
            }

            public String getAvatargj_id() {
                return avatargj_id;
            }

            public void setAvatargj_id(String avatargj_id) {
                this.avatargj_id = avatargj_id;
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

            public String getStory_id() {
                return story_id;
            }

            public void setStory_id(String story_id) {
                this.story_id = story_id;
            }

            public int getVclub_member() {
                return vclub_member;
            }

            public void setVclub_member(int vclub_member) {
                this.vclub_member = vclub_member;
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

            public static class BadgeData {
                /**
                 * uc_domain : 0
                 * enterprise : 0
                 * anniversary : 0
                 * taobao : 0
                 * gongyi : 0
                 * gongyi_level : 0
                 * bind_taobao : 1
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
                 * follow_whitelist_video : 1
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
                 * worldcup_2018 : 34
                 * wenda_v2 : 1
                 * league_badge_2018 : 0
                 * dailv_2018 : 1
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
                 * privacy : {"mobile":0}
                 * mbprivilege : 0000000000000000000000000000000000000000000000000000000004c00208
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
                     * mobile : 0
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

        public static class PicInfosData {
            /**
             * eb6b32d3ly1fuc1fy3ernj20zk0k0wy6 : {"thumbnail":{"url":"https://wx3.sinaimg.cn/wap180/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg","width":180,"height":101,"cut_type":1,"type":null},"bmiddle":{"url":"https://wx3.sinaimg.cn/wap360/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg","width":360,"height":202,"cut_type":1,"type":null},"large":{"url":"https://wx3.sinaimg.cn/wap720/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg","width":720,"height":405,"cut_type":1,"type":null},"original":{"url":"https://wx3.sinaimg.cn/woriginal/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg","width":"1280","height":"720","cut_type":1,"type":null},"largest":{"url":"https://wx3.sinaimg.cn/large/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg","width":"1280","height":"720","cut_type":1,"type":null},"object_id":"1042018:fb4bc848ceaec8afc079cd64c8d6be20","pic_id":"eb6b32d3ly1fuc1fy3ernj20zk0k0wy6","photo_tag":0,"type":"pic","pic_status":0}
             * eb6b32d3ly1fuc1g6gddbj20zk0k0avw : {"thumbnail":{"url":"https://wx4.sinaimg.cn/wap180/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg","width":180,"height":101,"cut_type":1,"type":null},"bmiddle":{"url":"https://wx4.sinaimg.cn/wap360/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg","width":360,"height":202,"cut_type":1,"type":null},"large":{"url":"https://wx4.sinaimg.cn/wap720/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg","width":720,"height":405,"cut_type":1,"type":null},"original":{"url":"https://wx4.sinaimg.cn/woriginal/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg","width":"1280","height":"720","cut_type":1,"type":null},"largest":{"url":"https://wx4.sinaimg.cn/large/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg","width":"1280","height":"720","cut_type":1,"type":null},"object_id":"1042018:22bc5151c4dd348d413c09e514c427db","pic_id":"eb6b32d3ly1fuc1g6gddbj20zk0k0avw","photo_tag":0,"type":"pic","pic_status":0}
             * eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j : {"thumbnail":{"url":"https://wx4.sinaimg.cn/wap180/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg","width":180,"height":101,"cut_type":1,"type":null},"bmiddle":{"url":"https://wx4.sinaimg.cn/wap360/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg","width":360,"height":202,"cut_type":1,"type":null},"large":{"url":"https://wx4.sinaimg.cn/wap720/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg","width":720,"height":405,"cut_type":1,"type":null},"original":{"url":"https://wx4.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg","width":"1280","height":"720","cut_type":1,"type":null},"largest":{"url":"https://wx4.sinaimg.cn/large/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg","width":"1280","height":"720","cut_type":1,"type":null},"object_id":"1042018:43286aafa479726c3c14ec1e6a729dd8","pic_id":"eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j","photo_tag":0,"type":"pic","pic_status":0}
             * eb6b32d3ly1fuc1gfsb6xj20zk0k0awt : {"thumbnail":{"url":"https://wx2.sinaimg.cn/wap180/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg","width":180,"height":101,"cut_type":1,"type":null},"bmiddle":{"url":"https://wx2.sinaimg.cn/wap360/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg","width":360,"height":202,"cut_type":1,"type":null},"large":{"url":"https://wx2.sinaimg.cn/wap720/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg","width":720,"height":405,"cut_type":1,"type":null},"original":{"url":"https://wx2.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg","width":"1280","height":"720","cut_type":1,"type":null},"largest":{"url":"https://wx2.sinaimg.cn/large/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg","width":"1280","height":"720","cut_type":1,"type":null},"object_id":"1042018:25685de9156d1ef3e731f6e4cb3fa032","pic_id":"eb6b32d3ly1fuc1gfsb6xj20zk0k0awt","photo_tag":0,"type":"pic","pic_status":0}
             * eb6b32d3ly1fuc1ghv0dxj20zk0k0e66 : {"thumbnail":{"url":"https://wx4.sinaimg.cn/wap180/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg","width":180,"height":101,"cut_type":1,"type":null},"bmiddle":{"url":"https://wx4.sinaimg.cn/wap360/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg","width":360,"height":202,"cut_type":1,"type":null},"large":{"url":"https://wx4.sinaimg.cn/wap720/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg","width":720,"height":405,"cut_type":1,"type":null},"original":{"url":"https://wx4.sinaimg.cn/woriginal/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg","width":"1280","height":"720","cut_type":1,"type":null},"largest":{"url":"https://wx4.sinaimg.cn/large/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg","width":"1280","height":"720","cut_type":1,"type":null},"object_id":"1042018:3139ee8ce8df30031936aa5da93b1b12","pic_id":"eb6b32d3ly1fuc1ghv0dxj20zk0k0e66","photo_tag":0,"type":"pic","pic_status":0}
             * eb6b32d3ly1fuc1gjfw8gj20zk0k01kx : {"thumbnail":{"url":"https://wx4.sinaimg.cn/wap180/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg","width":180,"height":101,"cut_type":1,"type":null},"bmiddle":{"url":"https://wx4.sinaimg.cn/wap360/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg","width":360,"height":202,"cut_type":1,"type":null},"large":{"url":"https://wx4.sinaimg.cn/wap720/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg","width":720,"height":405,"cut_type":1,"type":null},"original":{"url":"https://wx4.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg","width":"1280","height":"720","cut_type":1,"type":null},"largest":{"url":"https://wx4.sinaimg.cn/large/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg","width":"1280","height":"720","cut_type":1,"type":null},"object_id":"1042018:1bb0fcf396ba880032f4247cc9c6b785","pic_id":"eb6b32d3ly1fuc1gjfw8gj20zk0k01kx","photo_tag":0,"type":"pic","pic_status":0}
             * eb6b32d3ly1fuc1gt91z2j20zk0ne4qp : {"thumbnail":{"url":"https://wx1.sinaimg.cn/wap180/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg","width":180,"height":118,"cut_type":1,"type":null},"bmiddle":{"url":"https://wx1.sinaimg.cn/wap360/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg","width":360,"height":236,"cut_type":1,"type":null},"large":{"url":"https://wx1.sinaimg.cn/wap720/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg","width":720,"height":473,"cut_type":1,"type":null},"original":{"url":"https://wx1.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg","width":"1280","height":"842","cut_type":1,"type":null},"largest":{"url":"https://wx1.sinaimg.cn/large/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg","width":"1280","height":"842","cut_type":1,"type":null},"object_id":"1042018:fdfa02a4880654212e11549c11b69104","pic_id":"eb6b32d3ly1fuc1gt91z2j20zk0ne4qp","photo_tag":0,"type":"pic","pic_status":0}
             * eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8 : {"thumbnail":{"url":"https://wx2.sinaimg.cn/wap180/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg","width":180,"height":101,"cut_type":1,"type":null},"bmiddle":{"url":"https://wx2.sinaimg.cn/wap360/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg","width":360,"height":202,"cut_type":1,"type":null},"large":{"url":"https://wx2.sinaimg.cn/wap720/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg","width":720,"height":405,"cut_type":1,"type":null},"original":{"url":"https://wx2.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg","width":"1280","height":"720","cut_type":1,"type":null},"largest":{"url":"https://wx2.sinaimg.cn/large/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg","width":"1280","height":"720","cut_type":1,"type":null},"object_id":"1042018:1054f9ce4ccae22c5ff0827e2e5974e7","pic_id":"eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8","photo_tag":0,"type":"pic","pic_status":0}
             * eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz : {"thumbnail":{"url":"https://wx3.sinaimg.cn/wap180/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg","width":180,"height":101,"cut_type":1,"type":null},"bmiddle":{"url":"https://wx3.sinaimg.cn/wap360/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg","width":360,"height":202,"cut_type":1,"type":null},"large":{"url":"https://wx3.sinaimg.cn/wap720/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg","width":720,"height":405,"cut_type":1,"type":null},"original":{"url":"https://wx3.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg","width":"1280","height":"720","cut_type":1,"type":null},"largest":{"url":"https://wx3.sinaimg.cn/large/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg","width":"1280","height":"720","cut_type":1,"type":null},"object_id":"1042018:717119d31f5fe1077c15021884e98ec0","pic_id":"eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz","photo_tag":0,"type":"pic","pic_status":0}
             */

            private Eb6b32d3ly1fuc1fy3ernj20zk0k0wy6Data eb6b32d3ly1fuc1fy3ernj20zk0k0wy6;
            private Eb6b32d3ly1fuc1g6gddbj20zk0k0avwData eb6b32d3ly1fuc1g6gddbj20zk0k0avw;
            private Eb6b32d3ly1fuc1gdlxrbj20zk0k0b0jData eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j;
            private Eb6b32d3ly1fuc1gfsb6xj20zk0k0awtData eb6b32d3ly1fuc1gfsb6xj20zk0k0awt;
            private Eb6b32d3ly1fuc1ghv0dxj20zk0k0e66Data eb6b32d3ly1fuc1ghv0dxj20zk0k0e66;
            private Eb6b32d3ly1fuc1gjfw8gj20zk0k01kxData eb6b32d3ly1fuc1gjfw8gj20zk0k01kx;
            private Eb6b32d3ly1fuc1gt91z2j20zk0ne4qpData eb6b32d3ly1fuc1gt91z2j20zk0ne4qp;
            private Eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8Data eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8;
            private Eb6b32d3ly1fuc1gzi9cyj20zk0k0qqzData eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz;

            public Eb6b32d3ly1fuc1fy3ernj20zk0k0wy6Data getEb6b32d3ly1fuc1fy3ernj20zk0k0wy6() {
                return eb6b32d3ly1fuc1fy3ernj20zk0k0wy6;
            }

            public void setEb6b32d3ly1fuc1fy3ernj20zk0k0wy6(Eb6b32d3ly1fuc1fy3ernj20zk0k0wy6Data eb6b32d3ly1fuc1fy3ernj20zk0k0wy6) {
                this.eb6b32d3ly1fuc1fy3ernj20zk0k0wy6 = eb6b32d3ly1fuc1fy3ernj20zk0k0wy6;
            }

            public Eb6b32d3ly1fuc1g6gddbj20zk0k0avwData getEb6b32d3ly1fuc1g6gddbj20zk0k0avw() {
                return eb6b32d3ly1fuc1g6gddbj20zk0k0avw;
            }

            public void setEb6b32d3ly1fuc1g6gddbj20zk0k0avw(Eb6b32d3ly1fuc1g6gddbj20zk0k0avwData eb6b32d3ly1fuc1g6gddbj20zk0k0avw) {
                this.eb6b32d3ly1fuc1g6gddbj20zk0k0avw = eb6b32d3ly1fuc1g6gddbj20zk0k0avw;
            }

            public Eb6b32d3ly1fuc1gdlxrbj20zk0k0b0jData getEb6b32d3ly1fuc1gdlxrbj20zk0k0b0j() {
                return eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j;
            }

            public void setEb6b32d3ly1fuc1gdlxrbj20zk0k0b0j(Eb6b32d3ly1fuc1gdlxrbj20zk0k0b0jData eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j) {
                this.eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j = eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j;
            }

            public Eb6b32d3ly1fuc1gfsb6xj20zk0k0awtData getEb6b32d3ly1fuc1gfsb6xj20zk0k0awt() {
                return eb6b32d3ly1fuc1gfsb6xj20zk0k0awt;
            }

            public void setEb6b32d3ly1fuc1gfsb6xj20zk0k0awt(Eb6b32d3ly1fuc1gfsb6xj20zk0k0awtData eb6b32d3ly1fuc1gfsb6xj20zk0k0awt) {
                this.eb6b32d3ly1fuc1gfsb6xj20zk0k0awt = eb6b32d3ly1fuc1gfsb6xj20zk0k0awt;
            }

            public Eb6b32d3ly1fuc1ghv0dxj20zk0k0e66Data getEb6b32d3ly1fuc1ghv0dxj20zk0k0e66() {
                return eb6b32d3ly1fuc1ghv0dxj20zk0k0e66;
            }

            public void setEb6b32d3ly1fuc1ghv0dxj20zk0k0e66(Eb6b32d3ly1fuc1ghv0dxj20zk0k0e66Data eb6b32d3ly1fuc1ghv0dxj20zk0k0e66) {
                this.eb6b32d3ly1fuc1ghv0dxj20zk0k0e66 = eb6b32d3ly1fuc1ghv0dxj20zk0k0e66;
            }

            public Eb6b32d3ly1fuc1gjfw8gj20zk0k01kxData getEb6b32d3ly1fuc1gjfw8gj20zk0k01kx() {
                return eb6b32d3ly1fuc1gjfw8gj20zk0k01kx;
            }

            public void setEb6b32d3ly1fuc1gjfw8gj20zk0k01kx(Eb6b32d3ly1fuc1gjfw8gj20zk0k01kxData eb6b32d3ly1fuc1gjfw8gj20zk0k01kx) {
                this.eb6b32d3ly1fuc1gjfw8gj20zk0k01kx = eb6b32d3ly1fuc1gjfw8gj20zk0k01kx;
            }

            public Eb6b32d3ly1fuc1gt91z2j20zk0ne4qpData getEb6b32d3ly1fuc1gt91z2j20zk0ne4qp() {
                return eb6b32d3ly1fuc1gt91z2j20zk0ne4qp;
            }

            public void setEb6b32d3ly1fuc1gt91z2j20zk0ne4qp(Eb6b32d3ly1fuc1gt91z2j20zk0ne4qpData eb6b32d3ly1fuc1gt91z2j20zk0ne4qp) {
                this.eb6b32d3ly1fuc1gt91z2j20zk0ne4qp = eb6b32d3ly1fuc1gt91z2j20zk0ne4qp;
            }

            public Eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8Data getEb6b32d3ly1fuc1gxpmsvj20zk0k0qt8() {
                return eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8;
            }

            public void setEb6b32d3ly1fuc1gxpmsvj20zk0k0qt8(Eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8Data eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8) {
                this.eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8 = eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8;
            }

            public Eb6b32d3ly1fuc1gzi9cyj20zk0k0qqzData getEb6b32d3ly1fuc1gzi9cyj20zk0k0qqz() {
                return eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz;
            }

            public void setEb6b32d3ly1fuc1gzi9cyj20zk0k0qqz(Eb6b32d3ly1fuc1gzi9cyj20zk0k0qqzData eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz) {
                this.eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz = eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz;
            }

            public static class Eb6b32d3ly1fuc1fy3ernj20zk0k0wy6Data {
                /**
                 * thumbnail : {"url":"https://wx3.sinaimg.cn/wap180/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg","width":180,"height":101,"cut_type":1,"type":null}
                 * bmiddle : {"url":"https://wx3.sinaimg.cn/wap360/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg","width":360,"height":202,"cut_type":1,"type":null}
                 * large : {"url":"https://wx3.sinaimg.cn/wap720/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg","width":720,"height":405,"cut_type":1,"type":null}
                 * original : {"url":"https://wx3.sinaimg.cn/woriginal/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * largest : {"url":"https://wx3.sinaimg.cn/large/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * object_id : 1042018:fb4bc848ceaec8afc079cd64c8d6be20
                 * pic_id : eb6b32d3ly1fuc1fy3ernj20zk0k0wy6
                 * photo_tag : 0
                 * type : pic
                 * pic_status : 0
                 */

                private ThumbnailData thumbnail;
                private BmiddleData bmiddle;
                private LargeData large;
                private OriginalData original;
                private LargestData largest;
                private String object_id;
                private String pic_id;
                private int photo_tag;
                private String type;
                private int pic_status;

                public ThumbnailData getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(ThumbnailData thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public BmiddleData getBmiddle() {
                    return bmiddle;
                }

                public void setBmiddle(BmiddleData bmiddle) {
                    this.bmiddle = bmiddle;
                }

                public LargeData getLarge() {
                    return large;
                }

                public void setLarge(LargeData large) {
                    this.large = large;
                }

                public OriginalData getOriginal() {
                    return original;
                }

                public void setOriginal(OriginalData original) {
                    this.original = original;
                }

                public LargestData getLargest() {
                    return largest;
                }

                public void setLargest(LargestData largest) {
                    this.largest = largest;
                }

                public String getObject_id() {
                    return object_id;
                }

                public void setObject_id(String object_id) {
                    this.object_id = object_id;
                }

                public String getPic_id() {
                    return pic_id;
                }

                public void setPic_id(String pic_id) {
                    this.pic_id = pic_id;
                }

                public int getPhoto_tag() {
                    return photo_tag;
                }

                public void setPhoto_tag(int photo_tag) {
                    this.photo_tag = photo_tag;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getPic_status() {
                    return pic_status;
                }

                public void setPic_status(int pic_status) {
                    this.pic_status = pic_status;
                }

                public static class ThumbnailData {
                    /**
                     * url : https://wx3.sinaimg.cn/wap180/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg
                     * width : 180
                     * height : 101
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class BmiddleData {
                    /**
                     * url : https://wx3.sinaimg.cn/wap360/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg
                     * width : 360
                     * height : 202
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargeData {
                    /**
                     * url : https://wx3.sinaimg.cn/wap720/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg
                     * width : 720
                     * height : 405
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class OriginalData {
                    /**
                     * url : https://wx3.sinaimg.cn/woriginal/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargestData {
                    /**
                     * url : https://wx3.sinaimg.cn/large/eb6b32d3ly1fuc1fy3ernj20zk0k0wy6.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }
            }

            public static class Eb6b32d3ly1fuc1g6gddbj20zk0k0avwData {
                /**
                 * thumbnail : {"url":"https://wx4.sinaimg.cn/wap180/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg","width":180,"height":101,"cut_type":1,"type":null}
                 * bmiddle : {"url":"https://wx4.sinaimg.cn/wap360/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg","width":360,"height":202,"cut_type":1,"type":null}
                 * large : {"url":"https://wx4.sinaimg.cn/wap720/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg","width":720,"height":405,"cut_type":1,"type":null}
                 * original : {"url":"https://wx4.sinaimg.cn/woriginal/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * largest : {"url":"https://wx4.sinaimg.cn/large/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * object_id : 1042018:22bc5151c4dd348d413c09e514c427db
                 * pic_id : eb6b32d3ly1fuc1g6gddbj20zk0k0avw
                 * photo_tag : 0
                 * type : pic
                 * pic_status : 0
                 */

                private ThumbnailDataX thumbnail;
                private BmiddleDataX bmiddle;
                private LargeDataX large;
                private OriginalDataX original;
                private LargestDataX largest;
                private String object_id;
                private String pic_id;
                private int photo_tag;
                private String type;
                private int pic_status;

                public ThumbnailDataX getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(ThumbnailDataX thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public BmiddleDataX getBmiddle() {
                    return bmiddle;
                }

                public void setBmiddle(BmiddleDataX bmiddle) {
                    this.bmiddle = bmiddle;
                }

                public LargeDataX getLarge() {
                    return large;
                }

                public void setLarge(LargeDataX large) {
                    this.large = large;
                }

                public OriginalDataX getOriginal() {
                    return original;
                }

                public void setOriginal(OriginalDataX original) {
                    this.original = original;
                }

                public LargestDataX getLargest() {
                    return largest;
                }

                public void setLargest(LargestDataX largest) {
                    this.largest = largest;
                }

                public String getObject_id() {
                    return object_id;
                }

                public void setObject_id(String object_id) {
                    this.object_id = object_id;
                }

                public String getPic_id() {
                    return pic_id;
                }

                public void setPic_id(String pic_id) {
                    this.pic_id = pic_id;
                }

                public int getPhoto_tag() {
                    return photo_tag;
                }

                public void setPhoto_tag(int photo_tag) {
                    this.photo_tag = photo_tag;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getPic_status() {
                    return pic_status;
                }

                public void setPic_status(int pic_status) {
                    this.pic_status = pic_status;
                }

                public static class ThumbnailDataX {
                    /**
                     * url : https://wx4.sinaimg.cn/wap180/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg
                     * width : 180
                     * height : 101
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class BmiddleDataX {
                    /**
                     * url : https://wx4.sinaimg.cn/wap360/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg
                     * width : 360
                     * height : 202
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargeDataX {
                    /**
                     * url : https://wx4.sinaimg.cn/wap720/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg
                     * width : 720
                     * height : 405
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class OriginalDataX {
                    /**
                     * url : https://wx4.sinaimg.cn/woriginal/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargestDataX {
                    /**
                     * url : https://wx4.sinaimg.cn/large/eb6b32d3ly1fuc1g6gddbj20zk0k0avw.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }
            }

            public static class Eb6b32d3ly1fuc1gdlxrbj20zk0k0b0jData {
                /**
                 * thumbnail : {"url":"https://wx4.sinaimg.cn/wap180/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg","width":180,"height":101,"cut_type":1,"type":null}
                 * bmiddle : {"url":"https://wx4.sinaimg.cn/wap360/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg","width":360,"height":202,"cut_type":1,"type":null}
                 * large : {"url":"https://wx4.sinaimg.cn/wap720/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg","width":720,"height":405,"cut_type":1,"type":null}
                 * original : {"url":"https://wx4.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * largest : {"url":"https://wx4.sinaimg.cn/large/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * object_id : 1042018:43286aafa479726c3c14ec1e6a729dd8
                 * pic_id : eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j
                 * photo_tag : 0
                 * type : pic
                 * pic_status : 0
                 */

                private ThumbnailDataXX thumbnail;
                private BmiddleDataXX bmiddle;
                private LargeDataXX large;
                private OriginalDataXX original;
                private LargestDataXX largest;
                private String object_id;
                private String pic_id;
                private int photo_tag;
                private String type;
                private int pic_status;

                public ThumbnailDataXX getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(ThumbnailDataXX thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public BmiddleDataXX getBmiddle() {
                    return bmiddle;
                }

                public void setBmiddle(BmiddleDataXX bmiddle) {
                    this.bmiddle = bmiddle;
                }

                public LargeDataXX getLarge() {
                    return large;
                }

                public void setLarge(LargeDataXX large) {
                    this.large = large;
                }

                public OriginalDataXX getOriginal() {
                    return original;
                }

                public void setOriginal(OriginalDataXX original) {
                    this.original = original;
                }

                public LargestDataXX getLargest() {
                    return largest;
                }

                public void setLargest(LargestDataXX largest) {
                    this.largest = largest;
                }

                public String getObject_id() {
                    return object_id;
                }

                public void setObject_id(String object_id) {
                    this.object_id = object_id;
                }

                public String getPic_id() {
                    return pic_id;
                }

                public void setPic_id(String pic_id) {
                    this.pic_id = pic_id;
                }

                public int getPhoto_tag() {
                    return photo_tag;
                }

                public void setPhoto_tag(int photo_tag) {
                    this.photo_tag = photo_tag;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getPic_status() {
                    return pic_status;
                }

                public void setPic_status(int pic_status) {
                    this.pic_status = pic_status;
                }

                public static class ThumbnailDataXX {
                    /**
                     * url : https://wx4.sinaimg.cn/wap180/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg
                     * width : 180
                     * height : 101
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class BmiddleDataXX {
                    /**
                     * url : https://wx4.sinaimg.cn/wap360/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg
                     * width : 360
                     * height : 202
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargeDataXX {
                    /**
                     * url : https://wx4.sinaimg.cn/wap720/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg
                     * width : 720
                     * height : 405
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class OriginalDataXX {
                    /**
                     * url : https://wx4.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargestDataXX {
                    /**
                     * url : https://wx4.sinaimg.cn/large/eb6b32d3ly1fuc1gdlxrbj20zk0k0b0j.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }
            }

            public static class Eb6b32d3ly1fuc1gfsb6xj20zk0k0awtData {
                /**
                 * thumbnail : {"url":"https://wx2.sinaimg.cn/wap180/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg","width":180,"height":101,"cut_type":1,"type":null}
                 * bmiddle : {"url":"https://wx2.sinaimg.cn/wap360/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg","width":360,"height":202,"cut_type":1,"type":null}
                 * large : {"url":"https://wx2.sinaimg.cn/wap720/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg","width":720,"height":405,"cut_type":1,"type":null}
                 * original : {"url":"https://wx2.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * largest : {"url":"https://wx2.sinaimg.cn/large/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * object_id : 1042018:25685de9156d1ef3e731f6e4cb3fa032
                 * pic_id : eb6b32d3ly1fuc1gfsb6xj20zk0k0awt
                 * photo_tag : 0
                 * type : pic
                 * pic_status : 0
                 */

                private ThumbnailDataXXX thumbnail;
                private BmiddleDataXXX bmiddle;
                private LargeDataXXX large;
                private OriginalDataXXX original;
                private LargestDataXXX largest;
                private String object_id;
                private String pic_id;
                private int photo_tag;
                private String type;
                private int pic_status;

                public ThumbnailDataXXX getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(ThumbnailDataXXX thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public BmiddleDataXXX getBmiddle() {
                    return bmiddle;
                }

                public void setBmiddle(BmiddleDataXXX bmiddle) {
                    this.bmiddle = bmiddle;
                }

                public LargeDataXXX getLarge() {
                    return large;
                }

                public void setLarge(LargeDataXXX large) {
                    this.large = large;
                }

                public OriginalDataXXX getOriginal() {
                    return original;
                }

                public void setOriginal(OriginalDataXXX original) {
                    this.original = original;
                }

                public LargestDataXXX getLargest() {
                    return largest;
                }

                public void setLargest(LargestDataXXX largest) {
                    this.largest = largest;
                }

                public String getObject_id() {
                    return object_id;
                }

                public void setObject_id(String object_id) {
                    this.object_id = object_id;
                }

                public String getPic_id() {
                    return pic_id;
                }

                public void setPic_id(String pic_id) {
                    this.pic_id = pic_id;
                }

                public int getPhoto_tag() {
                    return photo_tag;
                }

                public void setPhoto_tag(int photo_tag) {
                    this.photo_tag = photo_tag;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getPic_status() {
                    return pic_status;
                }

                public void setPic_status(int pic_status) {
                    this.pic_status = pic_status;
                }

                public static class ThumbnailDataXXX {
                    /**
                     * url : https://wx2.sinaimg.cn/wap180/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg
                     * width : 180
                     * height : 101
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class BmiddleDataXXX {
                    /**
                     * url : https://wx2.sinaimg.cn/wap360/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg
                     * width : 360
                     * height : 202
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargeDataXXX {
                    /**
                     * url : https://wx2.sinaimg.cn/wap720/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg
                     * width : 720
                     * height : 405
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class OriginalDataXXX {
                    /**
                     * url : https://wx2.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargestDataXXX {
                    /**
                     * url : https://wx2.sinaimg.cn/large/eb6b32d3ly1fuc1gfsb6xj20zk0k0awt.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }
            }

            public static class Eb6b32d3ly1fuc1ghv0dxj20zk0k0e66Data {
                /**
                 * thumbnail : {"url":"https://wx4.sinaimg.cn/wap180/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg","width":180,"height":101,"cut_type":1,"type":null}
                 * bmiddle : {"url":"https://wx4.sinaimg.cn/wap360/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg","width":360,"height":202,"cut_type":1,"type":null}
                 * large : {"url":"https://wx4.sinaimg.cn/wap720/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg","width":720,"height":405,"cut_type":1,"type":null}
                 * original : {"url":"https://wx4.sinaimg.cn/woriginal/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * largest : {"url":"https://wx4.sinaimg.cn/large/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * object_id : 1042018:3139ee8ce8df30031936aa5da93b1b12
                 * pic_id : eb6b32d3ly1fuc1ghv0dxj20zk0k0e66
                 * photo_tag : 0
                 * type : pic
                 * pic_status : 0
                 */

                private ThumbnailDataXXXX thumbnail;
                private BmiddleDataXXXX bmiddle;
                private LargeDataXXXX large;
                private OriginalDataXXXX original;
                private LargestDataXXXX largest;
                private String object_id;
                private String pic_id;
                private int photo_tag;
                private String type;
                private int pic_status;

                public ThumbnailDataXXXX getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(ThumbnailDataXXXX thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public BmiddleDataXXXX getBmiddle() {
                    return bmiddle;
                }

                public void setBmiddle(BmiddleDataXXXX bmiddle) {
                    this.bmiddle = bmiddle;
                }

                public LargeDataXXXX getLarge() {
                    return large;
                }

                public void setLarge(LargeDataXXXX large) {
                    this.large = large;
                }

                public OriginalDataXXXX getOriginal() {
                    return original;
                }

                public void setOriginal(OriginalDataXXXX original) {
                    this.original = original;
                }

                public LargestDataXXXX getLargest() {
                    return largest;
                }

                public void setLargest(LargestDataXXXX largest) {
                    this.largest = largest;
                }

                public String getObject_id() {
                    return object_id;
                }

                public void setObject_id(String object_id) {
                    this.object_id = object_id;
                }

                public String getPic_id() {
                    return pic_id;
                }

                public void setPic_id(String pic_id) {
                    this.pic_id = pic_id;
                }

                public int getPhoto_tag() {
                    return photo_tag;
                }

                public void setPhoto_tag(int photo_tag) {
                    this.photo_tag = photo_tag;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getPic_status() {
                    return pic_status;
                }

                public void setPic_status(int pic_status) {
                    this.pic_status = pic_status;
                }

                public static class ThumbnailDataXXXX {
                    /**
                     * url : https://wx4.sinaimg.cn/wap180/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg
                     * width : 180
                     * height : 101
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class BmiddleDataXXXX {
                    /**
                     * url : https://wx4.sinaimg.cn/wap360/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg
                     * width : 360
                     * height : 202
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargeDataXXXX {
                    /**
                     * url : https://wx4.sinaimg.cn/wap720/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg
                     * width : 720
                     * height : 405
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class OriginalDataXXXX {
                    /**
                     * url : https://wx4.sinaimg.cn/woriginal/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargestDataXXXX {
                    /**
                     * url : https://wx4.sinaimg.cn/large/eb6b32d3ly1fuc1ghv0dxj20zk0k0e66.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }
            }

            public static class Eb6b32d3ly1fuc1gjfw8gj20zk0k01kxData {
                /**
                 * thumbnail : {"url":"https://wx4.sinaimg.cn/wap180/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg","width":180,"height":101,"cut_type":1,"type":null}
                 * bmiddle : {"url":"https://wx4.sinaimg.cn/wap360/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg","width":360,"height":202,"cut_type":1,"type":null}
                 * large : {"url":"https://wx4.sinaimg.cn/wap720/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg","width":720,"height":405,"cut_type":1,"type":null}
                 * original : {"url":"https://wx4.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * largest : {"url":"https://wx4.sinaimg.cn/large/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * object_id : 1042018:1bb0fcf396ba880032f4247cc9c6b785
                 * pic_id : eb6b32d3ly1fuc1gjfw8gj20zk0k01kx
                 * photo_tag : 0
                 * type : pic
                 * pic_status : 0
                 */

                private ThumbnailDataXXXXX thumbnail;
                private BmiddleDataXXXXX bmiddle;
                private LargeDataXXXXX large;
                private OriginalDataXXXXX original;
                private LargestDataXXXXX largest;
                private String object_id;
                private String pic_id;
                private int photo_tag;
                private String type;
                private int pic_status;

                public ThumbnailDataXXXXX getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(ThumbnailDataXXXXX thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public BmiddleDataXXXXX getBmiddle() {
                    return bmiddle;
                }

                public void setBmiddle(BmiddleDataXXXXX bmiddle) {
                    this.bmiddle = bmiddle;
                }

                public LargeDataXXXXX getLarge() {
                    return large;
                }

                public void setLarge(LargeDataXXXXX large) {
                    this.large = large;
                }

                public OriginalDataXXXXX getOriginal() {
                    return original;
                }

                public void setOriginal(OriginalDataXXXXX original) {
                    this.original = original;
                }

                public LargestDataXXXXX getLargest() {
                    return largest;
                }

                public void setLargest(LargestDataXXXXX largest) {
                    this.largest = largest;
                }

                public String getObject_id() {
                    return object_id;
                }

                public void setObject_id(String object_id) {
                    this.object_id = object_id;
                }

                public String getPic_id() {
                    return pic_id;
                }

                public void setPic_id(String pic_id) {
                    this.pic_id = pic_id;
                }

                public int getPhoto_tag() {
                    return photo_tag;
                }

                public void setPhoto_tag(int photo_tag) {
                    this.photo_tag = photo_tag;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getPic_status() {
                    return pic_status;
                }

                public void setPic_status(int pic_status) {
                    this.pic_status = pic_status;
                }

                public static class ThumbnailDataXXXXX {
                    /**
                     * url : https://wx4.sinaimg.cn/wap180/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg
                     * width : 180
                     * height : 101
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class BmiddleDataXXXXX {
                    /**
                     * url : https://wx4.sinaimg.cn/wap360/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg
                     * width : 360
                     * height : 202
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargeDataXXXXX {
                    /**
                     * url : https://wx4.sinaimg.cn/wap720/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg
                     * width : 720
                     * height : 405
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class OriginalDataXXXXX {
                    /**
                     * url : https://wx4.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargestDataXXXXX {
                    /**
                     * url : https://wx4.sinaimg.cn/large/eb6b32d3ly1fuc1gjfw8gj20zk0k01kx.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }
            }

            public static class Eb6b32d3ly1fuc1gt91z2j20zk0ne4qpData {
                /**
                 * thumbnail : {"url":"https://wx1.sinaimg.cn/wap180/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg","width":180,"height":118,"cut_type":1,"type":null}
                 * bmiddle : {"url":"https://wx1.sinaimg.cn/wap360/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg","width":360,"height":236,"cut_type":1,"type":null}
                 * large : {"url":"https://wx1.sinaimg.cn/wap720/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg","width":720,"height":473,"cut_type":1,"type":null}
                 * original : {"url":"https://wx1.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg","width":"1280","height":"842","cut_type":1,"type":null}
                 * largest : {"url":"https://wx1.sinaimg.cn/large/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg","width":"1280","height":"842","cut_type":1,"type":null}
                 * object_id : 1042018:fdfa02a4880654212e11549c11b69104
                 * pic_id : eb6b32d3ly1fuc1gt91z2j20zk0ne4qp
                 * photo_tag : 0
                 * type : pic
                 * pic_status : 0
                 */

                private ThumbnailDataXXXXXX thumbnail;
                private BmiddleDataXXXXXX bmiddle;
                private LargeDataXXXXXX large;
                private OriginalDataXXXXXX original;
                private LargestDataXXXXXX largest;
                private String object_id;
                private String pic_id;
                private int photo_tag;
                private String type;
                private int pic_status;

                public ThumbnailDataXXXXXX getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(ThumbnailDataXXXXXX thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public BmiddleDataXXXXXX getBmiddle() {
                    return bmiddle;
                }

                public void setBmiddle(BmiddleDataXXXXXX bmiddle) {
                    this.bmiddle = bmiddle;
                }

                public LargeDataXXXXXX getLarge() {
                    return large;
                }

                public void setLarge(LargeDataXXXXXX large) {
                    this.large = large;
                }

                public OriginalDataXXXXXX getOriginal() {
                    return original;
                }

                public void setOriginal(OriginalDataXXXXXX original) {
                    this.original = original;
                }

                public LargestDataXXXXXX getLargest() {
                    return largest;
                }

                public void setLargest(LargestDataXXXXXX largest) {
                    this.largest = largest;
                }

                public String getObject_id() {
                    return object_id;
                }

                public void setObject_id(String object_id) {
                    this.object_id = object_id;
                }

                public String getPic_id() {
                    return pic_id;
                }

                public void setPic_id(String pic_id) {
                    this.pic_id = pic_id;
                }

                public int getPhoto_tag() {
                    return photo_tag;
                }

                public void setPhoto_tag(int photo_tag) {
                    this.photo_tag = photo_tag;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getPic_status() {
                    return pic_status;
                }

                public void setPic_status(int pic_status) {
                    this.pic_status = pic_status;
                }

                public static class ThumbnailDataXXXXXX {
                    /**
                     * url : https://wx1.sinaimg.cn/wap180/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg
                     * width : 180
                     * height : 118
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class BmiddleDataXXXXXX {
                    /**
                     * url : https://wx1.sinaimg.cn/wap360/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg
                     * width : 360
                     * height : 236
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargeDataXXXXXX {
                    /**
                     * url : https://wx1.sinaimg.cn/wap720/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg
                     * width : 720
                     * height : 473
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class OriginalDataXXXXXX {
                    /**
                     * url : https://wx1.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg
                     * width : 1280
                     * height : 842
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargestDataXXXXXX {
                    /**
                     * url : https://wx1.sinaimg.cn/large/eb6b32d3ly1fuc1gt91z2j20zk0ne4qp.jpg
                     * width : 1280
                     * height : 842
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }
            }

            public static class Eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8Data {
                /**
                 * thumbnail : {"url":"https://wx2.sinaimg.cn/wap180/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg","width":180,"height":101,"cut_type":1,"type":null}
                 * bmiddle : {"url":"https://wx2.sinaimg.cn/wap360/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg","width":360,"height":202,"cut_type":1,"type":null}
                 * large : {"url":"https://wx2.sinaimg.cn/wap720/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg","width":720,"height":405,"cut_type":1,"type":null}
                 * original : {"url":"https://wx2.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * largest : {"url":"https://wx2.sinaimg.cn/large/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * object_id : 1042018:1054f9ce4ccae22c5ff0827e2e5974e7
                 * pic_id : eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8
                 * photo_tag : 0
                 * type : pic
                 * pic_status : 0
                 */

                private ThumbnailDataXXXXXXX thumbnail;
                private BmiddleDataXXXXXXX bmiddle;
                private LargeDataXXXXXXX large;
                private OriginalDataXXXXXXX original;
                private LargestDataXXXXXXX largest;
                private String object_id;
                private String pic_id;
                private int photo_tag;
                private String type;
                private int pic_status;

                public ThumbnailDataXXXXXXX getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(ThumbnailDataXXXXXXX thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public BmiddleDataXXXXXXX getBmiddle() {
                    return bmiddle;
                }

                public void setBmiddle(BmiddleDataXXXXXXX bmiddle) {
                    this.bmiddle = bmiddle;
                }

                public LargeDataXXXXXXX getLarge() {
                    return large;
                }

                public void setLarge(LargeDataXXXXXXX large) {
                    this.large = large;
                }

                public OriginalDataXXXXXXX getOriginal() {
                    return original;
                }

                public void setOriginal(OriginalDataXXXXXXX original) {
                    this.original = original;
                }

                public LargestDataXXXXXXX getLargest() {
                    return largest;
                }

                public void setLargest(LargestDataXXXXXXX largest) {
                    this.largest = largest;
                }

                public String getObject_id() {
                    return object_id;
                }

                public void setObject_id(String object_id) {
                    this.object_id = object_id;
                }

                public String getPic_id() {
                    return pic_id;
                }

                public void setPic_id(String pic_id) {
                    this.pic_id = pic_id;
                }

                public int getPhoto_tag() {
                    return photo_tag;
                }

                public void setPhoto_tag(int photo_tag) {
                    this.photo_tag = photo_tag;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getPic_status() {
                    return pic_status;
                }

                public void setPic_status(int pic_status) {
                    this.pic_status = pic_status;
                }

                public static class ThumbnailDataXXXXXXX {
                    /**
                     * url : https://wx2.sinaimg.cn/wap180/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg
                     * width : 180
                     * height : 101
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class BmiddleDataXXXXXXX {
                    /**
                     * url : https://wx2.sinaimg.cn/wap360/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg
                     * width : 360
                     * height : 202
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargeDataXXXXXXX {
                    /**
                     * url : https://wx2.sinaimg.cn/wap720/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg
                     * width : 720
                     * height : 405
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class OriginalDataXXXXXXX {
                    /**
                     * url : https://wx2.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargestDataXXXXXXX {
                    /**
                     * url : https://wx2.sinaimg.cn/large/eb6b32d3ly1fuc1gxpmsvj20zk0k0qt8.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }
            }

            public static class Eb6b32d3ly1fuc1gzi9cyj20zk0k0qqzData {
                /**
                 * thumbnail : {"url":"https://wx3.sinaimg.cn/wap180/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg","width":180,"height":101,"cut_type":1,"type":null}
                 * bmiddle : {"url":"https://wx3.sinaimg.cn/wap360/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg","width":360,"height":202,"cut_type":1,"type":null}
                 * large : {"url":"https://wx3.sinaimg.cn/wap720/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg","width":720,"height":405,"cut_type":1,"type":null}
                 * original : {"url":"https://wx3.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * largest : {"url":"https://wx3.sinaimg.cn/large/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg","width":"1280","height":"720","cut_type":1,"type":null}
                 * object_id : 1042018:717119d31f5fe1077c15021884e98ec0
                 * pic_id : eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz
                 * photo_tag : 0
                 * type : pic
                 * pic_status : 0
                 */

                private ThumbnailDataXXXXXXXX thumbnail;
                private BmiddleDataXXXXXXXX bmiddle;
                private LargeDataXXXXXXXX large;
                private OriginalDataXXXXXXXX original;
                private LargestDataXXXXXXXX largest;
                private String object_id;
                private String pic_id;
                private int photo_tag;
                private String type;
                private int pic_status;

                public ThumbnailDataXXXXXXXX getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(ThumbnailDataXXXXXXXX thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public BmiddleDataXXXXXXXX getBmiddle() {
                    return bmiddle;
                }

                public void setBmiddle(BmiddleDataXXXXXXXX bmiddle) {
                    this.bmiddle = bmiddle;
                }

                public LargeDataXXXXXXXX getLarge() {
                    return large;
                }

                public void setLarge(LargeDataXXXXXXXX large) {
                    this.large = large;
                }

                public OriginalDataXXXXXXXX getOriginal() {
                    return original;
                }

                public void setOriginal(OriginalDataXXXXXXXX original) {
                    this.original = original;
                }

                public LargestDataXXXXXXXX getLargest() {
                    return largest;
                }

                public void setLargest(LargestDataXXXXXXXX largest) {
                    this.largest = largest;
                }

                public String getObject_id() {
                    return object_id;
                }

                public void setObject_id(String object_id) {
                    this.object_id = object_id;
                }

                public String getPic_id() {
                    return pic_id;
                }

                public void setPic_id(String pic_id) {
                    this.pic_id = pic_id;
                }

                public int getPhoto_tag() {
                    return photo_tag;
                }

                public void setPhoto_tag(int photo_tag) {
                    this.photo_tag = photo_tag;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getPic_status() {
                    return pic_status;
                }

                public void setPic_status(int pic_status) {
                    this.pic_status = pic_status;
                }

                public static class ThumbnailDataXXXXXXXX {
                    /**
                     * url : https://wx3.sinaimg.cn/wap180/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg
                     * width : 180
                     * height : 101
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class BmiddleDataXXXXXXXX {
                    /**
                     * url : https://wx3.sinaimg.cn/wap360/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg
                     * width : 360
                     * height : 202
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargeDataXXXXXXXX {
                    /**
                     * url : https://wx3.sinaimg.cn/wap720/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg
                     * width : 720
                     * height : 405
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private int width;
                    private int height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class OriginalDataXXXXXXXX {
                    /**
                     * url : https://wx3.sinaimg.cn/woriginal/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }

                public static class LargestDataXXXXXXXX {
                    /**
                     * url : https://wx3.sinaimg.cn/large/eb6b32d3ly1fuc1gzi9cyj20zk0k0qqz.jpg
                     * width : 1280
                     * height : 720
                     * cut_type : 1
                     * type : null
                     */

                    private String url;
                    private String width;
                    private String height;
                    private int cut_type;
                    private Object type;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getCut_type() {
                        return cut_type;
                    }

                    public void setCut_type(int cut_type) {
                        this.cut_type = cut_type;
                    }

                    public Object getType() {
                        return type;
                    }

                    public void setType(Object type) {
                        this.type = type;
                    }
                }
            }
        }

        public static class EditConfigData {
            /**
             * edited : false
             */

            private boolean edited;

            public boolean isEdited() {
                return edited;
            }

            public void setEdited(boolean edited) {
                this.edited = edited;
            }
        }

        public static class RetweetedStatusData {
            /**
             * created_at : Thu Aug 16 17:48:34 +0800 2018
             * id : 4273699874438578
             * idstr : 4273699874438578
             * mid : 4273699874438578
             * edit_count : 1
             * can_edit : false
             * edit_at : Thu Aug 16 17:57:05 +0800 2018
             * text : 卓别林在上世纪40年代如是道。
             http://t.cn/R3wDDsh ​​​
             * textLength : 48
             * source_allowclick : 1
             * source_type : 2
             * source : <a href="http://weibo.com/" rel="nofollow">Android</a>
             * appid : 2133445
             * favorited : false
             * truncated : false
             * in_reply_to_status_id :
             * in_reply_to_user_id :
             * in_reply_to_screen_name :
             * pic_ids : []
             * geo : null
             * is_paid : false
             * mblog_vip_type : 0
             * user : {"id":3120123471,"idstr":"3120123471","class":1,"screen_name":"赏影猎人","name":"赏影猎人","province":"400","city":"1000","location":"海外","description":"不只是影迷。如果这个号被封就到豆瓣找我，ID：Paco","url":"","profile_image_url":"https://tvax2.sinaimg.cn/crop.0.0.996.996.50/b9f94e4fly8fp3jfpwz01j20ro0ro75o.jpg","cover_image":"https://ww4.sinaimg.cn/crop.0.0.920.300/b9f94e4fgw1fble8a0kfdj20pk08caba.jpg","cover_image_phone":"https://wx1.sinaimg.cn/crop.0.0.640.640.640/b9f94e4fgy1fs0lbe9fkwj20u00u0dyu.jpg","profile_url":"u/3120123471","domain":"","weihao":"","gender":"m","followers_count":1477889,"friends_count":635,"pagefriends_count":3,"statuses_count":5902,"video_status_count":0,"favourites_count":7563,"created_at":"Tue Nov 13 22:27:17 +0800 2012","following":false,"allow_all_act_msg":false,"geo_enabled":false,"verified":true,"verified_type":0,"remark":"","insecurity":{"sexual_content":false},"ptype":0,"allow_all_comment":true,"avatar_large":"https://tvax2.sinaimg.cn/crop.0.0.996.996.180/b9f94e4fly8fp3jfpwz01j20ro0ro75o.jpg","avatar_hd":"https://tvax2.sinaimg.cn/crop.0.0.996.996.1024/b9f94e4fly8fp3jfpwz01j20ro0ro75o.jpg","verified_reason":"知名电影博主 微博签约自媒体","verified_trade":"1028","verified_reason_url":"","verified_source":"","verified_source_url":"","verified_state":0,"verified_level":3,"verified_type_ext":0,"has_service_tel":false,"verified_reason_modified":"","verified_contact_name":"","verified_contact_email":"","verified_contact_mobile":"","follow_me":false,"like":false,"like_me":false,"online_status":0,"bi_followers_count":387,"lang":"zh-cn","star":0,"mbtype":12,"mbrank":6,"block_word":1,"block_app":1,"level":2,"type":1,"ulevel":0,"user_limit":0,"badge":{"uc_domain":0,"enterprise":0,"anniversary":0,"taobao":0,"gongyi":0,"gongyi_level":0,"bind_taobao":0,"dailv":0,"zongyiji":0,"vip_activity1":0,"unread_pool":0,"daiyan":0,"ali_1688":0,"vip_activity2":0,"fools_day_2016":0,"uefa_euro_2016":0,"unread_pool_ext":0,"self_media":1,"dzwbqlx_2016":1,"discount_2016":0,"follow_whitelist_video":1,"league_badge":0,"lol_msi_2017":0,"super_star_2017":0,"video_attention":0,"travel_2017":0,"lol_gm_2017":0,"cz_wed_2017":0,"inspector":0,"panda":0,"uve_icon":0,"user_name_certificate":1,"suishoupai_2018":0,"wenda":0,"wenchuan_10th":1,"super_star_2018":0,"worldcup_2018":0,"wenda_v2":1,"league_badge_2018":0,"dailv_2018":0,"asiad_2018":0,"qixi_2018":0},"badge_top":"","has_ability_tag":1,"extend":{"privacy":{"mobile":0},"mbprivilege":"0000000000000000000000000000000000000000000000000000000004c00208"},"dianping":"movie","credit_score":80,"user_ability":271896,"urank":40,"story_read_state":-1,"story_id":"3120123471_0","vclub_member":0}
             * annotations : [{"shooting":1,"client_mblogid":"43134aa7-4feb-4573-8ac5-0597ab5a7a14"},{"mapi_request":true}]
             * reposts_count : 671
             * comments_count : 52
             * attitudes_count : 351
             * pending_approval_count : 0
             * isLongText : false
             * hide_flag : 0
             * mlevel : 0
             * visible : {"type":0,"list_id":0}
             * biz_ids : [230442]
             * biz_feature : 4294967312
             * hasActionTypeCard : 1
             * text_tag_tips : []
             * mblogtype : 0
             * userType : 0
             * more_info_type : 0
             * positive_recom_flag : 0
             * content_auth : 0
             * gif_ids :
             * is_show_bulletin : 2
             * comment_manage_info : {"comment_permission_type":-1,"approval_comment_type":0}
             * mblogid : GuVgLiCFY
             * scheme : sinaweibo://detail/?mblogid=GuVgLiCFY
             * attitudes_status : 0
             * recom_state : -1
             * weibo_position : 2
             * edit_config : {"edited":true,"menu_edit_history":{"scheme":"sinaweibo://cardlist?containerid=231440_-_4273699874438578&title=编辑记录","title":"查看编辑记录"}}
             */

            private String created_at;
            private long id;
            private String idstr;
            private String mid;
            private int edit_count;
            private boolean can_edit;
            private String edit_at;
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
            private UserDataX user;
            private int reposts_count;
            private int comments_count;
            private int attitudes_count;
            private int pending_approval_count;
            private boolean isLongText;
            private int hide_flag;
            private int mlevel;
            private VisibleDataX visible;
            private long biz_feature;
            private int hasActionTypeCard;
            private int mblogtype;
            private int userType;
            private int more_info_type;
            private int positive_recom_flag;
            private int content_auth;
            private String gif_ids;
            private int is_show_bulletin;
            private CommentManageInfoDataX comment_manage_info;
            private String mblogid;
            private String scheme;
            private int attitudes_status;
            private int recom_state;
            private int weibo_position;
            private EditConfigDataX edit_config;
            private List<String> pic_ids;
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

            public int getEdit_count() {
                return edit_count;
            }

            public void setEdit_count(int edit_count) {
                this.edit_count = edit_count;
            }

            public boolean isCan_edit() {
                return can_edit;
            }

            public void setCan_edit(boolean can_edit) {
                this.can_edit = can_edit;
            }

            public String getEdit_at() {
                return edit_at;
            }

            public void setEdit_at(String edit_at) {
                this.edit_at = edit_at;
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

            public UserDataX getUser() {
                return user;
            }

            public void setUser(UserDataX user) {
                this.user = user;
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

            public VisibleDataX getVisible() {
                return visible;
            }

            public void setVisible(VisibleDataX visible) {
                this.visible = visible;
            }

            public long getBiz_feature() {
                return biz_feature;
            }

            public void setBiz_feature(long biz_feature) {
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

            public CommentManageInfoDataX getComment_manage_info() {
                return comment_manage_info;
            }

            public void setComment_manage_info(CommentManageInfoDataX comment_manage_info) {
                this.comment_manage_info = comment_manage_info;
            }

            public String getMblogid() {
                return mblogid;
            }

            public void setMblogid(String mblogid) {
                this.mblogid = mblogid;
            }

            public String getScheme() {
                return scheme;
            }

            public void setScheme(String scheme) {
                this.scheme = scheme;
            }

            public int getAttitudes_status() {
                return attitudes_status;
            }

            public void setAttitudes_status(int attitudes_status) {
                this.attitudes_status = attitudes_status;
            }

            public int getRecom_state() {
                return recom_state;
            }

            public void setRecom_state(int recom_state) {
                this.recom_state = recom_state;
            }

            public int getWeibo_position() {
                return weibo_position;
            }

            public void setWeibo_position(int weibo_position) {
                this.weibo_position = weibo_position;
            }

            public EditConfigDataX getEdit_config() {
                return edit_config;
            }

            public void setEdit_config(EditConfigDataX edit_config) {
                this.edit_config = edit_config;
            }

            public List<String> getPic_ids() {
                return pic_ids;
            }

            public void setPic_ids(List<String> pic_ids) {
                this.pic_ids = pic_ids;
            }

            public List<?> getText_tag_tips() {
                return text_tag_tips;
            }

            public void setText_tag_tips(List<?> text_tag_tips) {
                this.text_tag_tips = text_tag_tips;
            }

            public static class UserDataX {
                /**
                 * id : 3120123471
                 * idstr : 3120123471
                 * class : 1
                 * screen_name : 赏影猎人
                 * name : 赏影猎人
                 * province : 400
                 * city : 1000
                 * location : 海外
                 * description : 不只是影迷。如果这个号被封就到豆瓣找我，ID：Paco
                 * url :
                 * profile_image_url : https://tvax2.sinaimg.cn/crop.0.0.996.996.50/b9f94e4fly8fp3jfpwz01j20ro0ro75o.jpg
                 * cover_image : https://ww4.sinaimg.cn/crop.0.0.920.300/b9f94e4fgw1fble8a0kfdj20pk08caba.jpg
                 * cover_image_phone : https://wx1.sinaimg.cn/crop.0.0.640.640.640/b9f94e4fgy1fs0lbe9fkwj20u00u0dyu.jpg
                 * profile_url : u/3120123471
                 * domain :
                 * weihao :
                 * gender : m
                 * followers_count : 1477889
                 * friends_count : 635
                 * pagefriends_count : 3
                 * statuses_count : 5902
                 * video_status_count : 0
                 * favourites_count : 7563
                 * created_at : Tue Nov 13 22:27:17 +0800 2012
                 * following : false
                 * allow_all_act_msg : false
                 * geo_enabled : false
                 * verified : true
                 * verified_type : 0
                 * remark :
                 * insecurity : {"sexual_content":false}
                 * ptype : 0
                 * allow_all_comment : true
                 * avatar_large : https://tvax2.sinaimg.cn/crop.0.0.996.996.180/b9f94e4fly8fp3jfpwz01j20ro0ro75o.jpg
                 * avatar_hd : https://tvax2.sinaimg.cn/crop.0.0.996.996.1024/b9f94e4fly8fp3jfpwz01j20ro0ro75o.jpg
                 * verified_reason : 知名电影博主 微博签约自媒体
                 * verified_trade : 1028
                 * verified_reason_url :
                 * verified_source :
                 * verified_source_url :
                 * verified_state : 0
                 * verified_level : 3
                 * verified_type_ext : 0
                 * has_service_tel : false
                 * verified_reason_modified :
                 * verified_contact_name :
                 * verified_contact_email :
                 * verified_contact_mobile :
                 * follow_me : false
                 * like : false
                 * like_me : false
                 * online_status : 0
                 * bi_followers_count : 387
                 * lang : zh-cn
                 * star : 0
                 * mbtype : 12
                 * mbrank : 6
                 * block_word : 1
                 * block_app : 1
                 * level : 2
                 * type : 1
                 * ulevel : 0
                 * user_limit : 0
                 * badge : {"uc_domain":0,"enterprise":0,"anniversary":0,"taobao":0,"gongyi":0,"gongyi_level":0,"bind_taobao":0,"dailv":0,"zongyiji":0,"vip_activity1":0,"unread_pool":0,"daiyan":0,"ali_1688":0,"vip_activity2":0,"fools_day_2016":0,"uefa_euro_2016":0,"unread_pool_ext":0,"self_media":1,"dzwbqlx_2016":1,"discount_2016":0,"follow_whitelist_video":1,"league_badge":0,"lol_msi_2017":0,"super_star_2017":0,"video_attention":0,"travel_2017":0,"lol_gm_2017":0,"cz_wed_2017":0,"inspector":0,"panda":0,"uve_icon":0,"user_name_certificate":1,"suishoupai_2018":0,"wenda":0,"wenchuan_10th":1,"super_star_2018":0,"worldcup_2018":0,"wenda_v2":1,"league_badge_2018":0,"dailv_2018":0,"asiad_2018":0,"qixi_2018":0}
                 * badge_top :
                 * has_ability_tag : 1
                 * extend : {"privacy":{"mobile":0},"mbprivilege":"0000000000000000000000000000000000000000000000000000000004c00208"}
                 * dianping : movie
                 * credit_score : 80
                 * user_ability : 271896
                 * urank : 40
                 * story_read_state : -1
                 * story_id : 3120123471_0
                 * vclub_member : 0
                 */

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
                private String cover_image;
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
                private InsecurityDataX insecurity;
                private int ptype;
                private boolean allow_all_comment;
                private String avatar_large;
                private String avatar_hd;
                private String verified_reason;
                private String verified_trade;
                private String verified_reason_url;
                private String verified_source;
                private String verified_source_url;
                private int verified_state;
                private int verified_level;
                private int verified_type_ext;
                private boolean has_service_tel;
                private String verified_reason_modified;
                private String verified_contact_name;
                private String verified_contact_email;
                private String verified_contact_mobile;
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
                private BadgeDataX badge;
                private String badge_top;
                private int has_ability_tag;
                private ExtendDataX extend;
                private String dianping;
                private int credit_score;
                private int user_ability;
                private int urank;
                private int story_read_state;
                private String story_id;
                private int vclub_member;

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

                public String getCover_image() {
                    return cover_image;
                }

                public void setCover_image(String cover_image) {
                    this.cover_image = cover_image;
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

                public InsecurityDataX getInsecurity() {
                    return insecurity;
                }

                public void setInsecurity(InsecurityDataX insecurity) {
                    this.insecurity = insecurity;
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

                public int getVerified_state() {
                    return verified_state;
                }

                public void setVerified_state(int verified_state) {
                    this.verified_state = verified_state;
                }

                public int getVerified_level() {
                    return verified_level;
                }

                public void setVerified_level(int verified_level) {
                    this.verified_level = verified_level;
                }

                public int getVerified_type_ext() {
                    return verified_type_ext;
                }

                public void setVerified_type_ext(int verified_type_ext) {
                    this.verified_type_ext = verified_type_ext;
                }

                public boolean isHas_service_tel() {
                    return has_service_tel;
                }

                public void setHas_service_tel(boolean has_service_tel) {
                    this.has_service_tel = has_service_tel;
                }

                public String getVerified_reason_modified() {
                    return verified_reason_modified;
                }

                public void setVerified_reason_modified(String verified_reason_modified) {
                    this.verified_reason_modified = verified_reason_modified;
                }

                public String getVerified_contact_name() {
                    return verified_contact_name;
                }

                public void setVerified_contact_name(String verified_contact_name) {
                    this.verified_contact_name = verified_contact_name;
                }

                public String getVerified_contact_email() {
                    return verified_contact_email;
                }

                public void setVerified_contact_email(String verified_contact_email) {
                    this.verified_contact_email = verified_contact_email;
                }

                public String getVerified_contact_mobile() {
                    return verified_contact_mobile;
                }

                public void setVerified_contact_mobile(String verified_contact_mobile) {
                    this.verified_contact_mobile = verified_contact_mobile;
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

                public BadgeDataX getBadge() {
                    return badge;
                }

                public void setBadge(BadgeDataX badge) {
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

                public ExtendDataX getExtend() {
                    return extend;
                }

                public void setExtend(ExtendDataX extend) {
                    this.extend = extend;
                }

                public String getDianping() {
                    return dianping;
                }

                public void setDianping(String dianping) {
                    this.dianping = dianping;
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

                public String getStory_id() {
                    return story_id;
                }

                public void setStory_id(String story_id) {
                    this.story_id = story_id;
                }

                public int getVclub_member() {
                    return vclub_member;
                }

                public void setVclub_member(int vclub_member) {
                    this.vclub_member = vclub_member;
                }

                public static class InsecurityDataX {
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

                public static class BadgeDataX {
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
                     * self_media : 1
                     * dzwbqlx_2016 : 1
                     * discount_2016 : 0
                     * follow_whitelist_video : 1
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
                     * wenchuan_10th : 1
                     * super_star_2018 : 0
                     * worldcup_2018 : 0
                     * wenda_v2 : 1
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

                public static class ExtendDataX {
                    /**
                     * privacy : {"mobile":0}
                     * mbprivilege : 0000000000000000000000000000000000000000000000000000000004c00208
                     */

                    private PrivacyDataX privacy;
                    private String mbprivilege;

                    public PrivacyDataX getPrivacy() {
                        return privacy;
                    }

                    public void setPrivacy(PrivacyDataX privacy) {
                        this.privacy = privacy;
                    }

                    public String getMbprivilege() {
                        return mbprivilege;
                    }

                    public void setMbprivilege(String mbprivilege) {
                        this.mbprivilege = mbprivilege;
                    }

                    public static class PrivacyDataX {
                        /**
                         * mobile : 0
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

            public static class VisibleDataX {
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

            public static class CommentManageInfoDataX {
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

            public static class EditConfigDataX {
                /**
                 * edited : true
                 * menu_edit_history : {"scheme":"sinaweibo://cardlist?containerid=231440_-_4273699874438578&title=编辑记录","title":"查看编辑记录"}
                 */

                private boolean edited;
                private MenuEditHistoryData menu_edit_history;

                public boolean isEdited() {
                    return edited;
                }

                public void setEdited(boolean edited) {
                    this.edited = edited;
                }

                public MenuEditHistoryData getMenu_edit_history() {
                    return menu_edit_history;
                }

                public void setMenu_edit_history(MenuEditHistoryData menu_edit_history) {
                    this.menu_edit_history = menu_edit_history;
                }

                public static class MenuEditHistoryData {
                    /**
                     * scheme : sinaweibo://cardlist?containerid=231440_-_4273699874438578&title=编辑记录
                     * title : 查看编辑记录
                     */

                    private String scheme;
                    private String title;

                    public String getScheme() {
                        return scheme;
                    }

                    public void setScheme(String scheme) {
                        this.scheme = scheme;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }
                }
            }

            public static class AnnotationsData {
                /**
                 * shooting : 1
                 * client_mblogid : 43134aa7-4feb-4573-8ac5-0597ab5a7a14
                 * mapi_request : true
                 */

                private int shooting;
                private String client_mblogid;
                private boolean mapi_request;

                public int getShooting() {
                    return shooting;
                }

                public void setShooting(int shooting) {
                    this.shooting = shooting;
                }

                public String getClient_mblogid() {
                    return client_mblogid;
                }

                public void setClient_mblogid(String client_mblogid) {
                    this.client_mblogid = client_mblogid;
                }

                public boolean isMapi_request() {
                    return mapi_request;
                }

                public void setMapi_request(boolean mapi_request) {
                    this.mapi_request = mapi_request;
                }
            }
        }

        public static class PageInfoData {

            private String type;
            private String page_id;
            private String object_type;
            private String object_id;
            private String content1;
            private String content2;
            private int act_status;
            private MediaInfoData media_info;
            private String page_pic;
            private String page_title;
            private String page_url;
            private PicInfoData pic_info;
            private long oid;
            private String type_icon;
            private long author_id;
            private long authorid;
            private String warn;
            private ActionlogDataX actionlog;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getPage_id() {
                return page_id;
            }

            public void setPage_id(String page_id) {
                this.page_id = page_id;
            }

            public String getObject_type() {
                return object_type;
            }

            public void setObject_type(String object_type) {
                this.object_type = object_type;
            }

            public String getObject_id() {
                return object_id;
            }

            public void setObject_id(String object_id) {
                this.object_id = object_id;
            }

            public String getContent1() {
                return content1;
            }

            public void setContent1(String content1) {
                this.content1 = content1;
            }

            public String getContent2() {
                return content2;
            }

            public void setContent2(String content2) {
                this.content2 = content2;
            }

            public int getAct_status() {
                return act_status;
            }

            public void setAct_status(int act_status) {
                this.act_status = act_status;
            }

            public MediaInfoData getMedia_info() {
                return media_info;
            }

            public void setMedia_info(MediaInfoData media_info) {
                this.media_info = media_info;
            }

            public String getPage_pic() {
                return page_pic;
            }

            public void setPage_pic(String page_pic) {
                this.page_pic = page_pic;
            }

            public String getPage_title() {
                return page_title;
            }

            public void setPage_title(String page_title) {
                this.page_title = page_title;
            }

            public String getPage_url() {
                return page_url;
            }

            public void setPage_url(String page_url) {
                this.page_url = page_url;
            }

            public PicInfoData getPic_info() {
                return pic_info;
            }

            public void setPic_info(PicInfoData pic_info) {
                this.pic_info = pic_info;
            }

            public long getOid() {
                return oid;
            }

            public void setOid(long oid) {
                this.oid = oid;
            }

            public String getType_icon() {
                return type_icon;
            }

            public void setType_icon(String type_icon) {
                this.type_icon = type_icon;
            }

            public long getAuthor_id() {
                return author_id;
            }

            public void setAuthor_id(long author_id) {
                this.author_id = author_id;
            }

            public long getAuthorid() {
                return authorid;
            }

            public void setAuthorid(long authorid) {
                this.authorid = authorid;
            }

            public String getWarn() {
                return warn;
            }

            public void setWarn(String warn) {
                this.warn = warn;
            }

            public ActionlogDataX getActionlog() {
                return actionlog;
            }

            public void setActionlog(ActionlogDataX actionlog) {
                this.actionlog = actionlog;
            }

            public static class MediaInfoData {

                private String video_orientation;
                private String name;
                private int duration;
                private String stream_url;
                private String stream_url_hd;
                private String h5_url;
                private String mp4_sd_url;
                private String mp4_hd_url;
                private String h265_mp4_hd;
                private String h265_mp4_ld;
                private String inch_4_mp4_hd;
                private String inch_5_mp4_hd;
                private String inch_5_5_mp4_hd;
                private String mp4_720p_mp4;
                private String hevc_mp4_720p;
                private int prefetch_type;
                private int prefetch_size;
                private int act_status;
                private String protocol;
                private String media_id;
                private int origin_total_bitrate;
                private String next_title;
                private int video_publish_time;
                private int play_loop_type;
                private String author_name;
                private int has_recommend_video;
                private String online_users;
                private int online_users_number;
                private int is_keep_current_mblog;
                private List<VideoDetailsData> video_details;
                private List<PlayCompletionActionsData> play_completion_actions;
                private List<TitlesData> titles;

                public String getVideo_orientation() {
                    return video_orientation;
                }

                public void setVideo_orientation(String video_orientation) {
                    this.video_orientation = video_orientation;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getDuration() {
                    return duration;
                }

                public void setDuration(int duration) {
                    this.duration = duration;
                }

                public String getStream_url() {
                    return stream_url;
                }

                public void setStream_url(String stream_url) {
                    this.stream_url = stream_url;
                }

                public String getStream_url_hd() {
                    return stream_url_hd;
                }

                public void setStream_url_hd(String stream_url_hd) {
                    this.stream_url_hd = stream_url_hd;
                }

                public String getH5_url() {
                    return h5_url;
                }

                public void setH5_url(String h5_url) {
                    this.h5_url = h5_url;
                }

                public String getMp4_sd_url() {
                    return mp4_sd_url;
                }

                public void setMp4_sd_url(String mp4_sd_url) {
                    this.mp4_sd_url = mp4_sd_url;
                }

                public String getMp4_hd_url() {
                    return mp4_hd_url;
                }

                public void setMp4_hd_url(String mp4_hd_url) {
                    this.mp4_hd_url = mp4_hd_url;
                }

                public String getH265_mp4_hd() {
                    return h265_mp4_hd;
                }

                public void setH265_mp4_hd(String h265_mp4_hd) {
                    this.h265_mp4_hd = h265_mp4_hd;
                }

                public String getH265_mp4_ld() {
                    return h265_mp4_ld;
                }

                public void setH265_mp4_ld(String h265_mp4_ld) {
                    this.h265_mp4_ld = h265_mp4_ld;
                }

                public String getInch_4_mp4_hd() {
                    return inch_4_mp4_hd;
                }

                public void setInch_4_mp4_hd(String inch_4_mp4_hd) {
                    this.inch_4_mp4_hd = inch_4_mp4_hd;
                }

                public String getInch_5_mp4_hd() {
                    return inch_5_mp4_hd;
                }

                public void setInch_5_mp4_hd(String inch_5_mp4_hd) {
                    this.inch_5_mp4_hd = inch_5_mp4_hd;
                }

                public String getInch_5_5_mp4_hd() {
                    return inch_5_5_mp4_hd;
                }

                public void setInch_5_5_mp4_hd(String inch_5_5_mp4_hd) {
                    this.inch_5_5_mp4_hd = inch_5_5_mp4_hd;
                }

                public String getMp4_720p_mp4() {
                    return mp4_720p_mp4;
                }

                public void setMp4_720p_mp4(String mp4_720p_mp4) {
                    this.mp4_720p_mp4 = mp4_720p_mp4;
                }

                public String getHevc_mp4_720p() {
                    return hevc_mp4_720p;
                }

                public void setHevc_mp4_720p(String hevc_mp4_720p) {
                    this.hevc_mp4_720p = hevc_mp4_720p;
                }

                public int getPrefetch_type() {
                    return prefetch_type;
                }

                public void setPrefetch_type(int prefetch_type) {
                    this.prefetch_type = prefetch_type;
                }

                public int getPrefetch_size() {
                    return prefetch_size;
                }

                public void setPrefetch_size(int prefetch_size) {
                    this.prefetch_size = prefetch_size;
                }

                public int getAct_status() {
                    return act_status;
                }

                public void setAct_status(int act_status) {
                    this.act_status = act_status;
                }

                public String getProtocol() {
                    return protocol;
                }

                public void setProtocol(String protocol) {
                    this.protocol = protocol;
                }

                public String getMedia_id() {
                    return media_id;
                }

                public void setMedia_id(String media_id) {
                    this.media_id = media_id;
                }

                public int getOrigin_total_bitrate() {
                    return origin_total_bitrate;
                }

                public void setOrigin_total_bitrate(int origin_total_bitrate) {
                    this.origin_total_bitrate = origin_total_bitrate;
                }

                public String getNext_title() {
                    return next_title;
                }

                public void setNext_title(String next_title) {
                    this.next_title = next_title;
                }

                public int getVideo_publish_time() {
                    return video_publish_time;
                }

                public void setVideo_publish_time(int video_publish_time) {
                    this.video_publish_time = video_publish_time;
                }

                public int getPlay_loop_type() {
                    return play_loop_type;
                }

                public void setPlay_loop_type(int play_loop_type) {
                    this.play_loop_type = play_loop_type;
                }

                public String getAuthor_name() {
                    return author_name;
                }

                public void setAuthor_name(String author_name) {
                    this.author_name = author_name;
                }

                public int getHas_recommend_video() {
                    return has_recommend_video;
                }

                public void setHas_recommend_video(int has_recommend_video) {
                    this.has_recommend_video = has_recommend_video;
                }

                public String getOnline_users() {
                    return online_users;
                }

                public void setOnline_users(String online_users) {
                    this.online_users = online_users;
                }

                public int getOnline_users_number() {
                    return online_users_number;
                }

                public void setOnline_users_number(int online_users_number) {
                    this.online_users_number = online_users_number;
                }

                public int getIs_keep_current_mblog() {
                    return is_keep_current_mblog;
                }

                public void setIs_keep_current_mblog(int is_keep_current_mblog) {
                    this.is_keep_current_mblog = is_keep_current_mblog;
                }

                public List<VideoDetailsData> getVideo_details() {
                    return video_details;
                }

                public void setVideo_details(List<VideoDetailsData> video_details) {
                    this.video_details = video_details;
                }

                public List<PlayCompletionActionsData> getPlay_completion_actions() {
                    return play_completion_actions;
                }

                public void setPlay_completion_actions(List<PlayCompletionActionsData> play_completion_actions) {
                    this.play_completion_actions = play_completion_actions;
                }

                public List<TitlesData> getTitles() {
                    return titles;
                }

                public void setTitles(List<TitlesData> titles) {
                    this.titles = titles;
                }

                public static class VideoDetailsData {
                    /**
                     * size : 35493903
                     * bitrate : 793
                     * label : mp4_sd_url
                     */

                    private int size;
                    private int bitrate;
                    private String label;

                    public int getSize() {
                        return size;
                    }

                    public void setSize(int size) {
                        this.size = size;
                    }

                    public int getBitrate() {
                        return bitrate;
                    }

                    public void setBitrate(int bitrate) {
                        this.bitrate = bitrate;
                    }

                    public String getLabel() {
                        return label;
                    }

                    public void setLabel(String label) {
                        this.label = label;
                    }
                }

                public static class PlayCompletionActionsData {


                    private String type;
                    private String icon;
                    private String text;
                    private String link;
                    private int btn_code;
                    private int show_position;
                    private ActionlogData actionlog;
                    private String scheme;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public String getLink() {
                        return link;
                    }

                    public void setLink(String link) {
                        this.link = link;
                    }

                    public int getBtn_code() {
                        return btn_code;
                    }

                    public void setBtn_code(int btn_code) {
                        this.btn_code = btn_code;
                    }

                    public int getShow_position() {
                        return show_position;
                    }

                    public void setShow_position(int show_position) {
                        this.show_position = show_position;
                    }

                    public ActionlogData getActionlog() {
                        return actionlog;
                    }

                    public void setActionlog(ActionlogData actionlog) {
                        this.actionlog = actionlog;
                    }

                    public String getScheme() {
                        return scheme;
                    }

                    public void setScheme(String scheme) {
                        this.scheme = scheme;
                    }

                    public static class ActionlogData {

                        private String oid;
                        private int act_code;
                        private int act_type;
                        private String source;

                        public String getOid() {
                            return oid;
                        }

                        public void setOid(String oid) {
                            this.oid = oid;
                        }

                        public int getAct_code() {
                            return act_code;
                        }

                        public void setAct_code(int act_code) {
                            this.act_code = act_code;
                        }

                        public int getAct_type() {
                            return act_type;
                        }

                        public void setAct_type(int act_type) {
                            this.act_type = act_type;
                        }

                        public String getSource() {
                            return source;
                        }

                        public void setSource(String source) {
                            this.source = source;
                        }
                    }
                }

                public static class TitlesData {
                    /**
                     * default : true
                     * title : 《大独裁者》结尾演讲
                     */

                    @SerializedName("default")
                    private boolean defaultX;
                    private String title;

                    public boolean isDefaultX() {
                        return defaultX;
                    }

                    public void setDefaultX(boolean defaultX) {
                        this.defaultX = defaultX;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }
                }
            }

            public static class PicInfoData {
                /**
                 * pic_big : {"height":"157","url":"http://imgaliyuncdn.miaopai.com/stream/-Qp4rf6vowmMQt9NJb8qsSdScrYy9QYG_32768.jpg","width":"157"}
                 * pic_small : {"height":"157","url":"http://imgaliyuncdn.miaopai.com/stream/-Qp4rf6vowmMQt9NJb8qsSdScrYy9QYG_32768.jpg","width":"157"}
                 * pic_middle : {"url":"http://imgaliyuncdn.miaopai.com/stream/-Qp4rf6vowmMQt9NJb8qsSdScrYy9QYG_32768.jpg","width":"157","height":"157"}
                 */

                private PicBigData pic_big;
                private PicSmallData pic_small;
                private PicMiddleData pic_middle;

                public PicBigData getPic_big() {
                    return pic_big;
                }

                public void setPic_big(PicBigData pic_big) {
                    this.pic_big = pic_big;
                }

                public PicSmallData getPic_small() {
                    return pic_small;
                }

                public void setPic_small(PicSmallData pic_small) {
                    this.pic_small = pic_small;
                }

                public PicMiddleData getPic_middle() {
                    return pic_middle;
                }

                public void setPic_middle(PicMiddleData pic_middle) {
                    this.pic_middle = pic_middle;
                }

                public static class PicBigData {
                    /**
                     * height : 157
                     * url : http://imgaliyuncdn.miaopai.com/stream/-Qp4rf6vowmMQt9NJb8qsSdScrYy9QYG_32768.jpg
                     * width : 157
                     */

                    private String height;
                    private String url;
                    private String width;

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }
                }

                public static class PicSmallData {
                    /**
                     * height : 157
                     * url : http://imgaliyuncdn.miaopai.com/stream/-Qp4rf6vowmMQt9NJb8qsSdScrYy9QYG_32768.jpg
                     * width : 157
                     */

                    private String height;
                    private String url;
                    private String width;

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }
                }

                public static class PicMiddleData {
                    /**
                     * url : http://imgaliyuncdn.miaopai.com/stream/-Qp4rf6vowmMQt9NJb8qsSdScrYy9QYG_32768.jpg
                     * width : 157
                     * height : 157
                     */

                    private String url;
                    private String width;
                    private String height;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }
                }
            }

            public static class ActionlogDataX {

                private int act_type;
                private int act_code;
                private String cardid;
                private String lcardid;
                private String fid;
                private String uid;
                private String mid;
                private String oid;
                private String source;
                private String ext;

                public int getAct_type() {
                    return act_type;
                }

                public void setAct_type(int act_type) {
                    this.act_type = act_type;
                }

                public int getAct_code() {
                    return act_code;
                }

                public void setAct_code(int act_code) {
                    this.act_code = act_code;
                }

                public String getCardid() {
                    return cardid;
                }

                public void setCardid(String cardid) {
                    this.cardid = cardid;
                }

                public String getLcardid() {
                    return lcardid;
                }

                public void setLcardid(String lcardid) {
                    this.lcardid = lcardid;
                }

                public String getFid() {
                    return fid;
                }

                public void setFid(String fid) {
                    this.fid = fid;
                }

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public String getMid() {
                    return mid;
                }

                public void setMid(String mid) {
                    this.mid = mid;
                }

                public String getOid() {
                    return oid;
                }

                public void setOid(String oid) {
                    this.oid = oid;
                }

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
                }

                public String getExt() {
                    return ext;
                }

                public void setExt(String ext) {
                    this.ext = ext;
                }
            }
        }

        public static class UrlStructData {


            private String url_title;
            private String url_type_pic;
            private String ori_url;
            private String short_url;
            private int url_type;
            private boolean result;
            private ActionlogDataXX actionlog;
            private String storage_type;
            private int hide;
            private int position;
            private int need_save_obj;

            public String getUrl_title() {
                return url_title;
            }

            public void setUrl_title(String url_title) {
                this.url_title = url_title;
            }

            public String getUrl_type_pic() {
                return url_type_pic;
            }

            public void setUrl_type_pic(String url_type_pic) {
                this.url_type_pic = url_type_pic;
            }

            public String getOri_url() {
                return ori_url;
            }

            public void setOri_url(String ori_url) {
                this.ori_url = ori_url;
            }

            public String getShort_url() {
                return short_url;
            }

            public void setShort_url(String short_url) {
                this.short_url = short_url;
            }

            public int getUrl_type() {
                return url_type;
            }

            public void setUrl_type(int url_type) {
                this.url_type = url_type;
            }

            public boolean isResult() {
                return result;
            }

            public void setResult(boolean result) {
                this.result = result;
            }

            public ActionlogDataXX getActionlog() {
                return actionlog;
            }

            public void setActionlog(ActionlogDataXX actionlog) {
                this.actionlog = actionlog;
            }

            public String getStorage_type() {
                return storage_type;
            }

            public void setStorage_type(String storage_type) {
                this.storage_type = storage_type;
            }

            public int getHide() {
                return hide;
            }

            public void setHide(int hide) {
                this.hide = hide;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public int getNeed_save_obj() {
                return need_save_obj;
            }

            public void setNeed_save_obj(int need_save_obj) {
                this.need_save_obj = need_save_obj;
            }

            public static class ActionlogDataXX {

                private int act_type;
                private int act_code;
                private String oid;
                private String cardid;
                private String lcardid;
                private String uicode;
                private String luicode;
                private String fid;
                private String lfid;
                private String ext;

                public int getAct_type() {
                    return act_type;
                }

                public void setAct_type(int act_type) {
                    this.act_type = act_type;
                }

                public int getAct_code() {
                    return act_code;
                }

                public void setAct_code(int act_code) {
                    this.act_code = act_code;
                }

                public String getOid() {
                    return oid;
                }

                public void setOid(String oid) {
                    this.oid = oid;
                }

                public String getCardid() {
                    return cardid;
                }

                public void setCardid(String cardid) {
                    this.cardid = cardid;
                }

                public String getLcardid() {
                    return lcardid;
                }

                public void setLcardid(String lcardid) {
                    this.lcardid = lcardid;
                }

                public String getUicode() {
                    return uicode;
                }

                public void setUicode(String uicode) {
                    this.uicode = uicode;
                }

                public String getLuicode() {
                    return luicode;
                }

                public void setLuicode(String luicode) {
                    this.luicode = luicode;
                }

                public String getFid() {
                    return fid;
                }

                public void setFid(String fid) {
                    this.fid = fid;
                }

                public String getLfid() {
                    return lfid;
                }

                public void setLfid(String lfid) {
                    this.lfid = lfid;
                }

                public String getExt() {
                    return ext;
                }

                public void setExt(String ext) {
                    this.ext = ext;
                }
            }
        }

        public static class AnnotationsDataX {
            /**
             * shooting : 1
             * client_mblogid : iPhone-7ACB21DD-D6A1-4043-BE46-2410A31E8C72
             * mapi_request : true
             */

            private int shooting;
            private String client_mblogid;
            private boolean mapi_request;

            public int getShooting() {
                return shooting;
            }

            public void setShooting(int shooting) {
                this.shooting = shooting;
            }

            public String getClient_mblogid() {
                return client_mblogid;
            }

            public void setClient_mblogid(String client_mblogid) {
                this.client_mblogid = client_mblogid;
            }

            public boolean isMapi_request() {
                return mapi_request;
            }

            public void setMapi_request(boolean mapi_request) {
                this.mapi_request = mapi_request;
            }
        }

        public static class TopicStructData {
            /**
             * title :
             * topic_url : sinaweibo://searchall?containerid=231522&q=%23%E5%A4%A9%E6%B0%94%E5%89%A7%E9%80%8F%23&isnewpage=1
             * topic_title : 天气剧透
             * is_invalid : 0
             */

            private String title;
            private String topic_url;
            private String topic_title;
            private int is_invalid;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTopic_url() {
                return topic_url;
            }

            public void setTopic_url(String topic_url) {
                this.topic_url = topic_url;
            }

            public String getTopic_title() {
                return topic_title;
            }

            public void setTopic_title(String topic_title) {
                this.topic_title = topic_title;
            }

            public int getIs_invalid() {
                return is_invalid;
            }

            public void setIs_invalid(int is_invalid) {
                this.is_invalid = is_invalid;
            }
        }

        public static class TagStructData {


            private String tag_name;
            private String oid;
            private int tag_type;
            private int tag_hidden;
            private String tag_scheme;
            private String url_type_pic;
            private ActionlogDataXXX actionlog;

            public String getTag_name() {
                return tag_name;
            }

            public void setTag_name(String tag_name) {
                this.tag_name = tag_name;
            }

            public String getOid() {
                return oid;
            }

            public void setOid(String oid) {
                this.oid = oid;
            }

            public int getTag_type() {
                return tag_type;
            }

            public void setTag_type(int tag_type) {
                this.tag_type = tag_type;
            }

            public int getTag_hidden() {
                return tag_hidden;
            }

            public void setTag_hidden(int tag_hidden) {
                this.tag_hidden = tag_hidden;
            }

            public String getTag_scheme() {
                return tag_scheme;
            }

            public void setTag_scheme(String tag_scheme) {
                this.tag_scheme = tag_scheme;
            }

            public String getUrl_type_pic() {
                return url_type_pic;
            }

            public void setUrl_type_pic(String url_type_pic) {
                this.url_type_pic = url_type_pic;
            }

            public ActionlogDataXXX getActionlog() {
                return actionlog;
            }

            public void setActionlog(ActionlogDataXXX actionlog) {
                this.actionlog = actionlog;
            }

            public static class ActionlogDataXXX {


                private int act_code;
                private String oid;
                private Object uicode;
                private Object luicode;
                private Object fid;

                public int getAct_code() {
                    return act_code;
                }

                public void setAct_code(int act_code) {
                    this.act_code = act_code;
                }

                public String getOid() {
                    return oid;
                }

                public void setOid(String oid) {
                    this.oid = oid;
                }

                public Object getUicode() {
                    return uicode;
                }

                public void setUicode(Object uicode) {
                    this.uicode = uicode;
                }

                public Object getLuicode() {
                    return luicode;
                }

                public void setLuicode(Object luicode) {
                    this.luicode = luicode;
                }

                public Object getFid() {
                    return fid;
                }

                public void setFid(Object fid) {
                    this.fid = fid;
                }
            }
        }
    }
}
