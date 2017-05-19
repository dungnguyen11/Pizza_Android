package com.example.sam.pizza.DeliveryActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sam.pizza.MainActivity;
import com.example.sam.pizza.R;

public class DeliveryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_list);
        Button deliveredOrders = (Button) findViewById(R.id.delivery_finished_orders_button);
        deliveredOrders.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent finishedIntent = new Intent(view.getContext(), FinishedOrderedActivity.class);
                startActivityForResult(finishedIntent, 0);
            }
        });

        Button logOut1Orders = (Button) findViewById(R.id.delivery_log_out_button1);
        logOut1Orders.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent logOutIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(logOutIntent, 0);
            }
        });
    }
}
