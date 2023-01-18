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

public class Adapter  extends RecyclerView.Adapter<Adapter.CustomeViewHolder> {

    Context context;
    List<MelobitData> songlist;
    public Adapter(Context context, List<MelobitData> songlist){
        this.songlist=songlist;
        this.context= context;
    }
    @NonNull
    @Override
    public CustomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
      View view=layoutInflater.inflate(R.layout.music_card,parent,false);
      return new CustomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomeViewHolder holder, int position) {
        Picasso.get().load(songlist.get(position).image.cover_small.url).into(holder.imageView);
       holder.namesong.setText(songlist.get(position).title);
        holder.nameartist.setText(songlist.get(position).artists.get(0).fullName);
    }

    @Override
    public int getItemCount() {
        return songlist.size();
    }

    public class CustomeViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView namesong,nameartist;
        public CustomeViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.smallimg);
            nameartist = itemView.findViewById(R.id.artistname);
            namesong = itemView.findViewById(R.id.songnametxt);
        }
    }
}
