package com.sudheer.swipeabletabs.view.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.sudheer.swipeabletabs.R;
import com.sudheer.swipeabletabs.view.fragments.Favorites;
import com.sudheer.swipeabletabs.view.fragments.Home;
import com.sudheer.swipeabletabs.view.fragments.Profile;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Home blankFragment;
    private Favorites blankFragment2;
    private Profile blankFragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        blankFragment = new Home();
        blankFragment2 = new Favorites();
        blankFragment3 = new Profile();

        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());

        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(myPagerAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


    }

    class MyPagerAdapter extends FragmentPagerAdapter {

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

}