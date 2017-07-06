package com.doug;

public class Main {

    public static void main(String[] args) {
	// int width of 32
    int myIntValue = 234567;


	//width of 8
	byte myByteValue = 56;


	// width of 16
	short myShortValue = 3423;


	//width of 64
	long myLongMinValue = 10000L + 10L*(myIntValue + myByteValue + myShortValue);

        System.out.println("My Total  = " + myLongMinValue);
    }
}
