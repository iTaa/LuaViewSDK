package com.taobao.luaview.view.recyclerview.layout;

import android.support.v7.widget.GridLayoutManager;

import com.taobao.luaview.view.LVRecyclerView;

/**
 * GridLayoutManager for ReycyclerView
 * @author song
 * @date 15/11/30
 */
public class LVGridLayoutManager extends GridLayoutManager {

    /**
     * 用屏幕宽度dp，来表示有多少列，模拟iOS的自动放置位置，默认纵向布局
     *
     * @param lvRecyclerView
     */
    public LVGridLayoutManager(LVRecyclerView lvRecyclerView) {
        this(lvRecyclerView, 1);
    }

    public LVGridLayoutManager(LVRecyclerView lvRecyclerView, int spanCount) {
        super(lvRecyclerView.getContext(), spanCount);
        this.setSpanSizeLookup(new LVGridSpanSizeLookup(lvRecyclerView));
    }


}
