package me.huigesi.eyesopen.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import me.huigesi.eyesopen.di.module.News163Module;

import com.jess.arms.di.scope.FragmentScope;

import me.huigesi.eyesopen.mvp.ui.fragment.News163ListFragment;

@FragmentScope
@Component(modules = News163Module.class, dependencies = AppComponent.class)
public interface News163Component {
    void inject(News163ListFragment fragment);
}