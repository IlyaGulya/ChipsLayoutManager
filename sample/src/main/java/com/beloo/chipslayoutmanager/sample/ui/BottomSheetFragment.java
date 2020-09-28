package com.beloo.chipslayoutmanager.sample.ui;


import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.core.widget.NestedScrollView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.beloo.chipslayoutmanager.sample.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 */
public class BottomSheetFragment extends Fragment {

    public BottomSheetFragment() {
        // Required empty public constructor
    }

    public static BottomSheetFragment newInstance() {
        Bundle args = new Bundle();
        BottomSheetFragment fragment = new BottomSheetFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        view.findViewById(R.id.btnShowSheet).setOnClickListener(this::onShowSheetClicked);
    }

    void onShowSheetClicked(View view) {
        BottomSheetDialogFragment fragment = BottomSheetDialogFragment.newInstance();
        fragment.show(getChildFragmentManager(), fragment.getTag());
    }


}
