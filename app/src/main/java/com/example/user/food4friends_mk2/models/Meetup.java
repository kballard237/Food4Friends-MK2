package com.example.user.food4friends_mk2.models;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by user on 8/22/17.
 */

public class Meetup {

    private String meetupName;
    private String location;
    private Date meetupDate;
    private String displayTo; //friends, global, etc.
    private String hostID;
    private ArrayList<String> participantIDs;

    public Meetup(){
        //empty default constructor
    }

    public String getMeetupName() {
        return meetupName;
    }

    public void setMeetupName(String meetupName) {
        this.meetupName = meetupName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getMeetupDate() {
        return meetupDate;
    }

    public void setMeetupDate(Date meetupDate) {
        this.meetupDate = meetupDate;
    }

    public String getDisplayTo() {
        return displayTo;
    }

    public void setDisplayTo(String displayTo) {
        this.displayTo = displayTo;
    }

    public String getHostID() {
        return hostID;
    }

    public void setHostID(String hostID) {
        this.hostID = hostID;
    }

    public ArrayList<String> getParticipantIDs() {
        return participantIDs;
    }

    public void setParticipantIDs(ArrayList<String> participantIDs) {
        this.participantIDs = participantIDs;
    }


}
