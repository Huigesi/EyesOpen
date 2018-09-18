package me.huigesi.eyesopen.mvp.ui.fragment;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.scwang.smartrefresh.header.MaterialHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.base.DefaultsFooter;
import me.huigesi.eyesopen.app.utils.Resolution;
import me.huigesi.eyesopen.di.component.DaggerNbaDetailComponent;
import me.huigesi.eyesopen.di.module.NbaDetailModule;
import me.huigesi.eyesopen.mvp.contract.NbaDetailContract;
import me.huigesi.eyesopen.mvp.model.entity.NbaNewsComment;
import me.huigesi.eyesopen.mvp.model.entity.NbaNewsDetail;
import me.huigesi.eyesopen.mvp.presenter.NbaDetailPresenter;
import me.huigesi.eyesopen.mvp.ui.adapter.NbaDetailAdapter;
import me.huigesi.eyesopen.mvp.ui.view.NbaDetailHeaderView;
import me.huigesi.eyesopen.mvp.ui.view.NbaDetailLightView;

import static com.jess.arms.utils.Preconditions.checkNotNull;


public class NbaDetailFragment extends BaseFragment<NbaDetailPresenter> implements NbaDetailContract.View {
    public static final String NBA_NID = "NBA_NID";

    Unbinder unbinder;
    @BindView(R.id.rv_news)
    RecyclerView mRvNews;
    @BindView(R.id.srl_news)
    SmartRefreshLayout mSrlNews;
    @BindView(R.id.img_top)
    ImageView mImgTop;

    private NbaDetailAdapter mNbaDetailAdapter;
    private NbaDetailHeaderView mNbaDetailHeaderView;
    private NbaDetailLightView mNbaDetailLightView;
    public String mNid;
    private LinearLayoutManager mLinearLayoutManager;

    public static NbaDetailFragment newInstance() {
        NbaDetailFragment fragment = new NbaDetailFragment();
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerNbaDetailComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .nbaDetailModule(new NbaDetailModule(this))
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mNbaDetailAdapter = new NbaDetailAdapter(getActivity());
        mSrlNews.setRefreshHeader(new MaterialHeader(getActivity()).setColorSchemeColors(
                getResources().getColor(R.color.colorTheme)));
        mSrlNews.setRefreshFooter(new DefaultsFooter(getActivity()).setFinishDuration(0));
        mRvNews.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRvNews.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                int line = Resolution.dipToPx(getContext(), 1);
                outRect.set(0, 0, 0, line);
            }
        });
        mNbaDetailHeaderView = new NbaDetailHeaderView(getActivity());
        mNbaDetailLightView = new NbaDetailLightView(getActivity());
        mNid = getActivity().getIntent().getStringExtra(NBA_NID);
        mPresenter.getNbaHeader(mNid);
        initRecycleView();
        mRvNews.setAdapter(mNbaDetailAdapter);
        mSrlNews.setOnRefreshListener(refreshLayout -> {
            mPresenter.getNbaHeader(mNid);
            mPresenter.requestComment(mNid, true);
        });

        mSrlNews.setOnLoadMoreListener(refreshLayout -> loadMoreData());
    }

    private void loadMoreData() {
        mPresenter.requestComment(mNid, false);
    }

    private void initRecycleView() {
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        ArmsUtils.configRecyclerView(mRvNews, mLinearLayoutManager);
    }

    @Override
    public void setData(@Nullable Object data) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {
        mSrlNews.finishRefresh(0);
    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {

    }

    @Override
    public void showHeader(NbaNewsDetail data) {
        mNbaDetailHeaderView.setData(data);
        mNbaDetailAdapter.setHeaderView(mNbaDetailHeaderView);
    }

    @Override
    public void showData(NbaNewsComment data) {
        if (data.getData() != null && data.getData().size() > 0) {
            mNbaDetailAdapter.setData(data.getData(), true);
            if (data.getLight_comments() != null && data.getLight_comments().size() > 0) {
                mNbaDetailLightView.setData(data);
                mNbaDetailAdapter.setLightCommentView(mNbaDetailLightView);
            } else {
                mNbaDetailAdapter.removeLightCommentView();
            }
        }
    }

    @Override
    public void showMoreData(NbaNewsComment data) {
        if (data != null && data.getData().size() > 0)
            mNbaDetailAdapter.setData(data.getData(), false);
        else
            mSrlNews.setNoMoreData(true);
    }

    @Override
    public void endLoadMore() {
        mSrlNews.finishLoadMore(0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
