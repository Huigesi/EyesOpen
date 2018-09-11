package me.huigesi.eyesopen.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import me.huigesi.eyesopen.di.module.WeiboSpaceModule;

import com.jess.arms.di.scope.ActivityScope;

import me.huigesi.eyesopen.mvp.ui.activity.WeiboSpaceActivity;

@ActivityScope
@Component(modules = WeiboSpaceModule.class, dependencies = AppComponent.class)
public interface WeiboSpaceComponent {
    void inject(WeiboSpaceActivity activity);
}