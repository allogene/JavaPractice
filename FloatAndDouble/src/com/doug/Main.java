package com.doug;

public class Main {

    public static void main(String[] args) {

    double myWeightPounds = 220d;
    double myWeightKilo = 0d;
    double myKiloConv = 0.45359237d;

    myWeightKilo = myWeightPounds * myKiloConv;

    System.out.println("myWeightPounds = " + myWeightPounds);
    System.out.println("myWeightKilograms = " + myWeightKilo);



    }
}
