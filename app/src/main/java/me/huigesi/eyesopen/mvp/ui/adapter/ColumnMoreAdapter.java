package me.huigesi.eyesopen.mvp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.base.BaseRecyclerViewAdapter;
import me.huigesi.eyesopen.mvp.model.entity.Column;

public class ColumnMoreAdapter extends BaseRecyclerViewAdapter<Column> {


    public ColumnMoreAdapter(Context context) {
        super(context);
    }

    public void addItem(Column column) {
        mList.add(column);
        notifyDataSetChanged();
    }

    public void deleteItem(Column column) {
        mList.remove(column);
        notifyDataSetChanged();
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
            ((ViewHolder) holder).mImgClose.setVisibility(View.GONE);
        }
    }

    static class ViewHolder extends Holder {
        @BindView(R.id.tv_column)
        TextView mTvColumn;
        @BindView(R.id.img_close)
        ImageView mImgClose;
        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
