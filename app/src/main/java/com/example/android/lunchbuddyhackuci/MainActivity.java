package com.example.android.lunchbuddyhackuci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("DSLKFJSDLKFJKSDFS");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextActivity = (Button) findViewById(R.id.mapButtonActivityLoader);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MapUI.class));
            }
        });
    }

    public void openMap(View view){
//        startActivity(new Intent(MainActivity.this, MapUI.class));
//        setContentView(R.layout.map_ui);
    }
}
