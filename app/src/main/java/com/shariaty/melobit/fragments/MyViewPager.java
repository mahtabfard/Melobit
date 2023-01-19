package com.shariaty.melobit.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyViewPager extends FragmentPagerAdapter {
    private  final ArrayList<Fragment> fragmentsarray = new ArrayList<>();
    private final ArrayList<String> fragmentstitle = new ArrayList<>();
    public MyViewPager(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentsarray.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsarray.size();
    }

    public void addFragment(Fragment fragment,String string) {
        fragmentsarray.add(fragment);
        fragmentstitle.add(string);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentstitle.get(position);
    }
}


