package com.example.drawer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Activity context;
    private List<Data> data_list;
    private ViewHolder mviewHolder;

    public Adapter(Activity context,List<Data> data_list) {
        this.context = context;
        this.data_list = data_list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mview = LayoutInflater.from(context).inflate(R.layout.adapter_layout, null);
        return new Adapter.ViewHolder(mview);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {

        mviewHolder = (Adapter.ViewHolder)viewHolder;

        mviewHolder.text.setText(data_list.get(i).getId());
        mviewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, data_list.get(i).getId(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return data_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text=(TextView)itemView.findViewById(R.id.text);

        }


    }
}
