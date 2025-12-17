package com;

public class Question {

    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    char correctOption;

    public Question(String question, String optionA, String optionB,
                    String optionC, String optionD, char correctOption) {

        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
    }
}
