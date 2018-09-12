package me.huigesi.eyesopen.mvp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import cn.jzvd.JZVideoPlayerStandard;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.base.BaseRecyclerViewAdapter;
import me.huigesi.eyesopen.app.utils.GlideUtils;
import me.huigesi.eyesopen.app.utils.RegularUtils;
import me.huigesi.eyesopen.app.utils.Resolution;
import me.huigesi.eyesopen.app.utils.TimeUtils;
import me.huigesi.eyesopen.app.utils.UIUtils;
import me.huigesi.eyesopen.mvp.model.entity.WeiboNews;

public class WeiboNewsAdapter extends BaseRecyclerViewAdapter<WeiboNews.StatusesData> {
    public ImgAdapter mImgAdapter;
    private boolean mIsSpace;

    public WeiboNewsAdapter(Context context,boolean isSpace) {
        super(context);
        mIsSpace = isSpace;
    }

    @Override
    public RecyclerView.ViewHolder onCreate(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_weibo, null, false);
        view.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        return new NewsViewHolder(view);
    }

    @Override
    public void onBind(final RecyclerView.ViewHolder holder, int position, final WeiboNews.StatusesData data) {
        if (holder instanceof NewsViewHolder) {
            View.OnTouchListener mOnTouchListener= (v, event) -> {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    holder.itemView.performClick();  //模拟父控件的点击
                }
                return false;
            };
            if (data == null) {
                return;
            }
            int weight = Resolution.dipToPx(mContext, 50);
            GlideUtils.loadCircle(mContext, data.getUser().getAvatar_large(),
                    ((NewsViewHolder) holder).imgWeiboUser, weight, weight);
            ((NewsViewHolder) holder).imgWeiboUser.setOnClickListener(v -> {
                if (!mIsSpace)UIUtils.startSpaceActivity(mContext, data.getUser().getIdstr());
            });
            ((NewsViewHolder) holder).tvWeiboUser.setText(data.getUser().getScreen_name());
            try {
                ((NewsViewHolder) holder).tvWeiboTime.setText(
                        TimeUtils.prettyTime4(TimeUtils.prettyDate1(data.getCreated_at())));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            ((NewsViewHolder) holder).tvWeiboSource.setText(RegularUtils.getA(data.getSource()));
            SpannableString content;
            if (data.isIsLongText()) {
                content = UIUtils.setTextHighLight(mContext, data.getText() + "...全文", null, true);
            } else {
                content = UIUtils.setTextHighLight(mContext, data.getText(), null, false);
            }
            ((NewsViewHolder) holder).tvWeiboContentText.setOnTouchListener(mOnTouchListener);
            ((NewsViewHolder) holder).tvWeiboContentText.setMovementMethod(LinkMovementMethod.getInstance());
            ((NewsViewHolder) holder).tvWeiboContentText.setText(content);
            ((NewsViewHolder) holder).tvWeiboLike.setText(String.valueOf(data.getAttitudes_count()));
            ((NewsViewHolder) holder).tvWeiboComment.setText(String.valueOf(data.getComments_count()));
            ((NewsViewHolder) holder).tvWeiboZhuan.setText(String.valueOf(data.getReposts_count()));

            if (data.getPic_ids() != null && data.getPic_ids().size() > 0) {
                ((NewsViewHolder) holder).rvWeiboImgs.setVisibility(View.VISIBLE);
                ((NewsViewHolder) holder).rvWeiboImgs.setLayoutManager(new GridLayoutManager(
                        mContext, 3));
                mImgAdapter = new ImgAdapter(mContext);
                List<String> gifIds = new ArrayList<>();
                if (data.getGif_ids().equals("")){
                    mImgAdapter.setGifIds(gifIds);
                }else {
                    String[] str1=data.getGif_ids().split(",");
                    for (String s : str1) {
                        String id=s.substring(0,s.indexOf("|"));
                        gifIds.add(id);
                    }
                    mImgAdapter.setGifIds(gifIds);
                }
                mImgAdapter.setData(data.getPic_ids(), true);
                ((NewsViewHolder) holder).rvWeiboImgs.setAdapter(mImgAdapter);
                ((NewsViewHolder) holder).rvWeiboImgs.setOnTouchListener(mOnTouchListener);
            } else {
                ((NewsViewHolder) holder).rvWeiboImgs.setVisibility(View.GONE);
            }

            if (data.getPage_info() != null && data.getPage_info().getMedia_info() != null) {
                ((NewsViewHolder) holder).videoWeibo.setVisibility(View.VISIBLE);
                GlideUtils.loadAuto(mContext, data.getPage_info().getPage_pic(),
                        ((NewsViewHolder) holder).videoWeibo.thumbImageView);
                ((NewsViewHolder) holder).videoWeibo.setUp(
                        data.getPage_info().getMedia_info().getMp4_sd_url(),
                        JZVideoPlayerStandard.SCREEN_STATE_ON);
                ((NewsViewHolder) holder).rvWeiboImgs.setVisibility(View.GONE);
            } else {
                ((NewsViewHolder) holder).videoWeibo.setVisibility(View.GONE);
            }

            if (data.getRetweeted_status() != null && data.getRetweeted_status().getUser() != null) {
                ((NewsViewHolder) holder).llWeiboRetweeted.setVisibility(View.VISIBLE);
                String userName = data.getRetweeted_status()
                        .getUser().getName();
                String retWeedText = data.getRetweeted_status()
                        .getText();
                SpannableString retweeted;
                if (data.getRetweeted_status().isIsLongText()) {
                    retweeted = UIUtils.setTextHighLight(mContext, userName + " : " + retWeedText + "...全文", userName, true);
                } else {
                    retweeted = UIUtils.setTextHighLight(mContext, userName + " : " + retWeedText, userName, false);
                }
                ((NewsViewHolder) holder).tvRetweetedContent.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        if (event.getAction() == MotionEvent.ACTION_UP) {
                            ((NewsViewHolder) holder).llWeiboRetweeted.performClick();  //模拟父控件的点击
                        }
                        return false;
                    }
                });
                ((NewsViewHolder) holder).tvRetweetedContent.setMovementMethod(LinkMovementMethod.getInstance());
                ((NewsViewHolder) holder).tvRetweetedContent.setText(
                        retweeted);
                ((NewsViewHolder) holder).tvRetweetedReport.setText("转发 " + data.getRetweeted_status()
                        .getReposts_count());
                ((NewsViewHolder) holder).tvRetweetedComment.setText("评论 " + data.getRetweeted_status()
                        .getComments_count());
                ((NewsViewHolder) holder).tvRetweetedLike.setText("赞 " + data.getRetweeted_status()
                        .getAttitudes_count());
                ((NewsViewHolder) holder).llWeiboRetweeted.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        UIUtils.startWeiBoDetailFragment(mContext, data.getRetweeted_status().getIdstr());
                    }
                });
                if (data.getRetweeted_status().getPic_ids() != null &&
                        data.getRetweeted_status().getPic_ids().size() > 0) {
                    ((NewsViewHolder) holder).rvRetweetedImgs.setVisibility(View.VISIBLE);
                    mImgAdapter = new ImgAdapter(holder.itemView.getContext());
                    ((NewsViewHolder) holder).rvRetweetedImgs.setAdapter(mImgAdapter);
                    ((NewsViewHolder) holder).rvRetweetedImgs.setLayoutManager(new GridLayoutManager(
                            mContext, 3));
                    List<String> gifIds = new ArrayList<>();
                    if (data.getRetweeted_status().getGif_ids().equals("")){
                        mImgAdapter.setGifIds(gifIds);
                    }else {
                        String[] str1=data.getRetweeted_status().getGif_ids().split(",");
                        for (String s : str1) {
                            String id=s.substring(0,s.indexOf("|"));
                            gifIds.add(id);
                        }
                        mImgAdapter.setGifIds(gifIds);
                    }
                    mImgAdapter.setData(data.getRetweeted_status().getPic_ids(), true);
                    ((NewsViewHolder) holder).rvRetweetedImgs.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            if (event.getAction() == MotionEvent.ACTION_UP) {
                                ((NewsViewHolder) holder).llWeiboRetweeted.performClick();  //模拟父控件的点击
                            }
                            return false;
                        }
                    });
                } else {
                    ((NewsViewHolder) holder).rvRetweetedImgs.setVisibility(View.GONE);
                }

                if (data.getPage_info() != null && data.getPage_info().getMedia_info() != null) {
                    ((NewsViewHolder) holder).videoRetweetedWeibo.setVisibility(View.VISIBLE);
                    ((NewsViewHolder) holder).videoWeibo.setVisibility(View.GONE);
                    GlideUtils.loadAuto(mContext, data.getPage_info().getPage_pic(),
                            ((NewsViewHolder) holder).videoRetweetedWeibo.thumbImageView);
                    ((NewsViewHolder) holder).videoRetweetedWeibo.setUp(
                            data.getPage_info().getMedia_info().getMp4_sd_url(),
                            JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL);
                    ((NewsViewHolder) holder).rvRetweetedImgs.setVisibility(View.GONE);
                } else {
                    ((NewsViewHolder) holder).videoRetweetedWeibo.setVisibility(View.GONE);
                    ((NewsViewHolder) holder).videoWeibo.setVisibility(View.GONE);
                }
            } else if (data.getRetweeted_status() != null &&
                    data.getRetweeted_status().getUser() == null) {
                ((NewsViewHolder) holder).llWeiboRetweeted.setVisibility(View.VISIBLE);
                ((NewsViewHolder) holder).tvRetweetedContent.setText("抱歉，这条微博已被删除");
            } else {
                ((NewsViewHolder) holder).llWeiboRetweeted.setVisibility(View.GONE);
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   UIUtils.startWeiBoDetailFragment(mContext, data.getIdstr());
                }
            });
        }
    }

    public class NewsViewHolder extends Holder {
        private ImageView imgWeiboUser;
        private TextView tvWeiboUser;
        private TextView tvWeiboTime;
        private TextView tvWeiboSource;
        private TextView tvWeiboContentText;
        private RecyclerView rvWeiboImgs;
        private JZVideoPlayerStandard videoWeibo;
        private LinearLayout llWeiboRetweeted;
        private TextView tvRetweetedContent;
        private TextView tvRetweetedReport;
        private TextView tvRetweetedComment;
        private TextView tvRetweetedLike;
        private RecyclerView rvRetweetedImgs;
        private JZVideoPlayerStandard videoRetweetedWeibo;
        private LinearLayout llWeiboBtns;
        private TextView tvWeiboLike;
        private TextView tvWeiboComment;
        private TextView tvWeiboZhuan;
        private LinearLayout mLinearLayout;

        public NewsViewHolder(View view) {
            super(view);
            imgWeiboUser = (ImageView) view.findViewById(R.id.img_weibo_user);
            tvWeiboUser = (TextView) view.findViewById(R.id.tv_weibo_user);
            tvWeiboTime = (TextView) view.findViewById(R.id.tv_weibo_time);
            tvWeiboSource = (TextView) view.findViewById(R.id.tv_weibo_source);
            tvWeiboContentText = (TextView) view.findViewById(R.id.tv_weibo_contentText);
            rvWeiboImgs = (RecyclerView) view.findViewById(R.id.rv_weibo_imgs);
            videoWeibo = (JZVideoPlayerStandard) view.findViewById(R.id.video_weibo);
            llWeiboRetweeted = (LinearLayout) view.findViewById(R.id.ll_weibo_retweeted);
            tvRetweetedContent = (TextView) view.findViewById(R.id.tv_retweeted_content);
            tvRetweetedReport = (TextView) view.findViewById(R.id.tv_retweeted_report);
            tvRetweetedComment = (TextView) view.findViewById(R.id.tv_retweeted_comment);
            tvRetweetedLike = (TextView) view.findViewById(R.id.tv_retweeted_like);
            rvRetweetedImgs = (RecyclerView) view.findViewById(R.id.rv_retweeted_imgs);
            videoRetweetedWeibo = (JZVideoPlayerStandard) view.findViewById(R.id.video_retweeted_weibo);
            llWeiboBtns = (LinearLayout) view.findViewById(R.id.ll_weibo_btns);
            tvWeiboLike = (TextView) view.findViewById(R.id.tv_weibo_like);
            tvWeiboComment = (TextView) view.findViewById(R.id.tv_weibo_comment);
            tvWeiboZhuan = (TextView) view.findViewById(R.id.tv_weibo_zhuan);
            mLinearLayout = (LinearLayout) view.findViewById(R.id.ll_weibo_content);
        }
    }
}
