package com.example.aluno.geoquiz.services;

import com.example.aluno.geoquiz.entities.Question;
import com.example.aluno.geoquiz.repositories.QuestionRepository;

import java.util.List;

/**
 * Created by aluno on 08/05/17.
 */

public class QuizService {

    private int index = 0;
    private QuestionRepository repository;
    private List<Question> questions;

    public QuizService() {
        repository = new QuestionRepository();
        questions = repository.ListAll();
    }

    public boolean ValidateQuestion(Question question, boolean answer) {
        return (question.isCorrentAnswer() == answer);
    }

    public Question getRandomQuestion() {
        index = index % questions.size();
        Question question = questions.get(index++);
        return question;
    }
}
