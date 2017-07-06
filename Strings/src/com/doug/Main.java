package com.doug;

public class Main {

    public static void main(String[] args) {

        String mySting = "This is a string.";
        System.out.println(mySting);
        mySting = mySting + " As well as this.";
        System.out.println(mySting);
        mySting = mySting + "\u00AE";
        System.out.println(mySting);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);


        double mydouble1 = 20;
        double mydouble2 = 80;
        double mytotal = (mydouble1 + mydouble2);

        mytotal *= 25;
        double myremainder = mytotal % 40;
        if (myremainder <= 20)
            System.out.println("Total was over the limit");

    }
}
