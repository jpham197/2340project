package com.example.android;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Space Traders");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String name = "";


        String[] arraySpinner = new String[] {
                "Easy", "Normal", "Hard", "Extreme"
        };
        Spinner s = (Spinner) findViewById(R.id.spinner);

        EditText playerName = (EditText) findViewById(R.id.inputPlayerName);
        TextView skillPilotLevel = (TextView) findViewById(R.id.skillPilotLevel);
        TextView skillFighterLevel = (TextView) findViewById(R.id.skillFighterLevel);
        TextView skillEngineerLevel = (TextView) findViewById(R.id.skillEngineerLevel);
        TextView skillTraderLevel = (TextView) findViewById(R.id.skillTraderLevel);

        final String playerInformation = "Player Name: " + playerName.getText().toString()
                + "\nPilot Skill: " + skillPilotLevel.getText().toString()
                + "\nFighter Skill: " + skillFighterLevel.getText().toString()
                + "\nEngineer Skill: " + skillEngineerLevel.getText().toString()
                + "\nTrader Skill: " + skillTraderLevel.getText().toString();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        Button createButton = (Button) findViewById(R.id.createButton);
        createButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Log.w(TAG, playerInformation);
            }
        });
    }

}
