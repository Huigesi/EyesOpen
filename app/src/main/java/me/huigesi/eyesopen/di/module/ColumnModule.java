package me.huigesi.eyesopen.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import me.huigesi.eyesopen.mvp.contract.ColumnContract;
import me.huigesi.eyesopen.mvp.model.ColumnModel;


@Module
public class ColumnModule {
    private ColumnContract.View view;

    /**
     * 构建ColumnModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ColumnModule(ColumnContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ColumnContract.View provideColumnView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ColumnContract.Model provideColumnModel(ColumnModel model) {
        return model;
    }
}