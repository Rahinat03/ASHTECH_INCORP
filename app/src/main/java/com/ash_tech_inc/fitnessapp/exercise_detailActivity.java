package com.ash_tech_inc.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class exercise_detailActivity extends AppCompatActivity {

    private TextView exerciseName_TV,calories_TV,time_TV,descrip_TV;
    private LottieAnimationView exercise_LAV;
    private String exerciseName,descrip,imgURL;
    private int calories,time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_detail);

        exerciseName_TV = findViewById(R.id.ExerciseName_TV);
        calories_TV = findViewById(R.id.Calories_Tv);
        time_TV = findViewById(R.id.Time_Tv);
        descrip_TV = findViewById(R.id.Descrip_Tv);
        exercise_LAV = findViewById(R.id.Exercise_LAV);

        exerciseName = getIntent().getStringExtra("exerciseName");
        descrip = getIntent().getStringExtra("description");
        imgURL = getIntent().getStringExtra("imageURL");
        calories = getIntent().getIntExtra("calories",0);
        time = getIntent().getIntExtra("time",0);
        exerciseName_TV.setText(exerciseName);
        calories_TV.setText("Calories :" + calories);
        time_TV.setText("Time: "+ time);
        descrip_TV.setText(descrip);
        exercise_LAV.setAnimationFromUrl(imgURL);




    }
}