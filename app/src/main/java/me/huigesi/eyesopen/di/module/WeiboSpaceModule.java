package me.huigesi.eyesopen.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import me.huigesi.eyesopen.mvp.contract.WeiboSpaceContract;
import me.huigesi.eyesopen.mvp.model.WeiboSpaceModel;


@Module
public class WeiboSpaceModule {
    private WeiboSpaceContract.View view;

    /**
     * 构建WeiboSpaceModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public WeiboSpaceModule(WeiboSpaceContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    WeiboSpaceContract.View provideWeiboSpaceView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    WeiboSpaceContract.Model provideWeiboSpaceModel(WeiboSpaceModel model) {
        return model;
    }
}