package com.example.user.food4friends_mk2.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.food4friends_mk2.R;

/**
 * Created by user on 8/22/17.
 */

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.ViewHolder>{

    Context context;

    @Override
    public FriendsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View friendsView = inflater.inflate(R.layout.item_friend, parent, false);
        FriendsAdapter.ViewHolder viewHolder = new FriendsAdapter.ViewHolder(friendsView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(FriendsAdapter.ViewHolder holder, int position) {
        //holder.item
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        //attributes in item

        public ViewHolder(View itemView) {
            super(itemView);
            //set values
        }

        @Override
        public void onClick(View view) {
            //load profile of selected user
        }
    }
}
