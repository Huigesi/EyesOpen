package me.huigesi.eyesopen.mvp.ui.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.utils.swipeBack.SwipeBackActivity;

import static me.huigesi.eyesopen.app.utils.WebUtils.getClearAdDivJs;

public class GameActivity extends SwipeBackActivity {
    @BindView(R.id.fl_web)
    LinearLayout mFlWeb;
    private String mLoadUrl, mTitle;
    private ImageView iv_back;
    private TextView tv_bar_title;
    private WebView wb_news;
    private WebViewClient webViewClient;
    public static final String WEB_URL = "WEB_URL";
    public static final String WEB_TITLE = "WEB_TITLE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_notframe);
        ButterKnife.bind(this);
        mLoadUrl = getIntent().getStringExtra(WEB_URL);
        mTitle = getIntent().getStringExtra(WEB_TITLE);
        initView();
        setWebViewClient();
    }

    private void initView() {
        iv_back = (ImageView) findViewById(R.id.iv_back);
        tv_bar_title = (TextView) findViewById(R.id.tv_bar_title);
        wb_news = (WebView) findViewById(R.id.wb_news);
        wb_news.getSettings().setJavaScriptEnabled(true);
        wb_news.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wb_news.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    mFlWeb.performClick();  //模拟父控件的点击
                }
                return false;
            }
        });
        wb_news.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wb_news.loadUrl(mLoadUrl);
        tv_bar_title = (TextView) findViewById(R.id.tv_bar_title);
        tv_bar_title.setText(mTitle);
        iv_back = (ImageView) findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setWebViewClient() {
        webViewClient = new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                String js = getClearAdDivJs(GameActivity.this);
                view.loadUrl(js);
            }

            @Nullable
            @Override
            public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
                return super.shouldInterceptRequest(wb_news, url);
            }
        };
        wb_news.setWebViewClient(webViewClient);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        wb_news.destroy();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == event.KEYCODE_BACK && wb_news.canGoBack()) {
            wb_news.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
