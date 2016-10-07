package com.debugandroid.viewpagerexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

        private FragmentManager fm;
        public PageAdapter(FragmentManager fm){
            super(fm);
            this.fm=fm;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment=null;
            if(position==0){
                fragment=new Fragment1();
            }
            if(position==1){
                fragment=new Fragment2();
            }
            if(position==2){
                fragment=new Fragment3();
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public int getItemPosition(Object object)
        {

            return POSITION_UNCHANGED;

        }

    }

