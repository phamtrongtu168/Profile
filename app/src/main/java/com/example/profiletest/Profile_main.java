package com.example.profiletest;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.profiletest.fregment.MyViewPager2Adappter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile_main extends AppCompatActivity {
    private ViewPager2 mviewPager2;
    private BottomNavigationView mbottomNavigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_main);
        mviewPager2 = findViewById(R.id.view_page);
        mbottomNavigationView = findViewById(R.id.bottom_navigation);
        MyViewPager2Adappter adappter = new MyViewPager2Adappter(this);
        mviewPager2.setAdapter(adappter);
        mviewPager2.setPageTransformer(new DepthPageTransFormer());
        mviewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position){
                    case 0:
                        mbottomNavigationView.getMenu().findItem(R.id.menu_profile).setChecked(true);
                        break;
                    case 1:
                        mbottomNavigationView.getMenu().findItem(R.id.menu_list).setChecked(true);
                        break;
                    case 2:
                        mbottomNavigationView.getMenu().findItem(R.id.menu_setting).setChecked(true);
                        break;




                }
            }
        });
        mbottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_profile:
                        mviewPager2.setCurrentItem(0);
                        break;
                    case R.id.menu_list:
                        mviewPager2.setCurrentItem(1);
                        break;
                    case R.id.menu_setting:
                        mviewPager2.setCurrentItem(2);
                        break;
                }
                return false;
            }
        });
    }
}