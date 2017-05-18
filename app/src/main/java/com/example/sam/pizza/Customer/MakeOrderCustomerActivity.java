package com.example.sam.pizza.Customer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sam.pizza.MainActivity;
import com.example.sam.pizza.R;

public class MakeOrderCustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_order_customer2);


        Button orderListButton = (Button) findViewById(R.id.customer_order_list_button);
        orderListButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent orderListIntent = new Intent(view.getContext(), CustomerActivity.class);
                startActivityForResult(orderListIntent, 0);
            }

        });

        Button mainButton = (Button) findViewById(R.id.customer_log_out_button);
        mainButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent mainIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(mainIntent, 0);
            }

        });

        Button nextButton = (Button) findViewById(R.id.customer_order_next_button);
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent confirmIntent = new Intent(view.getContext(), ConfirmOrderActivity.class);
                Bundle bundle = new Bundle();

                String testString = "hello there";
                bundle.putString("stuff", testString);
                confirmIntent.putExtras(bundle);
                startActivityForResult(confirmIntent, 0);
            }

        });
//
//        String testString = "hahaha";
//        Intent i = new Intent(this, ConfirmOrderActivity.class);
//        Bundle bundle = new Bundle();
//        bundle.putString("stuff", testString);
//        i.putExtras(bundle);
//        startActivity(i);

    }
}
