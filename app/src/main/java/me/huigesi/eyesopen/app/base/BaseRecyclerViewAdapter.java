package me.huigesi.eyesopen.app.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseRecyclerViewAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    protected Context mContext;
    protected List<T> mList = new ArrayList<>();
    protected View mHeaderView, mFooterView;

    protected OnItemClickListener<T> mItemClickListener;
    private OnItemLongClickListener<T> mItemLongClickListener;

    public BaseRecyclerViewAdapter(Context context) {
        mContext = context;
    }

    public BaseRecyclerViewAdapter(Context context, @NonNull List<T> data) {
        mContext = context;
        mList = data;
    }

    public void setItemClickListener(OnItemClickListener<T> itemClickListener) {
        mItemClickListener = itemClickListener;
    }

    public void setItemLongClickListener(OnItemLongClickListener<T> itemLongClickListener) {
        mItemLongClickListener = itemLongClickListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        if (mHeaderView != null && viewType == ITEM_TYPE_HEADER) return new Holder(mHeaderView);
        if (mFooterView != null && viewType == ITEM_TYPE_FOOTER) return new Holder(mFooterView);
        return onCreate(parent, viewType);
    }

    public int getDataSize() {
        return mList.size();
    }

    public List<T> getData() {
        return new ArrayList<>(mList);
    }

    protected List<T> data() {
        return mList;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);

        RecyclerView.LayoutManager manager = recyclerView.getLayoutManager();
        if (manager instanceof GridLayoutManager) {
            final GridLayoutManager gridManager = ((GridLayoutManager) manager);
            gridManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {
                    return getItemViewType(position) == ITEM_TYPE_HEADER
                            ? gridManager.getSpanCount() : 1;
                }
            });
        }
    }

    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        ViewGroup.LayoutParams lp = holder.itemView.getLayoutParams();
        if (lp != null && lp instanceof StaggeredGridLayoutManager.LayoutParams) {
            StaggeredGridLayoutManager.LayoutParams p =
                    (StaggeredGridLayoutManager.LayoutParams) lp;
            int position = holder.getLayoutPosition();
            if ((position == 0 && getItemViewType(position) == ITEM_TYPE_HEADER)
                    || getItemViewType(position) == ITEM_TYPE_FOOTER) {
                p.setFullSpan(true);
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (mHeaderView == null && mFooterView == null) {
            return ITEM_TYPE_NORMAL;
        } else if (mHeaderView != null && mFooterView == null) {
            if (position == 0) return ITEM_TYPE_HEADER;
            else return ITEM_TYPE_NORMAL;
        } else if (mHeaderView == null && mFooterView != null) {
            if (position == mList.size())
                return ITEM_TYPE_FOOTER;
            else
                return ITEM_TYPE_NORMAL;
        } else {
            if (position == 0)
                return ITEM_TYPE_HEADER;
            else if (position == mList.size() + 1)
                return ITEM_TYPE_FOOTER;
            else
                return ITEM_TYPE_NORMAL;
        }
    }

    private int getRealPosition(RecyclerView.ViewHolder holder) {
        int position = holder.getLayoutPosition();
        return mHeaderView == null ? position : position - 1;
    }

    @Override
    public int getItemCount() {
        if (mHeaderView == null && mFooterView == null) {
            return mList.size();
        } else if (mHeaderView != null && mFooterView == null) {
            return mList.size() + 1;
        } else if (mHeaderView == null && mFooterView != null) {
            return mList.size() + 1;
        } else {
            return mList.size() + 2;
        }
    }


    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int position) {
        if (getItemViewType(position) == ITEM_TYPE_HEADER) {
            onBindHeader(mHeaderView, position);
            return;
        }
        if (getItemViewType(position) == ITEM_TYPE_FOOTER) {
            onBindFooter(mFooterView, position);
            return;
        }

        final int pos = getRealPosition(viewHolder);
        if (pos >= mList.size()) {
            return;
        }
        final T data = mList.get(pos);
        onBind(viewHolder, pos, data);

    }

    protected void onBindHeader(View headerView, int position) {

    }

    protected void onBindFooter(View footerView, int position) {

    }

    public void clear() {
        mList.clear();
        notifyDataSetChanged();
    }

    public void setData(@NonNull List<T> data, boolean clear) {
        if (clear)
            mList.clear();
        mList.addAll(data);
        notifyDataSetChanged();
    }

    /*public void removeData(@NonNull T data) {
        Iterator<T> iterator = mList.iterator();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (FP.eq(next, data)) {
                iterator.remove();
                break;
            }
        }
        notifyDataSetChanged();
    }*/

    public static final int ITEM_TYPE_HEADER = 0;
    public static final int ITEM_TYPE_FOOTER = 1;
    public static final int ITEM_TYPE_NORMAL = 2;

    public void setHeaderView(View headerView) {
        mHeaderView = headerView;
        notifyDataSetChanged();
    }

    public void removeHeaderView() {
        mHeaderView = null;
        notifyDataSetChanged();
    }

    public void setFooterView(View headerView) {
        mFooterView = headerView;
        notifyDataSetChanged();
    }

    public void removeFooterView() {
        mFooterView = null;
        notifyDataSetChanged();
    }

    public static class Holder extends RecyclerView.ViewHolder {
        public Holder(View itemView) {
            super(itemView);
        }
    }

    public abstract RecyclerView.ViewHolder onCreate(ViewGroup parent, final int viewType);

    public abstract void onBind(RecyclerView.ViewHolder holder, int position, T data);

    public interface OnItemClickListener<T> {
        void onItemClick(View view, int position, T data);

        void onLongClick(View view, int position, T data);
    }

    public interface OnItemLongClickListener<T> {
        boolean onLongClick(View view, int position, T data);
    }
}
