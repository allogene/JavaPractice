package com.doug;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,25,100);

        Dog dog = new Dog("Grayhound",20, 100,2,4, 1, 20, "short");

        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Shark",100, 1000,2,2,2);
        fish.eat();
        fish.move(5);
    }
}
