package com.example.profiletest.fregment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.ListFragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyViewPager2Adappter extends FragmentStateAdapter {
    public MyViewPager2Adappter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new ProFileFragment();
            case 1:
                return new ListMUFragment();
            case 2:
                return new SettingFragment();
            default:
                return new ProFileFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
