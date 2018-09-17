package me.huigesi.eyesopen.di.module;

import com.jess.arms.di.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

import me.huigesi.eyesopen.mvp.contract.WeiboSpaceContract;
import me.huigesi.eyesopen.mvp.model.WeiboSpaceModel;


@Module
public class WeiboSpaceModule {
    private WeiboSpaceContract.View view;

    /**
     * 构建WeiboSpacefgModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public WeiboSpaceModule(WeiboSpaceContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    WeiboSpaceContract.View provideWeiboSpacefgView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    WeiboSpaceContract.Model provideWeiboSpacefgModel(WeiboSpaceModel model) {
        return model;
    }
}