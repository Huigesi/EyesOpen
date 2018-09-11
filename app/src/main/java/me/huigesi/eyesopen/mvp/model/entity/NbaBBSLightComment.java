package me.huigesi.eyesopen.mvp.model.entity;

import java.util.List;

public class NbaBBSLightComment {

    private int status;
    private int all_count;
    private int more_count;
    private List<ListData> list;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAll_count() {
        return all_count;
    }

    public void setAll_count(int all_count) {
        this.all_count = all_count;
    }

    public int getMore_count() {
        return more_count;
    }

    public void setMore_count(int more_count) {
        this.more_count = more_count;
    }

    public List<ListData> getList() {
        return list;
    }

    public void setList(List<ListData> list) {
        this.list = list;
    }

    public static class ListData {
        /**
         * light_count : 1634
         * pid : 296377
         * puid : 4724827
         * via : 9
         * content : 克洛希尔，在达拉斯小牛06-07赛季穿44号球衣，由于也是白大个容易和司机混淆，玩2K7时我和同学都管他叫伪诺维茨基
         * create_time : 1535468968
         * update_info : 0
         * quote : []
         * attr : {"client":"862505039769125","share_num":1}
         * user_banned : 0
         * check_reply_info : {"type":1,"num":39}
         * smallcontent : 克洛希尔，...
         * togglecontent :
         * time : 15小时前
         * userName : kidd646236968
         * userImg : http://i1.hoopchina.com.cn/user/header/20180723/153231323416795_small_6.jpg@60Q
         * groupid : 6
         */

        private int light_count;
        private String pid;
        private String puid;
        private String via;
        private String content;
        private String create_time;
        private String update_info;
        private int user_banned;
        private CheckReplyInfoData check_reply_info;
        private String smallcontent;
        private String togglecontent;
        private String time;
        private String userName;
        private String userImg;
        private String groupid;
        private List<NbaBBSComment.ResultData.ListDataX.QuoteData> quote;

        public int getLight_count() {
            return light_count;
        }

        public void setLight_count(int light_count) {
            this.light_count = light_count;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getPuid() {
            return puid;
        }

        public void setPuid(String puid) {
            this.puid = puid;
        }

        public String getVia() {
            return via;
        }

        public void setVia(String via) {
            this.via = via;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getUpdate_info() {
            return update_info;
        }

        public void setUpdate_info(String update_info) {
            this.update_info = update_info;
        }

        public int getUser_banned() {
            return user_banned;
        }

        public void setUser_banned(int user_banned) {
            this.user_banned = user_banned;
        }

        public CheckReplyInfoData getCheck_reply_info() {
            return check_reply_info;
        }

        public void setCheck_reply_info(CheckReplyInfoData check_reply_info) {
            this.check_reply_info = check_reply_info;
        }

        public String getSmallcontent() {
            return smallcontent;
        }

        public void setSmallcontent(String smallcontent) {
            this.smallcontent = smallcontent;
        }

        public String getTogglecontent() {
            return togglecontent;
        }

        public void setTogglecontent(String togglecontent) {
            this.togglecontent = togglecontent;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserImg() {
            return userImg;
        }

        public void setUserImg(String userImg) {
            this.userImg = userImg;
        }

        public String getGroupid() {
            return groupid;
        }

        public void setGroupid(String groupid) {
            this.groupid = groupid;
        }

        public List<NbaBBSComment.ResultData.ListDataX.QuoteData> getQuote() {
            return quote;
        }

        public void setQuote(List<NbaBBSComment.ResultData.ListDataX.QuoteData> quote) {
            this.quote = quote;
        }

        public static class AttrData {
            /**
             * client : 862505039769125
             * share_num : 1
             */

            private String client;
            private int share_num;

            public String getClient() {
                return client;
            }

            public void setClient(String client) {
                this.client = client;
            }

            public int getShare_num() {
                return share_num;
            }

            public void setShare_num(int share_num) {
                this.share_num = share_num;
            }
        }

        public static class CheckReplyInfoData {
            /**
             * type : 1
             * num : 39
             */

            private int type;
            private int num;

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }
        }
    }
}
