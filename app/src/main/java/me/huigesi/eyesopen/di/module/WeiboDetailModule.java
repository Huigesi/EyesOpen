package me.huigesi.eyesopen.di.module;

import com.jess.arms.di.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

import me.huigesi.eyesopen.mvp.contract.WeiboDetailContract;
import me.huigesi.eyesopen.mvp.model.WeiboDetailModel;


@Module
public class WeiboDetailModule {
    private WeiboDetailContract.View view;

    /**
     * 构建WeiboDetailModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public WeiboDetailModule(WeiboDetailContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    WeiboDetailContract.View provideWeiboDetailView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    WeiboDetailContract.Model provideWeiboDetailModel(WeiboDetailModel model) {
        return model;
    }
}