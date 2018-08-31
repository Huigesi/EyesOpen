package me.huigesi.eyesopen.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import me.huigesi.eyesopen.di.module.NbaModule;

import com.jess.arms.di.scope.FragmentScope;

import me.huigesi.eyesopen.mvp.ui.fragment.NbaFragment;

@FragmentScope
@Component(modules = NbaModule.class, dependencies = AppComponent.class)
public interface NbaComponent {
    void inject(NbaFragment fragment);
}