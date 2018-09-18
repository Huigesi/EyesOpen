package me.huigesi.eyesopen.mvp.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/15.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {
    private FragmentManager mFragmentManager;
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> fragmentTitles = new ArrayList<>();

    public MyFragmentAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    public MyFragmentAdapter(FragmentManager fm, List<Fragment> fragments,
                             List<String> fragmentTitles) {
        super(fm);
        this.fragments = fragments;
        this.fragmentTitles = fragmentTitles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (fragmentTitles != null) {
            return fragmentTitles.get(position);
        } else {
            return "";
        }
    }
    public void updateFragments(List<Fragment> fragments, List<String> titles) {
        for (int i = 0; i < fragments.size(); i++) {
            final Fragment fragment = fragments.get(i);
            final FragmentTransaction ft = mFragmentManager.beginTransaction();
            if (i > 2) {
                ft.remove(fragment);
                fragments.remove(i);
                i--;
            }
            ft.commit();
        }
        for (int i = 0; i < fragments.size(); i++) {
            if (i > 2) {
                fragments.add(fragments.get(i));
            }
        }
        this.fragmentTitles = titles;
        notifyDataSetChanged();
    }
}
