package com.berbagi.berbagi3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Haqi.
 */
public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder>{

    Context context;
    ArrayList<HashMap<String, String>> list_data;

    public AdapterList(CampaignActivity mainActivity, ArrayList<HashMap<String, String>> list_data) {
        this.context = mainActivity;
        this.list_data = list_data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(context)
                .load("http://192.168.43.48/berbagi/img/" + list_data.get(position).get("gambar"))
                .crossFade()
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.imghp);
        holder.txtjudul.setText(list_data.get(position).get("judul"));
    }

    @Override
    public int getItemCount() {
        return list_data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtjudul;
        ImageView imghp;

        public ViewHolder(View itemView) {
            super(itemView);

            txtjudul = (TextView) itemView.findViewById(R.id.txtjudul);
            imghp = (ImageView) itemView.findViewById(R.id.imghp);
        }
    }
}