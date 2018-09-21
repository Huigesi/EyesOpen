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
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jaeger.library.StatusBarUtil;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.tencent.connect.UserInfo;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.utils.GlideUtils;
import me.huigesi.eyesopen.app.utils.Resolution;
import me.huigesi.eyesopen.app.utils.bigImgViewPager.glide.ImageLoader;
import me.huigesi.eyesopen.app.utils.bigImgViewPager.tool.ToastUtil;
import me.huigesi.eyesopen.di.component.DaggerMainComponent;
import me.huigesi.eyesopen.di.module.MainModule;
import me.huigesi.eyesopen.mvp.contract.MainContract;
import me.huigesi.eyesopen.mvp.presenter.MainPresenter;
import me.huigesi.eyesopen.mvp.ui.adapter.MyFragmentAdapter;
import me.huigesi.eyesopen.mvp.ui.fragment.NbaFragment;
import me.huigesi.eyesopen.mvp.ui.fragment.News163Fragment;
import me.huigesi.eyesopen.mvp.ui.fragment.WeiboFragment;

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
    ActionBarDrawerToggle mToggle;
    private Tencent mTencent;
    private UserInfo mUserInfo;
    private ImageView img_person;
    private BaseUiListener mIUiListener;
    private TextView mUserName;
    private static final String APP_ID = "1105602574";

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
       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorTheme));
        }*/
        StatusBarUtil.setColor(MainActivity.this, getResources().getColor(R.color.colorTheme));
        StatusBarUtil.setColorNoTranslucentForDrawerLayout(MainActivity.this, mDrawerLayout,
                getResources().getColor(R.color.colorTheme));
        View headerView = mNav.getHeaderView(0);
        setDrawerToggle();
        img_person = (ImageView) headerView.findViewById(R.id.person);
        mUserName = (TextView) headerView.findViewById(R.id.tv_user_name);
        mTencent = Tencent.createInstance(APP_ID, MainActivity.this.getApplicationContext());
        ArrayList<Fragment> mFragmentList = new ArrayList<>();
        mFragmentList.add(News163Fragment.newInstance());
        mFragmentList.add(WeiboFragment.newInstance());
        mFragmentList.add(NbaFragment.newInstance());
        MyFragmentAdapter adapter = new MyFragmentAdapter(getSupportFragmentManager(),
                mFragmentList);
        mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
        mNav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_Setting:
                        break;
                    case R.id.menu_Login_QQ:
                        mTencent.login(MainActivity.this, "all", new BaseUiListener());
                        break;
                    /*case R.id.menu_Login_WeiBo:
                        UIUtils.startWeiBoLoginActivity(MainActivity.this);
                        break;*/
                    case R.id.menu_Clear:
                        ImageLoader.cleanDiskCache(MainActivity.this);
                        ToastUtil.getInstance()._short(MainActivity.this, "磁盘缓存已成功清除");
                        break;
                    case R.id.menu_AboutUs:
                        break;
                }
                mDrawerLayout.closeDrawer(mNav);
                return true;
            }
        });
        mVpContent.setAdapter(adapter);
        mVpContent.setOffscreenPageLimit(2);
        mVpContent.addOnPageChangeListener(this);
        mIvTitleMovie.setOnClickListener(this);
        mIvTitleNews.setOnClickListener(this);
        mIvTitleVideo.setOnClickListener(this);
        mImgMenu.setOnClickListener(this);
        setCurrentItem(0);
    }

    private void setDrawerToggle() {
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbars,
                0, 0);
        mDrawerLayout.addDrawerListener(mToggle);
        /*同步drawerlayout的状态*/
        mToggle.syncState();
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
    /**
     * 自定义监听器实现IUiListener接口后，需要实现的3个方法
     * onComplete完成 onError错误 onCancel取消
     */
    private class BaseUiListener implements IUiListener {

        @Override
        public void onComplete(Object response) {
            Toast.makeText(MainActivity.this, "授权成功", Toast.LENGTH_SHORT).show();
            Log.e(TAG, "response:" + response);
            JSONObject obj = (JSONObject) response;
            try {
                String openID = obj.getString("openid");
                String accessToken = obj.getString("access_token");
                String expires = obj.getString("expires_in");
                mTencent.setOpenId(openID);
                mTencent.setAccessToken(accessToken, expires);
                QQToken qqToken = mTencent.getQQToken();
                mUserInfo = new UserInfo(getApplicationContext(), qqToken);
                mUserInfo.getUserInfo(new IUiListener() {
                    @Override
                    public void onComplete(Object response) {
                        Log.e(TAG, "登录成功" + response.toString());
                        try {
                            int weight = Resolution.dipToPx(MainActivity.this, 72);
                            GlideUtils.loadCircle(MainActivity.this,
                                    ((JSONObject) response).getString("figureurl_1"),
                                    img_person, weight, weight);
                            mUserName.setText(((JSONObject) response).getString("nickname"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(UiError uiError) {
                        Log.e(TAG, "登录失败" + uiError.toString());
                    }

                    @Override
                    public void onCancel() {
                        Log.e(TAG, "登录取消");

                    }
                });
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onError(UiError uiError) {
            Toast.makeText(MainActivity.this, "授权失败", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onCancel() {
            Toast.makeText(MainActivity.this, "授权取消", Toast.LENGTH_SHORT).show();

        }

    }

    /**
     * 在调用Login的Activity或者Fragment中重写onActivityResult方法
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case Constants.REQUEST_LOGIN:
                Tencent.onActivityResultData(requestCode, resultCode, data, mIUiListener);
                break;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
