package me.huigesi.eyesopen.mvp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.base.BaseRecyclerViewAdapter;
import me.huigesi.eyesopen.app.column.ItemColumnHelperCallback;
import me.huigesi.eyesopen.mvp.model.entity.Column;

public class ColumnAdapter extends BaseRecyclerViewAdapter<Column> implements
        ItemColumnHelperCallback.ItemTouchHelperAdapter {
    private static final String TAG = "ColumnAdapter";
    private boolean mShowDelete;
    private OnItemMoveListener mItemMoveListener;

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
                    mItemClickListener.onItemClick(v, position, data);
                }
            });
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    mItemClickListener.onLongClick(v, position, data);
                    return true;
                }
            });
            if (mShowDelete) {
                ((ViewHolder) holder).mImgClose.setVisibility(View.VISIBLE);
            }else {
                ((ViewHolder) holder).mImgClose.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        Collections.swap(mList, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
        if (!mList.get(fromPosition).getNewsColumnFixed() && !mList.get(toPosition)
                .getNewsColumnFixed()) {
            //交换mItems数据的位置
            Collections.swap(mList, fromPosition, toPosition);
            //交换RecyclerView列表中item的位置
            notifyItemMoved(fromPosition, toPosition);

            if (mItemMoveListener != null) {
                mItemMoveListener.onItemMove(fromPosition, toPosition);
            }

            return true;
        }
        return false;
    }

    public void setItemMoveListener(OnItemMoveListener itemMoveListener) {
        mItemMoveListener = itemMoveListener;
    }

    public interface OnItemMoveListener {
        void onItemMove(int fromPosition, int toPosition);
    }


    @Override
    public void onItemDismiss(int position) {
        mList.remove(position);
        notifyItemRemoved(position);
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
