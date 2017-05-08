package com.example.aluno.geoquiz.entities;

/**
 * Created by aluno on 08/05/17.
 */

public class Question {

    private String question;
    private boolean correntAnswer;

    public Question(String question, boolean correctAnswer) {
        this.question = question;
        this.correntAnswer = correctAnswer;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isCorrentAnswer() {
        return correntAnswer;
    }

    public void setCorrentAnswer(boolean correntAnswer) {
        this.correntAnswer = correntAnswer;
    }
}
