package com.doug;

public class Main  {

    public static void main(String[] args) {

    Porche porche = new Porche("Chayanne",4, "Alpha", 5, 1, 1);

    porche.accelerate(50,2);
    porche.brake(25,1);
    porche.turbo();
    porche.accelerate(75,6);
    porche.brake(0,-1);
    }
}
