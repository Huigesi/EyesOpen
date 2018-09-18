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
import me.huigesi.eyesopen.app.base.BaseRecyclerFragment;
import me.huigesi.eyesopen.app.base.DefaultsFooter;
import me.huigesi.eyesopen.di.component.DaggerWeiboComponent;
import me.huigesi.eyesopen.di.module.WeiboModule;
import me.huigesi.eyesopen.mvp.contract.WeiboContract;
import me.huigesi.eyesopen.mvp.model.entity.WeiboNews;
import me.huigesi.eyesopen.mvp.presenter.WeiboPresenter;
import me.huigesi.eyesopen.mvp.ui.adapter.WeiboNewsAdapter;

import static com.jess.arms.utils.Preconditions.checkNotNull;


public class WeiboFragment extends BaseRecyclerFragment<WeiboPresenter> implements WeiboContract.View {

    @BindView(R.id.rv_news)
    RecyclerView mRvNews;
    @BindView(R.id.srl_news)
    SmartRefreshLayout mSrlNews;
    @BindView(R.id.img_top)
    ImageView mImgTop;
    Unbinder unbinder;
    private LinearLayoutManager mLinearLayoutManager;
    private WeiboNewsAdapter mAdapter;

    public static WeiboFragment newInstance() {
        WeiboFragment fragment = new WeiboFragment();
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerWeiboComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .weiboModule(new WeiboModule(this))
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
                mPresenter.requestWeibos(true);
            }
        });
        mSrlNews.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                loadMore();
            }
        });
        initRecycleView();
        mAdapter = new WeiboNewsAdapter(getActivity(), false);
        mRvNews.setAdapter(mAdapter);
    }

    private void initRecycleView() {
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        ArmsUtils.configRecyclerView(mRvNews, mLinearLayoutManager);
        mRvNews.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                outRect.set(0, 0, 0, ArmsUtils.dip2px(getActivity(), 5));
            }
        });
    }

    private void loadMore() {
        mPresenter.requestWeibos(false);
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
    public void showData(WeiboNews data) {
        if (data != null && data.getStatuses() != null && data.getStatuses().size() > 0)
            mAdapter.setData(data.getStatuses(), true);
    }

    @Override
    public void showMoreData(WeiboNews data) {
        if (data != null && data.getStatuses().size() > 0)
            mAdapter.setData(data.getStatuses(), false);
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
