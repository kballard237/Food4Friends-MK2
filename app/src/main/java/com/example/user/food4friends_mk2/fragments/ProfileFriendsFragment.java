package com.example.user.food4friends_mk2.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.food4friends_mk2.R;
import com.example.user.food4friends_mk2.adapters.MeetupAdapter;

/**
 * Created by user on 8/22/17.
 */

public class ProfileFriendsFragment extends Fragment {

    //public MeetupAdapter meetupAdapter;
    //    public ArrayList<Tweet> tweets;
    public RecyclerView rvFriends;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_friends_profile, container, false);


        rvFriends = (RecyclerView) v.findViewById(R.id.rvFriendsProfile);
//        tweets = new ArrayList<>();
//        tweetAdapter = new TweetAdapter(tweets, new TweetAdapter.TweetAdapterListener() {
//            @Override
//            public void onItemSelected(View view, int position) {
//                Intent intent = new Intent(getContext(), MeetupDetailsActivity.class);
//        //or launch dialog fragment
//                startActivity(intent);
//            }
//        });
        //meetupAdapter = new MeetupAdapter();
        rvFriends.setLayoutManager(new LinearLayoutManager(getContext()));
        //rvFriends.setAdapter(meetupAdapter);

        return v;
    }

}
