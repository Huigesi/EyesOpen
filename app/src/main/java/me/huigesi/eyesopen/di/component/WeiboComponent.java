package me.huigesi.eyesopen.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import me.huigesi.eyesopen.di.module.WeiboModule;

import com.jess.arms.di.scope.FragmentScope;

import me.huigesi.eyesopen.mvp.ui.fragment.WeiboFragment;

@FragmentScope
@Component(modules = WeiboModule.class, dependencies = AppComponent.class)
public interface WeiboComponent {
    void inject(WeiboFragment fragment);
}