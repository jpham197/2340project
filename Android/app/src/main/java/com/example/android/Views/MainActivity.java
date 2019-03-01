package com.example.android.Views;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
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
//import com.example.android.ViewModels.PlayerViewModel;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Player user = new Player();
//    PlayerViewModel pvm = ViewModelProviders.of(this).get(PlayerViewModel.class);

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
        final Spinner s = findViewById(R.id.spinner);

        final EditText playerName = findViewById(R.id.inputPlayerName);
        final TextView skillPilotLevel = findViewById(R.id.skillPilotLevel);
        final TextView skillFighterLevel = findViewById(R.id.skillFighterLevel);
        final TextView skillEngineerLevel = findViewById(R.id.skillEngineerLevel);
        final TextView skillTraderLevel = findViewById(R.id.skillTraderLevel);
        final Button createButton = findViewById(R.id.createButton);

        Button addPilot = findViewById(R.id.skillPilotIncrease);
        final Button subPilot = findViewById(R.id.skillPilotDecrease);
        createButton.setEnabled(false);
        playerName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                createButton.setEnabled(false);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length() == 0) {
                    createButton.setEnabled(false);
                } else {
                    createButton.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        addPilot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                subPilot.setEnabled(true);
                int current = Integer.parseInt(skillPilotLevel.getText().toString());
                if (user.getPilot() + user.getTrader() + user.getEngineer() + user.getFighter()
                        != 16) {
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
                    user.setPilot(current);
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
                if (user.getPilot() + user.getTrader() + user.getEngineer() + user.getFighter()
                        != 16) {
                    current++;
                    user.setFighter(current);
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
                    user.setFighter(current);
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
                if (user.getPilot() + user.getTrader() + user.getEngineer() + user.getFighter()
                        != 16) {
                    current++;
                    user.setEngineer(current);
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
                    user.setEngineer(current);
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
                if (user.getPilot() + user.getTrader() + user.getEngineer() + user.getFighter()
                        != 16) {
                    current++;
                    user.setTrader(current);
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
                    user.setTrader(current);
                } else {
                    subTrader.setEnabled(false);
                }
                skillTraderLevel.setText(String.valueOf(current));
            }
        });



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);


        createButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getPilot() + user.getTrader() + user.getEngineer() + user.getFighter()
                        != 16) {
                    Toast.makeText(getApplication(), "You still have " +
                                    (16 - (user.getPilot() + user.getTrader()
                                    + user.getEngineer() + user.getFighter())) + " Skill Points left.",
                            Toast.LENGTH_LONG).show();
                } else {
                    final String playerInformation = "\nPlayer Name: " + playerName.getText().toString()
                            + "\nDifficulty: " + s.getSelectedItem()
                            + "\nPilot Skill: " + user.getPilot()
                            + "\nFighter Skill: " + user.getFighter()
                            + "\nTrader Skill: " + user.getTrader()
                            + "\nEngineer Skill: " + user.getEngineer();
                    Log.w(TAG, playerInformation);
                    Intent intent = new Intent (MainActivity.this,
                            ConfigureCompleteActivity.class);
                    startActivity(intent);
                }
            }
        });

        Button exitGameButton = findViewById(R.id.exit_Game_Button);
        exitGameButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

    }

}
