package me.huigesi.eyesopen.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import me.huigesi.eyesopen.di.module.NbaZhuanTiModule;

import com.jess.arms.di.scope.ActivityScope;

import me.huigesi.eyesopen.mvp.ui.activity.NbaZhuanTiActivity;

@ActivityScope
@Component(modules = NbaZhuanTiModule.class, dependencies = AppComponent.class)
public interface NbaZhuanTiComponent {
    void inject(NbaZhuanTiActivity activity);
}