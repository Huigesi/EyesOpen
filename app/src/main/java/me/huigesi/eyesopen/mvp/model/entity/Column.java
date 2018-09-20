package me.huigesi.eyesopen.mvp.model.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Unique;

@Entity
public class Column {
    private String name;
    @Id
    private String id;
    private String type;
    private boolean select;
    private int index;
    private Boolean fixed;
    @Generated(hash = 84521618)
    public Column(String name, String id, String type, boolean select, int index,
            Boolean fixed) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.select = select;
        this.index = index;
        this.fixed = fixed;
    }
    @Generated(hash = 1645384572)
    public Column() {
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean getSelect() {
        return this.select;
    }
    public void setSelect(boolean select) {
        this.select = select;
    }
    public int getIndex() {
        return this.index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public Boolean getFixed() {
        return this.fixed;
    }
    public void setFixed(Boolean fixed) {
        this.fixed = fixed;
    }

}
