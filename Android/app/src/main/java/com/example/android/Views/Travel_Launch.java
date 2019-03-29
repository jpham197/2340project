package com.example.android.Views;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.R;
import com.example.android.ViewModels.PlanetViewModel;

public class Travel_Launch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final PlanetViewModel pvm = ViewModelProviders.of(this).get(PlanetViewModel.class);

        final TextView distance1 = findViewById(R.id.Travel_Destination1);
        final TextView fuel1 = findViewById(R.id.Fuel_Used1);

        final TextView distance2 = findViewById(R.id.Travel_Destination2);
        final TextView fuel2 = findViewById(R.id.Fuel_Used2);

        final TextView distance3 = findViewById(R.id.Travel_Destination3);
        final TextView fuel3 = findViewById(R.id.Fuel_Used3);

        final TextView distance4 = findViewById(R.id.Travel_Destination4);
        final TextView fuel4 = findViewById(R.id.Fuel_Used4);

        final TextView distance5 = findViewById(R.id.Travel_Destination5);
        final TextView fuel5 = findViewById(R.id.Fuel_Used5);

        final TextView distance6 = findViewById(R.id.Travel_Destination6);
        final TextView fuel6 = findViewById(R.id.Fuel_Used6);

        final TextView distance7 = findViewById(R.id.Travel_Destination7);
        final TextView fuel7 = findViewById(R.id.Fuel_Used7);

//        final TextView distance8 = findViewById(R.id.Travel_Destination8);
//        final TextView fuel8 = findViewById(R.id.Fuel_Used8);
//
//        final TextView distance9 = findViewById(R.id.Travel_Destination9);
//        final TextView fuel9 = findViewById(R.id.Fuel_Used9);
//
//        final TextView distance10 = findViewById(R.id.Travel_Destination10);
//        final TextView fuel10 = findViewById(R.id.Fuel_Used10);

        final Button go1 = findViewById(R.id.Travel_Destination1_button);
        final Button go2 = findViewById(R.id.Travel_Destination2_button);
        final Button go3 = findViewById(R.id.Travel_Destination3_button);
        final Button go4 = findViewById(R.id.Travel_Destination4_button);
        final Button go5 = findViewById(R.id.Travel_Destination5_button);
        final Button go6 = findViewById(R.id.Travel_Destination6_button);
        final Button go7 = findViewById(R.id.Travel_Destination7_button);
//        final Button go8 = findViewById(R.id.Travel_Destination8_button);
//        final Button go9 = findViewById(R.id.Travel_Destination9_button);
//        final Button go10 = findViewById(R.id.Travel_Destination10_button);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel__launch);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



    }

}