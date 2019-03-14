package com.example.android.Views;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.android.R;

public class ConfigureCompleteActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


//    final String playerPilotSkill = getIntent().getStringExtra("playerPilotSkill");
//    final String playerFighterSkill = getIntent().getStringExtra("playerFighterSkill");
//    final String playerTradeSkill = getIntent().getStringExtra("playerTradeSkill");
//    final String playerEngineerSkill = getIntent().getStringExtra("playerEngineerSkill");
//    final String playerShip = getIntent().getStringExtra("playerShip");
//    final String playerLocation = getIntent().getStringExtra("playerLocation");
//    final String playerCredits = getIntent().getStringExtra("playerCredits");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configure_complete);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final String playerName = getIntent().getExtras().getString("playerName");
        setTitle("Space Traders: " + playerName);

        Button trade = findViewById(R.id.PlanetTradeButton);
        trade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.w(TAG, "TEST");
                Log.w(TAG, playerName);
            }
        });
    }

}
