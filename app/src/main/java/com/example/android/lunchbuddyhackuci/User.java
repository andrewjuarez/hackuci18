package com.example.android.lunchbuddyhackuci;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {


    private String firstName;
    private String lastName;
    public String uniqueID;
    private double lat;
    private double lng;
    private String lunch;
    private String study;
    private String picURI;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }


    public String getPicURI() {
        return picURI;
    }

    public void setPicURI(android.net.Uri picURI) {
        String url = picURI.toString();
        this.picURI = url;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }


    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }
}