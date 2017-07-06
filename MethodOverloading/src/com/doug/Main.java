package com.doug;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Doug", 500);
        System.out.println("New score = " + newScore);

        newScore = calculateScore(600);
        System.out.println("New score = " + newScore);

        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player and no points.");
        return 0;
    }

}
