package me.huigesi.eyesopen.app.column;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

public class ItemColumnHelperCallback extends ItemTouchHelper.Callback {
    private ItemTouchHelperAdapter mAdapter;
    public interface OnStateChangedListener {
        void onItemSelected();

        void onItemClear();
    }

    public ItemColumnHelperCallback(ItemTouchHelperAdapter mAdapter) {
        this.mAdapter=mAdapter;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        //拖拽
        int dragFlags = ItemTouchHelper.UP | ItemTouchHelper.DOWN |
                ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
        //滑动
        int swipeFlags = 0;
        return makeMovementFlags(dragFlags, swipeFlags);
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        if (viewHolder.getItemViewType() != target.getItemViewType()) {
            return false;
        }

        return mAdapter.onItemMove(viewHolder.getAdapterPosition(),
                target.getAdapterPosition());
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        mAdapter.onItemDismiss(viewHolder.getAdapterPosition());
    }

    public interface ItemTouchHelperAdapter {

        boolean onItemMove(int fromPosition, int toPosition);

        void onItemDismiss(int position);
    }

    public boolean isLongPressDragEnabled() {
        return true;
    }

    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    public void onChildDraw(Canvas c, RecyclerView recyclerView,
                            RecyclerView.ViewHolder viewHolder, float dX, float dY,
                            int actionState, boolean isCurrentlyActive) {

        if (actionState == ItemTouchHelper.ACTION_STATE_SWIPE) {
            float width = (float) viewHolder.itemView.getWidth();
            float alpha = 1.0f - Math.abs(dX) / width;
            viewHolder.itemView.setAlpha(alpha);
            viewHolder.itemView.setTranslationX(dX);
        } else {
            super.onChildDraw(c, recyclerView, viewHolder, dX, dY,
                    actionState, isCurrentlyActive);
        }
    }

    @Override
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
        if (actionState != ItemTouchHelper.ACTION_STATE_IDLE) {
            //看看这个viewHolder是否实现了onStateChangedListener接口
            if (viewHolder instanceof OnStateChangedListener) {
                OnStateChangedListener listener = (OnStateChangedListener) viewHolder;
                //回调ItemViewHolder中的onItemSelected方法来改变item的背景颜色
                listener.onItemSelected();
            }
        }
        super.onSelectedChanged(viewHolder, actionState);
    }
}
