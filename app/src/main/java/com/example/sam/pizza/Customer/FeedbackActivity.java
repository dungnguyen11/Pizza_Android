package com.example.sam.pizza.Customer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sam.pizza.R;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }
    public void submitFeedback(View view) {
        displayThankFeedback();
    }
    private void displayThankFeedback() {
        String thank = "Thank you for your feedback! We are really appreciated!";
        TextView textView = (TextView) findViewById(R.id.thank_textView_feedback);
        textView.setText(thank);
    }
}
