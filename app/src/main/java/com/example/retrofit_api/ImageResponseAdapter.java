package com.example.retrofit_api;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit_api.model.ImageResponseItem;

import java.util.List;

public class ImageResponseAdapter extends RecyclerView.Adapter<ImageResponseAdapter.viewHolder> {

    List<ImageResponseItem> list ;
    public ImageResponseAdapter(List<ImageResponseItem> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_item,parent,false);
        viewHolder viewHolder = new viewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

       // holder.img_rcv.setImageResource(list.get(position).getUrl());
        holder.title_txt.setText(list.get(position).getTitle());

        Log.e("TAG", "onBindViewHolder: "+list.get(position).getTitle() );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView img_rcv;
        TextView title_txt;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            img_rcv = itemView.findViewById(R.id.img_rcv);
            title_txt = itemView.findViewById(R.id.title_txt);
        }
    }
}
