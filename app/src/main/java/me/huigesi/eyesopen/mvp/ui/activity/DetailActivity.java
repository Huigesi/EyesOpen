package me.huigesi.eyesopen.mvp.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.jaeger.library.StatusBarUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.utils.UIUtils;
import me.huigesi.eyesopen.app.utils.swipeBack.SwipeBackActivity;

public class DetailActivity extends SwipeBackActivity {
    private static final String TAG = "DetailActivity";
    public static final String SHOW_TOOLBAR = "SHOW_TOOLBAR";
    @BindView(R.id.iv_back)
    ImageView mIvBack;
    @BindView(R.id.tv_bar_title)
    TextView mTvBarTitle;
    @BindView(R.id.main_content)
    FrameLayout mMainContent;
    @BindView(R.id.toolbar_detail)
    Toolbar mToolbarDetail;
    private Fragment mFragment;
    private int mAlpha = StatusBarUtil.DEFAULT_STATUS_BAR_ALPHA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        StatusBarUtil.setTranslucentForCoordinatorLayout(DetailActivity.this,0);
        ButterKnife.bind(this);
        String className = getIntent().getStringExtra(UIUtils.FRAGMENT_CLASS);
        boolean showToolBar = getIntent().getBooleanExtra(SHOW_TOOLBAR, true);
        if (showToolBar) {
            mToolbarDetail.setVisibility(View.VISIBLE);
        }else {
            mToolbarDetail.setVisibility(View.GONE);
        }
        try {
            mFragment = (Fragment) Class.forName(className).newInstance();
            if (mFragment != null) {
                mFragment.setArguments(savedInstanceState);
            }
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.main_content, mFragment);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        initToolBar();
    }

    private void initToolBar() {
        mIvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mTvBarTitle.setText("闲阅");
    }
}
