package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

/**
 * Created by sallie on 7/15/15.
 */
public class NumberGenerator {

    private int generated;

    public int generateInt(){
        Random rand= new Random();
        generated=rand.nextInt(99)+1;
        System.out.println("Generating a number from 1 to 100 now");
        return generated;
    }
    public int getGenerated(){
        return generated;
    }



}
