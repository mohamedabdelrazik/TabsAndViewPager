package com.farag.hamzamohamed.fragmentapp;

import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapterSimple extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapterSimple(Context context ,FragmentManager fm){
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0){
            return new FirstFragmend();
        }else {
            return new SecondFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return context.getString(R.string.first);
        }else {
            return context.getString(R.string.second);
        }
    }
}
