package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    int callCounter=0;

    public void increment(){
        callCounter++;
    }

    public int total(){
        System.out.print("increment has been called "+callCounter+" times.");
        return callCounter;
    }

}
