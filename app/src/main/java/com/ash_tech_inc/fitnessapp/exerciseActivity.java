package com.ash_tech_inc.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class exerciseActivity extends AppCompatActivity implements rv_adapter.ExerciseClickInterface{

    private RecyclerView exerciseRV;
    private ArrayList<exercise_RV_Model>rv_modelArrayList;
    private rv_adapter exerciserv_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        exerciseRV = findViewById(R.id.RV_exercise);
        rv_modelArrayList = new ArrayList<>();
        exerciserv_adapter =new rv_adapter(rv_modelArrayList,this,this::onExerciseClick);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        exerciseRV.setLayoutManager(manager);
        exerciseRV.setAdapter(exerciserv_adapter);
        addData();

    }

    private  void addData(){
        rv_modelArrayList.add(new exercise_RV_Model("Side Plank",getResources().getString(R.string.Side_Plank),"https://assets4.lottiefiles.com/packages/lf20_EOXjkv.json",25,10));
        rv_modelArrayList.add(new exercise_RV_Model("Lunges",getResources().getString(R.string.Lunges),"https://assets10.lottiefiles.com/packages/lf20_XbVCR4.json",30,10));
        rv_modelArrayList.add(new exercise_RV_Model("High Stepping",getResources().getString(R.string.High_stepping),"https://assets10.lottiefiles.com/packages/lf20_igizh2.json",35,10));
        rv_modelArrayList.add(new exercise_RV_Model("Bridge",getResources().getString(R.string.Bridge),"https://assets6.lottiefiles.com/packages/lf20_flq1qinv.json",25,10));
        rv_modelArrayList.add(new exercise_RV_Model("Cobra Stretch",getResources().getString(R.string.Cobra_stretch),"https://assets6.lottiefiles.com/packages/lf20_fqjp206k.json",35,10));
        exerciserv_adapter.notifyDataSetChanged();



    }

    @Override
    public void onExerciseClick(int position) {
        Intent i = new Intent(exerciseActivity.this,exercise_detailActivity.class);
        i.putExtra("exerciseName",rv_modelArrayList.get(position).getExerciseName());
        i.putExtra("imageURL",rv_modelArrayList.get(position).getImageURL());
        i.putExtra("time",rv_modelArrayList.get(position).getTime());
        i.putExtra("calories",rv_modelArrayList.get(position).getCalories());
        i.putExtra("description",rv_modelArrayList.get(position).getExerciseDescrip());
        startActivity(i);



    }
}