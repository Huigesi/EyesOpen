package me.huigesi.eyesopen.mvp.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.List;

import me.huigesi.eyesopen.app.base.BaseRecyclerFragment;
import me.huigesi.eyesopen.di.component.DaggerNews163ListComponent;
import me.huigesi.eyesopen.di.module.News163ListModule;
import me.huigesi.eyesopen.mvp.contract.News163ListContract;
import me.huigesi.eyesopen.mvp.model.api.Api;
import me.huigesi.eyesopen.mvp.model.entity.News163;
import me.huigesi.eyesopen.mvp.presenter.News163ListPresenter;

import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.mvp.ui.adapter.ItemNewsAdapter;

import static com.jess.arms.utils.Preconditions.checkNotNull;


public class News163ListFragment extends BaseRecyclerFragment<News163ListPresenter> implements News163ListContract.View {
    public static final String NEWS163_ID = "mId";
    private ItemNewsAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;
    private String mId,mNewsType;
    public static News163ListFragment newInstance(String id) {
        News163ListFragment fragment = new News163ListFragment();
        Bundle args = new Bundle();
        args.putString(NEWS163_ID, id);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerNews163ListComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .news163ListModule(new News163ListModule(this))
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news163_list, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mId = getArguments().getString(NEWS163_ID);
        if (mId.equals(Api.HEADLINE_ID) ){
            mNewsType=Api.TYPE_HEADLINE;
        }else {
            mNewsType=Api.TYPE_LIST;
        }
        mPresenter.requestNews163(mNewsType,mId,true);
        mSrlNews.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                mPresenter.requestNews163(mNewsType,mId,true);
            }
        });
        mSrlNews.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                mPresenter.requestNews163(mNewsType,mId,false);
            }
        });
        mAdapter = new ItemNewsAdapter(getActivity());
        initRecycleView();
        mRvNews.setAdapter(mAdapter);
    }

    private void initRecycleView() {
        mLayoutManager=new LinearLayoutManager(getActivity());
        ArmsUtils.configRecyclerView(mRvNews,mLayoutManager);
    }

    /**
     * 通过此方法可以使 Fragment 能够与外界做一些交互和通信, 比如说外部的 Activity 想让自己持有的某个 Fragment 对象执行一些方法,
     * 建议在有多个需要与外界交互的方法时, 统一传 {@link Message}, 通过 what 字段来区分不同的方法, 在 {@link #setData(Object)}
     * 方法中就可以 {@code switch} 做不同的操作, 这样就可以用统一的入口方法做多个不同的操作, 可以起到分发的作用
     * <p>
     * 调用此方法时请注意调用时 Fragment 的生命周期, 如果调用 {@link #setData(Object)} 方法时 {@link Fragment#onCreate(Bundle)} 还没执行
     * 但在 {@link #setData(Object)} 里却调用了 Presenter 的方法, 是会报空的, 因为 Dagger 注入是在 {@link Fragment#onCreate(Bundle)} 方法中执行的
     * 然后才创建的 Presenter, 如果要做一些初始化操作,可以不必让外部调用 {@link #setData(Object)}, 在 {@link #initData(Bundle)} 中初始化就可以了
     * <p>
     * Example usage:
     * <pre>
     * public void setData(@Nullable Object data) {
     *     if (data != null && data instanceof Message) {
     *         switch (((Message) data).what) {
     *             case 0:
     *                 loadData(((Message) data).arg1);
     *                 break;
     *             case 1:
     *                 refreshUI();
     *                 break;
     *             default:
     *                 //do something
     *                 break;
     *         }
     *     }
     * }
     *
     * // call setData(Object):
     * Message data = new Message();
     * data.what = 0;
     * data.arg1 = 1;
     * fragment.setData(data);
     * </pre>
     *
     * @param data 当不需要参数时 {@code data} 可以为 {@code null}
     */
    @Override
    public void setData(@Nullable Object data) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {
        mSrlNews.finishRefresh(0);
    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {

    }

    @Override
    public void showData(List<News163> data) {
        if (data != null && data.size() > 0) {
            mAdapter.setData(data, true);
        }else {
            Toast.makeText(getActivity(), "没有数据", Toast.LENGTH_SHORT).show();
            mSrlNews.setNoMoreData(true);
        }
    }

    @Override
    public void showMoreData(List<News163> data) {
        if (data != null && data.size() > 0) {
            mAdapter.setData(data, false);
        }else {
            mSrlNews.setNoMoreData(true);
            Toast.makeText(getActivity(), "没有数据", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void endLoadMore() {
        mSrlNews.finishLoadMore(0);
    }
}
