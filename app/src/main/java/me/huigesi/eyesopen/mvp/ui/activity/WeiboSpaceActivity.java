package me.huigesi.eyesopen.mvp.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.scwang.smartrefresh.header.MaterialHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.base.DefaultsFooter;
import me.huigesi.eyesopen.app.utils.GlideUtils;
import me.huigesi.eyesopen.app.utils.SPreUtils;
import me.huigesi.eyesopen.app.utils.swipeBack.SwipeBackActivity;
import me.huigesi.eyesopen.di.component.DaggerWeiboSpaceComponent;
import me.huigesi.eyesopen.di.module.WeiboSpaceModule;
import me.huigesi.eyesopen.mvp.contract.WeiboSpaceContract;
import me.huigesi.eyesopen.mvp.model.entity.WeiboNews;
import me.huigesi.eyesopen.mvp.model.entity.WeiboUserSpace;
import me.huigesi.eyesopen.mvp.presenter.WeiboSpacePresenter;
import me.huigesi.eyesopen.mvp.ui.adapter.WeiboNewsAdapter;

import static com.jess.arms.utils.Preconditions.checkNotNull;


public class WeiboSpaceActivity extends SwipeBackActivity<WeiboSpacePresenter> implements WeiboSpaceContract.View {

    public static final String WEIBO_SPACE_UID = "WEIBO_SPACE_UID";

    @BindView(R.id.mainbackdrop)
    ImageView mMainbackdrop;
    @BindView(R.id.img_weibo_user_cover)
    ImageView mImgWeiboUserCover;
    @BindView(R.id.tv_weibo_user_name)
    TextView mTvWeiboUserName;
    @BindView(R.id.tv_weibo_user_intro)
    TextView mTvWeiboUserIntro;
    @BindView(R.id.tv_weibo_user_location)
    TextView mTvWeiboUserLocation;
    @BindView(R.id.tv_weibo_user_friends_count)
    TextView mTvWeiboUserFriendsCount;
    @BindView(R.id.tv_weibo_user_followers_count)
    TextView mTvWeiboUserFollowersCount;
    @BindView(R.id.iv_back)
    ImageView mIvBack;
    @BindView(R.id.tv_bar_title)
    TextView mTvBarTitle;
    @BindView(R.id.maincollapsing)
    CollapsingToolbarLayout mMaincollapsing;
    @BindView(R.id.mainappbar)
    AppBarLayout mMainappbar;
    @BindView(R.id.rv_news)
    RecyclerView mRvNews;
    @BindView(R.id.srl_news)
    SmartRefreshLayout mSrlNews;

    private String mUid;
    private WeiboNewsAdapter mAdapter;
    private LinearLayoutManager mLinearLayoutManager;
    private String mGsId;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerWeiboSpaceComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .weiboSpaceModule(new WeiboSpaceModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_weibo_space; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mUid = getIntent().getStringExtra(WEIBO_SPACE_UID);
        mGsId = SPreUtils.getWeiBoUserInfo(SPreUtils.WEIBO_GSID, this);
        mPresenter.requestHeader(mUid);
        mPresenter.requestUserNews(true, mGsId, mUid);
        mSrlNews.setRefreshHeader(new MaterialHeader(this).setColorSchemeColors(
                getResources().getColor(R.color.colorTheme)));
        mSrlNews.setRefreshFooter(new DefaultsFooter(this).setFinishDuration(0));
        mSrlNews.setOnRefreshListener(refreshLayout -> mPresenter.requestUserNews(true, mGsId, mUid));
        mSrlNews.setOnLoadMoreListener(refreshLayout -> loadMore());
        initRecycleView();
        mAdapter = new WeiboNewsAdapter(this, true);
        mRvNews.setAdapter(mAdapter);
    }

    private void initRecycleView() {
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        ArmsUtils.configRecyclerView(mRvNews, mLinearLayoutManager);
        mRvNews.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                outRect.set(0, 0, 0, ArmsUtils.dip2px(WeiboSpaceActivity.this, 5));
            }
        });
    }

    private void loadMore() {
        mPresenter.requestUserNews(false, mGsId, mUid);
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
        finish();
    }

    @Override
    public void showHeader(WeiboUserSpace data) {
        if (data != null) {
            int weight = ArmsUtils.dip2px(this, 100);
            runOnUiThread(() -> {
                GlideUtils.load(this, data.getCovers().get(0).getCover(), mMainbackdrop);
                GlideUtils.loadCircle(this, data.getAvatar_large(), mImgWeiboUserCover, weight, weight);
                mTvWeiboUserName.setText(data.getName());
                mTvWeiboUserIntro.setText(data.getDescription());
                mTvWeiboUserLocation.setText(data.getLocation());
                mTvWeiboUserFriendsCount.setText(data.getFriends_count() + " 关注");
                mTvWeiboUserFollowersCount.setText(data.getFollowers_count() + " 粉丝");
                mTvBarTitle.setText(data.getName() + "的微博");
            });
        }

    }

    @Override
    public void showData(WeiboNews data) {
        if (data.getStatuses() != null && data.getStatuses().size() > 0) {
            mAdapter.setData(data.getStatuses(), true);
        } else {
            Toast.makeText(this, "没有数据", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void showMoreData(WeiboNews data) {
        if (data.getStatuses() != null && data.getStatuses().size() > 0)
            mAdapter.setData(data.getStatuses(), false);
        else
            mSrlNews.setNoMoreData(true);
    }

    @Override
    public void endLoadMore() {
        mSrlNews.finishLoadMore(0);
    }

    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }
}
