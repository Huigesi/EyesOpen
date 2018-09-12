package me.huigesi.eyesopen.di.module;

import com.jess.arms.di.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

import me.huigesi.eyesopen.mvp.contract.NbaBBSContract;
import me.huigesi.eyesopen.mvp.model.NbaBBSModel;


@Module
public class NbaBBSModule {
    private NbaBBSContract.View view;

    /**
     * 构建NbaBBSModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public NbaBBSModule(NbaBBSContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    NbaBBSContract.View provideNbaBBSView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    NbaBBSContract.Model provideNbaBBSModel(NbaBBSModel model) {
        return model;
    }
}