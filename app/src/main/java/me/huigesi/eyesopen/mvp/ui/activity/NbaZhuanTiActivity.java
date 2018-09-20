package me.huigesi.eyesopen.mvp.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.jaeger.library.StatusBarUtil;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.utils.GlideUtils;
import me.huigesi.eyesopen.app.utils.swipeBack.SwipeBackActivity;
import me.huigesi.eyesopen.di.component.DaggerNbaZhuanTiComponent;
import me.huigesi.eyesopen.di.module.NbaZhuanTiModule;
import me.huigesi.eyesopen.mvp.contract.NbaZhuanTiContract;
import me.huigesi.eyesopen.mvp.model.entity.NbaZhuanti;
import me.huigesi.eyesopen.mvp.presenter.NbaZhuanTiPresenter;
import me.huigesi.eyesopen.mvp.ui.adapter.NbaZhuanTiAdapter;

import static com.jess.arms.utils.Preconditions.checkNotNull;


public class NbaZhuanTiActivity extends SwipeBackActivity<NbaZhuanTiPresenter> implements NbaZhuanTiContract.View {

    @BindView(R.id.mainbackdrop)
    ImageView mMainbackdrop;
    @BindView(R.id.tv_nba_zhuanti)
    TextView mTvNbaZhuanti;
    @BindView(R.id.tv_nba_zhuanti_sum)
    TextView mTvNbaZhuantiSum;
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
    public static final String NBA_NID = "NBA_NID";
    private String mNid;
    private NbaZhuanTiAdapter mNbaZhuanTiAdapter;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerNbaZhuanTiComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .nbaZhuanTiModule(new NbaZhuanTiModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_nba_zhuan_ti; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        StatusBarUtil.setTranslucentForCoordinatorLayout(NbaZhuanTiActivity.this, 0);
        mNid = getIntent().getStringExtra(NBA_NID);
        mNbaZhuanTiAdapter = new NbaZhuanTiAdapter(this);
        mPresenter.requestZhuanTi(mNid);
        mSrlNews.setOnRefreshListener(refreshLayout -> mPresenter.requestZhuanTi(mNid));
        mRvNews.setAdapter(mNbaZhuanTiAdapter);
        mRvNews.setLayoutManager(new LinearLayoutManager(this));
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
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Override
    public void showData(NbaZhuanti data) {
        if (data.getResult() != null) {
            GlideUtils.load(this, data.getResult().getImg_m(), mMainbackdrop);
            mTvNbaZhuanti.setText(data.getResult().getTitle());
            mTvNbaZhuantiSum.setText(data.getResult().getSummary());
            mNbaZhuanTiAdapter.setData(data.getResult().getGroups(), true);
        }
    }

    @Override
    public void endLoadMore() {
        mSrlNews.finishLoadMore(0);
    }

    @Override
    public Activity getActivity() {
        return this;
    }
}
