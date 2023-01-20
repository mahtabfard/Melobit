package com.shariaty.melobit.fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.shariaty.melobit.Models.MelobitData;
import com.shariaty.melobit.R;
import com.shariaty.melobit.Request;
import com.shariaty.melobit.adapter.Adapter;
import com.shariaty.melobit.manager.RequestManager;

import java.util.List;


public class NewFragment extends Fragment {

    RecyclerView recyclerView3;
    ProgressDialog dialog;
    RequestManager manager;
    Context context;

    public NewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new, container, false);
        recyclerView3 = view.findViewById(R.id.newrecycler);
        context = view.getContext();
        dialog = new ProgressDialog(context);
        dialog.setTitle("Loading...⌛");
        manager = new RequestManager(context);
        manager.getFixture(request);

        return view;
    }
    final Request request = new Request() {
        @Override
        public void didFetch(List<MelobitData> list, String status) {
            dialog.dismiss();
            recyclerView3.setHasFixedSize(true);
            recyclerView3.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL , false));
            RecyclerView.Adapter adapter = new Adapter(context,list);
            recyclerView3.setAdapter(adapter);
        }

        @Override
        public void didError(String status) {
            dialog.dismiss();
            Toast.makeText(context, status, Toast.LENGTH_SHORT).show();
        }
    };
}