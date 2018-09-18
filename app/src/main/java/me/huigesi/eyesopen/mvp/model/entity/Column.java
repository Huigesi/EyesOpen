package me.huigesi.eyesopen.mvp.model.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Column {
    private String id;
    private String name;
    private String group;

    private boolean newsColumnSelect;
    private int newsColumnIndex;
@Generated(hash = 2018402591)
    public Column() {
    }
@Generated(hash = 1851873653)
    public Column(String id, String name, String group, boolean select, int index, Boolean fixed) {
        this.id=id;
        this.name=name;
        this.group=group;
        this.newsColumnSelect=select;
        this.newsColumnIndex=index;
        this.newsColumnFixed = fixed;
    }

    public boolean isNewsColumnSelect() {
        return newsColumnSelect;
    }

    public void setNewsColumnSelect(boolean newsColumnSelect) {
        this.newsColumnSelect = newsColumnSelect;
    }

    public int getNewsColumnIndex() {
        return newsColumnIndex;
    }

    public void setNewsColumnIndex(int newsColumnIndex) {
        this.newsColumnIndex = newsColumnIndex;
    }

    public Boolean getNewsColumnFixed() {
        return newsColumnFixed;
    }

    public void setNewsColumnFixed(Boolean newsColumnFixed) {
        this.newsColumnFixed = newsColumnFixed;
    }

    private Boolean newsColumnFixed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
