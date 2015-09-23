package com.cortexia.taref.fragment;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cortexia.taref.R;
import com.cortexia.taref.adapter.ItemsRecycleAdapter;
import com.cortexia.taref.model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecycleItemsFragment extends android.support.v4.app.Fragment {


    private View mRoot;
    private RecyclerView mListItemsRV;

    private List<Item> fakeData = new ArrayList<>();

    @SuppressLint("ValidFragment")
    public RecycleItemsFragment(List<Item> items) {
        // Required empty public constructor
        fakeData = items;
    }


    public RecycleItemsFragment() {
        setFakeData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRoot = inflater.inflate(R.layout.fragment_recycle_items, container, false);

        // Set up Recycle View
        mListItemsRV = (RecyclerView) mRoot.findViewById(R.id.list_item_rv);
        mListItemsRV.setLayoutManager(setUpLayoutManager());
        mListItemsRV.setAdapter(new ItemsRecycleAdapter(getActivity(), fakeData));

        return mRoot;
    }

    private GridLayoutManager setUpLayoutManager() {
        GridLayoutManager manager = new GridLayoutManager(getActivity(), 2);
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return (position % 3 == 0 ? 2 : 1);
            }
        });
        return manager;
    }


    private void setFakeData() {

        for (int i = 0; i < 20; i++) {
            Item item = new Item();
            item.setName("Hello world");
            fakeData.add(item);
        }

    }

}
