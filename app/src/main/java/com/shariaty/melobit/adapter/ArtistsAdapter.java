package com.shariaty.melobit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shariaty.melobit.Models.MelobitData;
import com.shariaty.melobit.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ArtistsAdapter  extends RecyclerView.Adapter<ArtistsAdapter.TrendViewHolder>{

    Context context;
    List<MelobitData> list;
    public ArtistsAdapter(Context context, List<MelobitData> list){
        this.list=list;
        this.context= context;
    }
    @NonNull
    @Override
    public ArtistsAdapter.TrendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.trending_artist,parent,false);
        return new ArtistsAdapter.TrendViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtistsAdapter.TrendViewHolder holder, int position) {
        Picasso.get().load(list.get(position).image.cover_small.url).into(holder.artistimg);
        holder.artistname.setText(list.get(position).artists.get(0).fullName);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class TrendViewHolder extends RecyclerView.ViewHolder{
        ImageView artistimg;
        TextView artistname;
        public TrendViewHolder(@NonNull View itemView) {
            super(itemView);
            artistimg = itemView.findViewById(R.id.artistimg);
            artistimg=itemView.findViewById(R.id.artistnametop);
        }
    }
}
