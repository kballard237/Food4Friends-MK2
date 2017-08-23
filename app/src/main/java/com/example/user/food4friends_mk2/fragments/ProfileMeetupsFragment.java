package com.example.user.food4friends_mk2.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.food4friends_mk2.R;
import com.example.user.food4friends_mk2.adapters.MeetupAdapter;
import com.example.user.food4friends_mk2.models.Meetup;

import java.util.ArrayList;

/**
 * Created by user on 8/21/17.
 */

public class ProfileMeetupsFragment extends Fragment {

    public MeetupAdapter meetupAdapter;
    public ArrayList<Meetup> meetups;
    public RecyclerView rvMeetups;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meetups_profile, container, false);

        rvMeetups = (RecyclerView) view.findViewById(R.id.rvMeetupsProfile);
        meetups = new ArrayList<>();
        meetupAdapter = new MeetupAdapter(meetups);
        rvMeetups.setLayoutManager(new LinearLayoutManager(getContext()));
        rvMeetups.setAdapter(meetupAdapter);

        return view;
    }

}
