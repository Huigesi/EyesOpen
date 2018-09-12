package me.huigesi.eyesopen.mvp.ui.view;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.jzvd.JZVideoPlayerStandard;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.utils.GlideUtils;
import me.huigesi.eyesopen.app.utils.RegularUtils;
import me.huigesi.eyesopen.app.utils.Resolution;
import me.huigesi.eyesopen.app.utils.TimeUtils;
import me.huigesi.eyesopen.app.utils.UIUtils;
import me.huigesi.eyesopen.mvp.model.entity.WeiboDetail;
import me.huigesi.eyesopen.mvp.ui.adapter.ImgAdapter;

public class WeiBoDetailHeaderView extends LinearLayout {
    @BindView(R.id.img_weibo_user)
    ImageView mImgWeiboUser;
    @BindView(R.id.tv_weibo_user)
    TextView mTvWeiboUser;
    @BindView(R.id.tv_weibo_time)
    TextView mTvWeiboTime;
    @BindView(R.id.tv_weibo_contentText)
    TextView mTvWeiboContentText;
    @BindView(R.id.rv_weibo_imgs)
    RecyclerView mRvWeiboImgs;
    @BindView(R.id.video_weibo)
    JZVideoPlayerStandard mVideoWeibo;
    @BindView(R.id.tv_retweeted_content)
    TextView mTvRetweetedContent;
    @BindView(R.id.tv_retweeted_report)
    TextView mTvRetweetedReport;
    @BindView(R.id.tv_retweeted_comment)
    TextView mTvRetweetedComment;
    @BindView(R.id.tv_retweeted_like)
    TextView mTvRetweetedLike;
    @BindView(R.id.rv_retweeted_imgs)
    RecyclerView mRvRetweetedImgs;
    @BindView(R.id.ll_weibo_retweeted_img)
    LinearLayout mLlWeiboRetweetedImg;
    @BindView(R.id.video_retweeted_weibo)
    JZVideoPlayerStandard mVideoRetweetedWeibo;
    @BindView(R.id.tv_weibo_like)
    TextView mTvWeiboLike;
    @BindView(R.id.tv_weibo_comment)
    TextView mTvWeiboComment;
    @BindView(R.id.tv_weibo_zhuan)
    TextView mTvWeiboZhuan;
    @BindView(R.id.ll_weibo_btns)
    LinearLayout mLlWeiboBtns;
    @BindView(R.id.tv_weibo_source)
    TextView mTvWeiboSource;
    @BindView(R.id.ll_weibo_img)
    LinearLayout mLlWeiboImg;
    @BindView(R.id.ll_weibo_retweeted)
    LinearLayout mLlWeiboRetweeted;
    private Unbinder mUnbinder;
    private WeiboDetail mWeiBoDetail;
    private ImgAdapter mImgAdapter;

