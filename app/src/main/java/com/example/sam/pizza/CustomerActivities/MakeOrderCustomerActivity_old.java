package com.example.sam.pizza.CustomerActivities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.sam.pizza.R;

public class MakeOrderCustomerActivity_old extends Activity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_order_customer);
        Spinner spinner = (Spinner) findViewById(R.id.pizza_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.pizza_types, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    public void submitOrder(View view) {
        displayThanks();
        String customerName = getName();
        displayName(customerName);
        String pizzaName = getPizza();
        displayPizza(pizzaName);
        showQuantity();
    }

    public String getName() {
        EditText text = (EditText) findViewById(R.id.name_editText_customer);
        String name = text.getText().toString();
        return name;
    }

    public void displayName(String name) {
        TextView labelTextView = (TextView) findViewById(R.id.name_label_textView_customer);
        labelTextView.setText("Customer Name: ");
        TextView nameTextView = (TextView) findViewById(R.id.show_name_textView_customer);
        nameTextView.setText(name);
    }

    public String getPizza() {
        Spinner spinner = (Spinner) findViewById(R.id.pizza_spinner);
        String pizza = spinner.getSelectedItem().toString();
        return pizza;
    }

    private void displayPizza(String pizzaName) {
        TextView lablelTextView = (TextView) findViewById(R.id.pizza_label_textView_customer);
        lablelTextView.setText("Pizza Type: ");
        TextView pizzaTextView = (TextView) findViewById(R.id.show_pizza_textView_customer);
        pizzaTextView.setText(pizzaName);
    }

    private void displayThanks() {
        String thank = "Thank you for ordering!";
        String order = "Order details: ";
        TextView thankTextView = (TextView) findViewById(R.id.thankYou_textView);
        thankTextView.setText(thank);
        TextView orderTextView = (TextView) findViewById(R.id.orderDetails_textView);
        orderTextView.setText(order);
    }

    public void displayQuantity(int number) {
        TextView orderTextView = (TextView) findViewById(R.id.quantity_textView_customer);
        orderTextView.setText("" + number);
    }

    int quantity = 0;

    public void increment(View view) {
        displayQuantity(++quantity);
    }

    public void decrement(View view) {
        if (quantity <= 0) {
            displayQuantity(0);
        } else {
            displayQuantity(--quantity);
        }
    }

    public void showQuantity() {
        TextView labelTextView = (TextView) findViewById(R.id.quantity_label_textView_customer);
        labelTextView.setText("Quantity: ");
        TextView quantityTextView = (TextView) findViewById(R.id.show_quantity_textView_customer);
        quantityTextView.setText("" + quantity);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
