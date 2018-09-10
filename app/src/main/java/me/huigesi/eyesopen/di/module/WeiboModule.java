package me.huigesi.eyesopen.di.module;

import com.jess.arms.di.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

import me.huigesi.eyesopen.mvp.contract.WeiboContract;
import me.huigesi.eyesopen.mvp.model.WeiboModel;


@Module
public class WeiboModule {
    private WeiboContract.View view;

    /**
     * 构建WeiboModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public WeiboModule(WeiboContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    WeiboContract.View provideWeiboView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    WeiboContract.Model provideWeiboModel(WeiboModel model) {
        return model;
    }
}