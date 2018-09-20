package me.huigesi.eyesopen.mvp.ui.fragment;

import android.content.Intent;
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
import me.huigesi.eyesopen.app.base.BaseRecyclerFragment;
import me.huigesi.eyesopen.app.base.DefaultsFooter;
import me.huigesi.eyesopen.di.component.DaggerNbaComponent;
import me.huigesi.eyesopen.di.module.NbaModule;
import me.huigesi.eyesopen.mvp.contract.NbaContract;
import me.huigesi.eyesopen.mvp.model.entity.NbaNews;
import me.huigesi.eyesopen.mvp.presenter.NbaPresenter;
import me.huigesi.eyesopen.mvp.ui.adapter.NbaNewsAdapter;

import static com.jess.arms.utils.Preconditions.checkNotNull;


public class NbaFragment extends BaseRecyclerFragment<NbaPresenter> implements NbaContract.View {
    @BindView(R.id.rv_news)
    RecyclerView mRvNews;
    @BindView(R.id.srl_news)
    SmartRefreshLayout mSrlNews;
    @BindView(R.id.img_top)
    ImageView mImgTop;
    Unbinder unbinder;
    private NbaNewsAdapter mAdapter;
    private LinearLayoutManager mLinearLayoutManager;


    public static NbaFragment newInstance() {
        NbaFragment fragment = new NbaFragment();
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerNbaComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .nbaModule(new NbaModule(this))
                .build()
                .inject(this);
    }


    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mSrlNews.setRefreshHeader(new MaterialHeader(getActivity()).setColorSchemeColors(
                getResources().getColor(R.color.colorTheme)));
        mSrlNews.setRefreshFooter(new DefaultsFooter(getActivity()).setFinishDuration(0));
        mSrlNews.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                mPresenter.requestUsers(true);
            }
        });
        mSrlNews.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                loadMore();
            }
        });
        initRecycleView();
        mAdapter = new NbaNewsAdapter(getActivity());
        mRvNews.setAdapter(mAdapter);
    }

    private void loadMore() {
        mPresenter.requestUsers(false);
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
        if (mSrlNews != null)
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
    public void showData(NbaNews data) {
        if (data.getResult().getData() != null && data.getResult().getData().size() > 0)
            mAdapter.setData(data.getResult().getData(), true);
    }

    @Override
    public void showMoreData(NbaNews data) {
        if (data.getResult().getData() != null && data.getResult().getData().size() > 0)
            mAdapter.setData(data.getResult().getData(), false);
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
