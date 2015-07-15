package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by sallie on 7/15/15.
 */
public class Troll implements Monster{

    String name="troll";
    private int hitpoints=40;

    public Troll(String name){
        this.name=name;
    }

    public String name(){
        return name;
    }

    public void takeDamage(int amount){
        hitpoints= hitpoints-amount/2;
    }

    public int currentHitpoints(){
        return hitpoints;
    }

}
