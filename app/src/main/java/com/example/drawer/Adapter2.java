package com.example.drawer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class Adapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Activity context;
    private List<Data2> data_list;

    public Adapter2(Activity context, List<Data2> data_list) {
        this.context = context;
        this.data_list = data_list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mview = LayoutInflater.from(context).inflate(R.layout.adapter_layout2, null);
        return new Adapter2.ViewHolder(mview);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return data_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }


    }
}
