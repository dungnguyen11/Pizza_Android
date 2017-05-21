package com.example.sam.pizza.CustomerActivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sam.pizza.Customer;
import com.example.sam.pizza.MainActivity;
import com.example.sam.pizza.PizzaOverflowApplication;
import com.example.sam.pizza.R;

public class CustomerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        Button logOutButton = (Button) findViewById(R.id.customer_log_out_button);
        logOutButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent logOutIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(logOutIntent, 0);
            }
        });

        Button newOrderButton = (Button) findViewById(R.id.customer_new_order_button);
        newOrderButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent newOrderIntent = new Intent(view.getContext(), MakeOrderCustomerActivity.class);
                startActivityForResult(newOrderIntent, 0);
            }
        });
//
//        Button feedbackButton = (Button) findViewById(R.id.giveFeedback_button);
//        feedbackButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view) {
//                Intent feedbackIntent = new Intent(view.getContext(), FeedbackActivity.class);
//                startActivityForResult(feedbackIntent, 0);
//            }
//
//        });
    }


}
