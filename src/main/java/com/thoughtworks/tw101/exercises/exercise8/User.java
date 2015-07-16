package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sallie on 7/15/15.
 */
public class User {

    private int guess;
    private ArrayList<Integer> guesses= new ArrayList<Integer>();

    public boolean evaluateGuess(int actual){
        if (guess==-1){
        }
        else if(actual==guess){
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
        try {
            guess = Integer.parseInt(response);
            guesses.add(guess);
        }
        catch (NumberFormatException e){
            System.out.println("Error! Please enter an integer only.");
            guess=-1;
        }
    }

    public void printGuesses(){
        System.out.print("Here are your guesses: ");
        for(int guess : guesses){
            System.out.print(guess+" ");
        }
        System.out.println();
    }
}
