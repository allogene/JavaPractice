package com.doug;

public class Main {

    public static void main(String[] args) {
/*
        double interest = 2.00;

        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 @ " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00, i)));

        }
        System.out.println("*********************");
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 @ " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
*/
        int countOfPrimes = 0;
        for (int i = 100; i < 1000; i++) {

            if (isPrime(i)) {
                countOfPrimes++;
                System.out.println("Prime Number " + i + " found.");
                System.out.println("Total Prime Numbers found = " + countOfPrimes);
            }
            if (countOfPrimes == 10) {
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}