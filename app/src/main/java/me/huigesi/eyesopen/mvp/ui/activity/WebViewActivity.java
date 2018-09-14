package me.huigesi.eyesopen.mvp.ui.activity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.utils.swipeBack.SwipeBackActivity;

import static me.huigesi.eyesopen.app.utils.WebUtils.getClearAdDivJs;


public class WebViewActivity extends SwipeBackActivity {
    private static final String TAG = "WebViewActivity";
    @BindView(R.id.iv_back)
    ImageView mIvBack;
    @BindView(R.id.tv_bar_title)
    TextView mTvBarTitle;
    @BindView(R.id.wb_news)
    WebView mWbNews;
    @BindView(R.id.fl_web)
    FrameLayout mFlWeb;
    private String loadUrl, title;
    private WebViewClient webViewClient;
    public static final String WEB_URL = "WEB_URL";
    public static final String WEB_TITLE = "WEB_TITLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        ButterKnife.bind(this);
        loadUrl = getIntent().getStringExtra(WEB_URL);
        title = getIntent().getStringExtra(WEB_TITLE);
        initView();
        setWebViewClient();
    }

    private void setWebViewClient() {
        webViewClient = new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                String js = getClearAdDivJs(WebViewActivity.this);
                view.loadUrl(js);
            }

            @Nullable
            @Override
            public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
               /* //判断是否是广告相关的资源链接
                if (!AdFilterTool.isAd(WebViewActivity.this, url)) {
                    //这里是不做处理的数据
                    return super.shouldInterceptRequest(wbNews, url);
                } else {
                    //有广告的请求数据，我们直接返回空数据，注：不能直接返回null
                    return new WebResourceResponse(null, null, null);
                }*/
                return super.shouldInterceptRequest(mWbNews, url);
            }
        };
        mWbNews.setWebViewClient(webViewClient);
    }

    private void initView() {
        mWbNews.getSettings().setJavaScriptEnabled(true);
        mWbNews.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        mWbNews.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        mWbNews.loadUrl(loadUrl);
        mTvBarTitle = (TextView) findViewById(R.id.tv_bar_title);
        mTvBarTitle.setText(title);
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mIvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mWbNews.destroy();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == event.KEYCODE_BACK && mWbNews.canGoBack()) {
            mWbNews.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public static class AdFilterTool {
        public static boolean isAd(Context context, String url) {
            Resources res = context.getResources();
            String[] filterUrls = res.getStringArray(R.array.adUrls);
            for (String adUrl : filterUrls) {
                if (url.contains(adUrl)) {
                    return true;
                }
            }
            return false;
        }
    }

}
