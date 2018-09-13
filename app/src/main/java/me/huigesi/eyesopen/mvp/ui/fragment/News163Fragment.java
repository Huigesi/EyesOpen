package me.huigesi.eyesopen.mvp.ui.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.utils.Resolution;
import me.huigesi.eyesopen.app.utils.UIUtils;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.ui.adapter.MyFragmentAdapter;


public class News163Fragment extends Fragment {

    @BindView(R.id.tl_news)
    TabLayout mTlNews;
    @BindView(R.id.vp_news)
    ViewPager mVpNews;
    Unbinder unbinder;
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> fragmentTitles = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news163, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    public static News163Fragment newInstance() {
        News163Fragment fragment = new News163Fragment();
        return fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setViewPager();
        //预加载界面数
        mVpNews.setOffscreenPageLimit(3);
        mTlNews.setupWithViewPager(mVpNews);
        int marge = Resolution.dipToPx(getContext(), 25);
        UIUtils.setUpIndicatorWidth(mTlNews, marge, marge);
    }

    private void setViewPager() {
        fragments.add(News163ListFragment.newInstance(Api.HEADLINE_ID));
        fragments.add(News163ListFragment.newInstance(Api.JOKE_ID));
        fragments.add(News163ListFragment.newInstance(Api.GAME_ID));
        fragmentTitles.add("头条");
        fragmentTitles.add("笑话");
        fragmentTitles.add("游戏");
        MyFragmentAdapter adapter = new MyFragmentAdapter(getChildFragmentManager(),
                fragments, fragmentTitles);
        mVpNews.setAdapter(adapter);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
