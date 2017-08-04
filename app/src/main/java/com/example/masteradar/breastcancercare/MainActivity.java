package com.example.masteradar.breastcancercare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<View> viewsToFadeIn = new ArrayList<View>();

        viewsToFadeIn.add(findViewById(R.id.button1));
        viewsToFadeIn.add(findViewById(R.id.button2));
        viewsToFadeIn.add(findViewById(R.id.button3));
        viewsToFadeIn.add(findViewById(R.id.button4));
        viewsToFadeIn.add(findViewById(R.id.button5));

        final Button BtnHospital = (Button) findViewById(R.id.button3);
        BtnHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findHospital();
            }
        });

        for (View v : viewsToFadeIn)
        {
            v.setAlpha(0); // make invisible to start
        }

        for (View v : viewsToFadeIn)
        {
            // 3 second fade in time
            v.animate().alpha(1.0f).setDuration(3000).start();
        }

    }
    private void findHospital(){
        Intent intent = new Intent(this,FindHospital.class);

        startActivity(intent);
    }
}
