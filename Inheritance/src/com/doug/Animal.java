package com.doug;

/**
 * Created by Acer on 4/28/2017.
 */
public class Animal {
    private String name;
    private int brain, body, size, weight;


    public Animal(String name, int brain, int body, int size, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void eat (){
        System.out.println("Animal.Eat called");
    }

    public void move(int speed){
        System.out.println("Animal is moving at " + speed);
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
