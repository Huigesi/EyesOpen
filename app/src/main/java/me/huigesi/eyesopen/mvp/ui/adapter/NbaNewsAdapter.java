package me.huigesi.eyesopen.mvp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.base.BaseRecyclerViewAdapter;
import me.huigesi.eyesopen.app.utils.GlideUtils;
import me.huigesi.eyesopen.app.utils.RegularUtils;
import me.huigesi.eyesopen.app.utils.Resolution;
import me.huigesi.eyesopen.app.utils.UIUtils;
import me.huigesi.eyesopen.mvp.model.entity.NbaNews;

public class NbaNewsAdapter extends BaseRecyclerViewAdapter<NbaNews.ResultBean.DataBean> {

    public NbaNewsAdapter(Context context) {
        super(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreate(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_nba, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBind(RecyclerView.ViewHolder holder, int position, final NbaNews.ResultBean.DataBean data) {
        if (holder instanceof ViewHolder) {
            if (data == null) {
                return;
            }
            int weight = Resolution.dipToPx(mContext, 100);
            int height = Resolution.dipToPx(mContext, 80);
            if (data.getThumbs() != null && data.getBadge() == null) {
                ((ViewHolder) holder).llNbaThumbs.setVisibility(View.VISIBLE);
                ((ViewHolder) holder).llNbaDefault.setVisibility(View.GONE);
                ((ViewHolder) holder).tvNbaThumbs.setText(data.getTitle());
                GlideUtils.load(mContext, data.getThumbs().get(0), ((ViewHolder) holder).imgNbaThumbs1);
                GlideUtils.load(mContext, data.getThumbs().get(1), ((ViewHolder) holder).imgNbaThumbs2);
                GlideUtils.load(mContext, data.getThumbs().get(2), ((ViewHolder) holder).imgNbaThumbs3);
                if (TextUtils.isEmpty(data.getLights())||data.getLights().equals("0")) {
                    ((ViewHolder) holder).llNbaLightThumbs.setVisibility(View.GONE);
                } else {
                    ((ViewHolder) holder).llNbaLightThumbs.setVisibility(View.VISIBLE);
                    ((ViewHolder) holder).tvNbaLightThumbs.setText(data.getLights());
                }
                ((ViewHolder) holder).tvNbaCommentThumbs.setText(data.getReplies());
            } else {
                ((ViewHolder) holder).llNbaThumbs.setVisibility(View.GONE);
                ((ViewHolder) holder).llNbaDefault.setVisibility(View.VISIBLE);
                ((ViewHolder) holder).tvNba.setText(data.getTitle());
                GlideUtils.load(mContext, data.getImg(), ((ViewHolder) holder).imgNba, weight, height);
                if (TextUtils.isEmpty(data.getLights())||data.getLights().equals("0")) {
                    ((ViewHolder) holder).llNbaLight.setVisibility(View.GONE);
                } else {
                    ((ViewHolder) holder).llNbaLight.setVisibility(View.VISIBLE);
                    ((ViewHolder) holder).tvNbaLight.setText(data.getLights());
                }
                ((ViewHolder) holder).tvNbaComment.setText(data.getReplies());
            }

            holder.itemView.setOnClickListener(v -> {
                if (data.getType() == 1) {
                    UIUtils.startNbaNewsFragment(mContext, data.getNid());
                } else if (data.getType() == 2) {
                    UIUtils.startNbaZhuanTiActivity(mContext, data.getNid());
                } else if (data.getType() == 5) {
                    UIUtils.startNbaH5Fragment(mContext, RegularUtils.getTid(data.getLink()));
                } else if (data.getType() == 3) {
                    /*List<ImageInfo> imageInfoList = new ArrayList<>();
                    ImageInfo imageInfo;
                    for (String image : data.getThumbs()) {
                        imageInfo = new ImageInfo();
                        imageInfo.setOriginUrl(image);// 原图
                        imageInfo.setThumbnailUrl(
                                image);// 缩略图，实际使用中，根据需求传入缩略图路径。如果没有缩略图url，可以将两项设置为一样，并隐藏查看原图按钮即可。
                        imageInfoList.add(imageInfo);
                        imageInfo = null;
                    }
                    ImagePreview
                            .getInstance()
                            .setContext(mContext)
                            .setIndex(0)
                            .setImageInfoList(imageInfoList)
                            .setShowDownButton(true)
                            .setLoadStrategy(ImagePreview.LoadStrategy.NetworkAuto)
                            .setFolderName("IdleReader")
                            .setScaleLevel(1, 3, 8)
                            .setZoomTransitionDuration(300)
                            .start();*/
                }
            });
        }
    }

    protected class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout llNbaDefault;
        private ImageView imgNba;
        private TextView tvNba;
        private LinearLayout llNbaLight;
        private TextView tvNbaLight;
        private LinearLayout llNbaComment;
        private TextView tvNbaComment;
        private LinearLayout llNbaThumbs;
        private TextView tvNbaThumbs;
        private ImageView imgNbaThumbs1;
        private ImageView imgNbaThumbs2;
        private ImageView imgNbaThumbs3;
        private LinearLayout llNbaLightThumbs;
        private TextView tvNbaLightThumbs;
        private LinearLayout llNbaCommentThumbs;
        private TextView tvNbaCommentThumbs;

        public ViewHolder(View view) {
            super(view);
            llNbaDefault = (LinearLayout) view.findViewById(R.id.ll_nba_default);
            imgNba = (ImageView) view.findViewById(R.id.img_nba);
            tvNba = (TextView) view.findViewById(R.id.tv_nba);
            llNbaLight = (LinearLayout) view.findViewById(R.id.ll_nba_light);
            tvNbaLight = (TextView) view.findViewById(R.id.tv_nba_light);
            llNbaComment = (LinearLayout) view.findViewById(R.id.ll_nba_comment);
            tvNbaComment = (TextView) view.findViewById(R.id.tv_nba_comment);
            llNbaThumbs = (LinearLayout) view.findViewById(R.id.ll_nba_thumbs);
            tvNbaThumbs = (TextView) view.findViewById(R.id.tv_nba_thumbs);
            imgNbaThumbs1 = (ImageView) view.findViewById(R.id.img_nba_thumbs1);
            imgNbaThumbs2 = (ImageView) view.findViewById(R.id.img_nba_thumbs2);
            imgNbaThumbs3 = (ImageView) view.findViewById(R.id.img_nba_thumbs3);
            llNbaLightThumbs = (LinearLayout) view.findViewById(R.id.ll_nba_light_thumbs);
            tvNbaLightThumbs = (TextView) view.findViewById(R.id.tv_nba_light_thumbs);
            llNbaCommentThumbs = (LinearLayout) view.findViewById(R.id.ll_nba_comment_thumbs);
            tvNbaCommentThumbs = (TextView) view.findViewById(R.id.tv_nba_comment_thumbs);
        }
    }
}
