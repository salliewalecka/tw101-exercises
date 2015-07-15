package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {
    //sums the odd entries between start and end exclusive

    public int of(int start, int end) {
        int sum=0;
        for(int i=start+1; i<end; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
