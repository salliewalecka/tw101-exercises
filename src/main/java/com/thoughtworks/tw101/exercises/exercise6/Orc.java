package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by sallie on 7/15/15.
 */
public class Orc implements Monster{
    String name="Orc";
    int hitpoints=20;

    public Orc(String name){
        this.name=name;
    }

    public String name(){
        return name;
    }

    public void takeDamage(int amount){
        hitpoints= hitpoints-amount;
    }

    public int currentHitpoints(){
        return hitpoints;
    }


}
