package me.huigesi.eyesopen.mvp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.base.BaseRecyclerViewAdapter;
import me.huigesi.eyesopen.app.utils.GlideUtils;
import me.huigesi.eyesopen.app.utils.Resolution;
import me.huigesi.eyesopen.mvp.model.entity.NbaNewsComment;

public class NbaDetailAdapter extends BaseRecyclerViewAdapter<NbaNewsComment.DataBean> {
    private View mLightCommentView;
    public static final int ITEM_TYPE_LIGHT = 3;
    public static final int ITEM_TYPE_COMMENT = 4;

    public void setLightCommentView(View lightCommentView) {
        this.mLightCommentView = lightCommentView;
        notifyDataSetChanged();
    }

    public void removeLightCommentView() {
        this.mLightCommentView = null;
        notifyDataSetChanged();
    }

    public NbaDetailAdapter(Context context) {
        super(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreate(ViewGroup parent, int viewType) {
        if (viewType == ITEM_TYPE_LIGHT && mLightCommentView != null) {
            return new Holder(mLightCommentView);
        } else if (viewType == ITEM_TYPE_COMMENT) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.view_nba_detail_comment, parent, false);
            view.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
            return new Holder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_nba_comment, null, false);
            view.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
            return new ViewHolder(view);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (mLightCommentView != null && position == 1) {
            return ITEM_TYPE_LIGHT;
        } else if (mLightCommentView == null && position == 1) {
            return ITEM_TYPE_COMMENT;
        } else if (mLightCommentView != null && position == 2) {
            return ITEM_TYPE_COMMENT;
        } else {
            return super.getItemViewType(position);
        }
    }

    @Override
    public void onBind(RecyclerView.ViewHolder holder, int position,
                       NbaNewsComment.DataBean data) {
        if (holder instanceof ViewHolder) {
            int weight = Resolution.dipToPx(mContext, 35);
            GlideUtils.loadCircle(mContext, data.getHeader(), ((ViewHolder) holder).imgNbaCommentUser,
                    weight, weight);
            ((ViewHolder) holder).tvNbaCommentUser.setText(data.getUser_name());
            ((ViewHolder) holder).tvNbaCommentTime.setText(data.getFormat_time());
            String htmls = data.getContent();
            CharSequence charSequence = Html.fromHtml(htmls);
            ((ViewHolder) holder).tvNbaDetailComment.setText(charSequence);
            ((ViewHolder) holder).tvNbaCommentLight.setText("亮了(" + data.getLight_count() + ")");
            if (data.getQuote_data() != null) {
                ((ViewHolder) holder).llNbaCommentQuote.setVisibility(View.VISIBLE);
                String quote = data.getQuote_data().getContent();
                CharSequence sequence = Html.fromHtml(quote);
                ((ViewHolder) holder).tvNbaDetailQuoteComment.setText(sequence);
                ((ViewHolder) holder).tvNbaCommentQuoteUser.setText(data.getQuote_data().getUser_name());
            } else {
                ((ViewHolder) holder).llNbaCommentQuote.setVisibility(View.GONE);
            }
        }
    }

    protected class ViewHolder extends Holder {
        private ImageView imgNbaCommentUser;
        private TextView tvNbaCommentUser;
        private TextView tvNbaCommentTime;
        private LinearLayout llNbaCommentQuote;
        private TextView tvNbaCommentQuoteUser;
        private TextView tvNbaDetailQuoteComment;
        private TextView tvNbaDetailComment;
        private LinearLayout llNbaCommentLight;
        private TextView tvNbaCommentLight;

        public ViewHolder(View view) {
            super(view);
            imgNbaCommentUser = (ImageView) view.findViewById(R.id.img_nba_comment_user);
            tvNbaCommentUser = (TextView) view.findViewById(R.id.tv_nba_comment_user);
            tvNbaCommentTime = (TextView) view.findViewById(R.id.tv_nba_comment_time);
            llNbaCommentQuote = (LinearLayout) view.findViewById(R.id.ll_nba_comment_quote);
            tvNbaCommentQuoteUser = (TextView) view.findViewById(R.id.tv_nba_comment_quote_user);
            tvNbaDetailQuoteComment = (TextView) view.findViewById(R.id.wv_nba_detail_quote_comment);
            tvNbaDetailComment = (TextView) view.findViewById(R.id.wv_nba_detail_comment);
            llNbaCommentLight = (LinearLayout) view.findViewById(R.id.ll_nba_comment_light);
            tvNbaCommentLight = (TextView) view.findViewById(R.id.tv_nba_comment_light);
        }
    }
}
