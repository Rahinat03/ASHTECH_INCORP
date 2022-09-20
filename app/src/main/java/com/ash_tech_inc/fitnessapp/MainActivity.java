package com.ash_tech_inc.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout exerciseLL,stepCounterLL;
    private LottieAnimationView exerciseLAV,stepCounterLAV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exerciseLL = findViewById(R.id.LLExercise);
        stepCounterLL = findViewById(R.id.LLStepCounter);
        exerciseLAV = findViewById(R.id.LAVExercise);
        stepCounterLAV = findViewById(R.id.LAVStepCounter);

        exerciseLAV.setAnimationFromUrl("https://assets4.lottiefiles.com/packages/lf20_vxnelydc.json");
        stepCounterLAV.setAnimationFromUrl("https://assets7.lottiefiles.com/packages/lf20_hvmtpjhe.json");

        exerciseLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,exerciseActivity.class);
                startActivity(i);

            }
        });
        stepCounterLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,stepCounterActivity.class);
                startActivity(i);

            }
        });
    }
}