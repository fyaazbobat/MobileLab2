package com.example.labassignment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Iterator;
public class Checkout extends AppCompatActivity {


    ArrayList<String> recievedIntent;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout);
        recievedIntent = getIntent().getStringArrayListExtra("home");
        radioGroup = findViewById(R.id.radioG);
        getApartmentType(recievedIntent);
       // Button button = (Button)findViewById(R.id.BtnPayment);

    }

    /* button.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, MenuPage.class));
        }
    });
*/
    private void getApartmentType(ArrayList<String> dataReceived) {

        for (String home : dataReceived) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(home);
            radioButton.setId(View.generateViewId());
            radioGroup.addView(radioButton);

        }

    }





}



