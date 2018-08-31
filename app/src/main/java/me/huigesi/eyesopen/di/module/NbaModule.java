package me.huigesi.eyesopen.di.module;

import com.jess.arms.di.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

import me.huigesi.eyesopen.mvp.contract.NbaContract;
import me.huigesi.eyesopen.mvp.model.NbaModel;


@Module
public class NbaModule {
    private NbaContract.View view;

    /**
     * 构建NbaModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public NbaModule(NbaContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    NbaContract.View provideNbaView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    NbaContract.Model provideNbaModel(NbaModel model) {
        return model;
    }
}