package me.huigesi.eyesopen.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import me.huigesi.eyesopen.di.module.News163ListModule;

import com.jess.arms.di.scope.FragmentScope;

import me.huigesi.eyesopen.mvp.ui.fragment.News163ListFragment;

@FragmentScope
@Component(modules = News163ListModule.class, dependencies = AppComponent.class)
public interface News163ListComponent {
    void inject(News163ListFragment fragment);
}