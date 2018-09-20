package me.huigesi.eyesopen.mvp.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import me.huigesi.eyesopen.app.base.BaseRecyclerFragment;
import me.huigesi.eyesopen.app.utils.SPreUtils;
import me.huigesi.eyesopen.di.component.DaggerWeiboDetailComponent;
import me.huigesi.eyesopen.di.module.WeiboDetailModule;
import me.huigesi.eyesopen.mvp.contract.WeiboDetailContract;
import me.huigesi.eyesopen.mvp.model.entity.WeiboDetail;
import me.huigesi.eyesopen.mvp.presenter.WeiboDetailPresenter;

import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.mvp.ui.adapter.WeiBoDetailAdapter;
import me.huigesi.eyesopen.mvp.ui.view.WeiBoDetailHeaderView;

import static com.jess.arms.utils.Preconditions.checkNotNull;


public class WeiboDetailFragment extends BaseRecyclerFragment<WeiboDetailPresenter> implements WeiboDetailContract.View {
    public static final String WEIBO_ID = "WEIBO_ID";
    private String mId, mGsid;
    private WeiBoDetailAdapter mWeiBoDetailAdapter;
    private WeiBoDetailHeaderView mWeiBoDetailHeaderView;

    public static WeiboDetailFragment newInstance() {
        WeiboDetailFragment fragment = new WeiboDetailFragment();
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerWeiboDetailComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .weiboDetailModule(new WeiboDetailModule(this))
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_weibo_detail, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mGsid = SPreUtils.getWeiBoUserInfo(SPreUtils.WEIBO_GSID, getActivity());
        mId = getActivity().getIntent().getStringExtra(WEIBO_ID);
        mWeiBoDetailAdapter = new WeiBoDetailAdapter(getActivity());
        mWeiBoDetailHeaderView = new WeiBoDetailHeaderView(getActivity());
        mRvNews.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRvNews.setAdapter(mWeiBoDetailAdapter);
        mSrlNews.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                mPresenter.requestWeiboDetail(mId, mGsid, true);
            }
        });
        mSrlNews.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                loadMoreComment();
            }
        });
        mPresenter.requestWeiboDetail(mGsid, mId, true);
    }

    private void loadMoreComment() {
        mPresenter.requestWeiboDetail(mId, mGsid, false);
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
    public void showData(WeiboDetail data) {
        if (data.getStatus().getMblogtypename() != null) {
            mWeiBoDetailHeaderView.setData(data);
            mWeiBoDetailAdapter.setHeaderView(mWeiBoDetailHeaderView);
        } else {
        }
        if (data.getRoot_comments() != null && data.getRoot_comments().size() > 0) {
            mWeiBoDetailAdapter.setData(data.getRoot_comments(), true);
        } else {
            mSrlNews.setNoMoreData(true);
        }
    }

    @Override
    public void showMoreData(WeiboDetail data) {
        if (data.getRoot_comments() != null && data.getRoot_comments().size() > 0) {
            mWeiBoDetailAdapter.setData(data.getRoot_comments(), false);
        } else {
            mSrlNews.setNoMoreData(true);
        }
    }

    @Override
    public void endLoadMore() {
        mSrlNews.finishLoadMore(0);
    }
}
