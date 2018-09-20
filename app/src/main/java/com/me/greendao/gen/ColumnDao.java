package com.me.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import me.huigesi.eyesopen.mvp.model.entity.Column;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "COLUMN".
*/
public class ColumnDao extends AbstractDao<Column, String> {

    public static final String TABLENAME = "COLUMN";

    /**
     * Properties of entity Column.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Name = new Property(0, String.class, "name", false, "NAME");
        public final static Property Id = new Property(1, String.class, "id", true, "ID");
        public final static Property Type = new Property(2, String.class, "type", false, "TYPE");
        public final static Property Select = new Property(3, boolean.class, "select", false, "SELECT");
        public final static Property Index = new Property(4, int.class, "index", false, "INDEX");
        public final static Property Fixed = new Property(5, Boolean.class, "fixed", false, "FIXED");
    }


    public ColumnDao(DaoConfig config) {
        super(config);
    }
    
    public ColumnDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"COLUMN\" (" + //
                "\"NAME\" TEXT," + // 0: name
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 1: id
                "\"TYPE\" TEXT," + // 2: type
                "\"SELECT\" INTEGER NOT NULL ," + // 3: select
                "\"INDEX\" INTEGER NOT NULL ," + // 4: index
                "\"FIXED\" INTEGER);"); // 5: fixed
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"COLUMN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Column entity) {
        stmt.clearBindings();
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(1, name);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(3, type);
        }
        stmt.bindLong(4, entity.getSelect() ? 1L: 0L);
        stmt.bindLong(5, entity.getIndex());
 
        Boolean fixed = entity.getFixed();
        if (fixed != null) {
            stmt.bindLong(6, fixed ? 1L: 0L);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Column entity) {
        stmt.clearBindings();
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(1, name);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(3, type);
        }
        stmt.bindLong(4, entity.getSelect() ? 1L: 0L);
        stmt.bindLong(5, entity.getIndex());
 
        Boolean fixed = entity.getFixed();
        if (fixed != null) {
            stmt.bindLong(6, fixed ? 1L: 0L);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1);
    }    

    @Override
    public Column readEntity(Cursor cursor, int offset) {
        Column entity = new Column( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // name
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // type
            cursor.getShort(offset + 3) != 0, // select
            cursor.getInt(offset + 4), // index
            cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0 // fixed
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Column entity, int offset) {
        entity.setName(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setType(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSelect(cursor.getShort(offset + 3) != 0);
        entity.setIndex(cursor.getInt(offset + 4));
        entity.setFixed(cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0);
     }
    
    @Override
    protected final String updateKeyAfterInsert(Column entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(Column entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Column entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}