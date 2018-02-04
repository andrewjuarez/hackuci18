package com.example.android.lunchbuddyhackuci;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {

    public String username;
    public String email;
    public double lat;
    public double lng;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

}