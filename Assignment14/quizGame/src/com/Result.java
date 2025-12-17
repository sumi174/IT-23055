package com;

public class Result {

    private String playerName;
    private int score;

    // Default Constructor
    public Result() {
    }

    // Parameterized Constructor
    public Result(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    // Getter & Setter
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
