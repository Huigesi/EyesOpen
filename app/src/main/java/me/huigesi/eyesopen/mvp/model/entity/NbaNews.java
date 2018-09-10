package me.huigesi.eyesopen.mvp.model.entity;

import java.util.List;

public class NbaNews {


    private ResultBean result;
    private int is_login;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getIs_login() {
        return is_login;
    }

    public void setIs_login(int is_login) {
        this.is_login = is_login;
    }

    public static class ResultBean {
        private int nextDataExists;
        private int show_hot_news;
        private int display_new_count;
        private int show_news_lights;
        private int display_type;
        private GameBean game;
        private List<DataBean> data;
        private List<CateListBean> cate_list;
        private List<?> ad_poster;

        public int getNextDataExists() {
            return nextDataExists;
        }

        public void setNextDataExists(int nextDataExists) {
            this.nextDataExists = nextDataExists;
        }

        public int getShow_hot_news() {
            return show_hot_news;
        }

        public void setShow_hot_news(int show_hot_news) {
            this.show_hot_news = show_hot_news;
        }

        public int getDisplay_new_count() {
            return display_new_count;
        }

        public void setDisplay_new_count(int display_new_count) {
            this.display_new_count = display_new_count;
        }

        public int getShow_news_lights() {
            return show_news_lights;
        }

        public void setShow_news_lights(int show_news_lights) {
            this.show_news_lights = show_news_lights;
        }

        public int getDisplay_type() {
            return display_type;
        }

        public void setDisplay_type(int display_type) {
            this.display_type = display_type;
        }

        public GameBean getGame() {
            return game;
        }

        public void setGame(GameBean game) {
            this.game = game;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public List<CateListBean> getCate_list() {
            return cate_list;
        }

        public void setCate_list(List<CateListBean> cate_list) {
            this.cate_list = cate_list;
        }

        public List<?> getAd_poster() {
            return ad_poster;
        }

        public void setAd_poster(List<?> ad_poster) {
            this.ad_poster = ad_poster;
        }

        public static class GameBean {
            /**
             * game_lists : []
             * refresh_time : 500
             */

            private int refresh_time;
            private List<?> game_lists;

            public int getRefresh_time() {
                return refresh_time;
            }

            public void setRefresh_time(int refresh_time) {
                this.refresh_time = refresh_time;
            }

            public List<?> getGame_lists() {
                return game_lists;
            }

            public void setGame_lists(List<?> game_lists) {
                this.game_lists = game_lists;
            }
        }

        public static class DataBean {

            private String nid;
            private String title;
            private String summary;
            private String uptime;
            private String img;
            private int type;
            private String lights;
            private String replies;
            private String read;
            private String link;
            private String hid;
            private int un_replay;
            private String position;
            private int is_recommend;
            private String recommend_url;
            private int display_type;
            private String brand_name;
            private String custom_text;
            private int close_hour;
            private List<BadgeBean> badge;
            private List<String> thumbs;
            private List<String> pm;
            private List<String> cm;
            private List<String> xm;

            public String getNid() {
                return nid;
            }

            public void setNid(String nid) {
                this.nid = nid;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getLights() {
                return lights;
            }

            public void setLights(String lights) {
                this.lights = lights;
            }

            public String getReplies() {
                return replies;
            }

            public void setReplies(String replies) {
                this.replies = replies;
            }

            public String getRead() {
                return read;
            }

            public void setRead(String read) {
                this.read = read;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getHid() {
                return hid;
            }

            public void setHid(String hid) {
                this.hid = hid;
            }

            public int getUn_replay() {
                return un_replay;
            }

            public void setUn_replay(int un_replay) {
                this.un_replay = un_replay;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public int getIs_recommend() {
                return is_recommend;
            }

            public void setIs_recommend(int is_recommend) {
                this.is_recommend = is_recommend;
            }

            public String getRecommend_url() {
                return recommend_url;
            }

            public void setRecommend_url(String recommend_url) {
                this.recommend_url = recommend_url;
            }

            public int getDisplay_type() {
                return display_type;
            }

            public void setDisplay_type(int display_type) {
                this.display_type = display_type;
            }

            public String getBrand_name() {
                return brand_name;
            }

            public void setBrand_name(String brand_name) {
                this.brand_name = brand_name;
            }

            public String getCustom_text() {
                return custom_text;
            }

            public void setCustom_text(String custom_text) {
                this.custom_text = custom_text;
            }

            public int getClose_hour() {
                return close_hour;
            }

            public void setClose_hour(int close_hour) {
                this.close_hour = close_hour;
            }

            public List<BadgeBean> getBadge() {
                return badge;
            }

            public void setBadge(List<BadgeBean> badge) {
                this.badge = badge;
            }

            public List<String> getThumbs() {
                return thumbs;
            }

            public void setThumbs(List<String> thumbs) {
                this.thumbs = thumbs;
            }

            public List<String> getPm() {
                return pm;
            }

            public void setPm(List<String> pm) {
                this.pm = pm;
            }

            public List<String> getCm() {
                return cm;
            }

            public void setCm(List<String> cm) {
                this.cm = cm;
            }

            public List<String> getXm() {
                return xm;
            }

            public void setXm(List<String> xm) {
                this.xm = xm;
            }

            public static class BadgeBean {
                /**
                 * name : 广告
                 * color : 1993d9
                 */

                private String name;
                private String color;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getColor() {
                    return color;
                }

                public void setColor(String color) {
                    this.color = color;
                }
            }
        }

        public static class CateListBean {
            /**
             * name : 全部
             * cate_type : news
             * cate_id : 1
             */

            private String name;
            private String cate_type;
            private String cate_id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCate_type() {
                return cate_type;
            }

            public void setCate_type(String cate_type) {
                this.cate_type = cate_type;
            }

            public String getCate_id() {
                return cate_id;
            }

            public void setCate_id(String cate_id) {
                this.cate_id = cate_id;
            }
        }
    }
}
