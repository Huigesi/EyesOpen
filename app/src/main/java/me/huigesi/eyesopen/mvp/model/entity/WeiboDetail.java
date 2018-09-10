package me.huigesi.eyesopen.mvp.model.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeiboDetail {


    private long id;
    private StatusData status;
    private long max_id;
    private int max_id_type;
    private int total_number;
    private int state_code;
    private FilterGroupInfoData filter_group_info;
    private RootCommentData rootComment;
    private List<RootCommentsData> root_comments;
    private List<FilterGroupData> filter_group;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public StatusData getStatus() {
        return status;
    }

    public void setStatus(StatusData status) {
        this.status = status;
    }

    public long getMax_id() {
        return max_id;
    }

    public void setMax_id(long max_id) {
        this.max_id = max_id;
    }

    public int getMax_id_type() {
        return max_id_type;
    }

    public void setMax_id_type(int max_id_type) {
        this.max_id_type = max_id_type;
    }

    public int getTotal_number() {
        return total_number;
    }

    public void setTotal_number(int total_number) {
        this.total_number = total_number;
    }

    public int getState_code() {
        return state_code;
    }

    public void setState_code(int state_code) {
        this.state_code = state_code;
    }

    public FilterGroupInfoData getFilter_group_info() {
        return filter_group_info;
    }

    public void setFilter_group_info(FilterGroupInfoData filter_group_info) {
        this.filter_group_info = filter_group_info;
    }

    public RootCommentData getRootComment() {
        return rootComment;
    }

    public void setRootComment(RootCommentData rootComment) {
        this.rootComment = rootComment;
    }

    public List<RootCommentsData> getRoot_comments() {
        return root_comments;
    }

    public void setRoot_comments(List<RootCommentsData> root_comments) {
        this.root_comments = root_comments;
    }

    public List<FilterGroupData> getFilter_group() {
        return filter_group;
    }

    public void setFilter_group(List<FilterGroupData> filter_group) {
        this.filter_group = filter_group;
    }

    public static class StatusData {


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
        private UserData user;
        private RetweetedStatusData retweeted_status;
        private int reposts_count;
        private int comments_count;
        private int attitudes_count;
        private int pending_approval_count;
        private boolean isLongText;
        private boolean liked;
        private int like_attitude_type;
        private int hide_flag;
        private int mlevel;
        private VisibleDataX visible;
        private int biz_feature;
        private int hasActionTypeCard;
        private int mblogtype;
        private int userType;
        private int more_info_type;
        private int positive_recom_flag;
        private int content_auth;
        private String gif_ids;
        private int is_show_bulletin;
        private CommentManageInfoDataX comment_manage_info;
        private String mblogtypename;
        private String mblogid;
        private String scheme;
        private int attitudes_status;
        private int recom_state;
        private int weibo_position;
        private String obj_ext;
        private PageInfoData page_info;
        private EditConfigDataX edit_config;
        private int is_fold;
        private List<String> pic_ids;
        private List<?> text_tag_tips;
        private List<UrlStructData> url_struct;
        private RetweetedStatusData.LongTextData longText;

        public RetweetedStatusData.LongTextData getLongText() {
            return longText;
        }

        public void setLongText(RetweetedStatusData.LongTextData longText) {
            this.longText = longText;
        }

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

        public UserData getUser() {
            return user;
        }

        public void setUser(UserData user) {
            this.user = user;
        }

        public RetweetedStatusData getRetweeted_status() {
            return retweeted_status;
        }

        public void setRetweeted_status(RetweetedStatusData retweeted_status) {
            this.retweeted_status = retweeted_status;
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

        public boolean isLiked() {
            return liked;
        }

        public void setLiked(boolean liked) {
            this.liked = liked;
        }

        public int getLike_attitude_type() {
            return like_attitude_type;
        }

        public void setLike_attitude_type(int like_attitude_type) {
            this.like_attitude_type = like_attitude_type;
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

        public String getMblogtypename() {
            return mblogtypename;
        }

        public void setMblogtypename(String mblogtypename) {
            this.mblogtypename = mblogtypename;
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

        public EditConfigDataX getEdit_config() {
            return edit_config;
        }

        public void setEdit_config(EditConfigDataX edit_config) {
            this.edit_config = edit_config;
        }

        public int getIs_fold() {
            return is_fold;
        }

        public void setIs_fold(int is_fold) {
            this.is_fold = is_fold;
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
                 * unread_pool : 1
                 * daiyan : 0
                 * ali_1688 : 0
                 * vip_activity2 : 0
                 * fools_day_2016 : 0
                 * uefa_euro_2016 : 0
                 * unread_pool_ext : 1
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

        public static class RetweetedStatusData {

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
            private UserDataX user;
            private int reposts_count;
            private int comments_count;
            private int attitudes_count;
            private int pending_approval_count;
            private boolean isLongText;
            private LongTextData longText;
            private int hide_flag;
            private int mlevel;
            private VisibleData visible;
            private long biz_feature;
            private int hasActionTypeCard;
            private int mblogtype;
            private int userType;
            private int more_info_type;
            private int positive_recom_flag;
            private int content_auth;
            private String gif_ids;
            private int is_show_bulletin;
            private CommentManageInfoData comment_manage_info;
            private String mblogid;
            private String scheme;
            private int attitudes_status;
            private int recom_state;
            private ContinueTagData continue_tag;
            private int preload_type;
            private PreloadDataData preload_data;
            private int weibo_position;
            private EditConfigData edit_config;
            private int is_fold;
            private List<String> pic_ids;
            private List<Integer> biz_ids;
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

            public LongTextData getLongText() {
                return longText;
            }

            public void setLongText(LongTextData longText) {
                this.longText = longText;
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

            public ContinueTagData getContinue_tag() {
                return continue_tag;
            }

            public void setContinue_tag(ContinueTagData continue_tag) {
                this.continue_tag = continue_tag;
            }

            public int getPreload_type() {
                return preload_type;
            }

            public void setPreload_type(int preload_type) {
                this.preload_type = preload_type;
            }

            public PreloadDataData getPreload_data() {
                return preload_data;
            }

            public void setPreload_data(PreloadDataData preload_data) {
                this.preload_data = preload_data;
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

            public int getIs_fold() {
                return is_fold;
            }

            public void setIs_fold(int is_fold) {
                this.is_fold = is_fold;
            }

            public List<String> getPic_ids() {
                return pic_ids;
            }

            public void setPic_ids(List<String> pic_ids) {
                this.pic_ids = pic_ids;
            }


            public List<Integer> getBiz_ids() {
                return biz_ids;
            }

            public void setBiz_ids(List<Integer> biz_ids) {
                this.biz_ids = biz_ids;
            }

            public List<?> getText_tag_tips() {
                return text_tag_tips;
            }

            public void setText_tag_tips(List<?> text_tag_tips) {
                this.text_tag_tips = text_tag_tips;
            }

            public static class UserDataX {

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
                private int credit_score;
                private int user_ability;
                private int urank;
                private int story_read_state;
                private int vclub_member;
                private String source;

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
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

                public static class ExtendDataX {
                    /**
                     * privacy : {"mobile":1}
                     * mbprivilege : 0000000000000000000000000000000000000000000000000000000000000000
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

            public static class LongTextData {

                private String longTextContent;
                private List<UrlObjectsData> url_objects;

                public String getLongTextContent() {
                    return longTextContent;
                }

                public void setLongTextContent(String longTextContent) {
                    this.longTextContent = longTextContent;
                }

                public List<UrlObjectsData> getUrl_objects() {
                    return url_objects;
                }

                public void setUrl_objects(List<UrlObjectsData> url_objects) {
                    this.url_objects = url_objects;
                }

                public static class UrlObjectsData {

                    private String url_ori;
                    private String object_id;
                    private int expire_time;
                    private InfoData info;
                    private ObjectDataX object;
                    private int like_count;
                    private int play_count;
                    private boolean isActionType;
                    private int follower_count;
                    private int asso_like_count;
                    private boolean card_info_un_integrity;
                    private int super_topic_status_count;
                    private int super_topic_photo_count;
                    private boolean is_follow_object_author;
                    private int object_author_video_status_count;

                    public String getUrl_ori() {
                        return url_ori;
                    }

                    public void setUrl_ori(String url_ori) {
                        this.url_ori = url_ori;
                    }

                    public String getObject_id() {
                        return object_id;
                    }

                    public void setObject_id(String object_id) {
                        this.object_id = object_id;
                    }

                    public int getExpire_time() {
                        return expire_time;
                    }

                    public void setExpire_time(int expire_time) {
                        this.expire_time = expire_time;
                    }

                    public InfoData getInfo() {
                        return info;
                    }

                    public void setInfo(InfoData info) {
                        this.info = info;
                    }

                    public ObjectDataX getObject() {
                        return object;
                    }

                    public void setObject(ObjectDataX object) {
                        this.object = object;
                    }

                    public int getLike_count() {
                        return like_count;
                    }

                    public void setLike_count(int like_count) {
                        this.like_count = like_count;
                    }

                    public int getPlay_count() {
                        return play_count;
                    }

                    public void setPlay_count(int play_count) {
                        this.play_count = play_count;
                    }

                    public boolean isIsActionType() {
                        return isActionType;
                    }

                    public void setIsActionType(boolean isActionType) {
                        this.isActionType = isActionType;
                    }

                    public int getFollower_count() {
                        return follower_count;
                    }

                    public void setFollower_count(int follower_count) {
                        this.follower_count = follower_count;
                    }

                    public int getAsso_like_count() {
                        return asso_like_count;
                    }

                    public void setAsso_like_count(int asso_like_count) {
                        this.asso_like_count = asso_like_count;
                    }

                    public boolean isCard_info_un_integrity() {
                        return card_info_un_integrity;
                    }

                    public void setCard_info_un_integrity(boolean card_info_un_integrity) {
                        this.card_info_un_integrity = card_info_un_integrity;
                    }

                    public int getSuper_topic_status_count() {
                        return super_topic_status_count;
                    }

                    public void setSuper_topic_status_count(int super_topic_status_count) {
                        this.super_topic_status_count = super_topic_status_count;
                    }

                    public int getSuper_topic_photo_count() {
                        return super_topic_photo_count;
                    }

                    public void setSuper_topic_photo_count(int super_topic_photo_count) {
                        this.super_topic_photo_count = super_topic_photo_count;
                    }

                    public boolean isIs_follow_object_author() {
                        return is_follow_object_author;
                    }

                    public void setIs_follow_object_author(boolean is_follow_object_author) {
                        this.is_follow_object_author = is_follow_object_author;
                    }

                    public int getObject_author_video_status_count() {
                        return object_author_video_status_count;
                    }

                    public void setObject_author_video_status_count(int object_author_video_status_count) {
                        this.object_author_video_status_count = object_author_video_status_count;
                    }

                    public static class InfoData {
                        /**
                         * url_short : http://t.cn/RkKlDZH
                         * url_long : http://video.weibo.com/show?fid=1034:4275782022027912
                         * type : 39
                         * result : true
                         * title :
                         * description :
                         * last_modified : 1534909342
                         * transcode : 0
                         */

                        private String url_short;
                        private String url_long;
                        private int type;
                        private boolean result;
                        private String title;
                        private String description;
                        private int last_modified;
                        private int transcode;

                        public String getUrl_short() {
                            return url_short;
                        }

                        public void setUrl_short(String url_short) {
                            this.url_short = url_short;
                        }

                        public String getUrl_long() {
                            return url_long;
                        }

                        public void setUrl_long(String url_long) {
                            this.url_long = url_long;
                        }

                        public int getType() {
                            return type;
                        }

                        public void setType(int type) {
                            this.type = type;
                        }

                        public boolean isResult() {
                            return result;
                        }

                        public void setResult(boolean result) {
                            this.result = result;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getDescription() {
                            return description;
                        }

                        public void setDescription(String description) {
                            this.description = description;
                        }

                        public int getLast_modified() {
                            return last_modified;
                        }

                        public void setLast_modified(int last_modified) {
                            this.last_modified = last_modified;
                        }

                        public int getTranscode() {
                            return transcode;
                        }

                        public void setTranscode(int transcode) {
                            this.transcode = transcode;
                        }
                    }

                    public static class ObjectDataX {

                        private String object_id;
                        private String containerid;
                        private String object_domain_id;
                        private String object_type;
                        private int safe_status;
                        private String show_status;
                        private String act_status;
                        private String last_modified;
                        private long timestamp;
                        private String activate_status;
                        private ObjectData object;

                        public String getObject_id() {
                            return object_id;
                        }

                        public void setObject_id(String object_id) {
                            this.object_id = object_id;
                        }

                        public String getContainerid() {
                            return containerid;
                        }

                        public void setContainerid(String containerid) {
                            this.containerid = containerid;
                        }

                        public String getObject_domain_id() {
                            return object_domain_id;
                        }

                        public void setObject_domain_id(String object_domain_id) {
                            this.object_domain_id = object_domain_id;
                        }

                        public String getObject_type() {
                            return object_type;
                        }

                        public void setObject_type(String object_type) {
                            this.object_type = object_type;
                        }

                        public int getSafe_status() {
                            return safe_status;
                        }

                        public void setSafe_status(int safe_status) {
                            this.safe_status = safe_status;
                        }

                        public String getShow_status() {
                            return show_status;
                        }

                        public void setShow_status(String show_status) {
                            this.show_status = show_status;
                        }

                        public String getAct_status() {
                            return act_status;
                        }

                        public void setAct_status(String act_status) {
                            this.act_status = act_status;
                        }

                        public String getLast_modified() {
                            return last_modified;
                        }

                        public void setLast_modified(String last_modified) {
                            this.last_modified = last_modified;
                        }

                        public long getTimestamp() {
                            return timestamp;
                        }

                        public void setTimestamp(long timestamp) {
                            this.timestamp = timestamp;
                        }

                        public String getActivate_status() {
                            return activate_status;
                        }

                        public void setActivate_status(String activate_status) {
                            this.activate_status = activate_status;
                        }

                        public ObjectData getObject() {
                            return object;
                        }

                        public void setObject(ObjectData object) {
                            this.object = object;
                        }

                        public static class ObjectData {
                            /**
                             * display_name : 双蛋肠粉的秒拍视频
                             * summary : 长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文
                             * url : http://video.weibo.com/show?fid=1034:4275782022027912
                             * target_url : http://video.weibo.com/show?fid=1034:4275782022027912
                             * object_type : video
                             * author : {"id":"5905635122","display_name":"双蛋肠粉","object_type":"person","avatar_large":"http://tvax2.sinaimg.cn/crop.206.229.270.270.180/006rFrtoly8frvvzh84mqj30ku0dwakj.jpg","followers_count":25,"verified_type":-1,"verified_type_ext":0,"verified_reason":"","verified":false,"verified_level":3}
                             * created_at : 2018-08-22
                             * updated_at : 2018-08-22
                             * object_type_detail : weibovideo
                             * id : 1034:4275782022027912
                             * image : {"url":"http://wx1.sinaimg.cn/orj480/006rFrtogy1fuibw7yg4lj30a00hsjro.jpg","width":360,"height":640}
                             * cover_image : false
                             * urls : {"mp4_hd_mp4":"http://f.us.sinaimg.cn/0012MlMbgx07n1BA5CjC010402000P4E0k010.mp4?label=mp4_hd&template=360x640.28&Expires=1534913137&ssig=CoQIDxrhfv&KID=unistore,video","mp4_ld_mp4":"http://f.us.sinaimg.cn/002qEWbfgx07n1BA6Imz010402000M6U0k010.mp4?label=mp4_ld&template=360x640.28&Expires=1534913137&ssig=vqr2rME3IX&KID=unistore,video","mp4_ld":"http://f.us.sinaimg.cn/004o8wlHgx07n1BA8oWs010f020000220k010.m3u8?Expires=1534913137&ssig=qEx7QXfXf1&KID=unistore,video","mp4_hd":"http://f.us.sinaimg.cn/001F6iZQgx07n1BA7zaL010f020000220k010.m3u8?Expires=1534913137&ssig=TIEZJnr7gK&KID=unistore,video"}
                             * screenshots : {"1":"http://wx1.sinaimg.cn/sq480/006rFrtogy1fuibw7yg4lj30a00hsjro.jpg","2":"http://wx2.sinaimg.cn/sq480/006rFrtogy1fuibw807c5j30a00hsjro.jpg","3":"http://wx1.sinaimg.cn/sq480/006rFrtogy1fuibw85zdlj30a00hs0su.jpg","4":"http://wx1.sinaimg.cn/sq480/006rFrtogy1fuibw87k9lj30a00hs0su.jpg","5":"http://wx3.sinaimg.cn/sq480/006rFrtogy1fuibw88vo9j30a00hs0su.jpg"}
                             * duration : 3
                             * file_create_type : localfile
                             * links : {"url":"http://video.weibo.com/show?fid=1034:4275782022027912"}
                             * custom_data : {"source":"新浪微博"}
                             * stream : {"duration":3,"format":"mp4","url":"http://f.us.sinaimg.cn/002qEWbfgx07n1BA6Imz010402000M6U0k010.mp4?label=mp4_ld&template=360x640.28&Expires=1534913137&ssig=vqr2rME3IX&KID=unistore,video","hd_url":"http://f.us.sinaimg.cn/0012MlMbgx07n1BA5CjC010402000P4E0k010.mp4?label=mp4_hd&template=360x640.28&Expires=1534913137&ssig=CoQIDxrhfv&KID=unistore,video","width":360,"height":640}
                             * original_url : http://f.us.sinaimg.cn/0040TuyIgx07n1BzdwNF010f1200341s0k010
                             * storage_type : unistore
                             * embed_code : http://video.weibo.com/player/1034:4275782022027912/v.swf
                             * original_file_md5 : db361da89113c76831afbb2948e82d7f
                             * video_details : [{"size":196332,"bitrate":397,"prefetch_size":152976,"label":"mp4_hd"},{"size":184940,"bitrate":374,"prefetch_size":144318,"label":"mp4_ld"}]
                             * author_mid : 4275782043765408
                             * client_ip : 116.22.33.244
                             * raw_file_meta : {"md5":"db361da89113c76831afbb2948e82d7f"}
                             * compressed_file_meta : {"md5":"db361da89113c76831afbb2948e82d7f","video_media_info":{"width":360,"height":640}}
                             * client : other
                             * video_type : normal
                             * fid : 4275782018695490
                             * copyright : 0
                             * definition : normal
                             * scrubber_preview : {"previews":[{"width":80,"height":45,"row":10,"col":10,"interval":1,"label":"ld","urls":["http://wx3.sinaimg.cn/large/006rFrtogy1fuibwf4pswj30m80cit8o.jpg"]}]}
                             * appid : 28
                             * slides : {"pids":["006rFrtogy1fuibwalcmdj30a00hsjro","006rFrtogy1fuibwamk8yj30a00hsjro","006rFrtogy1fuibwanwk4j30a00hsaac","006rFrtogy1fuibwapaudj30a00hsjro"]}
                             * video_cover : 006rFrtogy1fuibwak5j2j30a00hsmx3
                             * biz_type : video
                             * file_monitor_type : after
                             * timeMonitorMeta : {"uploadCompleteTimeStamp":1534909337166,"transBackTimeStamp":1534909342706,"monitorReturnTimeStamp":0,"initTimeStamp":1534909336000}
                             * domesticOnly : false
                             * input_tags : {"creation_time":"2018-08-22 03:42:15"}
                             * video_orientation : vertical
                             * ext_info : {"video_orientation":"vertical"}
                             * logos : ["other"]
                             * biz : {"biz_id":"230444","containerid":"2304444275782022027912"}
                             */

                            private String display_name;
                            private String summary;
                            private String url;
                            private String target_url;
                            private String object_type;
                            private AuthorData author;
                            private String created_at;
                            private String updated_at;
                            private String object_type_detail;
                            private String id;
                            private ImageData image;
                            private boolean cover_image;
                            private UrlsData urls;
                            private ScreenshotsData screenshots;
                            private int duration;
                            private String file_create_type;
                            private LinksData links;
                            private CustomDataData custom_data;
                            private StreamData stream;
                            private String original_url;
                            private String storage_type;
                            private String embed_code;
                            private String original_file_md5;
                            private String author_mid;
                            private String client_ip;
                            private RawFileMetaData raw_file_meta;
                            private CompressedFileMetaData compressed_file_meta;
                            private String client;
                            private String video_type;
                            private long fid;
                            private int copyright;
                            private String definition;
                            private ScrubberPreviewData scrubber_preview;
                            private int appid;
                            private SlidesData slides;
                            private String video_cover;
                            private String biz_type;
                            private String file_monitor_type;
                            private TimeMonitorMetaData timeMonitorMeta;
                            private boolean domesticOnly;
                            private InputTagsData input_tags;
                            private String video_orientation;
                            private ExtInfoData ext_info;
                            private BizData biz;
                            private List<VideoDetailsData> video_details;
                            private List<String> logos;

                            public String getDisplay_name() {
                                return display_name;
                            }

                            public void setDisplay_name(String display_name) {
                                this.display_name = display_name;
                            }

                            public String getSummary() {
                                return summary;
                            }

                            public void setSummary(String summary) {
                                this.summary = summary;
                            }

                            public String getUrl() {
                                return url;
                            }

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public String getTarget_url() {
                                return target_url;
                            }

                            public void setTarget_url(String target_url) {
                                this.target_url = target_url;
                            }

                            public String getObject_type() {
                                return object_type;
                            }

                            public void setObject_type(String object_type) {
                                this.object_type = object_type;
                            }

                            public AuthorData getAuthor() {
                                return author;
                            }

                            public void setAuthor(AuthorData author) {
                                this.author = author;
                            }

                            public String getCreated_at() {
                                return created_at;
                            }

                            public void setCreated_at(String created_at) {
                                this.created_at = created_at;
                            }

                            public String getUpdated_at() {
                                return updated_at;
                            }

                            public void setUpdated_at(String updated_at) {
                                this.updated_at = updated_at;
                            }

                            public String getObject_type_detail() {
                                return object_type_detail;
                            }

                            public void setObject_type_detail(String object_type_detail) {
                                this.object_type_detail = object_type_detail;
                            }

                            public String getId() {
                                return id;
                            }

                            public void setId(String id) {
                                this.id = id;
                            }

                            public ImageData getImage() {
                                return image;
                            }

                            public void setImage(ImageData image) {
                                this.image = image;
                            }

                            public boolean isCover_image() {
                                return cover_image;
                            }

                            public void setCover_image(boolean cover_image) {
                                this.cover_image = cover_image;
                            }

                            public UrlsData getUrls() {
                                return urls;
                            }

                            public void setUrls(UrlsData urls) {
                                this.urls = urls;
                            }

                            public ScreenshotsData getScreenshots() {
                                return screenshots;
                            }

                            public void setScreenshots(ScreenshotsData screenshots) {
                                this.screenshots = screenshots;
                            }

                            public int getDuration() {
                                return duration;
                            }

                            public void setDuration(int duration) {
                                this.duration = duration;
                            }

                            public String getFile_create_type() {
                                return file_create_type;
                            }

                            public void setFile_create_type(String file_create_type) {
                                this.file_create_type = file_create_type;
                            }

                            public LinksData getLinks() {
                                return links;
                            }

                            public void setLinks(LinksData links) {
                                this.links = links;
                            }

                            public CustomDataData getCustom_data() {
                                return custom_data;
                            }

                            public void setCustom_data(CustomDataData custom_data) {
                                this.custom_data = custom_data;
                            }

                            public StreamData getStream() {
                                return stream;
                            }

                            public void setStream(StreamData stream) {
                                this.stream = stream;
                            }

                            public String getOriginal_url() {
                                return original_url;
                            }

                            public void setOriginal_url(String original_url) {
                                this.original_url = original_url;
                            }

                            public String getStorage_type() {
                                return storage_type;
                            }

                            public void setStorage_type(String storage_type) {
                                this.storage_type = storage_type;
                            }

                            public String getEmbed_code() {
                                return embed_code;
                            }

                            public void setEmbed_code(String embed_code) {
                                this.embed_code = embed_code;
                            }

                            public String getOriginal_file_md5() {
                                return original_file_md5;
                            }

                            public void setOriginal_file_md5(String original_file_md5) {
                                this.original_file_md5 = original_file_md5;
                            }

                            public String getAuthor_mid() {
                                return author_mid;
                            }

                            public void setAuthor_mid(String author_mid) {
                                this.author_mid = author_mid;
                            }

                            public String getClient_ip() {
                                return client_ip;
                            }

                            public void setClient_ip(String client_ip) {
                                this.client_ip = client_ip;
                            }

                            public RawFileMetaData getRaw_file_meta() {
                                return raw_file_meta;
                            }

                            public void setRaw_file_meta(RawFileMetaData raw_file_meta) {
                                this.raw_file_meta = raw_file_meta;
                            }

                            public CompressedFileMetaData getCompressed_file_meta() {
                                return compressed_file_meta;
                            }

                            public void setCompressed_file_meta(CompressedFileMetaData compressed_file_meta) {
                                this.compressed_file_meta = compressed_file_meta;
                            }

                            public String getClient() {
                                return client;
                            }

                            public void setClient(String client) {
                                this.client = client;
                            }

                            public String getVideo_type() {
                                return video_type;
                            }

                            public void setVideo_type(String video_type) {
                                this.video_type = video_type;
                            }

                            public long getFid() {
                                return fid;
                            }

                            public void setFid(long fid) {
                                this.fid = fid;
                            }

                            public int getCopyright() {
                                return copyright;
                            }

                            public void setCopyright(int copyright) {
                                this.copyright = copyright;
                            }

                            public String getDefinition() {
                                return definition;
                            }

                            public void setDefinition(String definition) {
                                this.definition = definition;
                            }

                            public ScrubberPreviewData getScrubber_preview() {
                                return scrubber_preview;
                            }

                            public void setScrubber_preview(ScrubberPreviewData scrubber_preview) {
                                this.scrubber_preview = scrubber_preview;
                            }

                            public int getAppid() {
                                return appid;
                            }

                            public void setAppid(int appid) {
                                this.appid = appid;
                            }

                            public SlidesData getSlides() {
                                return slides;
                            }

                            public void setSlides(SlidesData slides) {
                                this.slides = slides;
                            }

                            public String getVideo_cover() {
                                return video_cover;
                            }

                            public void setVideo_cover(String video_cover) {
                                this.video_cover = video_cover;
                            }

                            public String getBiz_type() {
                                return biz_type;
                            }

                            public void setBiz_type(String biz_type) {
                                this.biz_type = biz_type;
                            }

                            public String getFile_monitor_type() {
                                return file_monitor_type;
                            }

                            public void setFile_monitor_type(String file_monitor_type) {
                                this.file_monitor_type = file_monitor_type;
                            }

                            public TimeMonitorMetaData getTimeMonitorMeta() {
                                return timeMonitorMeta;
                            }

                            public void setTimeMonitorMeta(TimeMonitorMetaData timeMonitorMeta) {
                                this.timeMonitorMeta = timeMonitorMeta;
                            }

                            public boolean isDomesticOnly() {
                                return domesticOnly;
                            }

                            public void setDomesticOnly(boolean domesticOnly) {
                                this.domesticOnly = domesticOnly;
                            }

                            public InputTagsData getInput_tags() {
                                return input_tags;
                            }

                            public void setInput_tags(InputTagsData input_tags) {
                                this.input_tags = input_tags;
                            }

                            public String getVideo_orientation() {
                                return video_orientation;
                            }

                            public void setVideo_orientation(String video_orientation) {
                                this.video_orientation = video_orientation;
                            }

                            public ExtInfoData getExt_info() {
                                return ext_info;
                            }

                            public void setExt_info(ExtInfoData ext_info) {
                                this.ext_info = ext_info;
                            }

                            public BizData getBiz() {
                                return biz;
                            }

                            public void setBiz(BizData biz) {
                                this.biz = biz;
                            }

                            public List<VideoDetailsData> getVideo_details() {
                                return video_details;
                            }

                            public void setVideo_details(List<VideoDetailsData> video_details) {
                                this.video_details = video_details;
                            }

                            public List<String> getLogos() {
                                return logos;
                            }

                            public void setLogos(List<String> logos) {
                                this.logos = logos;
                            }

                            public static class AuthorData {
                                /**
                                 * id : 5905635122
                                 * display_name : 双蛋肠粉
                                 * object_type : person
                                 * avatar_large : http://tvax2.sinaimg.cn/crop.206.229.270.270.180/006rFrtoly8frvvzh84mqj30ku0dwakj.jpg
                                 * followers_count : 25
                                 * verified_type : -1
                                 * verified_type_ext : 0
                                 * verified_reason :
                                 * verified : false
                                 * verified_level : 3
                                 */

                                private String id;
                                private String display_name;
                                private String object_type;
                                private String avatar_large;
                                private int followers_count;
                                private int verified_type;
                                private int verified_type_ext;
                                private String verified_reason;
                                private boolean verified;
                                private int verified_level;

                                public String getId() {
                                    return id;
                                }

                                public void setId(String id) {
                                    this.id = id;
                                }

                                public String getDisplay_name() {
                                    return display_name;
                                }

                                public void setDisplay_name(String display_name) {
                                    this.display_name = display_name;
                                }

                                public String getObject_type() {
                                    return object_type;
                                }

                                public void setObject_type(String object_type) {
                                    this.object_type = object_type;
                                }

                                public String getAvatar_large() {
                                    return avatar_large;
                                }

                                public void setAvatar_large(String avatar_large) {
                                    this.avatar_large = avatar_large;
                                }

                                public int getFollowers_count() {
                                    return followers_count;
                                }

                                public void setFollowers_count(int followers_count) {
                                    this.followers_count = followers_count;
                                }

                                public int getVerified_type() {
                                    return verified_type;
                                }

                                public void setVerified_type(int verified_type) {
                                    this.verified_type = verified_type;
                                }

                                public int getVerified_type_ext() {
                                    return verified_type_ext;
                                }

                                public void setVerified_type_ext(int verified_type_ext) {
                                    this.verified_type_ext = verified_type_ext;
                                }

                                public String getVerified_reason() {
                                    return verified_reason;
                                }

                                public void setVerified_reason(String verified_reason) {
                                    this.verified_reason = verified_reason;
                                }

                                public boolean isVerified() {
                                    return verified;
                                }

                                public void setVerified(boolean verified) {
                                    this.verified = verified;
                                }

                                public int getVerified_level() {
                                    return verified_level;
                                }

                                public void setVerified_level(int verified_level) {
                                    this.verified_level = verified_level;
                                }
                            }

                            public static class ImageData {
                                /**
                                 * url : http://wx1.sinaimg.cn/orj480/006rFrtogy1fuibw7yg4lj30a00hsjro.jpg
                                 * width : 360
                                 * height : 640
                                 */

                                private String url;
                                private int width;
                                private int height;

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
                            }

                            public static class UrlsData {
                                /**
                                 * mp4_hd_mp4 : http://f.us.sinaimg.cn/0012MlMbgx07n1BA5CjC010402000P4E0k010.mp4?label=mp4_hd&template=360x640.28&Expires=1534913137&ssig=CoQIDxrhfv&KID=unistore,video
                                 * mp4_ld_mp4 : http://f.us.sinaimg.cn/002qEWbfgx07n1BA6Imz010402000M6U0k010.mp4?label=mp4_ld&template=360x640.28&Expires=1534913137&ssig=vqr2rME3IX&KID=unistore,video
                                 * mp4_ld : http://f.us.sinaimg.cn/004o8wlHgx07n1BA8oWs010f020000220k010.m3u8?Expires=1534913137&ssig=qEx7QXfXf1&KID=unistore,video
                                 * mp4_hd : http://f.us.sinaimg.cn/001F6iZQgx07n1BA7zaL010f020000220k010.m3u8?Expires=1534913137&ssig=TIEZJnr7gK&KID=unistore,video
                                 */

                                private String mp4_hd_mp4;
                                private String mp4_ld_mp4;
                                private String mp4_ld;
                                private String mp4_hd;

                                public String getMp4_hd_mp4() {
                                    return mp4_hd_mp4;
                                }

                                public void setMp4_hd_mp4(String mp4_hd_mp4) {
                                    this.mp4_hd_mp4 = mp4_hd_mp4;
                                }

                                public String getMp4_ld_mp4() {
                                    return mp4_ld_mp4;
                                }

                                public void setMp4_ld_mp4(String mp4_ld_mp4) {
                                    this.mp4_ld_mp4 = mp4_ld_mp4;
                                }

                                public String getMp4_ld() {
                                    return mp4_ld;
                                }

                                public void setMp4_ld(String mp4_ld) {
                                    this.mp4_ld = mp4_ld;
                                }

                                public String getMp4_hd() {
                                    return mp4_hd;
                                }

                                public void setMp4_hd(String mp4_hd) {
                                    this.mp4_hd = mp4_hd;
                                }
                            }

                            public static class ScreenshotsData {
                                /**
                                 * 1 : http://wx1.sinaimg.cn/sq480/006rFrtogy1fuibw7yg4lj30a00hsjro.jpg
                                 * 2 : http://wx2.sinaimg.cn/sq480/006rFrtogy1fuibw807c5j30a00hsjro.jpg
                                 * 3 : http://wx1.sinaimg.cn/sq480/006rFrtogy1fuibw85zdlj30a00hs0su.jpg
                                 * 4 : http://wx1.sinaimg.cn/sq480/006rFrtogy1fuibw87k9lj30a00hs0su.jpg
                                 * 5 : http://wx3.sinaimg.cn/sq480/006rFrtogy1fuibw88vo9j30a00hs0su.jpg
                                 */

                                @SerializedName("1")
                                private String _$1;
                                @SerializedName("2")
                                private String _$2;
                                @SerializedName("3")
                                private String _$3;
                                @SerializedName("4")
                                private String _$4;
                                @SerializedName("5")
                                private String _$5;

                                public String get_$1() {
                                    return _$1;
                                }

                                public void set_$1(String _$1) {
                                    this._$1 = _$1;
                                }

                                public String get_$2() {
                                    return _$2;
                                }

                                public void set_$2(String _$2) {
                                    this._$2 = _$2;
                                }

                                public String get_$3() {
                                    return _$3;
                                }

                                public void set_$3(String _$3) {
                                    this._$3 = _$3;
                                }

                                public String get_$4() {
                                    return _$4;
                                }

                                public void set_$4(String _$4) {
                                    this._$4 = _$4;
                                }

                                public String get_$5() {
                                    return _$5;
                                }

                                public void set_$5(String _$5) {
                                    this._$5 = _$5;
                                }
                            }

                            public static class LinksData {
                                /**
                                 * url : http://video.weibo.com/show?fid=1034:4275782022027912
                                 */

                                private String url;

                                public String getUrl() {
                                    return url;
                                }

                                public void setUrl(String url) {
                                    this.url = url;
                                }
                            }

                            public static class CustomDataData {
                                /**
                                 * source : 新浪微博
                                 */

                                private String source;

                                public String getSource() {
                                    return source;
                                }

                                public void setSource(String source) {
                                    this.source = source;
                                }
                            }

                            public static class StreamData {
                                /**
                                 * duration : 3
                                 * format : mp4
                                 * url : http://f.us.sinaimg.cn/002qEWbfgx07n1BA6Imz010402000M6U0k010.mp4?label=mp4_ld&template=360x640.28&Expires=1534913137&ssig=vqr2rME3IX&KID=unistore,video
                                 * hd_url : http://f.us.sinaimg.cn/0012MlMbgx07n1BA5CjC010402000P4E0k010.mp4?label=mp4_hd&template=360x640.28&Expires=1534913137&ssig=CoQIDxrhfv&KID=unistore,video
                                 * width : 360
                                 * height : 640
                                 */

                                private int duration;
                                private String format;
                                private String url;
                                private String hd_url;
                                private int width;
                                private int height;

                                public int getDuration() {
                                    return duration;
                                }

                                public void setDuration(int duration) {
                                    this.duration = duration;
                                }

                                public String getFormat() {
                                    return format;
                                }

                                public void setFormat(String format) {
                                    this.format = format;
                                }

                                public String getUrl() {
                                    return url;
                                }

                                public void setUrl(String url) {
                                    this.url = url;
                                }

                                public String getHd_url() {
                                    return hd_url;
                                }

                                public void setHd_url(String hd_url) {
                                    this.hd_url = hd_url;
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
                            }

                            public static class RawFileMetaData {
                                /**
                                 * md5 : db361da89113c76831afbb2948e82d7f
                                 */

                                private String md5;

                                public String getMd5() {
                                    return md5;
                                }

                                public void setMd5(String md5) {
                                    this.md5 = md5;
                                }
                            }

                            public static class CompressedFileMetaData {
                                /**
                                 * md5 : db361da89113c76831afbb2948e82d7f
                                 * video_media_info : {"width":360,"height":640}
                                 */

                                private String md5;
                                private VideoMediaInfoData video_media_info;

                                public String getMd5() {
                                    return md5;
                                }

                                public void setMd5(String md5) {
                                    this.md5 = md5;
                                }

                                public VideoMediaInfoData getVideo_media_info() {
                                    return video_media_info;
                                }

                                public void setVideo_media_info(VideoMediaInfoData video_media_info) {
                                    this.video_media_info = video_media_info;
                                }

                                public static class VideoMediaInfoData {
                                    /**
                                     * width : 360
                                     * height : 640
                                     */

                                    private int width;
                                    private int height;

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
                                }
                            }

                            public static class ScrubberPreviewData {
                                private List<PreviewsData> previews;

                                public List<PreviewsData> getPreviews() {
                                    return previews;
                                }

                                public void setPreviews(List<PreviewsData> previews) {
                                    this.previews = previews;
                                }

                                public static class PreviewsData {
                                    /**
                                     * width : 80
                                     * height : 45
                                     * row : 10
                                     * col : 10
                                     * interval : 1
                                     * label : ld
                                     * urls : ["http://wx3.sinaimg.cn/large/006rFrtogy1fuibwf4pswj30m80cit8o.jpg"]
                                     */

                                    private int width;
                                    private int height;
                                    private int row;
                                    private int col;
                                    private int interval;
                                    private String label;
                                    private List<String> urls;

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

                                    public int getRow() {
                                        return row;
                                    }

                                    public void setRow(int row) {
                                        this.row = row;
                                    }

                                    public int getCol() {
                                        return col;
                                    }

                                    public void setCol(int col) {
                                        this.col = col;
                                    }

                                    public int getInterval() {
                                        return interval;
                                    }

                                    public void setInterval(int interval) {
                                        this.interval = interval;
                                    }

                                    public String getLabel() {
                                        return label;
                                    }

                                    public void setLabel(String label) {
                                        this.label = label;
                                    }

                                    public List<String> getUrls() {
                                        return urls;
                                    }

                                    public void setUrls(List<String> urls) {
                                        this.urls = urls;
                                    }
                                }
                            }

                            public static class SlidesData {
                                private List<String> pids;

                                public List<String> getPids() {
                                    return pids;
                                }

                                public void setPids(List<String> pids) {
                                    this.pids = pids;
                                }
                            }

                            public static class TimeMonitorMetaData {
                                /**
                                 * uploadCompleteTimeStamp : 1534909337166
                                 * transBackTimeStamp : 1534909342706
                                 * monitorReturnTimeStamp : 0
                                 * initTimeStamp : 1534909336000
                                 */

                                private long uploadCompleteTimeStamp;
                                private long transBackTimeStamp;
                                private int monitorReturnTimeStamp;
                                private long initTimeStamp;

                                public long getUploadCompleteTimeStamp() {
                                    return uploadCompleteTimeStamp;
                                }

                                public void setUploadCompleteTimeStamp(long uploadCompleteTimeStamp) {
                                    this.uploadCompleteTimeStamp = uploadCompleteTimeStamp;
                                }

                                public long getTransBackTimeStamp() {
                                    return transBackTimeStamp;
                                }

                                public void setTransBackTimeStamp(long transBackTimeStamp) {
                                    this.transBackTimeStamp = transBackTimeStamp;
                                }

                                public int getMonitorReturnTimeStamp() {
                                    return monitorReturnTimeStamp;
                                }

                                public void setMonitorReturnTimeStamp(int monitorReturnTimeStamp) {
                                    this.monitorReturnTimeStamp = monitorReturnTimeStamp;
                                }

                                public long getInitTimeStamp() {
                                    return initTimeStamp;
                                }

                                public void setInitTimeStamp(long initTimeStamp) {
                                    this.initTimeStamp = initTimeStamp;
                                }
                            }

                            public static class InputTagsData {
                                /**
                                 * creation_time : 2018-08-22 03:42:15
                                 */

                                private String creation_time;

                                public String getCreation_time() {
                                    return creation_time;
                                }

                                public void setCreation_time(String creation_time) {
                                    this.creation_time = creation_time;
                                }
                            }

                            public static class ExtInfoData {
                                /**
                                 * video_orientation : vertical
                                 */

                                private String video_orientation;

                                public String getVideo_orientation() {
                                    return video_orientation;
                                }

                                public void setVideo_orientation(String video_orientation) {
                                    this.video_orientation = video_orientation;
                                }
                            }

                            public static class BizData {
                                /**
                                 * biz_id : 230444
                                 * containerid : 2304444275782022027912
                                 */

                                private String biz_id;
                                private String containerid;

                                public String getBiz_id() {
                                    return biz_id;
                                }

                                public void setBiz_id(String biz_id) {
                                    this.biz_id = biz_id;
                                }

                                public String getContainerid() {
                                    return containerid;
                                }

                                public void setContainerid(String containerid) {
                                    this.containerid = containerid;
                                }
                            }

                            public static class VideoDetailsData {
                                /**
                                 * size : 196332
                                 * bitrate : 397
                                 * prefetch_size : 152976
                                 * label : mp4_hd
                                 */

                                private int size;
                                private int bitrate;
                                private int prefetch_size;
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

                                public int getPrefetch_size() {
                                    return prefetch_size;
                                }

                                public void setPrefetch_size(int prefetch_size) {
                                    this.prefetch_size = prefetch_size;
                                }

                                public String getLabel() {
                                    return label;
                                }

                                public void setLabel(String label) {
                                    this.label = label;
                                }
                            }
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

            public static class ContinueTagData {
                /**
                 * title : 全文
                 * pic : http://h5.sinaimg.cn/upload/2015/09/25/3/timeline_card_small_article.png
                 * scheme : sinaweibo://detail?mblogid=4275782043765408&id=4275782043765408
                 */

                private String title;
                private String pic;
                private String scheme;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getScheme() {
                    return scheme;
                }

                public void setScheme(String scheme) {
                    this.scheme = scheme;
                }
            }

            public static class PreloadDataData {
                private List<String> longtexts;

                public List<String> getLongtexts() {
                    return longtexts;
                }

                public void setLongtexts(List<String> longtexts) {
                    this.longtexts = longtexts;
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
            private String oid;
            private String type_icon;
            private String author_id;
            private String authorid;
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

            public String getOid() {
                return oid;
            }

            public void setOid(String oid) {
                this.oid = oid;
            }

            public String getType_icon() {
                return type_icon;
            }

            public void setType_icon(String type_icon) {
                this.type_icon = type_icon;
            }

            public String getAuthor_id() {
                return author_id;
            }

            public void setAuthor_id(String author_id) {
                this.author_id = author_id;
            }

            public String getAuthorid() {
                return authorid;
            }

            public void setAuthorid(String authorid) {
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
                /**
                 * video_orientation : vertical
                 * name : 双蛋肠粉的秒拍视频
                 * duration : 3
                 * stream_url : http://f.us.sinaimg.cn/002qEWbfgx07n1BA6Imz010402000M6U0k010.mp4?label=mp4_ld&template=360x640.28&Expires=1534913137&ssig=vqr2rME3IX&KID=unistore,video
                 * stream_url_hd : http://f.us.sinaimg.cn/0012MlMbgx07n1BA5CjC010402000P4E0k010.mp4?label=mp4_hd&template=360x640.28&Expires=1534913137&ssig=CoQIDxrhfv&KID=unistore,video
                 * h5_url : http://video.weibo.com/show?fid=1034:4275782022027912
                 * mp4_sd_url : http://f.us.sinaimg.cn/002qEWbfgx07n1BA6Imz010402000M6U0k010.mp4?label=mp4_ld&template=360x640.28&Expires=1534913137&ssig=vqr2rME3IX&KID=unistore,video
                 * mp4_hd_url : http://f.us.sinaimg.cn/0012MlMbgx07n1BA5CjC010402000P4E0k010.mp4?label=mp4_hd&template=360x640.28&Expires=1534913137&ssig=CoQIDxrhfv&KID=unistore,video
                 * h265_mp4_hd : http://f.us.sinaimg.cn/001F6iZQgx07n1BA7zaL010f020000220k010.m3u8?Expires=1534913137&ssig=TIEZJnr7gK&KID=unistore,video
                 * h265_mp4_ld : http://f.us.sinaimg.cn/004o8wlHgx07n1BA8oWs010f020000220k010.m3u8?Expires=1534913137&ssig=qEx7QXfXf1&KID=unistore,video
                 * inch_4_mp4_hd :
                 * inch_5_mp4_hd :
                 * inch_5_5_mp4_hd :
                 * mp4_720p_mp4 :
                 * hevc_mp4_720p :
                 * prefetch_type : 1
                 * prefetch_size : 152976
                 * act_status : 1
                 * protocol :
                 * media_id : 4275782022027912
                 * origin_total_bitrate : 0
                 * next_title : 长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文字长文 ​​​
                 * video_details : [{"size":196332,"bitrate":397,"prefetch_size":152976,"label":"mp4_hd_url"},{"size":184940,"bitrate":374,"prefetch_size":144318,"label":"mp4_sd_url"}]
                 * play_completion_actions : [{"type":"1","icon":"http://img.t.sinajs.cn/t6/style/images/face/feed_c_r.png","text":"重播","link":"","btn_code":1000,"show_position":1,"actionlog":{"oid":"2304444275782022027912","act_code":1221,"act_type":0,"source":"video"}}]
                 * video_publish_time : 1534909337
                 * play_loop_type : 0
                 * author_mid : 4275782043765408
                 * author_name : 双蛋肠粉
                 * has_recommend_video : 1
                 * online_users : 1次观看
                 * online_users_number : 1
                 * ttl : 3600
                 * storage_type : unistore
                 */

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
                private String author_mid;
                private String author_name;
                private int has_recommend_video;
                private String online_users;
                private int online_users_number;
                private int ttl;
                private String storage_type;
                private List<VideoDetailsDataX> video_details;
                private List<PlayCompletionActionsData> play_completion_actions;

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

                public String getAuthor_mid() {
                    return author_mid;
                }

                public void setAuthor_mid(String author_mid) {
                    this.author_mid = author_mid;
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

                public int getTtl() {
                    return ttl;
                }

                public void setTtl(int ttl) {
                    this.ttl = ttl;
                }

                public String getStorage_type() {
                    return storage_type;
                }

                public void setStorage_type(String storage_type) {
                    this.storage_type = storage_type;
                }

                public List<VideoDetailsDataX> getVideo_details() {
                    return video_details;
                }

                public void setVideo_details(List<VideoDetailsDataX> video_details) {
                    this.video_details = video_details;
                }

                public List<PlayCompletionActionsData> getPlay_completion_actions() {
                    return play_completion_actions;
                }

                public void setPlay_completion_actions(List<PlayCompletionActionsData> play_completion_actions) {
                    this.play_completion_actions = play_completion_actions;
                }

                public static class VideoDetailsDataX {
                    /**
                     * size : 196332
                     * bitrate : 397
                     * prefetch_size : 152976
                     * label : mp4_hd_url
                     */

                    private int size;
                    private int bitrate;
                    private int prefetch_size;
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

                    public int getPrefetch_size() {
                        return prefetch_size;
                    }

                    public void setPrefetch_size(int prefetch_size) {
                        this.prefetch_size = prefetch_size;
                    }

                    public String getLabel() {
                        return label;
                    }

                    public void setLabel(String label) {
                        this.label = label;
                    }
                }

                public static class PlayCompletionActionsData {
                    /**
                     * type : 1
                     * icon : http://img.t.sinajs.cn/t6/style/images/face/feed_c_r.png
                     * text : 重播
                     * link :
                     * btn_code : 1000
                     * show_position : 1
                     * actionlog : {"oid":"2304444275782022027912","act_code":1221,"act_type":0,"source":"video"}
                     */

                    private String type;
                    private String icon;
                    private String text;
                    private String link;
                    private int btn_code;
                    private int show_position;
                    private ActionlogData actionlog;

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

                    public static class ActionlogData {
                        /**
                         * oid : 2304444275782022027912
                         * act_code : 1221
                         * act_type : 0
                         * source : video
                         */

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
            }

            public static class PicInfoData {
                /**
                 * pic_big : {"height":"640","url":"http://wx1.sinaimg.cn/orj480/006rFrtogy1fuibw7yg4lj30a00hsjro.jpg","width":"360"}
                 * pic_small : {"height":"640","url":"http://wx1.sinaimg.cn/orj480/006rFrtogy1fuibw7yg4lj30a00hsjro.jpg","width":"360"}
                 * pic_middle : {"url":"http://wx1.sinaimg.cn/orj480/006rFrtogy1fuibw7yg4lj30a00hsjro.jpg","height":"640","width":"360"}
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
                     * height : 640
                     * url : http://wx1.sinaimg.cn/orj480/006rFrtogy1fuibw7yg4lj30a00hsjro.jpg
                     * width : 360
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
                     * height : 640
                     * url : http://wx1.sinaimg.cn/orj480/006rFrtogy1fuibw7yg4lj30a00hsjro.jpg
                     * width : 360
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
                     * url : http://wx1.sinaimg.cn/orj480/006rFrtogy1fuibw7yg4lj30a00hsjro.jpg
                     * height : 640
                     * width : 360
                     */

                    private String url;
                    private String height;
                    private String width;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
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

        public static class EditConfigDataX {
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

        public static class AnnotationsDataX {
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

        public static class UrlStructData {

            private String url_title;
            private String url_type_pic;
            private String ori_url;
            private String page_id;
            private String short_url;
            private int url_type;
            private boolean result;
            private ActionlogDataXX actionlog;
            private String storage_type;
            private int hide;
            private String object_type;
            private int ttl;
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

            public String getPage_id() {
                return page_id;
            }

            public void setPage_id(String page_id) {
                this.page_id = page_id;
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

            public String getObject_type() {
                return object_type;
            }

            public void setObject_type(String object_type) {
                this.object_type = object_type;
            }

            public int getTtl() {
                return ttl;
            }

            public void setTtl(int ttl) {
                this.ttl = ttl;
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
    }

    public static class FilterGroupInfoData {
    }

    public static class RootCommentData {
    }

    public static class RootCommentsData {

        private String created_at;
        private long id;
        private long rootid;
        private int floor_number;
        private String text;
        private int disable_reply;
        private UserDataXX user;
        private String mid;
        private String idstr;
        private boolean liked;
        private int max_id;
        private int total_number;
        private boolean isLikedByMblogAuthor;
        private int like_counts;
        private List<?> url_objects;
        private List<CommentsData> comments;

        public MoreInfoData getMore_info() {
            return more_info;
        }

        public void setMore_info(MoreInfoData more_info) {
            this.more_info = more_info;
        }

        private MoreInfoData more_info;

        public static class MoreInfoData{
            private String scheme;
            private String text;
            private String highlight_text;

            public String getScheme() {
                return scheme;
            }

            public void setScheme(String scheme) {
                this.scheme = scheme;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getHighlight_text() {
                return highlight_text;
            }

            public void setHighlight_text(String highlight_text) {
                this.highlight_text = highlight_text;
            }
        }

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

        public long getRootid() {
            return rootid;
        }

        public void setRootid(long rootid) {
            this.rootid = rootid;
        }

        public int getFloor_number() {
            return floor_number;
        }

        public void setFloor_number(int floor_number) {
            this.floor_number = floor_number;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getDisable_reply() {
            return disable_reply;
        }

        public void setDisable_reply(int disable_reply) {
            this.disable_reply = disable_reply;
        }

        public UserDataXX getUser() {
            return user;
        }

        public void setUser(UserDataXX user) {
            this.user = user;
        }

        public String getMid() {
            return mid;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }

        public String getIdstr() {
            return idstr;
        }

        public void setIdstr(String idstr) {
            this.idstr = idstr;
        }

        public boolean isLiked() {
            return liked;
        }

        public void setLiked(boolean liked) {
            this.liked = liked;
        }

        public int getMax_id() {
            return max_id;
        }

        public void setMax_id(int max_id) {
            this.max_id = max_id;
        }

        public int getTotal_number() {
            return total_number;
        }

        public void setTotal_number(int total_number) {
            this.total_number = total_number;
        }

        public boolean isIsLikedByMblogAuthor() {
            return isLikedByMblogAuthor;
        }

        public void setIsLikedByMblogAuthor(boolean isLikedByMblogAuthor) {
            this.isLikedByMblogAuthor = isLikedByMblogAuthor;
        }

        public int getLike_counts() {
            return like_counts;
        }

        public void setLike_counts(int like_counts) {
            this.like_counts = like_counts;
        }

        public List<?> getUrl_objects() {
            return url_objects;
        }

        public void setUrl_objects(List<?> url_objects) {
            this.url_objects = url_objects;
        }

        public List<CommentsData> getComments() {
            return comments;
        }

        public void setComments(List<CommentsData> comments) {
            this.comments = comments;
        }

        public static class CommentsData{
            private ReplyCommentData reply_comment;
            private int like_count;
            private int shouldShowColon;
            @SerializedName("url_objects")
            private List<?> url_objectsX;
            private String text;
            private StatusData.UserData user;

            public StatusData.UserData getUser() {
                return user;
            }

            public void setUser(StatusData.UserData user) {
                this.user = user;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            private List<UrlStructData> url_struct;
            public ReplyCommentData getReply_comment() {
                return reply_comment;
            }

            public void setReply_comment(ReplyCommentData reply_comment) {
                this.reply_comment = reply_comment;
            }

            public int getLike_count() {
                return like_count;
            }

            public void setLike_count(int like_count) {
                this.like_count = like_count;
            }

            public int getShouldShowColon() {
                return shouldShowColon;
            }

            public void setShouldShowColon(int shouldShowColon) {
                this.shouldShowColon = shouldShowColon;
            }

            public List<?> getUrl_objectsX() {
                return url_objectsX;
            }

            public void setUrl_objectsX(List<?> url_objectsX) {
                this.url_objectsX = url_objectsX;
            }

            public List<UrlStructData> getUrl_struct() {
                return url_struct;
            }

            public void setUrl_struct(List<UrlStructData> url_struct) {
                this.url_struct = url_struct;
            }
        }
        public static class UserDataXX {

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
            private String source;

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

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
            private InsecurityDataXX insecurity;
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
            private BadgeDataXX badge;
            private String badge_top;
            private int has_ability_tag;
            private ExtendDataXX extend;
            private int credit_score;
            private int user_ability;
            private int urank;
            private int story_read_state;
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

            public InsecurityDataXX getInsecurity() {
                return insecurity;
            }

            public void setInsecurity(InsecurityDataXX insecurity) {
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

            public BadgeDataXX getBadge() {
                return badge;
            }

            public void setBadge(BadgeDataXX badge) {
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

            public ExtendDataXX getExtend() {
                return extend;
            }

            public void setExtend(ExtendDataXX extend) {
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

            public static class InsecurityDataXX {
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

            public static class BadgeDataXX {
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

            public static class ExtendDataXX {
                /**
                 * privacy : {"mobile":1}
                 * mbprivilege : 0000000000000000000000000000000000000000000000000000000000000000
                 */

                private PrivacyDataXX privacy;
                private String mbprivilege;

                public PrivacyDataXX getPrivacy() {
                    return privacy;
                }

                public void setPrivacy(PrivacyDataXX privacy) {
                    this.privacy = privacy;
                }

                public String getMbprivilege() {
                    return mbprivilege;
                }

                public void setMbprivilege(String mbprivilege) {
                    this.mbprivilege = mbprivilege;
                }

                public static class PrivacyDataXX {
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

        public static class ReplyCommentData {

            @SerializedName("created_at")
            private String created_atX;
            @SerializedName("id")
            private long idX;
            @SerializedName("rootid")
            private long rootidX;
            @SerializedName("floor_number")
            private int floor_numberX;
            @SerializedName("text")
            private String textX;
            @SerializedName("disable_reply")
            private int disable_replyX;
            @SerializedName("user")
            private UserData userX;
            @SerializedName("mid")
            private String midX;
            @SerializedName("idstr")
            private String idstrX;

            public String getCreated_atX() {
                return created_atX;
            }

            public void setCreated_atX(String created_atX) {
                this.created_atX = created_atX;
            }

            public long getIdX() {
                return idX;
            }

            public void setIdX(long idX) {
                this.idX = idX;
            }

            public long getRootidX() {
                return rootidX;
            }

            public void setRootidX(long rootidX) {
                this.rootidX = rootidX;
            }

            public int getFloor_numberX() {
                return floor_numberX;
            }

            public void setFloor_numberX(int floor_numberX) {
                this.floor_numberX = floor_numberX;
            }

            public String getTextX() {
                return textX;
            }

            public void setTextX(String textX) {
                this.textX = textX;
            }

            public int getDisable_replyX() {
                return disable_replyX;
            }

            public void setDisable_replyX(int disable_replyX) {
                this.disable_replyX = disable_replyX;
            }

            public UserData getUserX() {
                return userX;
            }

            public void setUserX(UserData userX) {
                this.userX = userX;
            }

            public String getMidX() {
                return midX;
            }

            public void setMidX(String midX) {
                this.midX = midX;
            }

            public String getIdstrX() {
                return idstrX;
            }

            public void setIdstrX(String idstrX) {
                this.idstrX = idstrX;
            }

            public static class UserData {

                @SerializedName("id")
                private int idX;
                @SerializedName("idstr")
                private String idstrX;
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
                @SerializedName("created_at")
                private String created_atX;
                private boolean following;
                private boolean allow_all_act_msg;
                private boolean geo_enabled;
                private boolean verified;
                private int verified_type;
                private String remark;
                private UserDataXX.InsecurityDataXX insecurity;
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
                private UserDataXX.BadgeDataXX badge;
                private String badge_top;
                private int has_ability_tag;
                private ExtendData extend;
                private int credit_score;
                private int user_ability;
                private int urank;
                private int story_read_state;
                private int vclub_member;
                private String source;

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
                }

                public int getIdX() {
                    return idX;
                }

                public void setIdX(int idX) {
                    this.idX = idX;
                }

                public String getIdstrX() {
                    return idstrX;
                }

                public void setIdstrX(String idstrX) {
                    this.idstrX = idstrX;
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

                public String getCreated_atX() {
                    return created_atX;
                }

                public void setCreated_atX(String created_atX) {
                    this.created_atX = created_atX;
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

                public UserDataXX.InsecurityDataXX getInsecurity() {
                    return insecurity;
                }

                public void setInsecurity(UserDataXX.InsecurityDataXX insecurity) {
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

                public UserDataXX.BadgeDataXX getBadge() {
                    return badge;
                }

                public void setBadge(UserDataXX.BadgeDataXX badge) {
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

                public static class ExtendData {
                    /**
                     * privacy : {"mobile":1}
                     * mbprivilege : 0000000000000000000000000000000000000000000000000000000004c00208
                     */

                    private UserDataXX.ExtendDataXX.PrivacyDataXX privacy;
                    private String mbprivilege;

                    public UserDataXX.ExtendDataXX.PrivacyDataXX getPrivacy() {
                        return privacy;
                    }

                    public void setPrivacy(UserDataXX.ExtendDataXX.PrivacyDataXX privacy) {
                        this.privacy = privacy;
                    }

                    public String getMbprivilege() {
                        return mbprivilege;
                    }

                    public void setMbprivilege(String mbprivilege) {
                        this.mbprivilege = mbprivilege;
                    }
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
            private ActionlogData actionlog;
            private String storage_type;
            private int hide;
            private String object_type;
            private int position;
            private PicInfosData pic_infos;
            private String gif_name;
            private VipGifData vip_gif;
            private int need_save_obj;
            private List<String> pic_ids;

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

            public ActionlogData getActionlog() {
                return actionlog;
            }

            public void setActionlog(ActionlogData actionlog) {
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

            public String getObject_type() {
                return object_type;
            }

            public void setObject_type(String object_type) {
                this.object_type = object_type;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public PicInfosData getPic_infos() {
                return pic_infos;
            }

            public void setPic_infos(PicInfosData pic_infos) {
                this.pic_infos = pic_infos;
            }

            public String getGif_name() {
                return gif_name;
            }

            public void setGif_name(String gif_name) {
                this.gif_name = gif_name;
            }

            public VipGifData getVip_gif() {
                return vip_gif;
            }

            public void setVip_gif(VipGifData vip_gif) {
                this.vip_gif = vip_gif;
            }

            public int getNeed_save_obj() {
                return need_save_obj;
            }

            public void setNeed_save_obj(int need_save_obj) {
                this.need_save_obj = need_save_obj;
            }

            public List<String> getPic_ids() {
                return pic_ids;
            }

            public void setPic_ids(List<String> pic_ids) {
                this.pic_ids = pic_ids;
            }

            public static class ActionlogData {

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

            public static class PicInfosData {
                /**
                 * 5941bb93ly1fui8gp1krij20q90k4wh5 : {"thumbnail":{"type":null,"url":"http://wx1.sinaimg.cn/thumbnail/5941bb93ly1fui8gp1krij20q90k4wh5.jpg","cut_type":1,"width":120,"height":91,"croped":false},"bmiddle":{"type":null,"url":"http://wx1.sinaimg.cn/bmiddle/5941bb93ly1fui8gp1krij20q90k4wh5.jpg","cut_type":1,"width":440,"height":337,"croped":false},"large":{"type":null,"url":"http://wx1.sinaimg.cn/large/5941bb93ly1fui8gp1krij20q90k4wh5.jpg","cut_type":1,"width":"945","height":"724","croped":false},"woriginal":{"type":null,"url":"http://wx1.sinaimg.cn/woriginal/5941bb93ly1fui8gp1krij20q90k4wh5.jpg","cut_type":1,"width":"945","height":"724","croped":false}}
                 */

                @SerializedName("5941bb93ly1fui8gp1krij20q90k4wh5")
                private _$5941bb93ly1fui8gp1krij20q90k4wh5Data _$5941bb93ly1fui8gp1krij20q90k4wh5;

                public _$5941bb93ly1fui8gp1krij20q90k4wh5Data get_$5941bb93ly1fui8gp1krij20q90k4wh5() {
                    return _$5941bb93ly1fui8gp1krij20q90k4wh5;
                }

                public void set_$5941bb93ly1fui8gp1krij20q90k4wh5(_$5941bb93ly1fui8gp1krij20q90k4wh5Data _$5941bb93ly1fui8gp1krij20q90k4wh5) {
                    this._$5941bb93ly1fui8gp1krij20q90k4wh5 = _$5941bb93ly1fui8gp1krij20q90k4wh5;
                }

                public static class _$5941bb93ly1fui8gp1krij20q90k4wh5Data {
                    /**
                     * thumbnail : {"type":null,"url":"http://wx1.sinaimg.cn/thumbnail/5941bb93ly1fui8gp1krij20q90k4wh5.jpg","cut_type":1,"width":120,"height":91,"croped":false}
                     * bmiddle : {"type":null,"url":"http://wx1.sinaimg.cn/bmiddle/5941bb93ly1fui8gp1krij20q90k4wh5.jpg","cut_type":1,"width":440,"height":337,"croped":false}
                     * large : {"type":null,"url":"http://wx1.sinaimg.cn/large/5941bb93ly1fui8gp1krij20q90k4wh5.jpg","cut_type":1,"width":"945","height":"724","croped":false}
                     * woriginal : {"type":null,"url":"http://wx1.sinaimg.cn/woriginal/5941bb93ly1fui8gp1krij20q90k4wh5.jpg","cut_type":1,"width":"945","height":"724","croped":false}
                     */

                    private ThumbnailData thumbnail;
                    private BmiddleData bmiddle;
                    private LargeData large;
                    private WoriginalData woriginal;

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

                    public WoriginalData getWoriginal() {
                        return woriginal;
                    }

                    public void setWoriginal(WoriginalData woriginal) {
                        this.woriginal = woriginal;
                    }

                    public static class ThumbnailData {
                        /**
                         * type : null
                         * url : http://wx1.sinaimg.cn/thumbnail/5941bb93ly1fui8gp1krij20q90k4wh5.jpg
                         * cut_type : 1
                         * width : 120
                         * height : 91
                         * croped : false
                         */

                        private Object type;
                        private String url;
                        private int cut_type;
                        private int width;
                        private int height;
                        private boolean croped;

                        public Object getType() {
                            return type;
                        }

                        public void setType(Object type) {
                            this.type = type;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getCut_type() {
                            return cut_type;
                        }

                        public void setCut_type(int cut_type) {
                            this.cut_type = cut_type;
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

                        public boolean isCroped() {
                            return croped;
                        }

                        public void setCroped(boolean croped) {
                            this.croped = croped;
                        }
                    }

                    public static class BmiddleData {
                        /**
                         * type : null
                         * url : http://wx1.sinaimg.cn/bmiddle/5941bb93ly1fui8gp1krij20q90k4wh5.jpg
                         * cut_type : 1
                         * width : 440
                         * height : 337
                         * croped : false
                         */

                        private Object type;
                        private String url;
                        private int cut_type;
                        private int width;
                        private int height;
                        private boolean croped;

                        public Object getType() {
                            return type;
                        }

                        public void setType(Object type) {
                            this.type = type;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getCut_type() {
                            return cut_type;
                        }

                        public void setCut_type(int cut_type) {
                            this.cut_type = cut_type;
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

                        public boolean isCroped() {
                            return croped;
                        }

                        public void setCroped(boolean croped) {
                            this.croped = croped;
                        }
                    }

                    public static class LargeData {
                        /**
                         * type : null
                         * url : http://wx1.sinaimg.cn/large/5941bb93ly1fui8gp1krij20q90k4wh5.jpg
                         * cut_type : 1
                         * width : 945
                         * height : 724
                         * croped : false
                         */

                        private Object type;
                        private String url;
                        private int cut_type;
                        private String width;
                        private String height;
                        private boolean croped;

                        public Object getType() {
                            return type;
                        }

                        public void setType(Object type) {
                            this.type = type;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getCut_type() {
                            return cut_type;
                        }

                        public void setCut_type(int cut_type) {
                            this.cut_type = cut_type;
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

                        public boolean isCroped() {
                            return croped;
                        }

                        public void setCroped(boolean croped) {
                            this.croped = croped;
                        }
                    }

                    public static class WoriginalData {
                        /**
                         * type : null
                         * url : http://wx1.sinaimg.cn/woriginal/5941bb93ly1fui8gp1krij20q90k4wh5.jpg
                         * cut_type : 1
                         * width : 945
                         * height : 724
                         * croped : false
                         */

                        private Object type;
                        private String url;
                        private int cut_type;
                        private String width;
                        private String height;
                        private boolean croped;

                        public Object getType() {
                            return type;
                        }

                        public void setType(Object type) {
                            this.type = type;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getCut_type() {
                            return cut_type;
                        }

                        public void setCut_type(int cut_type) {
                            this.cut_type = cut_type;
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

                        public boolean isCroped() {
                            return croped;
                        }

                        public void setCroped(boolean croped) {
                            this.croped = croped;
                        }
                    }
                }
            }

            public static class VipGifData {

                private BizData biz;
                private String object_type;
                private String target_url;
                @SerializedName("id")
                private String idX;
                private String display_name;
                private String comment_id;
                private String url;
                private String object_id;
                private String containerid;
                private String object_domain_id;
                private int safe_status;
                private String show_status;
                private String act_status;
                private String last_modified;
                private long timestamp;
                private String activate_status;
                private List<String> pic_ids;

                public BizData getBiz() {
                    return biz;
                }

                public void setBiz(BizData biz) {
                    this.biz = biz;
                }

                public String getObject_type() {
                    return object_type;
                }

                public void setObject_type(String object_type) {
                    this.object_type = object_type;
                }

                public String getTarget_url() {
                    return target_url;
                }

                public void setTarget_url(String target_url) {
                    this.target_url = target_url;
                }

                public String getIdX() {
                    return idX;
                }

                public void setIdX(String idX) {
                    this.idX = idX;
                }

                public String getDisplay_name() {
                    return display_name;
                }

                public void setDisplay_name(String display_name) {
                    this.display_name = display_name;
                }

                public String getComment_id() {
                    return comment_id;
                }

                public void setComment_id(String comment_id) {
                    this.comment_id = comment_id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getObject_id() {
                    return object_id;
                }

                public void setObject_id(String object_id) {
                    this.object_id = object_id;
                }

                public String getContainerid() {
                    return containerid;
                }

                public void setContainerid(String containerid) {
                    this.containerid = containerid;
                }

                public String getObject_domain_id() {
                    return object_domain_id;
                }

                public void setObject_domain_id(String object_domain_id) {
                    this.object_domain_id = object_domain_id;
                }

                public int getSafe_status() {
                    return safe_status;
                }

                public void setSafe_status(int safe_status) {
                    this.safe_status = safe_status;
                }

                public String getShow_status() {
                    return show_status;
                }

                public void setShow_status(String show_status) {
                    this.show_status = show_status;
                }

                public String getAct_status() {
                    return act_status;
                }

                public void setAct_status(String act_status) {
                    this.act_status = act_status;
                }

                public String getLast_modified() {
                    return last_modified;
                }

                public void setLast_modified(String last_modified) {
                    this.last_modified = last_modified;
                }

                public long getTimestamp() {
                    return timestamp;
                }

                public void setTimestamp(long timestamp) {
                    this.timestamp = timestamp;
                }

                public String getActivate_status() {
                    return activate_status;
                }

                public void setActivate_status(String activate_status) {
                    this.activate_status = activate_status;
                }

                public List<String> getPic_ids() {
                    return pic_ids;
                }

                public void setPic_ids(List<String> pic_ids) {
                    this.pic_ids = pic_ids;
                }

                public static class BizData {
                    /**
                     * biz_id : 230597
                     * containerid : 230597ef7ae721dad184d512d8048cf10551cd
                     */

                    private String biz_id;
                    private String containerid;

                    public String getBiz_id() {
                        return biz_id;
                    }

                    public void setBiz_id(String biz_id) {
                        this.biz_id = biz_id;
                    }

                    public String getContainerid() {
                        return containerid;
                    }

                    public void setContainerid(String containerid) {
                        this.containerid = containerid;
                    }
                }
            }
        }
    }

    public static class FilterGroupData {
        /**
         * param : flow=0
         * scheme :
         * title : 按热度
         * isDefault : 1
         */

        private String param;
        private String scheme;
        private String title;
        private int isDefault;

        public String getParam() {
            return param;
        }

        public void setParam(String param) {
            this.param = param;
        }

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

        public int getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(int isDefault) {
            this.isDefault = isDefault;
        }
    }
}
