package me.huigesi.eyesopen.di.module;

import com.jess.arms.di.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

import me.huigesi.eyesopen.mvp.contract.NbaDetailContract;
import me.huigesi.eyesopen.mvp.model.NbaDetailModel;


@Module
public class NbaDetailModule {
    private NbaDetailContract.View view;

    /**
     * 构建NbaDetailModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public NbaDetailModule(NbaDetailContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    NbaDetailContract.View provideNbaDetailView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    NbaDetailContract.Model provideNbaDetailModel(NbaDetailModel model) {
        return model;
    }
}