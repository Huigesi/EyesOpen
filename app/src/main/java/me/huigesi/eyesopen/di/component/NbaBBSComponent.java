package me.huigesi.eyesopen.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import me.huigesi.eyesopen.di.module.NbaBBSModule;

import com.jess.arms.di.scope.FragmentScope;

import me.huigesi.eyesopen.mvp.ui.fragment.NbaBBSFragment;

@FragmentScope
@Component(modules = NbaBBSModule.class, dependencies = AppComponent.class)
public interface NbaBBSComponent {
    void inject(NbaBBSFragment fragment);
}