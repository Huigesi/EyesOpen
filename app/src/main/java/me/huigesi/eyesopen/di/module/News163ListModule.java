package me.huigesi.eyesopen.di.module;

import com.jess.arms.di.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

import me.huigesi.eyesopen.mvp.contract.News163ListContract;
import me.huigesi.eyesopen.mvp.model.News163ListModel;


@Module
public class News163ListModule {
    private News163ListContract.View view;

    /**
     * 构建News163ListModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public News163ListModule(News163ListContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    News163ListContract.View provideNews163ListView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    News163ListContract.Model provideNews163ListModel(News163ListModel model) {
        return model;
    }
}