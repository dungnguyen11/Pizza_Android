package com.example.sam.pizza.Customer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sam.pizza.R;

public class ConfirmOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);

        Bundle bundle = getIntent().getExtras();
        String stuff = bundle.getString("stuff");
        TextView text = (TextView) findViewById(R.id.customer_confirm_order_text);
        text.setText(stuff);

    }
}
