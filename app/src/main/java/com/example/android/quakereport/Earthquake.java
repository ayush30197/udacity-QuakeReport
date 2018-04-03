package com.example.android.quakereport;

import android.net.Uri;

import java.net.URI;
import java.net.URL;

/**
 * Created by bansa on 3/12/2018.
 */

public class Earthquake {
    private double magnitude;
   private String location;
    private long date;
    private String url;

    public Earthquake(double mag, String loc, long eDate, String url) {
        this.magnitude = mag;
        this.location = loc;
        this.date = eDate;
    }
    public double getMagnitude(){
        return magnitude;
    }
    public String getLocation(){
        return location;
    }
    public long getDate(){
        return date;
    }

    public String getUrl() {
        return url;
    }
}
//
        /*down vote
        Here is an answer for developers using Android Studio.
        Operating System : Mac OS X El Capitan
        IDE : Android Studio 2.2
        For some reasons, I wasn't able to access internet through my AVD at work (probably proxy or network configuration issues). What did the trick for me was to launch in command line my AVD and giving manually the Google public DNS 8.8.8.8.
        In your Terminal go to the folder tools of your Android sdk to find the 'emulator' program:
        cd ~/Library/Android/sdk/tools
        Then retrieve the name of your AVDs :
        emulator -list-avds
        It will return you something like this:
        Android_Wear_Round_API_23
        Nexus_10_API_22
        Nexus_5X_API_22
        Nexus_5X_API_24
        Nexus_9_API_24
        Then launch the AVD you would like with the following instructions:
        emulator -avd NameOfYourDevice -dns-server 8.8.8.8
        Your AVD is launched and you should be able to use internet.*/