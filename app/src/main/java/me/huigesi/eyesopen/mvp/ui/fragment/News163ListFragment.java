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
import android.widget.Toast;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.List;

import me.huigesi.eyesopen.app.base.BaseRecyclerFragment;
import me.huigesi.eyesopen.di.component.DaggerNews163ListComponent;
import me.huigesi.eyesopen.di.module.News163ListModule;
import me.huigesi.eyesopen.mvp.contract.News163ListContract;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.entity.News163;
import me.huigesi.eyesopen.mvp.presenter.News163ListPresenter;

import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.mvp.ui.adapter.ItemNewsAdapter;

import static com.jess.arms.utils.Preconditions.checkNotNull;


public class News163ListFragment extends BaseRecyclerFragment<News163ListPresenter> implements News163ListContract.View {
    public static final String NEWS163_ID = "mId";
    public static final String NEWS_TYPE = "NEWS_TYPE";
    public static final String POSITION = "POSITION";
    private ItemNewsAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;
    private String mId,mNewsType;
    public static News163ListFragment newInstance(String newsId, String newsType, int position) {
        News163ListFragment fragment = new News163ListFragment();
        Bundle args = new Bundle();
        args.putString(NEWS163_ID, newsId);
        args.putString(NEWS_TYPE, newsType);
        args.putInt(POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerNews163ListComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .news163ListModule(new News163ListModule(this))
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news163_list, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mId = getArguments().getString(NEWS163_ID);
        if (mId.equals(Api.HEADLINE_ID) ){
            mNewsType=Api.TYPE_HEADLINE;
        }else {
            mNewsType=Api.TYPE_LIST;
        }
        mPresenter.requestNews163(mNewsType,mId,true);
        mSrlNews.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                mPresenter.requestNews163(mNewsType,mId,true);
            }
        });
        mSrlNews.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                mPresenter.requestNews163(mNewsType,mId,false);
            }
        });
        mAdapter = new ItemNewsAdapter(getActivity());
        initRecycleView();
        mRvNews.setAdapter(mAdapter);
    }

    private void initRecycleView() {
        mLayoutManager=new LinearLayoutManager(getActivity());
        ArmsUtils.configRecyclerView(mRvNews,mLayoutManager);
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
    public void showData(List<News163> data) {
        if (data != null && data.size() > 0) {
            mAdapter.setData(data, true);
        }else {
            Toast.makeText(getActivity(), "没有数据", Toast.LENGTH_SHORT).show();
            mSrlNews.setNoMoreData(true);
        }
    }

    @Override
    public void showMoreData(List<News163> data) {
        if (data != null && data.size() > 0) {
            mAdapter.setData(data, false);
        }else {
            mSrlNews.setNoMoreData(true);
            Toast.makeText(getActivity(), "没有数据", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void endLoadMore() {
        mSrlNews.finishLoadMore(0);
    }
}
