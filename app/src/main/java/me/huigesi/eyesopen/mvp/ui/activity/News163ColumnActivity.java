package me.huigesi.eyesopen.mvp.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bingoogolapple.badgeview.BGABadgeTextView;
import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.app.utils.ChannelView.bean.ChannelItem;
import me.huigesi.eyesopen.app.utils.ChannelView.bean.GroupItem;
import me.huigesi.eyesopen.app.utils.ChannelView.listener.OnChannelItemClicklistener;
import me.huigesi.eyesopen.app.utils.ChannelView.listener.UserActionListener;
import me.huigesi.eyesopen.app.utils.ChannelView.view.ChannelTagView;

public class News163ColumnActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView mImgBack;/*
    @BindView(R.id.rv_column_my)
    RecyclerView mRvColumnMy;
    @BindView(R.id.rv_column_more)
    RecyclerView mRvColumnMore;*/
    @BindView(R.id.channelTagView)
    ChannelTagView mChannelTagView;
    private ArrayList<ChannelItem> mAddedChannels = new ArrayList<>();
    private ArrayList<ChannelItem> mUnAddedChannels = new ArrayList<>();
    private ArrayList<GroupItem> mUnAddedItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news163_column);
        ButterKnife.bind(this);
        initData();
        mChannelTagView.showPahtAnim(true);
        mChannelTagView.initChannels(mAddedChannels, mUnAddedItems, true, new ChannelTagView.RedDotRemainderListener() {
            @Override
            public boolean showAddedChannelBadge(BGABadgeTextView itemView, int position) {
                if (mAddedChannels.get(position).title.equals("直播")) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public boolean showUnAddedChannelBadge(BGABadgeTextView itemView, int position) {
                if (mUnAddedChannels.get(position).title.equals("数码") || mUnAddedChannels.get(position).title.equals("科技")) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public void handleAddedChannelReddot(BGABadgeTextView itemView, int position) {
                itemView.showCirclePointBadge();
            }

            @Override
            public void handleUnAddedChannelReddot(BGABadgeTextView itemView, int position) {
                if (mUnAddedChannels.get(position).title.equals("科技")) {
                    itemView.showTextBadge("new");
                } else {
                    itemView.showCirclePointBadge();
                }
            }

            @Override
            public void OnDragDismiss(BGABadgeTextView itemView, int position) {
                //拖拽取消红点提示
                itemView.hiddenBadge();
            }
        });
        mChannelTagView.setOnChannelItemClicklistener(new OnChannelItemClicklistener() {
            @Override
            public void onAddedChannelItemClick(View itemView, int position) {
                //打开
            }

            @Override
            public void onUnAddedChannelItemClick(View itemView, int position) {
                //添加
                ChannelItem item = mUnAddedChannels.remove(position);
                mAddedChannels.add(item);
            }

            @Override
            public void onItemDrawableClickListener(View itemView, int position) {
                //删除
                mUnAddedChannels.add(mAddedChannels.remove(position));
            }
        });
        mChannelTagView.setUserActionListener(new UserActionListener() {
            @Override
            public void onMoved(int fromPos, int toPos, ArrayList<ChannelItem> addedChannels) {
                //移动
                mAddedChannels.clear();
                mAddedChannels.addAll(addedChannels);
            }

            @Override
            public void onSwiped(int position, View itemView, ArrayList<ChannelItem> addedChannels, ArrayList<ChannelItem> unAddedChannels) {
                //删除
                mUnAddedChannels.clear();
                mUnAddedChannels.addAll(unAddedChannels);
            }
        });
    }

    private void initData() {
        String[] chanles = getResources().getStringArray(R.array.news_channel);
        for (int i=0;i<3;i++) {
            ChannelItem item = new ChannelItem();
            item.id = i;
            item.title = chanles[i];
            mAddedChannels.add(item);
        }
        GroupItem groupFinance = new GroupItem();
        groupFinance.category = "未添加";
        for (int i=3;i<chanles.length;i++) {
            ChannelItem item = new ChannelItem();
            item.id = i;
            item.title = chanles[i];
            mUnAddedChannels.add(item);
            groupFinance.addChanelItem(item);
        }
        mUnAddedItems.add(groupFinance);
    }
}
