package me.huigesi.eyesopen.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import me.huigesi.eyesopen.di.module.WeiboDetailModule;

import com.jess.arms.di.scope.FragmentScope;

import me.huigesi.eyesopen.mvp.ui.fragment.WeiboDetailFragment;

@FragmentScope
@Component(modules = WeiboDetailModule.class, dependencies = AppComponent.class)
public interface WeiboDetailComponent {
    void inject(WeiboDetailFragment fragment);
}