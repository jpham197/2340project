package com.example.android.Views;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.Entity.Market;
import com.example.android.Entity.Planet;
import com.example.android.Model.Repository;
import com.example.android.R;

public class MarketplaceStartup extends AppCompatActivity {
    Repository repo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketplace_startup);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button waterDec = findViewById(R.id.Item_Water_Selected_Dec);
        Button waterInc = findViewById(R.id.Item_Water_Selected_Inc);
        Button fursDec = findViewById(R.id.Item_Furs_Selected_Dec);
        Button fursInc = findViewById(R.id.Item_Furs_Selected_Inc);
        Button foodDec = findViewById(R.id.Item_Food_Selected_Dec);
        Button foodInc = findViewById(R.id.Item_Food_Selected_Inc);
        Button oreDec = findViewById(R.id.Item_Ore_Selected_Dec);
        Button oreInc = findViewById(R.id.Item_Ore_Selected_Inc);
        Button gamesDec = findViewById(R.id.Item_Games_Selected_Dec);
        Button gamesInc = findViewById(R.id.Item_Games_Selected_Inc);
        Button firearmsDec = findViewById(R.id.Item_Firearms_Selected_Dec);
        Button firearmsInc = findViewById(R.id.Item_Firearms_Selected_Inc);
        Button medicineDec = findViewById(R.id.Item_Medicine_Selected_Dec);
        Button machinesInc = findViewById(R.id.Item_Medicine_Selected_Inc);
        Button machinesDec = findViewById(R.id.Item_Machines_Selected_Dec);
        Button narcoticsInc = findViewById(R.id.Item_Narcotics_Selected_Inc);
        Button narcoticsDec = findViewById(R.id.Item_Narcotics_Selected_Dec);

        final EditText playerName = findViewById(R.id.);
        final TextView avalibleWater = findViewById(R.id.Item_Water_Available_counter);
        final TextView skillTraderLevel = findViewById(R.id.);
        waterDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }){

        }
        Planet planet = repo.getCurrentPlanet();
        Market market = planet.getWholeMarket();

    }

}
