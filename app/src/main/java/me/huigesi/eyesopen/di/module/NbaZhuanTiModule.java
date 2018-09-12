package me.huigesi.eyesopen.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import me.huigesi.eyesopen.mvp.contract.NbaZhuanTiContract;
import me.huigesi.eyesopen.mvp.model.NbaZhuanTiModel;


@Module
public class NbaZhuanTiModule {
    private NbaZhuanTiContract.View view;

    /**
     * 构建NbaZhuanTiModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public NbaZhuanTiModule(NbaZhuanTiContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    NbaZhuanTiContract.View provideNbaZhuanTiView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    NbaZhuanTiContract.Model provideNbaZhuanTiModel(NbaZhuanTiModel model) {
        return model;
    }
}