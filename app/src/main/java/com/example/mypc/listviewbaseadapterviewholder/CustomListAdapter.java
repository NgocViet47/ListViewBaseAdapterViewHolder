package com.example.mypc.listviewbaseadapterviewholder;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MyPC on 1/17/2017.
 */

public class CustomListAdapter extends RecyclerView.Adapter<CustomListAdapter.ViewHolder> {
    private List<Items> contactInfoList;
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public CustomListAdapter(Context context, List<Items> datas) {
        mContext = context;
        contactInfoList = datas;
        mLayoutInflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.list_item_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Items items = contactInfoList.get(position);

        holder.imageView.setImageResource(items.getIdImage());
        holder.textViewName.setText(items.getName());
        holder.textViewTime.setText(items.getTime());
    }

    @Override
    public int getItemCount() {
        return contactInfoList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        protected TextView textViewName;
        protected TextView textViewTime;
        protected ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            textViewName = (TextView)itemView.findViewById(R.id.textViewName);
            textViewTime = (TextView)itemView.findViewById(R.id.textViewTime);
            imageView = (ImageView)itemView.findViewById(R.id.imageView);
        }
    }
}
