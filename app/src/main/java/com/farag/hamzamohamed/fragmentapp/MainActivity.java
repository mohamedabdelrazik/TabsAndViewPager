package com.farag.hamzamohamed.fragmentapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Hello
    // git push gitHub
    // git push gitLab
    // git
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);

        // Create an adapter that knows which fragment should be shown on each page
        FragmentAdapterSimple mAdapter = new FragmentAdapterSimple(this,getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(mAdapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
    }
}
