package com.example.sam.pizza.CustomerActivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.sam.pizza.MainActivity;
import com.example.sam.pizza.R;

public class MakeOrderCustomerActivity extends Activity {

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
                String test2 = "haha";

                bundle.putString("pizzas", testString);

                confirmIntent.putExtras(bundle);
                startActivityForResult(confirmIntent, 0);
            }

        });
    }

    String orderedPizza = "";

    public String addPizzas() {
        addHawaiian(orderedPizza);
        return orderedPizza;
    }

    public String addHawaiian(String string){
        ImageView hawaiian = (ImageView) findViewById(R.id.order_hawaiian);
        string = string +'\n';
        string.concat("Hawaiian Pizza");
        return string;
    }

    public String addSeafood(String string){
        ImageView seafood = (ImageView) findViewById(R.id.order_seafood);
        string = string +'\n';
        string.concat("Seafood Pizza");
        return string;
    }
    public String addPepperoni(String string){
        ImageView hawaiian = (ImageView) findViewById(R.id.order_pepperoni);
        string = string +'\n';
        string.concat("Pepperoni Pizza");
        return string;
    }
    public String addDeluxe(String string){
        ImageView deluxe = (ImageView) findViewById(R.id.order_deluxe);
        string = string +'\n';
        string.concat("Deluxe Pizza");
        return string;
    }
}
