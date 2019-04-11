package com.ujjwal.scrollviewappdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edit_text_make;
    private EditText edit_text_year;
    private EditText edit_text_color;
    private EditText edit_text_price;
    private EditText edit_text_engine;
    private TextView text_view_details;

    private int number=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         edit_text_make = findViewById(R.id.et_make);
         edit_text_year = findViewById(R.id.et_year);
         edit_text_color = findViewById(R.id.et_color);
         edit_text_price = findViewById(R.id.et_price);
         edit_text_engine = findViewById(R.id.et_engine);
         text_view_details = findViewById(R.id.details);
    }

    public void create_car(View view) {
        String make=edit_text_make.getText().toString().trim();
        int year=Integer.parseInt(edit_text_year.getText().toString().trim());
        String color=edit_text_color.getText().toString().trim();
        double price=Double.parseDouble(edit_text_price.getText().toString().trim());
        double engine=Double.parseDouble(edit_text_engine.getText().toString().trim());

        Car gaadi = new Car(make,year,color,price,engine);
        String manufacturer=gaadi.getMake();
        int g_year=gaadi.getYear();
        String g_color=gaadi.getColor();
        double g_price=gaadi.getPrice();
        double g_engine=gaadi.getEngine();

        text_view_details.append("\n This is vehicle No. " + number++ + "\n Manufacturer: "
                + manufacturer + "\n Year: " + g_year + "\n Color: " + g_color + "\n Purchase Price: "
                + g_price + "\n Engine Size: " + g_engine +"\n\n");



    }
}
