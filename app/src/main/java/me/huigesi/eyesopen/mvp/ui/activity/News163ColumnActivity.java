package me.huigesi.eyesopen.mvp.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.jess.arms.utils.ArmsUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;
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
        initRecycleView();
        initData();
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
