package com.ash_tech_inc.fitnessapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;

public class rv_adapter extends RecyclerView.Adapter<rv_adapter.ExerciseViewHolder> {

     private ArrayList<exercise_RV_Model> rv_modelArrayList;
     private Context context;
     private ExerciseClickInterface exerciseClickInterface;

    public rv_adapter(ArrayList<exercise_RV_Model> rv_modelArrayList, Context context, ExerciseClickInterface exerciseClickInterface) {
        this.rv_modelArrayList = rv_modelArrayList;
        this.context = context;
        this.exerciseClickInterface = exerciseClickInterface;
    }

    @NonNull
    @Override
    public rv_adapter.ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item,parent,false);
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull rv_adapter.ExerciseViewHolder holder, int position) {
        holder.exercise_TV.setText(rv_modelArrayList.get(position).getExerciseName());
        holder.exercise_LAV.setAnimationFromUrl(rv_modelArrayList.get(position).getImageURL());
        String time = String.valueOf(rv_modelArrayList.get(position).getTime()) + "MIN";
        holder.time_TV.setText(time);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exerciseClickInterface.onExerciseClick(position);

            }
        });

    }

    @Override
    public int getItemCount() {
        return rv_modelArrayList.size();
    }

    public class ExerciseViewHolder extends RecyclerView.ViewHolder {

        private TextView exercise_TV,time_TV;
        private LottieAnimationView exercise_LAV;
        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);
            exercise_TV = itemView.findViewById(R.id.exerciseNameTV);
            time_TV = itemView.findViewById(R.id.exerciseTime);
            exercise_LAV = itemView.findViewById(R.id.exerciseLAV);


        }
    }

    public interface ExerciseClickInterface{
        void onExerciseClick(int position);
    }
}
