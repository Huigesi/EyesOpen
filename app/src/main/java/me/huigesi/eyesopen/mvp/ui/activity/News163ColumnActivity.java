package me.huigesi.eyesopen.mvp.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.huigesi.eyesopen.R;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news163_column);
        ButterKnife.bind(this);

    }
}
