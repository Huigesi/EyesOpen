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
import android.widget.Toast;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.scwang.smartrefresh.header.MaterialHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.base.DefaultsFooter;
import me.huigesi.eyesopen.di.component.DaggerNbaBBSComponent;
import me.huigesi.eyesopen.di.module.NbaBBSModule;
import me.huigesi.eyesopen.mvp.contract.NbaBBSContract;
import me.huigesi.eyesopen.mvp.model.entity.NbaBBSComment;
import me.huigesi.eyesopen.mvp.model.entity.NbaBBSLightComment;
import me.huigesi.eyesopen.mvp.presenter.NbaBBSPresenter;
import me.huigesi.eyesopen.mvp.ui.adapter.NbaBBSDetailAdapter;
import me.huigesi.eyesopen.mvp.ui.view.NbaBBSDetailLightView;
import me.huigesi.eyesopen.mvp.ui.view.NbaBBSHeaderView;

import static com.jess.arms.utils.Preconditions.checkNotNull;


public class NbaBBSFragment extends BaseFragment<NbaBBSPresenter> implements NbaBBSContract.View {
    public static final String NBA_H5_TID = "NBA_H5_TID";
    public String tid;
    @BindView(R.id.rv_news)
    RecyclerView mRvNews;
    @BindView(R.id.srl_news)
    SmartRefreshLayout mSrlNews;
    @BindView(R.id.img_top)
    ImageView mImgTop;
    Unbinder unbinder;
    private NbaBBSHeaderView mNbaBBSHeaderView;
    private NbaBBSDetailLightView mNbaDetailLightView;
    private NbaBBSDetailAdapter mNbaBBSDetailAdapter;
    private LinearLayoutManager mLinearLayoutManager;

    public static NbaBBSFragment newInstance() {
        NbaBBSFragment fragment = new NbaBBSFragment();
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerNbaBBSComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .nbaBBSModule(new NbaBBSModule(this))
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        tid = getActivity().getIntent().getStringExtra(NBA_H5_TID);
        mPresenter.requestBBSComment(tid, true);
        mPresenter.requestLightBBSComment(tid, true);
        mNbaBBSDetailAdapter = new NbaBBSDetailAdapter(getActivity());
        mNbaBBSHeaderView = new NbaBBSHeaderView(getActivity());
        mNbaDetailLightView = new NbaBBSDetailLightView(getActivity());
        mSrlNews.setRefreshHeader(new MaterialHeader(getActivity()).setColorSchemeColors(
                getResources().getColor(R.color.colorTheme)));
        mSrlNews.setRefreshFooter(new DefaultsFooter(getActivity()).setFinishDuration(0));
        mNbaBBSHeaderView.setData(tid);
        mNbaBBSDetailAdapter.setHeaderView(mNbaBBSHeaderView);
        mRvNews.setAdapter(mNbaBBSDetailAdapter);
        mRvNews.setLayoutManager(new LinearLayoutManager(getActivity()));
        initRecycleView();
        mSrlNews.setOnRefreshListener(refreshLayout -> {
            mPresenter.requestBBSComment(tid, true);
            mPresenter.requestLightBBSComment(tid, true);
        });

        mSrlNews.setOnLoadMoreListener(refreshLayout -> loadMoreData());
    }

    private void loadMoreData() {
        mPresenter.requestBBSComment(tid, false);
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
    public void showCommentData(NbaBBSComment data) {
        if (data.getResult().getList() != null && data.getResult().getList().size() > 0) {
            mNbaBBSDetailAdapter.setData(data.getResult().getList(), true);
        } else {
            Toast.makeText(getActivity(), "没有数据", Toast.LENGTH_SHORT).show();
        }
        mNbaBBSHeaderView.setData(tid);
        mNbaBBSDetailAdapter.setHeaderView(mNbaBBSHeaderView);
    }

    @Override
    public void showCommentMoreData(NbaBBSComment data) {
        if (data.getResult().getList() != null && data.getResult().getList().size() > 0)
            mNbaBBSDetailAdapter.setData(data.getResult().getList(), false);
        else
            mSrlNews.setNoMoreData(true);
    }

    @Override
    public void showLightCommentData(NbaBBSLightComment data) {
        if (data.getList() != null && data.getList().size() > 0) {
            mNbaDetailLightView.setData(data.getList());
            mNbaBBSDetailAdapter.setLightCommentView(mNbaDetailLightView);
        } else {
            mNbaBBSDetailAdapter.removeLightCommentView();
        }
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
