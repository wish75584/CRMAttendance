package com.felixtechlabs.crmattendance;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

import androidx.appcompat.app.AppCompatActivity;

public class test extends AppCompatActivity {

    TextInputLayout text_input_layout_activity, text_input_layout_hours, text_input_layout_mins;
    AutoCompleteTextView autoComplete_activity, autoComplete_hours, autoComplete_mins;
    ArrayAdapter<String> adapter_activity, adapter_hour, adapter_mins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        text_input_layout_activity = findViewById(R.id.text_input_layout_activity);
        text_input_layout_hours = findViewById(R.id.text_input_layout_hours);


        autoComplete_activity = findViewById(R.id.autoComplete_activity);
        autoComplete_hours = findViewById(R.id.autoComplete_hours);
        autoComplete_mins = findViewById(R.id.autoComplete_mins);


        adapter_activity = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.activity));
        adapter_hour = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.hour));
        adapter_mins = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.mins));

        autoComplete_activity.setAdapter(adapter_activity);
        autoComplete_hours.setAdapter(adapter_hour);
        autoComplete_mins.setAdapter(adapter_mins);


    }
}
