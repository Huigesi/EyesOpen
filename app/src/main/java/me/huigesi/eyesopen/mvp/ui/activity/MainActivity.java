package me.huigesi.eyesopen.mvp.ui.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.di.component.DaggerMainComponent;
import me.huigesi.eyesopen.di.module.MainModule;
import me.huigesi.eyesopen.mvp.contract.MainContract;
import me.huigesi.eyesopen.mvp.presenter.MainPresenter;
import me.huigesi.eyesopen.mvp.ui.adapter.MyFragmentAdapter;
import me.huigesi.eyesopen.mvp.ui.fragment.NbaFragment;

import static com.jess.arms.utils.Preconditions.checkNotNull;


public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View ,
        ViewPager.OnPageChangeListener,View.OnClickListener{

    @BindView(R.id.img_menu)
    ImageView mImgMenu;
    @BindView(R.id.iv_title_news)
    ImageView mIvTitleNews;
    @BindView(R.id.iv_title_movie)
    ImageView mIvTitleMovie;
    @BindView(R.id.iv_title_video)
    ImageView mIvTitleVideo;
    @BindView(R.id.toolbars)
    Toolbar mToolbars;
    @BindView(R.id.vp_content)
    ViewPager mVpContent;
    @BindView(R.id.nav)
    NavigationView mNav;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerMainComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorTheme));
        }
        ArrayList<Fragment> mFragmentList = new ArrayList<>();
        mFragmentList.add(NbaFragment.newInstance());
        mFragmentList.add(NbaFragment.newInstance());
        mFragmentList.add(NbaFragment.newInstance());
        MyFragmentAdapter adapter = new MyFragmentAdapter(getSupportFragmentManager(),
                mFragmentList);
        mVpContent.setAdapter(adapter);
        mVpContent.setOffscreenPageLimit(2);
        mVpContent.addOnPageChangeListener(this);
        mIvTitleMovie.setOnClickListener(this);
        mIvTitleNews.setOnClickListener(this);
        mIvTitleVideo.setOnClickListener(this);

        setCurrentItem(0);
    }

    private void setCurrentItem(int i) {
        mVpContent.setCurrentItem(i);
        mIvTitleMovie.setSelected(false);
        mIvTitleVideo.setSelected(false);
        mIvTitleNews.setSelected(false);
        switch (i) {
            case 0:
                mIvTitleNews.setSelected(true);
                break;
            case 1:
                mIvTitleMovie.setSelected(true);
                break;
            case 2:
                mIvTitleVideo.setSelected(true);
                break;
        }
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

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
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        setCurrentItem(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_title_news:
                if (mVpContent.getCurrentItem() != 0) {
                    setCurrentItem(0);
                }
                break;
            case R.id.iv_title_movie:
                if (mVpContent.getCurrentItem() != 1) {
                    setCurrentItem(1);
                }
                break;
            case R.id.iv_title_video:
                if (mVpContent.getCurrentItem() != 2) {
                    setCurrentItem(2);
                }
                break;
            case R.id.img_menu:
                if (mDrawerLayout.isDrawerOpen(mNav)) {
                    mDrawerLayout.closeDrawer(mNav);
                } else {
                    mDrawerLayout.openDrawer(mNav);
                }
                break;
        }
    }
}
