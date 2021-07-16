package com.kmtstudio.tablayoutwithviewpager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ScreenSliderAdapter extends FragmentStateAdapter {

    String[] text = {"Bangladesh","Malta","Poland"};

    public ScreenSliderAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {

        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if (position==0) {

            return new BangladeshFragment();

        } else if (position==1) {

            return new MaltaFragment();

        } else if (position==2) {

            return new PolandFragment();
        }

        return new BangladeshFragment();
    }

    @Override
    public int getItemCount() {
        return text.length;
    }
}
