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

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import me.huigesi.eyesopen.app.base.BaseRecyclerFragment;
import me.huigesi.eyesopen.app.utils.SPreUtils;
import me.huigesi.eyesopen.di.component.DaggerWeiboDetailComponent;
import me.huigesi.eyesopen.di.module.WeiboDetailModule;
import me.huigesi.eyesopen.mvp.contract.WeiboDetailContract;
import me.huigesi.eyesopen.mvp.model.entity.WeiboDetail;
import me.huigesi.eyesopen.mvp.presenter.WeiboDetailPresenter;

import me.huigesi.eyesopen.R;
import me.huigesi.eyesopen.mvp.ui.adapter.WeiBoDetailAdapter;
import me.huigesi.eyesopen.mvp.ui.view.WeiBoDetailHeaderView;

import static com.jess.arms.utils.Preconditions.checkNotNull;


public class WeiboDetailFragment extends BaseRecyclerFragment<WeiboDetailPresenter> implements WeiboDetailContract.View {
    public static final String WEIBO_ID = "WEIBO_ID";
    private String mId,mGsid;
    private WeiBoDetailAdapter mWeiBoDetailAdapter;
    private WeiBoDetailHeaderView mWeiBoDetailHeaderView;

    public static WeiboDetailFragment newInstance() {
        WeiboDetailFragment fragment = new WeiboDetailFragment();
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerWeiboDetailComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .weiboDetailModule(new WeiboDetailModule(this))
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_weibo_detail, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mGsid = SPreUtils.getWeiBoUserInfo(SPreUtils.WEIBO_GSID, getActivity());
        mId = getActivity().getIntent().getStringExtra(WEIBO_ID);
        mWeiBoDetailAdapter = new WeiBoDetailAdapter(getActivity());
        mWeiBoDetailHeaderView = new WeiBoDetailHeaderView(getActivity());
        mRvNews.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRvNews.setAdapter(mWeiBoDetailAdapter);
        mSrlNews.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                mPresenter.requestWeiboDetail(mId, mGsid, true);
            }
        });
        mSrlNews.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                loadMoreComment();
            }
        });
        mPresenter.requestWeiboDetail(mGsid, mId, true);
    }

    private void loadMoreComment() {
        mPresenter.requestWeiboDetail(mId, mGsid, false);
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
    public void init() {

    }

    @Override
    public void showData(WeiboDetail data) {
        if (data.getStatus().getMblogtypename() != null) {
            mWeiBoDetailHeaderView.setData(data);
            mWeiBoDetailAdapter.setHeaderView(mWeiBoDetailHeaderView);
        }else {
        }
        if (data.getRoot_comments() != null && data.getRoot_comments().size() > 0) {
            mWeiBoDetailAdapter.setData(data.getRoot_comments(), true);
        }
    }

    @Override
    public void showMoreData(WeiboDetail data) {
        if (data.getRoot_comments() != null && data.getRoot_comments().size() > 0) {
            mWeiBoDetailAdapter.setData(data.getRoot_comments(), false);
        }
    }

    @Override
    public void endLoadMore() {
        mSrlNews.finishLoadMore(0);
    }
}
