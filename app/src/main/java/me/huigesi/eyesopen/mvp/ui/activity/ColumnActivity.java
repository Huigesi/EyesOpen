package me.huigesi.eyesopen.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.app.base.BaseRecyclerViewAdapter;
import me.huigesi.eyesopen.app.base.BaseSpacesItemDecoration;
import me.huigesi.eyesopen.app.column.ItemColumnHelperCallback;
import me.huigesi.eyesopen.app.utils.ClickUtils;
import me.huigesi.eyesopen.di.component.DaggerColumnComponent;
import me.huigesi.eyesopen.di.module.ColumnModule;
import me.huigesi.eyesopen.mvp.contract.ColumnContract;
import me.huigesi.eyesopen.mvp.model.entity.Column;
import me.huigesi.eyesopen.mvp.presenter.ColumnPresenter;

import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.mvp.ui.adapter.ColumnAdapter;
import me.huigesi.eyesopen.mvp.ui.adapter.ColumnMoreAdapter;


import static com.jess.arms.utils.Preconditions.checkNotNull;


public class ColumnActivity extends BaseActivity<ColumnPresenter> implements ColumnContract.View {
    @BindView(R.id.img_back)
    ImageView mImgBack;
    @BindView(R.id.rv_column_my)
    RecyclerView mRvColumnMy;
    @BindView(R.id.rv_column_more)
    RecyclerView mRvColumnMore;
    @BindView(R.id.tv_column_edit)
    TextView mTvColumnEdit;
    private ColumnAdapter mColumnAdapter;
    private ColumnMoreAdapter mColumnMoreAdapter;
    private List<Column> mMyColumnList = new ArrayList<>();
    private List<Column> mMoreColumnList = new ArrayList<>();
    Boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    private void initAdapter() {
        ItemColumnHelperCallback callback =
                new ItemColumnHelperCallback(mColumnAdapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(mRvColumnMy);
        mColumnAdapter.setItemMoveListener(new ColumnAdapter.OnItemMoveListener() {
            @Override
            public void onItemMove(int fromPosition, int toPosition) {
                mPresenter.onItemSwap(fromPosition, toPosition);
            }
        });
        mColumnAdapter.setItemClickListener(new BaseRecyclerViewAdapter.OnItemClickListener<Column>() {
            @Override
            public void onItemClick(View view, int position, Column data) {
                //防止快速点击
                if (ClickUtils.isFastDoubleClick()) {
                    return;
                }

                if (flag == true) {
                    if (!data.getFixed()) {
                        mPresenter.onItemAddOrRemove(data.getName(), false);
                    }
                    mColumnMoreAdapter.addItem(data);
                    mColumnAdapter.deleteItem(data);
                } else {

                }

            }

            @Override
            public void onLongClick(View view, int position, Column data) {
                if (!flag) {
                    flag = true;
                    mColumnAdapter.showDelete(flag);
                    mTvColumnEdit.setText("完成");
                    mColumnAdapter.notifyDataSetChanged();
                }
            }
        });

        mColumnMoreAdapter.setItemClickListener(new BaseRecyclerViewAdapter.OnItemClickListener<Column>() {
            @Override
            public void onItemClick(View view, int position, Column data) {
                if (ClickUtils.isFastDoubleClick()) {
                    return;
                }
                Log.i(TAG, "onItemClick: "+data.getName());
                mPresenter.onItemAddOrRemove(data.getName(), true);
                mColumnAdapter.addItem(data);
                mColumnMoreAdapter.deleteItem(data);
            }

            @Override
            public void onLongClick(View view, int position, Column data) {
            }
        });

        mTvColumnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == true) {
                    flag = false;
                    mTvColumnEdit.setText("编辑");
                } else {
                    flag = true;
                    mTvColumnEdit.setText("完成");
                }
                mColumnAdapter.showDelete(flag);
                mColumnAdapter.notifyDataSetChanged();
            }
        });
    }

    private void initRecycleView() {
        mColumnAdapter = new ColumnAdapter(this);
        mColumnMoreAdapter = new ColumnMoreAdapter(this);
        ArmsUtils.configRecyclerView(mRvColumnMy, new GridLayoutManager(this, 4));
        ArmsUtils.configRecyclerView(mRvColumnMore, new GridLayoutManager(this, 4));
        mRvColumnMy.addItemDecoration(new BaseSpacesItemDecoration(ArmsUtils.dip2px(this, 10)));
        mRvColumnMore.addItemDecoration(new BaseSpacesItemDecoration(ArmsUtils.dip2px(this, 10)));
        mRvColumnMy.setAdapter(mColumnAdapter);
        mRvColumnMore.setAdapter(mColumnMoreAdapter);
    }

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerColumnComponent
                .builder()
                .appComponent(appComponent)
                .columnModule(new ColumnModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_news163_column;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        initRecycleView();
        initAdapter();
    }

    @Override
    public void showMessage(@NonNull String message) {

    }

    @Override
    public void initData(List<Column> mMyColumnList, List<Column> mMoreColumnList) {
        mColumnAdapter.setData(mMyColumnList, true);
        mColumnMoreAdapter.setData(mMoreColumnList, true);
    }
}
