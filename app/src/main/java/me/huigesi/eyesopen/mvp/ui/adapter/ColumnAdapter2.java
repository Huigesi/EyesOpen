package me.huigesi.eyesopen.mvp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.base.BaseRecyclerViewAdapter;
import me.huigesi.eyesopen.mvp.model.entity.Column;

public class ColumnAdapter2 extends BaseRecyclerViewAdapter<Column> {

    public ColumnAdapter2(Context context) {
        super(context);
    }

    public void addItem(Column column) {
        mList.add(column);
    }

    public void deleteItem(Column column) {
        mList.remove(column);
    }

    @Override
    public RecyclerView.ViewHolder onCreate(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_column, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBind(RecyclerView.ViewHolder holder, int position, Column data) {
        if (holder instanceof ViewHolder) {
            ((ViewHolder) holder).mTvColumn.setText(data.getName());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mItemClickListener.onItemClick(v,position,data);
                }
            });
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    mItemClickListener.onItemClick(v,position,data);
                    return true;
                }
            });
        }
    }

    static class ViewHolder extends Holder {
        @BindView(R.id.tv_column)
        TextView mTvColumn;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
