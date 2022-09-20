package com.ash_tech_inc.fitnessapp;

public class exercise_RV_Model {
    private String exerciseName;
    private String exerciseDescrip;
    private String imageURL;
    private int calories,time;

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getExerciseDescrip() {
        return exerciseDescrip;
    }

    public void setExerciseDescrip(String exerciseDescrip) {
        this.exerciseDescrip = exerciseDescrip;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public exercise_RV_Model(String exerciseName, String exerciseDescrip, String imageURL, int calories, int time) {
        this.exerciseName = exerciseName;
        this.exerciseDescrip = exerciseDescrip;
        this.imageURL = imageURL;
        this.calories = calories;
        this.time = time;
    }
}
