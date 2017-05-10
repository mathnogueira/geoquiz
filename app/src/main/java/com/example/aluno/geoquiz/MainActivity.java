package com.example.aluno.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aluno.geoquiz.entities.Question;
import com.example.aluno.geoquiz.feedback.IFeedbackService;
import com.example.aluno.geoquiz.feedback.ToastFeedbackService;
import com.example.aluno.geoquiz.services.QuizService;

public class MainActivity extends AppCompatActivity {

    private TextView campoPergunta;
    private IFeedbackService feedbackService;
    private QuizService service;
    private Question currentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        carregarProximaPergunta();
    }

    private void initComponents() {
        campoPergunta = (TextView) findViewById(R.id.perguntaTextView);
        feedbackService = new ToastFeedbackService(this);
        service = new QuizService();
    }

    public void responderTrue(View view) {
        validarResposta(true);
    }

    public void responderFalse(View view) {
        validarResposta(false);
    }

    public void proximaPergunta(View view) {
        carregarProximaPergunta();
    }

    private void validarResposta(boolean resposta) {
        String feedback;
        if (service.ValidateQuestion(currentQuestion, resposta)) {
            feedback = getString(R.string.successFeedback);
        } else {
            feedback = getString(R.string.failFeedback);
        }
        feedbackService.show(feedback);
        carregarProximaPergunta();
    }

    private void carregarProximaPergunta() {
        currentQuestion = service.getRandomQuestion();
        campoPergunta.setText(currentQuestion.getQuestion());
    }
}
