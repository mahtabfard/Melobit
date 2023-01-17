package com.shariaty.melobit.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.shariaty.melobit.R;

public class TopHitsFragment extends Fragment {

    ImageView backbtn;
    TabLayout tab ;
    ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_top_hits, container, false);
        backbtn = view.findViewById(R.id.bt_back);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tab = view.findViewById(R.id.tab_layout);
        viewPager = view.findViewById(R.id.view_pager);
        tab.setupWithViewPager(viewPager);
        MyViewPager myViewPager = new MyViewPager(getActivity().getSupportFragmentManager()
                , FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        myViewPager.addFragment(new PersianFragment(),"Persian");
        myViewPager.addFragment(new ForeignFragment(),"foreign");
        viewPager.setAdapter(myViewPager);
        return  view;
    }
}