package com.example.user.food4friends_mk2.adapters;

import android.content.Context;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.food4friends_mk2.R;
import com.example.user.food4friends_mk2.models.Meetup;

import java.util.ArrayList;

/**
 * Created by user on 8/21/17.
 */

public class MeetupAdapter extends RecyclerView.Adapter<MeetupAdapter.ViewHolder> {

    Context context;
    ArrayList<Meetup> meetups;

    public MeetupAdapter(ArrayList<Meetup> meetupArrayList){
        meetups = meetupArrayList;
    }

    @Override
    public MeetupAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View meetupView = inflater.inflate(R.layout.item_meetup_profile, parent, false);
        ViewHolder viewHolder = new ViewHolder(meetupView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MeetupAdapter.ViewHolder holder, int position) {
        Meetup meetup = meetups.get(position);
//        holder.meetupName.setText(meetup.getMeetupName());
//        holder.location.setText(meetup.getLocation());
//        holder.meetupDate.setText(meetup.getMeetupDate().toString());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView meetupName;
        private TextView location;
        private TextView meetupDate;

        public ViewHolder(View itemView) {
            super(itemView);
            meetupName = (TextView) itemView.findViewById(R.id.tvMeetupName);
            location = (TextView) itemView.findViewById(R.id.tvLocation);
            meetupDate = (TextView) itemView.findViewById(R.id.tvMeetupDate);
        }

        @Override
        public void onClick(View view) {
            //get detailed view of selected meetup
        }
    }
}
