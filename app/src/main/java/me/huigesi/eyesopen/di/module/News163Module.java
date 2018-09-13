package me.huigesi.eyesopen.di.module;

import com.jess.arms.di.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

import me.huigesi.eyesopen.mvp.contract.News163Contract;
import me.huigesi.eyesopen.mvp.model.News163Model;


@Module
public class News163Module {
    private News163Contract.View view;

    /**
     * 构建News163Module时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public News163Module(News163Contract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    News163Contract.View provideNews163View() {
        return this.view;
    }

    @FragmentScope
    @Provides
    News163Contract.Model provideNews163Model(News163Model model) {
        return model;
    }
}