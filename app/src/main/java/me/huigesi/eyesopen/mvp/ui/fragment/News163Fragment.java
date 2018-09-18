package me.huigesi.eyesopen.mvp.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.utils.Resolution;
import me.huigesi.eyesopen.app.utils.UIUtils;
import me.huigesi.eyesopen.di.component.DaggerNews163Component;
import me.huigesi.eyesopen.di.module.News163Module;
import me.huigesi.eyesopen.mvp.contract.News163Contract;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.entity.Column;
import me.huigesi.eyesopen.mvp.presenter.News163Presenter;
import me.huigesi.eyesopen.mvp.ui.adapter.MyFragmentAdapter;

import static com.jess.arms.utils.Preconditions.checkNotNull;


public class News163Fragment extends BaseFragment<News163Presenter> implements News163Contract.View {

    @BindView(R.id.img_column_add)
    ImageView mImgColumnAdd;
    @BindView(R.id.tl_news)
    TabLayout mTlNews;
    @BindView(R.id.vp_news)
    ViewPager mVpNews;
    Unbinder unbinder;
    private List<Fragment> mFragments = new ArrayList<>();
    private List<String> mFragmentTitles = new ArrayList<>();

    public static News163Fragment newInstance() {
        News163Fragment fragment = new News163Fragment();
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerNews163Component //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .news163Module(new News163Module(this))
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news163, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mPresenter.operateColumnDb();
        setViewPager();
        //预加载界面数
        mVpNews.setOffscreenPageLimit(3);
        mTlNews.setupWithViewPager(mVpNews);
        int marge = Resolution.dipToPx(getContext(), 25);
        UIUtils.setUpIndicatorWidth(mTlNews, marge, marge);
        mImgColumnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIUtils.startColumnActivity(getActivity());
            }
        });
    }

    private void setViewPager() {
        /*fragments.add(News163ListFragment.newInstance(Api.HEADLINE_ID));
        fragments.add(News163ListFragment.newInstance(Api.JOKE_ID));
        fragments.add(News163ListFragment.newInstance(Api.GAME_ID));
        fragmentTitles.add("头条");
        fragmentTitles.add("笑话");
        fragmentTitles.add("游戏");
        MyFragmentAdapter adapter = new MyFragmentAdapter(getChildFragmentManager(),
                fragments, fragmentTitles);
        mVpNews.setAdapter(adapter);*/

    }

    @Override
    public void setData(@Nullable Object data) {

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

    @Override
    public void initViewPager(List<Column> data) {
        if (data != null) {
            for (Column news : data) {
                final News163ListFragment fragment = News163ListFragment
                        .newInstance(news.getId(), news.getGroup(),
                                news.getNewsColumnIndex());

                mFragments.add(fragment);
                mFragmentTitles.add(news.getName());
            }

            if (mVpNews.getAdapter() == null) {
                // 初始化ViewPager
                MyFragmentAdapter adapter = new MyFragmentAdapter(getActivity().getSupportFragmentManager(),
                        mFragments, mFragmentTitles);
                mVpNews.setAdapter(adapter);
            } else {
                final MyFragmentAdapter adapter = (MyFragmentAdapter) mVpNews.getAdapter();
                adapter.updateFragments(mFragments, mFragmentTitles);
            }
            mVpNews.setCurrentItem(0, false);
            mTlNews.setupWithViewPager(mVpNews);
            mTlNews.setScrollPosition(0, 0, true);
            // 根据Tab的长度动态设置TabLayout的模式
            UIUtils.dynamicSetTabLayoutMode(mTlNews);


            setOnTabSelectEvent(mVpNews, mTlNews);

        } else {
            Toast.makeText(getActivity(), "数据异常", Toast.LENGTH_SHORT).show();
        }
    }
    public void setOnTabSelectEvent(final ViewPager viewPager, final TabLayout tabLayout) {
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition(), true);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
