package com.example.android.lunchbuddyhackuci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextActivity = (Button) findViewById(R.id.mapButtonActivityLoader);
    }

    public void openMap(View view){
        setContentView(R.layout.map_ui);
    }
}
