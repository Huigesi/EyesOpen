package me.huigesi.eyesopen.mvp.ui.activity;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.jess.arms.utils.ArmsUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.base.BaseRecyclerViewAdapter;
import me.huigesi.eyesopen.mvp.model.entity.Column;
import me.huigesi.eyesopen.mvp.ui.adapter.ColumnAdapter;
import me.huigesi.eyesopen.mvp.ui.adapter.ColumnAdapter2;

public class News163ColumnActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView mImgBack;/*
    @BindView(R.id.rv_column_my)
    RecyclerView mRvColumnMy;
    @BindView(R.id.rv_column_more)
    RecyclerView mRvColumnMore;*/
    @BindView(R.id.rv_column_my)
    RecyclerView mRvColumnMy;
    @BindView(R.id.rv_column_more)
    RecyclerView mRvColumnMore;
    private ColumnAdapter mColumnAdapter;
    private ColumnAdapter2 mColumnAdapter2;
    private List<Column> mMyColumnList = new ArrayList<>();
    private List<Column> mMoreColumnList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news163_column);
        ButterKnife.bind(this);
        mImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        initRecycleView();
        initData();
        initAdapter();
    }

    private void initAdapter() {
        mColumnAdapter.setItemClickListener(new BaseRecyclerViewAdapter.OnItemClickListener<Column>() {
            @Override
            public void onItemClick(View view, int position, Column data) {
                Toast.makeText(getApplication(),"long click"+position,Toast.LENGTH_SHORT).show();

              /*  mMoreColumnList.add(data);
                mMyColumnList.remove(data);

                mColumnAdapter2.setData(mMoreColumnList,true);
                mColumnAdapter.setData(mMyColumnList,true);*/
            }
        });
        mColumnAdapter.setItemLongClickListener(new BaseRecyclerViewAdapter.OnItemLongClickListener<Column>() {
            @Override
            public boolean onLongClick(View view, int position, Column data) {
                Toast.makeText(getApplication(),"long click"+position,Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        mColumnAdapter2.setItemClickListener(new BaseRecyclerViewAdapter.OnItemClickListener<Column>() {
            @Override
            public void onItemClick(View view, int position, Column data) {
                Toast.makeText(getApplication(),"click"+position,Toast.LENGTH_SHORT).show();

                mMyColumnList.add(data);
                mMoreColumnList.remove(data);
                mColumnAdapter2.setData(mMoreColumnList,true);
                mColumnAdapter.setData(mMyColumnList,true);
            }
        });
        mColumnAdapter2.setItemLongClickListener(new BaseRecyclerViewAdapter.OnItemLongClickListener<Column>() {
            @Override
            public boolean onLongClick(View view, int position, Column data) {
                mMyColumnList.add(data);
                mMoreColumnList.remove(data);
                mColumnAdapter2.setData(mMoreColumnList,true);
                mColumnAdapter.setData(mMyColumnList,true);
                return false;
            }
        });
    }

    private void initData() {
        String[] columnList = getResources().getStringArray(R.array.news_channel);
        String[] columnIdList = getResources().getStringArray(R.array.news_channel_id);
        for (int i=0;i<3;i++) {
            Column column = new Column();
            column.setId(columnIdList[i]);
            column.setName(columnList[i]);
            mMyColumnList.add(column);
        }
        for (int i=3;i<columnList.length;i++) {
            Column column = new Column();
            column.setId(columnIdList[i]);
            column.setName(columnList[i]);
            mMoreColumnList.add(column);
        }
        mColumnAdapter.setData(mMyColumnList,true);
        mColumnAdapter2.setData(mMoreColumnList,true);
    }

    private void initRecycleView() {
        mColumnAdapter = new ColumnAdapter(this);
        mColumnAdapter2 = new ColumnAdapter2(this);
        ArmsUtils.configRecyclerView(mRvColumnMy,new GridLayoutManager(this,4));
        ArmsUtils.configRecyclerView(mRvColumnMore,new GridLayoutManager(this,4));
        mRvColumnMy.setAdapter(mColumnAdapter);
        mRvColumnMore.setAdapter(mColumnAdapter2);
    }

}
