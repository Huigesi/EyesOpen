package me.huigesi.eyesopen.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import me.huigesi.eyesopen.di.module.ColumnModule;

import com.jess.arms.di.scope.ActivityScope;

import me.huigesi.eyesopen.mvp.ui.activity.ColumnActivity;

@ActivityScope
@Component(modules = ColumnModule.class, dependencies = AppComponent.class)
public interface ColumnComponent {
    void inject(ColumnActivity activity);
}