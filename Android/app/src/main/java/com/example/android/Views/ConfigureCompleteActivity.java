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

import com.example.android.Entity.Location;
import com.example.android.Entity.Planet;
import com.example.android.Entity.Player;
import com.example.android.Entity.SolarSystem;
import com.example.android.Model.PlayerInteractor;
import com.example.android.Model.Repository;
import com.example.android.R;
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

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configure_complete);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final String playerName = getIntent().getExtras().getString("playerName");
        setTitle("Space Traders: " + playerName);
        repo = new Repository();
        Button trade = findViewById(R.id.PlanetTradeButton);
        trade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.w(TAG, "TEST");
//                Log.w(TAG, playerName);
                Intent intent = new Intent (ConfigureCompleteActivity.this, MarketplaceStartup.class);
                List list = ssvm.getSolarSystems();
                SolarSystem solarSystem = (SolarSystem) list.get((int)Math.random() * list.size());
                Planet[] planets = solarSystem.getPlanets();
                Planet planet = planets[0];
                int x = planet.getxCoordinate();
                int y = planet.getyCoordinate();
                Location location = new Location(x, y);
                Player player = pvm.getPlayer();
                player.setLocation(location);
                repo.setCurrentPlanet(planet);
                startActivity(intent);
            }
        });
    }

}
