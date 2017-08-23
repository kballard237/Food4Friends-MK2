package com.example.user.food4friends_mk2;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.user.food4friends_mk2.adapters.ProfilePagerAdapter;

public class ProfileActivity extends AppCompatActivity {

    ProfilePagerAdapter pagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.ic_silverware_logo);
        toolbar.setTitle(R.string.app_name);
        toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        pagerAdapter = new ProfilePagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(pagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
