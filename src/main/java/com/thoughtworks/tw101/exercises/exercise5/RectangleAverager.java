package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int area=0;
        for(int i=0; i<rectangles.length; i++){
            area=area+rectangles[i].area();
        }
        return (float)area/rectangles.length;
    }
}
