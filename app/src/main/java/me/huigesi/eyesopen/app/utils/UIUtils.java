package me.huigesi.eyesopen.app.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;


import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.mvp.model.entity.WeiboUserSpace;
import me.huigesi.eyesopen.mvp.ui.activity.DetailActivity;
import me.huigesi.eyesopen.mvp.ui.activity.WeiboSpaceActivity;
import me.huigesi.eyesopen.mvp.ui.fragment.NbaBBSFragment;
import me.huigesi.eyesopen.mvp.ui.fragment.NbaDetailFragment;

import static me.huigesi.eyesopen.app.utils.RegularUtils.regex_at;
import static me.huigesi.eyesopen.app.utils.RegularUtils.regex_http;
import static me.huigesi.eyesopen.app.utils.RegularUtils.regex_sharp;


public class UIUtils {
    public static final String FRAGMENT_CLASS = "FRAGMENT_CLASS";
    public static void startSpaceActivity(Context context, String uid) {
        Intent intent = new Intent(context, WeiboSpaceActivity.class);
        intent.putExtra(WeiboSpaceActivity.WEIBO_SPACE_UID, uid);
        context.startActivity(intent);
    }

    public static void startNbaNewsFragment(Context context, String nid) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(FRAGMENT_CLASS, NbaDetailFragment.class.getName());
        intent.putExtra(NbaDetailFragment.NBA_NID, nid);
        context.startActivity(intent);
    }
    public static void startNbaH5Fragment(Context context, String tid) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(FRAGMENT_CLASS, NbaBBSFragment.class.getName());
        intent.putExtra(NbaBBSFragment.NBA_H5_TID, tid);
        context.startActivity(intent);
    }
