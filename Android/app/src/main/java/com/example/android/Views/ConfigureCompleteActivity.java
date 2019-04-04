package com.example.android.Views;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.Entity.Location;
import com.example.android.Entity.Planet;
import com.example.android.Entity.Player;
import com.example.android.Entity.SolarSystem;
import com.example.android.Model.PlayerInteractor;
import com.example.android.Model.Repository;
import com.example.android.R;
import com.example.android.ViewModels.PlanetViewModel;
import com.example.android.ViewModels.PlayerViewModel;
import com.example.android.ViewModels.SolarSystemViewModel;

import java.util.List;

public class ConfigureCompleteActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Repository repo;

//    final String playerPilotSkill = getIntent().getStringExtra("playerPilotSkill");
//    final String playerFighterSkill = getIntent().getStringExtra("playerFighterSkill");
//    final String playerTradeSkill = getIntent().getStringExtra("playerTradeSkill");
//    final String playerEngineerSkill = getIntent().getStringExtra("playerEngineerSkill");
//    final String playerShip = getIntent().getStringExtra("playerShip");
//    final String playerLocation = getIntent().getStringExtra("playerLocation");
//    final String playerCredits = getIntent().getStringExtra("playerCredits");

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final SolarSystemViewModel ssvm = ViewModelProviders.of(this).get(SolarSystemViewModel.class);
        final PlayerViewModel pvm = ViewModelProviders.of(this).get(PlayerViewModel.class);
        final PlanetViewModel planetViewModel = ViewModelProviders.of(this).get(PlanetViewModel.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configure_complete);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Space Traders: " + pvm.getPlayer().getName());
        TextView xCor = findViewById(R.id.Xoutput);
        TextView yCor = findViewById(R.id.Youtput);
        TextView currPlanetName = findViewById(R.id.PlanetScreen_PlanetName);
        TextView fuelView = findViewById(R.id.FuelRemaining);

        Planet planet = planetViewModel.getCurrentPlanet();
        Location planetLocation = planet.getLocation();
        Location location = new Location(planetLocation.getX(), planetLocation.getY());
        xCor.setText(String.valueOf(player.getLocation().getX()));
        yCor.setText(String.valueOf(player.getLocation().getY()));
        repo = new Repository();
        Button trade = findViewById(R.id.PlanetTradeButton);
        Button inventory = findViewById(R.id.PlayerInventoryButton);
        boolean flag = false;
        int xPos = (int)Math.random() * 1000;
        int yPos = (int)Math.random() * 1000;
        int fuel = (int)Math.random() * 1000;
        if (getIntent().getExtras() != null) {
            flag = true;
            xPos = getIntent().getExtras().getInt("x");
            yPos = getIntent().getExtras().getInt("y");
            fuel = getIntent().getExtras().getInt("fuel");
        }
//        TextView xCor = findViewById(R.id.Xoutput);
//        TextView yCor = findViewById(R.id.Youtput);
        TextView currPlanetName = findViewById(R.id.PlanetScreen_PlanetName);
        TextView fuelView = findViewById(R.id.FuelRemaining);

        player.setLocation(location);
        repo.setCurrentPlanet(planet);

//        xCor.setText(String.valueOf(player.getLocation().getX()));
//        yCor.setText(String.valueOf(player.getLocation().getY()));
        currPlanetName.setText("Current Planet name: " + planet.getName());

        if (flag) {
            xCor.setText(String.valueOf(xPos));
            yCor.setText(String.valueOf(yPos));
            fuelView.setText(String.valueOf(fuel));
        }

        trade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (ConfigureCompleteActivity.this, MarketplaceStartup.class);
                startActivity(intent);
            }
        });

        inventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (ConfigureCompleteActivity.this, PlayerInventoryLaunch.class);
                startActivity(intent);
            }
        });

        Button travel = findViewById(R.id.TravelButton);
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfigureCompleteActivity.this, Travel_Launch.class);
                startActivity(intent);
            }
        });


    }

}
