package com.sudheer.swipeabletabs.adapters;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sudheer.swipeabletabs.view.fragments.Favorites;
import com.sudheer.swipeabletabs.view.fragments.Home;
import com.sudheer.swipeabletabs.view.fragments.Profile;

public class MyPagerAdapter extends FragmentPagerAdapter {

    Home blankFragment = new Home();
    Favorites blankFragment2 = new Favorites();
    Profile blankFragment3 = new Profile();

    String[] fragmentNames = {"Home", "Favorite", "Profile"};

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return blankFragment;
            case 1:
                return blankFragment2;
            case 2:
                return blankFragment3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return fragmentNames.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentNames[position];
    }
}