/*



    public static void startWebViewActivity(Context mContext, String url, String title) {
        Intent intent = new Intent(mContext, WebViewActivity.class);
        intent.putExtra(WebViewActivity.WEB_URL, url);
        intent.putExtra(WebViewActivity.WEB_TITLE, title);
        mContext.startActivity(intent);
    }

    public static void startNbaZhuanTiActivity(Context context, String nid) {
        Intent intent = new Intent(context, NBAZhuanTiActivity.class);
        intent.putExtra(NBAZhuanTiActivity.NBA_NID, nid);
        context.startActivity(intent);
    }

    public static void startWeiBoDetailFragment(Context context, String nid) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(FRAGMENT_CLASS, WeiBoDetailFragment.class.getName());
        intent.putExtra(WeiBoDetailFragment.WEIBO_NID, nid);
        context.startActivity(intent);
    }

    public static void startWeiBoLoginActivity(Activity activity) {
        Intent intent = new Intent(activity, WeiBoLoginActivity.class);
        activity.startActivity(intent);
    }
*/

    public static void setUpIndicatorWidth(TabLayout tabLayout, int marginLeft, int marginRight) {
        Class<?> tabLayoutClass = tabLayout.getClass();
        Field tabStrip = null;
        try {
            tabStrip = tabLayoutClass.getDeclaredField("mTabStrip");
            tabStrip.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        LinearLayout layout = null;
        try {
            if (tabStrip != null) {
                layout = (LinearLayout) tabStrip.get(tabLayout);
            }
            for (int i = 0; i < layout.getChildCount(); i++) {
                View child = layout.getChildAt(i);
                child.setPadding(0, 0, 0, 0);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        0, LinearLayout.LayoutParams.MATCH_PARENT, 1);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    params.setMarginStart(marginLeft);
                    params.setMarginEnd(marginRight);
                }
                child.setLayoutParams(params);
                child.invalidate();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    //文字转换

    public static SpannableString setTextHighLight(final Context context, String content, String nickName,
                                                   boolean isLongText) {
        final SpannableString result = new SpannableString(content);
        if (nickName != null) {
            result.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.weiboLight)),
                    0, nickName.length(), Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        }
        if (isLongText) {
            result.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.weiboLight)),
                    result.length() - 2, result.length(), Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        }
        if (content.contains("@")) {
            Pattern p = Pattern.compile(regex_at);
            Matcher m = p.matcher(result);
            while (m.find()) {
                final int start = m.start();
                final int end = m.end();
                TextClickSpan span = new TextClickSpan(context);
                span.setOnClickListener(new TextClickSpan.OnTextClickListener() {
                    @Override
                    public void onClick() {
                        Map<String, String> parmes = new HashMap<>();
                        //s=ca0bff51&screen_name=博物杂志&c=weicoabroad&gsid=_2A252g8InDeRxGeRJ7FQY9C_MzT2IHXVTGVLvrDV6PUJbkdANLWPykWpNUh3I3pRTBVDeOibMN0qnkz_i9kdHj9AZ
                        parmes.put("s", "ca0bff51");
                        String name=result.subSequence(start,end).toString().substring(1);
                        parmes.put("screen_name", name);
                        parmes.put("c", "weicoabroad");
                        HttpModule.getWeiBoUserShow(parmes,context);
                        HttpModule.ResultListener listener = new HttpModule.ResultListener() {
                            @Override
                            public void success(WeiboUserSpace o) {
                                startSpaceActivity(context, o.getIdstr());
                            }

                            @Override
                            public void fail(Throwable e) {
                                Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        };
                        HttpModule.setmResultListener(listener);
                    }
                });
                //result.setSpan(span, start, end, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
                result.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(View widget) {
                        Map<String, String> parmes = new HashMap<>();
                        //s=ca0bff51&screen_name=博物杂志&c=weicoabroad&gsid=_2A252g8InDeRxGeRJ7FQY9C_MzT2IHXVTGVLvrDV6PUJbkdANLWPykWpNUh3I3pRTBVDeOibMN0qnkz_i9kdHj9AZ
                        parmes.put("s", "ca0bff51");
                        String name=result.subSequence(start,end).toString().substring(1);
                        parmes.put("screen_name", name);
                        parmes.put("c", "weicoabroad");
                        HttpModule.getWeiBoUserShow(parmes,context);
                        HttpModule.ResultListener listener = new HttpModule.ResultListener() {
                            @Override
                            public void success(WeiboUserSpace o) {
                                startSpaceActivity(context, o.getIdstr());
                            }

                            @Override
                            public void fail(Throwable e) {
                                Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        };
                        HttpModule.setmResultListener(listener);
                    }

                    @Override
                    public void updateDrawState(TextPaint ds) {
                        ds.setColor(context.getResources().getColor(R.color.weiboLight));
                        ds.setUnderlineText(false);
                    }
                }, start, end, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
            }
        }

        if (content.contains("#")) {
            Pattern p = Pattern.compile(regex_sharp);
            Matcher m = p.matcher(result);
            while (m.find()) {
                int start = m.start();
                int end = m.end();
                result.setSpan(
                        (new ForegroundColorSpan(context.getResources().getColor(R.color.weiboLight))),
                        start, end, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
            }
        }

        if (content.contains("http://")) {
            Pattern p = Pattern.compile(regex_http);
            Matcher m = p.matcher(result);
            while (m.find()) {
                final int start = m.start();
                final int end = m.end();
                TextClickSpan span = new TextClickSpan(context);
                span.setOnClickListener(new TextClickSpan.OnTextClickListener() {
                    @Override
                    public void onClick() {
                        //startWebViewActivity(context, result.subSequence(start, end).toString(), "闲阅");
                    }
                });
                result.setSpan(span, start, end, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
            }
        }
        return result;
    }

    public static class TextClickSpan extends ClickableSpan {
        private Context mContext;
        private OnTextClickListener mOnClickListener;

        public void setOnClickListener(OnTextClickListener onClickListener) {
            this.mOnClickListener = onClickListener;
        }

        public TextClickSpan(Context context) {
            mContext = context;
        }

        public interface OnTextClickListener {
            void onClick();
        }

        @Override
        public void updateDrawState(TextPaint ds) {
            ds.setColor(mContext.getResources().getColor(R.color.weiboLight));
            ds.setUnderlineText(false);
        }

        @Override
        public void onClick(View widget) {
            mOnClickListener.onClick();
        }
    }

    private static SpannableStringBuilder getUrlTextSpannableString(SpannableString source) {
        SpannableStringBuilder builder = new SpannableStringBuilder(source);
        String prefix = " ";
        builder.replace(0, prefix.length(), prefix);
        builder.append(" 网页链接");
        return builder;
    }
}
