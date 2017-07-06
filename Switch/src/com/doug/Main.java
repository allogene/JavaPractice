package com.doug;

public class Main {

    public static void main(String[] args) {

        char switchValue = 'D';
        switch (switchValue) {
            case 'A':
                System.out.println(switchValue + " was found.");
                break;
            case 'B':
                System.out.println(switchValue + " was found.");
                break;
            case 'C':

            case 'D':

            case 'E':
                System.out.println(switchValue + " was found.");
                break;
            default:
                System.out.println("Not Found");
                break;
        }
        String month = "March";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "march":
                System.out.println("Mar");
                break;
            default:
                System.out.println("Unknown Month");
        }
    }
}
