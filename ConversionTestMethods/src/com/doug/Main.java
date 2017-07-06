package com.doug;

public class Main {

    public static void main(String[] args) {

        double feet = 1, inches = 1;

        double rCentimeters = calcFeetAndInchesToCentimeters(feet, inches);
        if (rCentimeters < 0) {
            System.out.println("Invalid input.");
        }
        else{
            System.out.println("Feet: " + feet +
                    " Inches: " + inches +
                    " = " + rCentimeters +
                    " Centimeters");
        }

        feet = 0;
        inches = 13;
        rCentimeters = calcFeetAndInchesToCentimeters(inches);
        if (rCentimeters < 0) {
            System.out.println("Invalid input.");
        }
        else{
            System.out.println("Feet: " + feet +
                    " Inches: " + inches +
                    " = " + rCentimeters +
                    " Centimeters");
        }

        feet = 0;
        inches = -13;
        rCentimeters = calcFeetAndInchesToCentimeters(inches);
        if (rCentimeters < 0) {
            System.out.println("Invalid input.");
        }
        else{
            System.out.println("Feet: " + feet +
                    " Inches: " + inches +
                    " = " + rCentimeters +
                    " Centimeters");
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        double centimetersConversionRate = 2.54;
        double centimeters = 0;

        if (feet >= 0 || ((inches <= 12) && (inches >= 0))) {
            centimeters = ((feet * 12) + inches) * centimetersConversionRate;
        } else {
            System.out.println("Invalid input provided.");
            return -1;
        }

        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {

        double feet;

        System.out.println("Inches: " + inches);

        if (inches >= 0) {
            feet = (int) inches/12;
            inches %= 12;

            //System.out.println("Inches: " + inches);
           // System.out.println("Feet: " + feet);

            return calcFeetAndInchesToCentimeters(feet,inches);
        } else {
            return -1;
        }

    }
}