    public WeiBoDetailHeaderView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_weibo_detail, this, true);
        mUnbinder = ButterKnife.bind(this);
    }

    public void setData(WeiboDetail weiBoDetail) {
        mWeiBoDetail = weiBoDetail;
        refreshUI();
    }

    private void refreshUI() {
        if (mWeiBoDetail.getStatus() == null) {
            return;
        }
        int weight = Resolution.dipToPx(getContext(), 35);
        GlideUtils.loadCircle(getContext(), mWeiBoDetail.getStatus().getUser().getProfile_image_url(),
                mImgWeiboUser, weight, weight);
        mImgWeiboUser.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                UIUtils.startSpaceActivity(getContext(), mWeiBoDetail.getStatus().getUser().getIdstr());
            }
        });
        mTvWeiboUser.setText(mWeiBoDetail.getStatus().getUser().getScreen_name());
        try {
            mTvWeiboTime.setText(
                    TimeUtils.prettyTime4(TimeUtils.prettyDate1(mWeiBoDetail.getStatus().getCreated_at())));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String s = RegularUtils.getA(mWeiBoDetail.getStatus().getSource());
        mTvWeiboSource.setText(s);
        SpannableString content;
        if (mWeiBoDetail.getStatus().isIsLongText() == true) {
            content = UIUtils.setTextHighLight(getContext(), mWeiBoDetail.getStatus().getLongText().getLongTextContent(), null, false);
        } else {
            content = UIUtils.setTextHighLight(getContext(), mWeiBoDetail.getStatus().getText(), null, false);
        }
        mTvWeiboContentText.setMovementMethod(LinkMovementMethod.getInstance());
        mTvWeiboContentText.setText(content);
        mTvWeiboLike.setText(String.valueOf(mWeiBoDetail.getStatus().getAttitudes_count()));
        mTvWeiboComment.setText(String.valueOf(mWeiBoDetail.getStatus().getComments_count()));
        mTvWeiboZhuan.setText(String.valueOf(mWeiBoDetail.getStatus().getReposts_count()));
        if (mWeiBoDetail.getStatus().getPic_ids() != null && mWeiBoDetail.getStatus().getPic_ids().size() > 0) {
            mLlWeiboImg.setVisibility(View.VISIBLE);
            mRvWeiboImgs.setLayoutManager(new GridLayoutManager(
                    getContext(), 3));
            mImgAdapter = new ImgAdapter(getContext());
            List<String> gifIds = new ArrayList<>();
            if (mWeiBoDetail.getStatus().getGif_ids().equals("")){
                mImgAdapter.setGifIds(gifIds);
            }else {
                String[] str1=mWeiBoDetail.getStatus().getGif_ids().split(",");
                for (String ss : str1) {
                    String id=ss.substring(0,ss.indexOf("|"));
                    gifIds.add(id);
                }
                mImgAdapter.setGifIds(gifIds);
            }
            mImgAdapter.setData(mWeiBoDetail.getStatus().getPic_ids(), true);
            mRvWeiboImgs.setAdapter(mImgAdapter);
        } else {
            mLlWeiboImg.setVisibility(View.GONE);
        }
        if (mWeiBoDetail.getStatus().getPage_info() != null && mWeiBoDetail.getStatus()
                .getPage_info().getMedia_info() != null) {
            mVideoWeibo.setVisibility(View.VISIBLE);
            GlideUtils.loadAuto(getContext(), mWeiBoDetail.getStatus().getPage_info().getPage_pic(),
                    mVideoWeibo.thumbImageView);
            mVideoWeibo.setUp(
                    mWeiBoDetail.getStatus().getPage_info().getMedia_info().getMp4_sd_url(),
                    JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL);
            mLlWeiboImg.setVisibility(GONE);
        } else {
            mVideoWeibo.setVisibility(View.GONE);
        }
        if (mWeiBoDetail.getStatus().getRetweeted_status() != null) {
            mLlWeiboRetweeted.setVisibility(View.VISIBLE);
            String userName = mWeiBoDetail.getStatus().getRetweeted_status()
                    .getUser().getName();
            String retWeedText = mWeiBoDetail.getStatus().getRetweeted_status()
                    .getText();
            SpannableString retweeted;
            if (mWeiBoDetail.getStatus().getRetweeted_status().isIsLongText()) {
                retweeted = UIUtils.setTextHighLight(getContext(), userName + " : " +
                        retWeedText + "...全文", userName, true);
            } else {
                retweeted = UIUtils.setTextHighLight(getContext(), userName + " : " +
                        retWeedText, userName, false);
            }
            mTvRetweetedContent.setOnTouchListener(new OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        mLlWeiboRetweeted.performClick();  //模拟父控件的点击
                    }
                    return false;
                }
            });
            mTvRetweetedContent.setMovementMethod(LinkMovementMethod.getInstance());
            mTvRetweetedContent.setText(retweeted);

            mTvRetweetedReport.setText("转发 " + mWeiBoDetail.getStatus().getRetweeted_status()
                    .getReposts_count());
            mTvRetweetedComment.setText("评论 " + mWeiBoDetail.getStatus().getRetweeted_status()
                    .getComments_count());
            mTvRetweetedLike.setText("赞 " + mWeiBoDetail.getStatus().getRetweeted_status()
                    .getAttitudes_count());
            mLlWeiboRetweeted.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                   UIUtils.startWeiBoDetailFragment(getContext(),
                            mWeiBoDetail.getStatus().getRetweeted_status().getIdstr());
                }
            });
            if (mWeiBoDetail.getStatus().getRetweeted_status().getPic_ids() != null &&
                    mWeiBoDetail.getStatus().getRetweeted_status().getPic_ids().size() > 0) {
                mLlWeiboRetweetedImg.setVisibility(View.VISIBLE);
                mImgAdapter = new ImgAdapter(getContext());
                List<String> gifIds = new ArrayList<>();
                if (mWeiBoDetail.getStatus().getRetweeted_status().getGif_ids().equals("")){
                    mImgAdapter.setGifIds(gifIds);
                }else {
                    String[] str1=mWeiBoDetail.getStatus().getRetweeted_status().getGif_ids().split(",");
                    for (String ss : str1) {
                        String id=ss.substring(0,ss.indexOf("|"));
                        gifIds.add(id);
                    }
                    mImgAdapter.setGifIds(gifIds);
                }
                mRvRetweetedImgs.setAdapter(mImgAdapter);
                mRvRetweetedImgs.setLayoutManager(new GridLayoutManager(
                        getContext(), 3));
                mRvRetweetedImgs.setOnTouchListener(new OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        if (event.getAction() == MotionEvent.ACTION_UP) {
                            mLlWeiboRetweeted.performClick();  //模拟父控件的点击
                        }
                        return false;
                    }
                });
                mImgAdapter.setData(mWeiBoDetail.getStatus().getRetweeted_status().getPic_ids(), true);
            } else {
                mLlWeiboRetweetedImg.setVisibility(View.GONE);
            }
            if (mWeiBoDetail.getStatus().getPage_info() != null && mWeiBoDetail.getStatus().getPage_info().getMedia_info() != null) {
                mVideoRetweetedWeibo.setVisibility(View.VISIBLE);
                mVideoWeibo.setVisibility(View.GONE);
                GlideUtils.loadAuto(getContext(), mWeiBoDetail.getStatus().getPage_info().getPage_pic(),
                        mVideoRetweetedWeibo.thumbImageView);
                mVideoRetweetedWeibo.setUp(
                        mWeiBoDetail.getStatus().getPage_info().getMedia_info().getMp4_sd_url(),
                        JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL);
                mLlWeiboRetweetedImg.setVisibility(GONE);
            } else if (mWeiBoDetail.getStatus().getRetweeted_status() != null &&
                    mWeiBoDetail.getStatus().getRetweeted_status().getUser() == null) {
                mLlWeiboRetweeted.setVisibility(View.VISIBLE);
                mTvRetweetedContent.setText("抱歉，这条微博已被删除");
            } else {
                mVideoRetweetedWeibo.setVisibility(View.GONE);
                mVideoWeibo.setVisibility(View.GONE);
            }
        } else {
            mLlWeiboRetweeted.setVisibility(View.GONE);
        }
    }
}
