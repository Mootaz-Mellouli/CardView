package com.example.cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    ArrayList<String> villenames;
    ArrayList<Integer> villeimages;
    Context ctx;
//    ArrayList<String> data;
    public CustomAdapter(Context ctx, ArrayList villeimages, ArrayList villenames)
    {

       villeimages=villeimages;
       villenames=villenames;
       ctx=ctx;

    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout,parent,false),this);
    }



    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.name.setText(villenames.get(position));
        holder.image.setImageResource(villeimages.get(position));
    }



    @Override
    public int getItemCount() {
        return villenames.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        //TextView itemtext;
        CustomAdapter myadapter;
        TextView name;
        ImageView image;

        public MyViewHolder(@NonNull View itemView, CustomAdapter adapter) {
            super(itemView);
            name =itemView.findViewById(R.id.textview);
            image= itemView.findViewById(R.id.imageview);
            myadapter=adapter;

        }


    }


}
