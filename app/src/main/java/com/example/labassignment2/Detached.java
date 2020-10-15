package com.example.labassignment2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;



public class Detached extends AppCompatActivity {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    ArrayList<String> selected = new ArrayList<>();

    // TODO: Rename and change types and number of parameters

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_detached);

        CheckBox DtFirst = (CheckBox) findViewById(R.id.chkDTHome);
        DtFirst.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(((CheckBox)v).isChecked())
                    selected.add(getResources().getString(R.string.addDetached));
            }

        });


        CheckBox DtSecond = (CheckBox) findViewById(R.id.chkDTHome2);
        DtSecond.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                if(((CheckBox)view).isChecked())
                    selected.add(getResources().getString(R.string.addDetached2));
            }

        });



        CheckBox DtThird = (CheckBox) findViewById(R.id.chkDTHome3);
        DtThird.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                if(((CheckBox)view).isChecked())
                    selected.add(getResources().getString(R.string.addDetached3));
            }

        });

        Button SecondButton = findViewById(R.id.BtnDetach);
        SecondButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Detached.this, Checkout.class);
                intent.putExtra("home", selected);
                startActivity(intent);
            }
        });

    }
}

