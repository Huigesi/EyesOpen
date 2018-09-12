package me.huigesi.eyesopen.mvp.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.base.BaseRecyclerViewAdapter;
import me.huigesi.eyesopen.app.utils.GlideUtils;
import me.huigesi.eyesopen.app.utils.Resolution;
import me.huigesi.eyesopen.mvp.model.entity.NbaBBSLightComment;

public class NbaBBSDetailLightView extends LinearLayout {
    @BindView(R.id.rv_nba_detail_light)
    RecyclerView mRvNbaDetailLight;
    private Unbinder mUnbinder;
    private LightAdapter mLightAdapter;

    public NbaBBSDetailLightView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_nba_detail_light, this,
                true);
        mUnbinder = ButterKnife.bind(this);
        mLightAdapter = new LightAdapter(context);
    }

    public void setData(List<NbaBBSLightComment.ListData> data) {
        mLightAdapter.setData(data, false);
        refreshUI();
    }


    private void refreshUI() {
        mRvNbaDetailLight.setLayoutManager(new LinearLayoutManager(getContext()));
        mRvNbaDetailLight.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.set(0, 0, 0, 1);
            }
        });
        mRvNbaDetailLight.setAdapter(mLightAdapter);
    }

    private class LightAdapter extends BaseRecyclerViewAdapter<NbaBBSLightComment.ListData> {

        public LightAdapter(Context context) {
            super(context);
        }

        @Override
        public RecyclerView.ViewHolder onCreate(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_nba_comment, null, false);
            view.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
            return new ViewHolder(view);
        }

        @Override
        public void onBind(RecyclerView.ViewHolder holder, int position, NbaBBSLightComment.ListData data) {
            if (holder instanceof ViewHolder) {
                int weight = Resolution.dipToPx(mContext, 35);
                GlideUtils.loadCircle(mContext, data.getUserImg(), ((ViewHolder) holder)
                        .imgNbaCommentUser, weight, weight);
                ((ViewHolder) holder).tvNbaCommentUser.setText(data.getUserName());
                ((ViewHolder) holder).tvNbaCommentTime.setText(data.getTime());
                String htmls = data.getContent();
                CharSequence charSequence = Html.fromHtml(htmls);
                ((ViewHolder) holder).tvNbaDetailComment.setText(charSequence);
                ((ViewHolder) holder).tvNbaCommentLight.setText("亮了(" + data.getLight_count() + ")");
                if (data.getQuote() != null && data.getQuote().size() > 0) {
                    ((ViewHolder) holder).llNbaCommentQuote.setVisibility(View.VISIBLE);
                    String quote = data.getQuote().get(0).getContent();
                    String userName = data.getQuote().get(0).getHeader().get(0);
                    CharSequence sequence = Html.fromHtml(quote);
                    CharSequence userNameSequence = Html.fromHtml(userName);
                    ((ViewHolder) holder).tvNbaDetailQuoteComment.setText(sequence);
                    ((ViewHolder) holder).tvNbaCommentQuoteUser.setText(userNameSequence);
                } else {
                    ((ViewHolder) holder).llNbaCommentQuote.setVisibility(View.GONE);
                }
            }
        }
    }

    protected class ViewHolder extends BaseRecyclerViewAdapter.Holder {
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
