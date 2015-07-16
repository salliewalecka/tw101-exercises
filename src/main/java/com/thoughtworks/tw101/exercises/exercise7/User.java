package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by sallie on 7/15/15.
 */
public class User {

    int guess;

    public boolean evaluateGuess(int actual){
        if(actual==guess){
            System.out.println("Nice Job! You guessed "+ guess+" and the machine chose "+actual);
            return true;
        }
        else if (actual>guess){
            System.out.println("Your guess of "+ guess+" is too low.  Please guess again.");
        }
        else{
            System.out.println("Your guess of "+ guess+" is too high. Please guess again.");
        }
        return false;
    }

    public void readIn(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your guess:");
        // get user input for a
        String response = reader.next();
        guess= Integer.parseInt(response);
    }
}
