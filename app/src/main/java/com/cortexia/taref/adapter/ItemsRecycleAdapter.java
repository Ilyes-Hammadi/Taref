package com.cortexia.taref.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cortexia.taref.R;
import com.cortexia.taref.activity.DetailActivity;
import com.cortexia.taref.model.Item;

import java.util.Collections;
import java.util.List;

/**
 * Created by ilyes on 28/08/15.
 */
public class ItemsRecycleAdapter extends RecyclerView.Adapter<ItemsRecycleAdapter.MyViewHolder> {

    private LayoutInflater mInflater;
    private List<Item> mData = Collections.emptyList();

    public ItemsRecycleAdapter(Context context, List<Item> data) {
        mInflater = LayoutInflater.from(context);
        mData = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_list, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // Getting the data from the data array
        Item object = mData.get(position);

        // Setting the views to reflect the data we need to display
        holder.nameTV.setText(object.getName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // Set the view ref here
        ImageView imageIV;
        TextView nameTV;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            // Get refrence to view ( findViewByid())
            nameTV = (TextView) itemView.findViewById(R.id.item_name_tv);
            imageIV = (ImageView) itemView.findViewById(R.id.item_image_iv);


        }

        @Override
        public void onClick(View v) {
            // Setup the click on a single item from the list
            mInflater.getContext().startActivity(new Intent(mInflater.getContext(), DetailActivity.class));
        }
    }

}
