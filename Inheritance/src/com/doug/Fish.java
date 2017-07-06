package com.doug;

/**
 * Created by Acer on 4/28/2017.
 */
public class Fish extends Animal{
    private int gills, eyes, fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){
        System.out.println("Fish.rest called");
    }

    private void movedMuscles(){
        System.out.println("Fish.moveMuscles called");
    }

    private void moveBackFin(){
        System.out.println("Fish.moveBackFin called");
    }

    private void swim(int speed){
        movedMuscles();
        moveBackFin();
        super.move(speed);
    }
}
