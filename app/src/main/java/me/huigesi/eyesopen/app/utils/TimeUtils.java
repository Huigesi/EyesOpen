package me.huigesi.eyesopen.app.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

public class TimeUtils {
    public static long prettyDate1(String time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(
                "EEE MMM dd HH:mm:ss Z yyyy", new Locale("ENGLISH", "CHINA"));
        Date myDate = sdf.parse(time);
        return myDate.getTime();
    }

    public static String prettyTime4(long millisecond) {
        long currentTimeMillis = System.currentTimeMillis();
        long diffseconds = (currentTimeMillis - millisecond) / 1000;
        if (diffseconds < 60 * 5) {
            return "刚刚";
        } else if (diffseconds < 60 * 60) {

            return (diffseconds / 60) + "分钟前";
        } else if (diffseconds < 60 * 60 * 24) {

            return diffseconds / (60 * 60) + "小时前";
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            return simpleDateFormat.format(new Date(millisecond));
        }
    }

}
