package me.huigesi.eyesopen.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import me.huigesi.eyesopen.di.module.NbaDetailModule;

import com.jess.arms.di.scope.FragmentScope;

import me.huigesi.eyesopen.mvp.ui.fragment.NbaDetailFragment;

@FragmentScope
@Component(modules = NbaDetailModule.class, dependencies = AppComponent.class)
public interface NbaDetailComponent {
    void inject(NbaDetailFragment fragment);
}