package com.example.amazonapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapterClass extends RecyclerView.Adapter<RecyclerAdapterClass.UserHolder> {

    Context context;
    List<RecyclerModelClass> recyclerModelClassList= new ArrayList<>();

    public RecyclerAdapterClass(Context context, List<RecyclerModelClass> recyclerModelClassList) {
        this.context = context;
        this.recyclerModelClassList = recyclerModelClassList;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new UserHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {

        holder.textView.setText(recyclerModelClassList.get(position).getName());
        holder.imageView.setImageResource(recyclerModelClassList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return recyclerModelClassList.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;


        public UserHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.recyclerImage1);
            textView = itemView.findViewById(R.id.imageName);

        }
    }
}
