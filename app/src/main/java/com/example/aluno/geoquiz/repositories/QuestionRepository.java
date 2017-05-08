package com.example.aluno.geoquiz.repositories;

import com.example.aluno.geoquiz.entities.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by aluno on 08/05/17.
 */

public class QuestionRepository {

    private List<Question> mocked = new ArrayList<>();

    public QuestionRepository() {
        mocked.add(new Question("São Paulo é a capital do Brasil", false));
        mocked.add(new Question("Toronto é a capital do Canadá", false));
        mocked.add(new Question("Tokyo é a capital do Japão", true));
        mocked.add(new Question("Londres é a capital do Reino Unido", false));
        mocked.add(new Question("Londres é a capital da Inglaterra", true));
        Collections.shuffle(mocked);
    }

    public List<Question> ListAll() {
        return mocked;
    }
}
