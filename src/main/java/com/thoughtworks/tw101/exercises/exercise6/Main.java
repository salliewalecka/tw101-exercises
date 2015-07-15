package com.thoughtworks.tw101.exercises.exercise6;
import java.util.ArrayList;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// reportStatus methods. Create instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the status of all monsters using a void reportStatus() method. ReportStatus should print the name and current hit 
// points of the monster.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

public class Main {

    public static void reportStatus(Monster monster){
        System.out.println(monster.name()+" with "+monster.currentHitpoints()+" hitpoints");
    }


    public static void main(String[] args) {

        ArrayList<Monster> monsters= new ArrayList<>();

        monsters.add(new Orc("abby"));
        monsters.add(new Troll("al"));
        monsters.add(new Orc("brianna"));
        monsters.add(new Troll("bob"));
        monsters.add(new Orc("clare"));

        for(Monster currentMonster: monsters){
            currentMonster.takeDamage(10);
        }

        for (Monster currentMonster: monsters){
            reportStatus(currentMonster);
        }

    }
}
