package com.example.labassignment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPage extends AppCompatActivity {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;




    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_menu);
    }



    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.secondmenu, menu);
        return true;
    }


    public  boolean onOptionsItemSelected(MenuItem item)
    {
        Intent intent;

        switch (item.getItemId())
        {
            case R.id.Deattached:
                intent = new Intent( this, Detached.class);
                startActivity(intent);

                break;


            case R.id.SemiDetached:
                intent = new Intent( this, SemiDetached.class);
                startActivity(intent);

                break;



            case R.id.Townhomes:
                intent = new Intent( this, Townhomes.class);
                startActivity(intent);

                break;


            case R.id.condominium:
                intent = new Intent( this, Condo.class);
                startActivity(intent);

                break;

            case R.id.Apartment:
                intent = new Intent( this, Apartment.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        return true;
    }
}

