package com.example.testersallam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //spinner
        Spinner dropdown = findViewById(R.id.spinner1);
        String[] items = new String[]{"HTML", "JavaScript", "Python"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }

    @SuppressLint("SetTextI18n")
    public void onBtnClick(View view){

        // Edit Text
        TextView txt1 = findViewById(R.id.txt1);
        TextView txt2 = findViewById(R.id.txt2);
        TextView txt3 = findViewById(R.id.txt3);

        // Txt After Button Click
        txt1.setText("Hacking Nasa this might Takes some time...........");
        txt2.setText("Woo We Did it..........");
        txt3.setText("Wanna Results?? Go See A Doctor");
    }
}