package com.felixtechlabs.crmattendance;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;


public class MyAttendence extends AppCompatActivity {

    ArrayAdapter<String> adapter_activity, adapter_hour, adapter_mins;
    ArrayList<String> list;
    Spinner spinner_activity, spinner_hour, spinner_mins;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_attendence);


        spinner_activity = (Spinner) findViewById(R.id.spinner_activity);
        spinner_hour = (Spinner) findViewById(R.id.spinner_hour);
        spinner_mins = (Spinner) findViewById(R.id.spinner_mins);

        adapter_activity = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.activity));
        adapter_hour = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.hour));
        adapter_mins = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.mins));

        spinner_activity.setAdapter(adapter_activity);
        spinner_hour.setAdapter(adapter_hour);
        spinner_mins.setAdapter(adapter_mins);


    }
}
