package com.example.aluno.geoquiz.feedback;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by aluno on 08/05/17.
 */

public class ToastFeedbackService implements IFeedbackService {

    private Context context;

    public ToastFeedbackService(Context context) {
        this.context = context;
    }

    public void show(String feedback) {
        Toast.makeText(context, feedback, Toast.LENGTH_SHORT).show();
    }

    public void showLong(String feedback) {
        Toast.makeText(context, feedback, Toast.LENGTH_LONG).show();
    }
}
