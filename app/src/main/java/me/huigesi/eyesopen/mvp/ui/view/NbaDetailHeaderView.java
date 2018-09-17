package me.huigesi.eyesopen.mvp.ui.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.utils.GlideUtils;
import me.huigesi.eyesopen.mvp.model.entity.NbaNewsDetail;

public class NbaDetailHeaderView extends LinearLayout {

    @BindView(R.id.tv_nba_detail_title)
    TextView mTvNbaDetailTitle;
    @BindView(R.id.tv_nba_detail_title_time)
    TextView mTvNbaDetailTitleTime;
    @BindView(R.id.tv_nba_detail_title_origin)
    TextView mTvNbaDetailTitleOrigin;
    @BindView(R.id.rl_detail_title)
    LinearLayout mRlDetailTitle;
    @BindView(R.id.wv_nba_detail_content)
    WebView mWvNbaDetailContent;
    @BindView(R.id.ll_nba_detail_content)
    LinearLayout mLlNbaDetailContent;
    @BindView(R.id.img_nba_detail_content)
    ImageView mImgNbaDetailContent;
    @BindView(R.id.ll_nomore)
    LinearLayout mLlNomore;
    private Unbinder mUnbinder;
    private NbaNewsDetail mNbaDetailNews;

    public NbaDetailHeaderView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_nba_detail, this, true);
        mUnbinder = ButterKnife.bind(this);
    }

    public void setData(NbaNewsDetail data) {
        mNbaDetailNews = data;
        refreshUI();
    }

    private void refreshUI() {
        if (mNbaDetailNews == null) {
            return;
        }
        mTvNbaDetailTitle.setText(mNbaDetailNews.getResult().getTitle());
        mTvNbaDetailTitleOrigin.setText(mNbaDetailNews.getResult().getOffline_data().
                getData().getNews().getOrigin());
        mTvNbaDetailTitleOrigin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(getContext(), WebViewActivity.class);
                intent.putExtra(WebViewActivity.WEB_URL, mNbaDetailNews.getResult()
                        .getOffline_data().getData().getNews().getOrigin_url());
                intent.putExtra(WebViewActivity.WEB_TITLE, mNbaDetailNews.getResult().getTitle());
                getContext().startActivity(intent);*/
            }
        });
        mTvNbaDetailTitleTime.setText(mNbaDetailNews.getResult().getOffline_data().getData()
                .getNews().getAddtime());
        GlideUtils.loadAuto(getContext(), mNbaDetailNews.getResult().getOffline_data()
                .getData().getNews().getImg_m(), mImgNbaDetailContent);
        String htmls = mNbaDetailNews.getResult().getOffline_data().getData().getNews().getContent();
        mWvNbaDetailContent.getSettings().setUseWideViewPort(false);
        mWvNbaDetailContent.getSettings().setLoadsImagesAutomatically(true);
        mWvNbaDetailContent.getSettings().setDefaultFontSize(18);
        mWvNbaDetailContent.getSettings().setJavaScriptEnabled(true);
        mWvNbaDetailContent.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                imgReset();
            }
        });
        //imgReset(mWvNbaDetailContent);
        String css = "<style>*{line-height:30px;} p.thicker{font-weight: 100;} p{color:#666;}</style>";
        mWvNbaDetailContent.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        mWvNbaDetailContent.loadDataWithBaseURL(null, css + htmls,
                "text/html", "utf-8", null);
    }

    private void imgReset() {
        mWvNbaDetailContent.loadUrl("javascript:(function(){" +
                "var objs = document.getElementsByTagName('img'); " +
                "for(var i=0;i<objs.length;i++)  " +
                "{"
                + "var img = objs[i];   " +
                " img.style.maxWidth = '100%';img.style.height='auto';" +
                "}" +
                "})()");
    }
}
