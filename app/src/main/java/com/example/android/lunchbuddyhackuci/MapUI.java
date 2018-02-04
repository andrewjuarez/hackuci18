package com.example.android.lunchbuddyhackuci;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MapUI extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    private Location mLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_ui);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        System.out.println("inside on mapready");
        mMap = map;
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney").
                icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

    }
}