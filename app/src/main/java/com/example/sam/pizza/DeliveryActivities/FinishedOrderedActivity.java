package com.example.sam.pizza.DeliveryActivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sam.pizza.MainActivity;
import com.example.sam.pizza.R;

public class FinishedOrderedActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_finish);

        Button orderList = (Button) findViewById(R.id.delivery_orders_list_button);
        orderList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent listIntent = new Intent(view.getContext(), DeliveryListActivity.class);
                startActivityForResult(listIntent, 0);
            }
        });

        Button logOut2Orders = (Button) findViewById(R.id.delivery_log_out_button2);
        logOut2Orders.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent logOutIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(logOutIntent, 0);
            }
        });

    }
}
