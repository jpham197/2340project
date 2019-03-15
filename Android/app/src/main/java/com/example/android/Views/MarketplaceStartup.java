package com.example.android.Views;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.Entity.Item;
import com.example.android.Entity.ItemType;
import com.example.android.Entity.Market;
import com.example.android.Entity.Planet;
import com.example.android.Model.Repository;
import com.example.android.R;
import com.example.android.ViewModels.PlanetViewModel;
import com.example.android.ViewModels.SolarSystemViewModel;

public class MarketplaceStartup extends AppCompatActivity {
    Repository repo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketplace_startup);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final SolarSystemViewModel ssvm = ViewModelProviders.of(this).get(SolarSystemViewModel.class);
        final PlanetViewModel pvm = ViewModelProviders.of(this).get(PlanetViewModel.class);

        Button buy = findViewById(R.id.Marketplace_buy);
        Button sell = findViewById(R.id.Marketplace_sell);

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
        Button robotsInc = findViewById(R.id.Item_Robots_Selected_Inc);
        Button robotsDec = findViewById(R.id.Item_Robots_Selected_Dec);

        final TextView availableWater = findViewById(R.id.Item_Water_Available_counter);
        final TextView availableFurs = findViewById(R.id.Item_Furs_Available_counter);
        final TextView availableFood = findViewById(R.id.Item_Food_Available_counter);
        final TextView availableOre = findViewById(R.id.Item_Ore_Available_counter);
        final TextView availableGames = findViewById(R.id.Item_Games_Available_counter);
        final TextView availableFirearms= findViewById(R.id.Item_Firearms_Available_counter);
        final TextView availableMedicine = findViewById(R.id.Item_Medicine_Available_counter);
        final TextView availableMachines = findViewById(R.id.Item_Machines_Available_counter);
        final TextView availableNaroctics = findViewById(R.id.Item_Narcotics_Available_counter);
        final TextView availableRobots = findViewById(R.id.Item_Robots_Available_counter);

        final TextView selectedWater = findViewById(R.id.Item_Water_Selected_counter);
        final TextView selectedFurs = findViewById(R.id.Item_Furs_Selected_counter);
        final TextView selectedFood = findViewById(R.id.Item_Food_Selected_counter);
        TextView selectedOre = findViewById(R.id.Item_Ore_Selected_counter);
        TextView selectedGames = findViewById(R.id.Item_Games_Selected_counter);
        TextView selectedFirearms = findViewById(R.id.Item_Firearms_Selected_counter);
        TextView selectedMedicine = findViewById(R.id.Item_Medicine_Selected_counter);
        TextView selectedNaroctics = findViewById(R.id.Item_Narcotics_Selected_counter);
        TextView selectedRobots = findViewById(R.id.Item_Robots_Selected_counter);
        TextView selectedMachines = findViewById(R.id.Item_Machines_Selected_counter);

//        final Planet planet = ssvm.getSolarSystems().get(0).getPlanets()[0];
        final Planet planet = pvm.getPlanet();
        final Market market = planet.getWholeMarket();

        Item i = new Item(ItemType.water);
        int y = market.getStock(i);
        String x = String.valueOf(y);
        availableWater.setText(x);
//        availableFurs.setText(market.getStock(new Item(ItemType.furs)));
//        availableFood.setText(market.getStock(new Item(ItemType.food)));
//        availableOre.setText(market.getStock(new Item(ItemType.ores)));
//        availableGames.setText(market.getStock(new Item(ItemType.games)));
//        availableFirearms.setText(market.getStock(new Item(ItemType.firearms)));
//        availableMedicine.setText(market.getStock(new Item(ItemType.medicine)));
//        availableMachines.setText(market.getStock(new Item(ItemType.machines)));
//        availableNaroctics.setText(market.getStock(new Item(ItemType.narcotics)));
//        availableRobots.setText(market.getStock(new Item(ItemType.robots)));

        waterDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem(new Item(ItemType.water));
                availableWater.setText(market.getStock(new Item(ItemType.water)));
                int x = Integer.parseInt(selectedWater.getText().toString());
                x++;
                selectedWater.setText(String.valueOf(x));
            }
        });

        foodDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem(new Item(ItemType.food));
                availableFood.setText(market.getStock(new Item(ItemType.food)));
                int x = Integer.parseInt(selectedFood.getText().toString());
                x++;
                selectedFood.setText(String.valueOf(x));
            }
        });

        fursDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem(new Item(ItemType.furs));
                availableFurs.setText(market.getStock(new Item(ItemType.furs)));
                int x = Integer.parseInt(selectedFurs.getText().toString());
                x++;
                selectedFurs.setText(String.valueOf(x));
            }
        });

        waterDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem(new Item(ItemType.water));
                availableWater.setText(market.getStock(new Item(ItemType.water)));
                int x = Integer.parseInt(selectedWater.getText().toString());
                x++;
                selectedWater.setText(String.valueOf(x));
            }
        });

        waterDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem(new Item(ItemType.water));
                availableWater.setText(market.getStock(new Item(ItemType.water)));
                int x = Integer.parseInt(selectedWater.getText().toString());
                x++;
                selectedWater.setText(String.valueOf(x));
            }
        });

        waterDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem(new Item(ItemType.water));
                availableWater.setText(market.getStock(new Item(ItemType.water)));
                int x = Integer.parseInt(selectedWater.getText().toString());
                x++;
                selectedWater.setText(String.valueOf(x));
            }
        });

        waterDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem(new Item(ItemType.water));
                availableWater.setText(market.getStock(new Item(ItemType.water)));
                int x = Integer.parseInt(selectedWater.getText().toString());
                x++;
                selectedWater.setText(String.valueOf(x));
            }
        });

        waterDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem(new Item(ItemType.water));
                availableWater.setText(market.getStock(new Item(ItemType.water)));
                int x = Integer.parseInt(selectedWater.getText().toString());
                x++;
                selectedWater.setText(String.valueOf(x));
            }
        });

        waterDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem(new Item(ItemType.water));
                availableWater.setText(market.getStock(new Item(ItemType.water)));
                int x = Integer.parseInt(selectedWater.getText().toString());
                x++;
                selectedWater.setText(String.valueOf(x));
            }
        });

        waterDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem(new Item(ItemType.water));
                availableWater.setText(market.getStock(new Item(ItemType.water)));
                int x = Integer.parseInt(selectedWater.getText().toString());
                x++;
                selectedWater.setText(String.valueOf(x));
            }
        });





    }

}
