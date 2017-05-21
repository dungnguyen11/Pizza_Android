package com.example.sam.pizza.CustomerActivities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sam.pizza.R;

public class ConfirmOrderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);

        Bundle bundle = getIntent().getExtras();
        String stuff = bundle.getString("stuffs");
        TextView text = (TextView) findViewById(R.id.customer_confirm_order_text);
        text.setText(stuff);

    }
}
