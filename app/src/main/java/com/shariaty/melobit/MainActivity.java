package com.shariaty.melobit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.shariaty.melobit.fragments.NewFragment;
import com.shariaty.melobit.fragments.SearchFragment;
import com.shariaty.melobit.fragments.TopDayFragment;
import com.shariaty.melobit.fragments.TopWeekFragment;
import com.shariaty.melobit.fragments.TrendingArtist;

public class MainActivity extends AppCompatActivity {
    ImageView searchbtn;
    TextView txtnew,txttrend,txttopday,txttopweek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchbtn=findViewById(R.id.btnsearch);
        txttopweek=findViewById(R.id.txt_seeallweek);
        txtnew=findViewById(R.id.txt_seeallnew);
        txttrend=findViewById(R.id.txt_seeallartist);
        txttopday=findViewById(R.id.txt_seealltopday);

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new SearchFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.home_layout, frag).commit();
            }
        });

        txtnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new NewFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.home_layout, frag).commit();
            }
        });

        txttrend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new TrendingArtist();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.home_layout, frag).commit();
            }
        });

        txttopday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new TopDayFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.home_layout, frag).commit();
            }
        });

        txttopweek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new TopWeekFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.home_layout, frag).commit();
            }
        });
    }
}