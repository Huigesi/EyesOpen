package me.huigesi.eyesopen.app.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import me.huigesi.eyesopen.mvp.ui.adapter.IntegerDefault0Adapter;

public class GsonUtils {
    public static Gson setGsonAdapter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Integer.class, new IntegerDefault0Adapter());
        gsonBuilder.registerTypeAdapter(int.class, new IntegerDefault0Adapter());
        return gsonBuilder.create();
    }
}
