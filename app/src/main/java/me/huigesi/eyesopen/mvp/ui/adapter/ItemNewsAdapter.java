package me.huigesi.eyesopen.mvp.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.base.BaseRecyclerViewAdapter;
import me.huigesi.eyesopen.app.utils.GlideUtils;
import me.huigesi.eyesopen.app.utils.Resolution;
import me.huigesi.eyesopen.app.utils.UIUtils;
import me.huigesi.eyesopen.mvp.model.entity.News163;

public class ItemNewsAdapter extends BaseRecyclerViewAdapter<News163> {
    private static final String TAG = "ItemNewsAdapter";

    public ItemNewsAdapter(Context context) {
        super(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreate(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_news, parent, false);
        return new ItemNewsHolder(view);
    }

    public void setPlugInfo(int i,News163 data,LinearLayout llTemplateGame,ImageView imgTemplateGame,
                            TextView tvGameTitle,TextView tvGameSubtitle,LinearLayout llTemplateGame1) {
        llTemplateGame.setVisibility(View.VISIBLE);
        GlideUtils.load(mContext, data.getWap_pluginfo().get(i).getImgsrc(),
                imgTemplateGame);
        tvGameTitle.setText(
                data.getWap_pluginfo().get(i).getTitle());
        if (data.getWap_pluginfo().get(i).getSubtitle().equals("")) {
            tvGameSubtitle.setVisibility(View.GONE);
        } else {
            tvGameSubtitle.setVisibility(View.VISIBLE);
            tvGameSubtitle.setText(
                    data.getWap_pluginfo().get(i).getSubtitle());
        }
        llTemplateGame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIUtils.startGameActivity(mContext, data.getWap_pluginfo().get(i).getUrl(),
                        data.getWap_pluginfo().get(i).getTitle());
            }
        });
    }
    @Override
    public void onBind(RecyclerView.ViewHolder holder, int position, final News163 data) {
        if (holder instanceof ItemNewsHolder) {
            if (data == null) {
                return;
            }
            int weight = Resolution.dipToPx(mContext, 120);
            int height = Resolution.dipToPx(mContext, 80);
            if (!TextUtils.isEmpty(data.getTemplate())) {
                if (data.getWap_pluginfo() != null && position == 0) {
                    if (data.getWap_pluginfo().size() == 4) {
                        ((ItemNewsHolder) holder).llTemplateGame3.setVisibility(View.VISIBLE);
                        ((ItemNewsHolder) holder).llTemplateGame4.setVisibility(View.VISIBLE);
                        ((ItemNewsHolder) holder).llTemplateGame1.setVisibility(View.VISIBLE);
                        ((ItemNewsHolder) holder).llTemplateGame2.setVisibility(View.VISIBLE);
                   setPlugInfo(0,data,((ItemNewsHolder) holder).llTemplateGame,
                           ((ItemNewsHolder) holder).imgTemplateGame1,
                           ((ItemNewsHolder) holder).tvGame1Title,
                           ((ItemNewsHolder) holder).tvGame1Subtitle,
                           ((ItemNewsHolder) holder).llTemplateGame1);
                   setPlugInfo(1,data,((ItemNewsHolder) holder).llTemplateGame,
                           ((ItemNewsHolder) holder).imgTemplateGame2,
                           ((ItemNewsHolder) holder).tvGame2Title,
                           ((ItemNewsHolder) holder).tvGame2Subtitle,
                           ((ItemNewsHolder) holder).llTemplateGame2);
                    setPlugInfo(2,data,((ItemNewsHolder) holder).llTemplateGame,
                            ((ItemNewsHolder) holder).imgTemplateGame3,
                            ((ItemNewsHolder) holder).tvGame3Title,
                            ((ItemNewsHolder) holder).tvGame3Subtitle,
                            ((ItemNewsHolder) holder).llTemplateGame3);
                    setPlugInfo(3,data,((ItemNewsHolder) holder).llTemplateGame,
                            ((ItemNewsHolder) holder).imgTemplateGame4,
                            ((ItemNewsHolder) holder).tvGame4Title,
                            ((ItemNewsHolder) holder).tvGame4Subtitle,
                            ((ItemNewsHolder) holder).llTemplateGame4);
                    } else if (data.getWap_pluginfo().size() == 3) {
                        ((ItemNewsHolder) holder).llTemplateGame3.setVisibility(View.VISIBLE);
                        ((ItemNewsHolder) holder).llTemplateGame4.setVisibility(View.GONE);
                        ((ItemNewsHolder) holder).llTemplateGame1.setVisibility(View.VISIBLE);
                        ((ItemNewsHolder) holder).llTemplateGame2.setVisibility(View.VISIBLE);
                        setPlugInfo(0,data,((ItemNewsHolder) holder).llTemplateGame,
                                ((ItemNewsHolder) holder).imgTemplateGame1,
                                ((ItemNewsHolder) holder).tvGame1Title,
                                ((ItemNewsHolder) holder).tvGame1Subtitle,
                                ((ItemNewsHolder) holder).llTemplateGame1);
                        setPlugInfo(1,data,((ItemNewsHolder) holder).llTemplateGame,
                                ((ItemNewsHolder) holder).imgTemplateGame2,
                                ((ItemNewsHolder) holder).tvGame2Title,
                                ((ItemNewsHolder) holder).tvGame2Subtitle,
                                ((ItemNewsHolder) holder).llTemplateGame2);
                        setPlugInfo(2,data,((ItemNewsHolder) holder).llTemplateGame,
                                ((ItemNewsHolder) holder).imgTemplateGame3,
                                ((ItemNewsHolder) holder).tvGame3Title,
                                ((ItemNewsHolder) holder).tvGame3Subtitle,
                                ((ItemNewsHolder) holder).llTemplateGame3);
                    }else if(data.getWap_pluginfo().size() == 2){
                        setPlugInfo(0,data,((ItemNewsHolder) holder).llTemplateGame,
                                ((ItemNewsHolder) holder).imgTemplateGame1,
                                ((ItemNewsHolder) holder).tvGame1Title,
                                ((ItemNewsHolder) holder).tvGame1Subtitle,
                                ((ItemNewsHolder) holder).llTemplateGame1);
                        setPlugInfo(1,data,((ItemNewsHolder) holder).llTemplateGame,
                                ((ItemNewsHolder) holder).imgTemplateGame2,
                                ((ItemNewsHolder) holder).tvGame2Title,
                                ((ItemNewsHolder) holder).tvGame2Subtitle,
                                ((ItemNewsHolder) holder).llTemplateGame2);
                        ((ItemNewsHolder) holder).llTemplateGame1.setVisibility(View.VISIBLE);
                        ((ItemNewsHolder) holder).llTemplateGame2.setVisibility(View.VISIBLE);
                        ((ItemNewsHolder) holder).llTemplateGame4.setVisibility(View.GONE);
                        ((ItemNewsHolder) holder).llTemplateGame3.setVisibility(View.GONE);
                    }else {
                        ((ItemNewsHolder) holder).llTemplateGame1.setVisibility(View.VISIBLE);
                        ((ItemNewsHolder) holder).llTemplateGame2.setVisibility(View.GONE);
                        ((ItemNewsHolder) holder).llTemplateGame4.setVisibility(View.GONE);
                        ((ItemNewsHolder) holder).llTemplateGame3.setVisibility(View.GONE);
                        setPlugInfo(0,data,((ItemNewsHolder) holder).llTemplateGame,
                                ((ItemNewsHolder) holder).imgTemplateGame1,
                                ((ItemNewsHolder) holder).tvGame1Title,
                                ((ItemNewsHolder) holder).tvGame1Subtitle,
                                ((ItemNewsHolder) holder).llTemplateGame1);
                    }

                } else {
                    ((ItemNewsHolder) holder).llTemplateGame.setVisibility(View.GONE);
                }
                ((ItemNewsHolder) holder).itemNews.setVisibility(View.GONE);
                ((ItemNewsHolder) holder).itemExtra.setVisibility(View.GONE);
                ((ItemNewsHolder) holder).itemTemplate.setVisibility(View.VISIBLE);
                GlideUtils.load(mContext, data.getImgsrc(),
                        ((ItemNewsHolder) holder).imgNewsTemplate);
                ((ItemNewsHolder) holder).tvTemplateTitle.setText(data.getTitle());
            } else if (data.getImgextra() != null) {
                ((ItemNewsHolder) holder).itemNews.setVisibility(View.GONE);
                ((ItemNewsHolder) holder).itemExtra.setVisibility(View.VISIBLE);
                ((ItemNewsHolder) holder).itemTemplate.setVisibility(View.GONE);
                ((ItemNewsHolder) holder).tvExtraTitle.setText(data.getTitle());
                ((ItemNewsHolder) holder).tvExtraSource.setText(data.getSource());
                ((ItemNewsHolder) holder).tvExtraVote.setText(data.getVotecount() + "评论");
                GlideUtils.load(mContext, data.getImgextra().get(0).getImgsrc(),
                        ((ItemNewsHolder) holder).imgExtra1);
                GlideUtils.load(mContext, data.getImgextra().get(1).getImgsrc(),
                        ((ItemNewsHolder) holder).imgExtra2);
                GlideUtils.load(mContext, data.getImgsrc(),
                        ((ItemNewsHolder) holder).imgExtra3);
            } else {
                ((ItemNewsHolder) holder).itemNews.setVisibility(View.VISIBLE);
                ((ItemNewsHolder) holder).itemExtra.setVisibility(View.GONE);
                ((ItemNewsHolder) holder).itemTemplate.setVisibility(View.GONE);
                GlideUtils.load(mContext, data.getImgsrc(),
                        ((ItemNewsHolder) holder).imgNewsCover, weight, height);
                ((ItemNewsHolder) holder).tvNewsTitle.setText(data.getTitle());
                ((ItemNewsHolder) holder).tvNewsSource.setText(data.getSource());
                ((ItemNewsHolder) holder).tvNewsVote.setText(data.getVotecount() + "评论");
            }
            if (data.getUrl() != null) {
                ((ItemNewsHolder) holder).itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        UIUtils.startWebViewActivity(mContext, data.getUrl(), data.getSource());
                    }
                });
            }

        }
    }

    protected class ItemNewsHolder extends RecyclerView.ViewHolder {
        private LinearLayout itemNews;
        private TextView tvNewsTitle;
        private ImageView imgNewsCover;
        private TextView tvNewsSource;
        private TextView tvNewsVote;
        private LinearLayout itemExtra;
        private TextView tvExtraTitle;
        private ImageView imgExtra1;
        private ImageView imgExtra2;
        private ImageView imgExtra3;
        private TextView tvExtraSource;
        private TextView tvExtraVote;
        private RelativeLayout itemTemplate;
        private ImageView imgNewsTemplate;
        private TextView tvTemplateTitle;

        private LinearLayout llTemplateGame;
        private LinearLayout llTemplateGame1;
        private ImageView imgTemplateGame1;
        private TextView tvGame1Title;
        private TextView tvGame1Subtitle;
        private LinearLayout llTemplateGame2;
        private ImageView imgTemplateGame2;
        private TextView tvGame2Title;
        private TextView tvGame2Subtitle;
        private LinearLayout llTemplateGame3;
        private ImageView imgTemplateGame3;
        private TextView tvGame3Title;
        private TextView tvGame3Subtitle;
        private LinearLayout llTemplateGame4;
        private ImageView imgTemplateGame4;
        private TextView tvGame4Title;
        private TextView tvGame4Subtitle;

        public ItemNewsHolder(View view) {
            super(view);
            itemNews = (LinearLayout) view.findViewById(R.id.item_news);
            tvNewsTitle = (TextView) view.findViewById(R.id.tv_news_title);
            imgNewsCover = (ImageView) view.findViewById(R.id.img_news_cover);
            tvNewsSource = (TextView) view.findViewById(R.id.tv_news_source);
            tvNewsVote = (TextView) view.findViewById(R.id.tv_news_vote);
            itemExtra = (LinearLayout) view.findViewById(R.id.item_extra);
            tvExtraTitle = (TextView) view.findViewById(R.id.tv_extra_title);
            imgExtra1 = (ImageView) view.findViewById(R.id.img_extra1);
            imgExtra2 = (ImageView) view.findViewById(R.id.img_extra2);
            imgExtra3 = (ImageView) view.findViewById(R.id.img_extra3);
            tvExtraSource = (TextView) view.findViewById(R.id.tv_extra_source);
            tvExtraVote = (TextView) view.findViewById(R.id.tv_extra_vote);
            itemTemplate = (RelativeLayout) view.findViewById(R.id.item_template);
            imgNewsTemplate = (ImageView) view.findViewById(R.id.img_news_template);
            tvTemplateTitle = (TextView) view.findViewById(R.id.tv_template_title);
            llTemplateGame = (LinearLayout) view.findViewById(R.id.ll_template_game);
            llTemplateGame1 = (LinearLayout) view.findViewById(R.id.ll_template_game1);
            imgTemplateGame1 = (ImageView) view.findViewById(R.id.img_template_game1);
            tvGame1Title = (TextView) view.findViewById(R.id.tv_game1_title);
            tvGame1Subtitle = (TextView) view.findViewById(R.id.tv_game1_subtitle);
            llTemplateGame2 = (LinearLayout) view.findViewById(R.id.ll_template_game2);
            imgTemplateGame2 = (ImageView) view.findViewById(R.id.img_template_game2);
            tvGame2Title = (TextView) view.findViewById(R.id.tv_game2_title);
            tvGame2Subtitle = (TextView) view.findViewById(R.id.tv_game2_subtitle);
            llTemplateGame3 = (LinearLayout) view.findViewById(R.id.ll_template_game3);
            imgTemplateGame3 = (ImageView) view.findViewById(R.id.img_template_game3);
            tvGame3Title = (TextView) view.findViewById(R.id.tv_game3_title);
            tvGame3Subtitle = (TextView) view.findViewById(R.id.tv_game3_subtitle);
            llTemplateGame4 = (LinearLayout) view.findViewById(R.id.ll_template_game4);
            imgTemplateGame4 = (ImageView) view.findViewById(R.id.img_template_game4);
            tvGame4Title = (TextView) view.findViewById(R.id.tv_game4_title);
            tvGame4Subtitle = (TextView) view.findViewById(R.id.tv_game4_subtitle);
        }
    }
}
