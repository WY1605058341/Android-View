package com.android_view.refresh_more;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends MyWrapAdapter {
    public MyRecyclerViewAdapter(RecyclerView.Adapter adapter, ArrayList<View> headerViews, ArrayList footViews) {
        super(adapter, headerViews, footViews);
    }
}
