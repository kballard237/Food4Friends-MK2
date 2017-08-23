package com.example.user.food4friends_mk2.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.user.food4friends_mk2.fragments.ProfileFriendsFragment;
import com.example.user.food4friends_mk2.fragments.ProfileMeetupsFragment;

/**
 * Created by user on 8/21/17.
 */

public class ProfilePagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] {"Meetups", "Friends"};
    private Context context;
    public ProfilePagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }
    private ProfileMeetupsFragment meetupsFragment = new ProfileMeetupsFragment();
    private ProfileFriendsFragment friendsFragment = new ProfileFriendsFragment();

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return meetupsFragment;
            case 1:
                return friendsFragment;
            default:
                return null;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
