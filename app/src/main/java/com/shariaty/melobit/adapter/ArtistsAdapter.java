package com.shariaty.melobit.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArtistsAdapter  extends RecyclerView.Adapter<ArtistsAdapter.TrendViewHolder>{

    @NonNull
    @Override
    public ArtistsAdapter.TrendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ArtistsAdapter.TrendViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class TrendViewHolder extends RecyclerView.ViewHolder{
        public TrendViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
