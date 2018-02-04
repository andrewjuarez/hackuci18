package com.example.android.lunchbuddyhackuci;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MapUI extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    private Location mLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_ui);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        ArrayList<String> friends = new ArrayList<String>();
        friends.add("Becky");
        friends.add("Tom");
        friends.add("Albert");
        friends.add("Jorge");
        friends.add("Max");
        friends.add("Tupac");
        friends.add("Billy Mayes");
        friends.add("Elvis Presely");
        friends.add("Atlanta Seahawks");
        friends.add("Nintendo");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friends);
        ListView listView = (ListView) findViewById(R.id.friendList);
        listView.setAdapter(itemsAdapter);
    }

    @Override
    public void onMapReady(GoogleMap map) {
//        LatLng currentLocation = new LatLng(mLocation.getLatitude(), mLocation.getLongitude());
        mMap = map;
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney").
                icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
//        mMap.addMarker(new MarkerOptions().position(currentLocation).title("My location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

    }
}
