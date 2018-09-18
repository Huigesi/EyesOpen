package me.huigesi.eyesopen.mvp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.base.BaseRecyclerViewAdapter;
import me.huigesi.eyesopen.app.column.ItemColumnHelperCallback;
import me.huigesi.eyesopen.mvp.model.entity.Column;

public class ColumnAdapter extends BaseRecyclerViewAdapter<Column> implements ItemColumnHelperCallback.ItemTouchHelperAdapter{
    private boolean mShowDelete;

    public ColumnAdapter(Context context) {
        super(context);
    }

    public void showDelete(boolean showDelete) {
        this.mShowDelete = showDelete;
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

    @Override
    public void onItemMove(int fromPosition, int toPosition) {
        Collections.swap(mList, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
    }

    @Override
    public void onItemDismiss(int position) {
        mList.remove(position);
        notifyItemRemoved(position);
    }

    static class ViewHolder extends Holder{
        @BindView(R.id.tv_column)
        TextView mTvColumn;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
