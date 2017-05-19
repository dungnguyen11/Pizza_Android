package com.example.sam.pizza;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sam.pizza.CustomerActivities.CustomerActivity;
import com.example.sam.pizza.DeliveryActivities.DeliveryListActivity;
import com.example.sam.pizza.OwnerActivities.OwnerActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                if (getLoginName().equalsIgnoreCase("customer")) {
                    Intent orderIntent = new Intent(view.getContext(), CustomerActivity.class);
                    startActivityForResult(orderIntent, 0);
                } else if (getLoginName().equalsIgnoreCase("owner")) {
                    Intent ownerIntent = new  Intent(view.getContext(), OwnerActivity.class);
                    startActivityForResult(ownerIntent, 0);
                } else if (getLoginName().equalsIgnoreCase("delivery")) {
                    Intent deliveryIntent = new Intent(view.getContext(), DeliveryListActivity.class);
                    startActivityForResult(deliveryIntent, 0);
                }
            }

        });

//        Button customerButton = (Button) findViewById(R.id.customer_button);
//        customerButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view) {
//                Intent orderIntent = new Intent(view.getContext(), CustomerActivity.class);
//                startActivityForResult(orderIntent, 0);
//            }
//
//        });
//
//        Button managerButton = (Button) findViewById(R.id.manager_button);
//        managerButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view) {
//                Intent managerIntent = new Intent(view.getContext(), OwnerActivity.class);
//                startActivityForResult(managerIntent, 0);
//            }
//
//        });
//
//        Button deliveryButton = (Button) findViewById(R.id.delivery_button);
//        deliveryButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view) {
//                Intent deliveryIntent = new Intent(view.getContext(), DeliveryListActivity.class);
//                startActivityForResult(deliveryIntent, 0);
//            }
//        });
    }

    public String getLoginName() {
        EditText loginName = (EditText) findViewById(R.id.login_name);
        String name = loginName.getText().toString();
        return name;
    }
}
