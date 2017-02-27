package com.arif.samplelist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by root on 27/02/17.
 */

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ViewHolder> {

    private ArrayList<Item> items;

    public ItemListAdapter(ArrayList<Item> items){
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vResult = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(vResult);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.labelTitle.setText(item.getTitle());
        holder.labelSubtitle.setText(item.getSubtile());
        holder.imageView.setImageResource(item.getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView labelTitle;
        private TextView labelSubtitle;

        public ViewHolder(View view) {
            super(view);
            imageView       = (ImageView) view.findViewById(R.id.item_image_view);
            labelTitle      = (TextView) view.findViewById(R.id.item_label_title);
            labelSubtitle   = (TextView) view.findViewById(R.id.item_label_subtitle);
        }
    }
}
