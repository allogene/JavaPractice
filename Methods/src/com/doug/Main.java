package com.doug;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = 0;
        int ret = 0;

        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);

        score = 1500;
        levelCompleted = calculateHighScorePosition(score);
        displayHighScorePosition("Doug", levelCompleted);

        score = 900;
        levelCompleted = calculateHighScorePosition(score);
        displayHighScorePosition("Jim", levelCompleted);

        score = 400;
        levelCompleted = calculateHighScorePosition(score);
        displayHighScorePosition("Mike", levelCompleted);

        score = 50;
        levelCompleted = calculateHighScorePosition(score);
        displayHighScorePosition("Bill", levelCompleted);

        score = 1000;
        levelCompleted = calculateHighScorePosition(score);
        displayHighScorePosition("Joe", levelCompleted);

        score = 500;
        levelCompleted = calculateHighScorePosition(score);
        displayHighScorePosition("Joe", levelCompleted);

        score = 100;
        levelCompleted = calculateHighScorePosition(score);
        displayHighScorePosition("Joe", levelCompleted);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return score;
    }

    public static void displayHighScorePosition(String playerName, int positionInHighScoreTable) {
        System.out.println(playerName +
                " managed to get into position " +
                positionInHighScoreTable +
                " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if ((score >= 500) && (score < 1000)) {
            return 2;
        } else if ((score >= 100) && (score < 500)) {
            return 3;
        } else {
            return 4;
        }
    }

}
