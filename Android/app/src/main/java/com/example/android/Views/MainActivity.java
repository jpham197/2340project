package com.example.android.Views;

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
import android.widget.Toast;


import com.example.android.Entity.Player;
import com.example.android.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Player user = new Player();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Space Traders");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String[] arraySpinner = new String[] {
                "Easy", "Normal", "Hard", "Extreme"
        };
        Spinner s = findViewById(R.id.spinner);

        EditText playerName = findViewById(R.id.inputPlayerName);
        final TextView skillPilotLevel = findViewById(R.id.skillPilotLevel);
        final TextView skillFighterLevel = findViewById(R.id.skillFighterLevel);
        final TextView skillEngineerLevel = findViewById(R.id.skillEngineerLevel);
        final TextView skillTraderLevel = findViewById(R.id.skillTraderLevel);

        Button addPilot = findViewById(R.id.skillPilotIncrease);
        final Button subPilot = findViewById(R.id.skillPilotDecrease);

        addPilot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                subPilot.setEnabled(true);
                int current = Integer.parseInt(skillPilotLevel.getText().toString());
                if (Integer.parseInt(skillPilotLevel.getText().toString())
                        + Integer.parseInt(skillFighterLevel.getText().toString())
                        + Integer.parseInt(skillEngineerLevel.getText().toString())
                        + Integer.parseInt(skillTraderLevel.getText().toString()) != 16) {
                    current++;
                    user.setPilot(current);
                } else {
                    Toast.makeText(getApplication(), "No more Skill Points left.",
                            Toast.LENGTH_LONG).show();
                }
                skillPilotLevel.setText(String.valueOf(current));
            }
        });

        subPilot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = Integer.parseInt(skillPilotLevel.getText().toString());
                if (current > 0) {
                    current--;
                } else {
                    subPilot.setEnabled(false);
                }
                skillPilotLevel.setText(String.valueOf(current));
            }
        });

        Button addFighter = findViewById(R.id.skillFighterIncrease);
        final Button subFighter = findViewById(R.id.skillFighterDecrease);

        addFighter.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                subFighter.setEnabled(true);
                int current = Integer.parseInt(skillFighterLevel.getText().toString());
                if (Integer.parseInt(skillPilotLevel.getText().toString())
                        + Integer.parseInt(skillFighterLevel.getText().toString())
                        + Integer.parseInt(skillEngineerLevel.getText().toString())
                        + Integer.parseInt(skillTraderLevel.getText().toString()) != 16) {
                    current++;
                } else {
                    Toast.makeText(getApplication(), "No more Skill Points left.",
                            Toast.LENGTH_LONG).show();
                }
                skillFighterLevel.setText(String.valueOf(current));
            }
        });

        subFighter.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = Integer.parseInt(skillFighterLevel.getText().toString());
                if (current > 0) {
                    current--;
                } else {
                    subFighter.setEnabled(false);
                }
                skillFighterLevel.setText(String.valueOf(current));
            }
        });


        Button addEngineer = findViewById(R.id.skillEngineerIncrease);
        final Button subEngineer = findViewById(R.id.skillEngineerDecrease);

        addEngineer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                subEngineer.setEnabled(true);
                int current = Integer.parseInt(skillEngineerLevel.getText().toString());
                if (Integer.parseInt(skillPilotLevel.getText().toString())
                        + Integer.parseInt(skillFighterLevel.getText().toString())
                        + Integer.parseInt(skillEngineerLevel.getText().toString())
                        + Integer.parseInt(skillTraderLevel.getText().toString()) != 16) {
                    current++;
                } else {
                    Toast.makeText(getApplication(), "No more Skill Points left.",
                            Toast.LENGTH_LONG).show();
                }
                skillEngineerLevel.setText(String.valueOf(current));
            }
        });

        subEngineer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = Integer.parseInt(skillEngineerLevel.getText().toString());
                if (current > 0) {
                    current--;
                } else {
                    subEngineer.setEnabled(false);
                }
                skillEngineerLevel.setText(String.valueOf(current));
            }
        });

        Button addTrader = findViewById(R.id.skillTraderIncrease);
        final Button subTrader = findViewById(R.id.skillTraderDecrease);

        addTrader.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                subTrader.setEnabled(true);
                int current = Integer.parseInt(skillTraderLevel.getText().toString());
                if (Integer.parseInt(skillPilotLevel.getText().toString())
                        + Integer.parseInt(skillFighterLevel.getText().toString())
                        + Integer.parseInt(skillEngineerLevel.getText().toString())
                        + Integer.parseInt(skillTraderLevel.getText().toString()) != 16) {
                    current++;
                } else {
                    Toast.makeText(getApplication(), "No more Skill Points left.",
                            Toast.LENGTH_LONG).show();
                }
                skillTraderLevel.setText(String.valueOf(current));
            }
        });

        subTrader.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = Integer.parseInt(skillTraderLevel.getText().toString());
                if (current > 0) {
                    current--;
                } else {
                    subTrader.setEnabled(false);
                }
                skillTraderLevel.setText(String.valueOf(current));
            }
        });

        final String playerInformation = "\nPlayer Name: " + playerName.getText().toString()
                + "\nPilot Skill: " + user.getPilot()
                + "\nFighter Skill: " + skillFighterLevel.getText().toString()
                + "\nEngineer Skill: " + skillEngineerLevel.getText().toString()
                + "\nTrader Skill: " + skillTraderLevel.getText().toString();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        Button createButton = findViewById(R.id.createButton);
        createButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.w(TAG, playerInformation);
            }
        });
    }

}
