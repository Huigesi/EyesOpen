package me.huigesi.eyesopen.mvp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import me.huigesi.eyesopen.app.base.BaseRecyclerViewAdapter;

public class News163ColumnAdapter extends BaseRecyclerViewAdapter<String>{
    public News163ColumnAdapter(Context context) {
        super(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreate(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBind(RecyclerView.ViewHolder holder, int position, String data) {

    }
}
