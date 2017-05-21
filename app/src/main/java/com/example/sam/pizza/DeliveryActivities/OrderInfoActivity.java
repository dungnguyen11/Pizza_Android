package com.example.sam.pizza.DeliveryActivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sam.pizza.R;

public class OrderInfoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_info);


        Button deliveredOrders = (Button) findViewById(R.id.delivery_finished_orders_button);
        deliveredOrders.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent finishedIntent = new Intent(view.getContext(), FinishedOrderedActivity.class);
                startActivityForResult(finishedIntent, 0);
            }
        });

//        Button deliveredOrders = (Button) findViewById(R.id.delivery_finished_orders_button);
//        deliveredOrders.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Intent finishedIntent = new Intent(view.getContext(), FinishedOrderedActivity.class);
//                startActivityForResult(finishedIntent, 0);
//            }
//        });
//
//        Button deliveredOrders = (Button) findViewById(R.id.delivery_finished_orders_button);
//        deliveredOrders.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Intent finishedIntent = new Intent(view.getContext(), FinishedOrderedActivity.class);
//                startActivityForResult(finishedIntent, 0);
//            }
//        });

    }


}
