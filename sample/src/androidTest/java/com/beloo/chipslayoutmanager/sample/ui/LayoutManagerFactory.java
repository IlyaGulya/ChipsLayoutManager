package com.beloo.chipslayoutmanager.sample.ui;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;

import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;

@VisibleForTesting
public class LayoutManagerFactory {
    @Nullable
    public RecyclerView.LayoutManager layoutManager(Context context) {
        return ChipsLayoutManager.newBuilder(context)
                .setOrientation(ChipsLayoutManager.HORIZONTAL)
                .build();
    }
}
