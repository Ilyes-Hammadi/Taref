package com.cortexia.taref.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cortexia.taref.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecycleItemsFragment extends android.support.v4.app.Fragment {


    public RecycleItemsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycle_items, container, false);
    }


}
