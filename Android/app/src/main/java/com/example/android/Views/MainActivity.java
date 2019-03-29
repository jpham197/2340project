package com.example.android.Views;

import android.arch.lifecycle.ViewModel;
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

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.example.android.Entity.Location;
import com.example.android.Entity.Planet;
import com.example.android.Entity.Player;
import com.example.android.Entity.Ship;
import com.example.android.Entity.ShipType;
import com.example.android.Entity.SolarSystem;
import com.example.android.Entity.Universe;
import com.example.android.Model.Repository;
import com.example.android.R;
import com.example.android.ViewModels.PlanetViewModel;
import com.example.android.ViewModels.PlayerViewModel;
import com.example.android.ViewModels.SolarSystemViewModel;

public class MainActivity extends AppCompatActivity implements Serializable {

    private static final String TAG = "MainActivity";
    Player user = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final PlayerViewModel pvm = ViewModelProviders.of(this).get(PlayerViewModel.class);
        final SolarSystemViewModel ssvm = ViewModelProviders.of(this).get(SolarSystemViewModel.class);
        final PlanetViewModel ppvm = ViewModelProviders.of(this).get(PlanetViewModel.class);
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

        final Button addPilot = findViewById(R.id.skillPilotIncrease);
        final Button subPilot = findViewById(R.id.skillPilotDecrease);
        final Button addFighter = findViewById(R.id.skillFighterIncrease);
        final Button subFighter = findViewById(R.id.skillFighterDecrease);
        final Button addEngineer = findViewById(R.id.skillEngineerIncrease);
        final Button subEngineer = findViewById(R.id.skillEngineerDecrease);
        final Button addTrader = findViewById(R.id.skillTraderIncrease);
        final Button subTrader = findViewById(R.id.skillTraderDecrease);
        subPilot.setEnabled(false);
        subEngineer.setEnabled(false);
        subFighter.setEnabled(false);
        subTrader.setEnabled(false);

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
                        < 16) {
                    current++;
                    user.setPilot(current);
//                    user.setName(playerName.getText().toString());
                    if (user.getPilot() + user.getTrader() + user.getEngineer() + user.getFighter()
                            == 16) {
                        addPilot.setEnabled(false);
                        addFighter.setEnabled(false);
                        addEngineer.setEnabled(false);
                        addTrader.setEnabled(false);
                        Toast.makeText(getApplication(), "No more Skill Points left",
                                Toast.LENGTH_LONG).show();
                    }
                }
                skillPilotLevel.setText(String.valueOf(current));
            }
        });

        subPilot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addEngineer.setEnabled(true);
                addFighter.setEnabled(true);
                addPilot.setEnabled(true);
                addTrader.setEnabled(true);
                int current = Integer.parseInt(skillPilotLevel.getText().toString());
                if (current > 0) {
                    current--;
                    user.setPilot(current);
                    if (current == 0) {
                        subPilot.setEnabled(false);
                    }
                }
                skillPilotLevel.setText(String.valueOf(current));
            }
        });

        addFighter.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                subFighter.setEnabled(true);
                int current = Integer.parseInt(skillFighterLevel.getText().toString());
                if (user.getPilot() + user.getTrader() + user.getEngineer() + user.getFighter()
                        < 16) {
                    current++;
                    user.setFighter(current);
                    if (user.getPilot() + user.getTrader() + user.getEngineer() + user.getFighter()
                            == 16) {
                        addPilot.setEnabled(false);
                        addFighter.setEnabled(false);
                        addEngineer.setEnabled(false);
                        addTrader.setEnabled(false);
                        Toast.makeText(getApplication(), "No more Skill Points left",
                                Toast.LENGTH_LONG).show();
                    }
                }
                skillFighterLevel.setText(String.valueOf(current));
            }
        });

        subFighter.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addEngineer.setEnabled(true);
                addFighter.setEnabled(true);
                addPilot.setEnabled(true);
                addTrader.setEnabled(true);
                int current = Integer.parseInt(skillFighterLevel.getText().toString());
                if (current > 0) {
                    current--;
                    user.setFighter(current);
                    if (current == 0) {
                        subFighter.setEnabled(false);
                    }
                }
                skillFighterLevel.setText(String.valueOf(current));
            }
        });

        addEngineer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                subEngineer.setEnabled(true);
                int current = Integer.parseInt(skillEngineerLevel.getText().toString());
                if (user.getPilot() + user.getTrader() + user.getEngineer() + user.getFighter()
                        < 16) {
                    current++;
                    user.setEngineer(current);
                    if (user.getPilot() + user.getTrader() + user.getEngineer() + user.getFighter()
                            == 16) {
                        addPilot.setEnabled(false);
                        addFighter.setEnabled(false);
                        addEngineer.setEnabled(false);
                        addTrader.setEnabled(false);
                        Toast.makeText(getApplication(), "No more Skill Points left",
                                Toast.LENGTH_LONG).show();
                    }
                }
                skillEngineerLevel.setText(String.valueOf(current));
            }
        });

        subEngineer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addEngineer.setEnabled(true);
                addFighter.setEnabled(true);
                addPilot.setEnabled(true);
                addTrader.setEnabled(true);
                int current = Integer.parseInt(skillEngineerLevel.getText().toString());
                if (current > 0) {
                    current--;
                    user.setEngineer(current);
                    if (current == 0) {
                        subEngineer.setEnabled(false);
                    }
                }
                skillEngineerLevel.setText(String.valueOf(current));
            }
        });

        addTrader.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                subTrader.setEnabled(true);
                int current = Integer.parseInt(skillTraderLevel.getText().toString());
                if (user.getPilot() + user.getTrader() + user.getEngineer() + user.getFighter()
                        < 16) {
                    current++;
                    user.setTrader(current);
                    if (user.getPilot() + user.getTrader() + user.getEngineer() + user.getFighter()
                            == 16) {
                        addPilot.setEnabled(false);
                        addFighter.setEnabled(false);
                        addEngineer.setEnabled(false);
                        addTrader.setEnabled(false);
                        Toast.makeText(getApplication(), "No more Skill Points left",
                                Toast.LENGTH_LONG).show();
                    }
                }
                skillTraderLevel.setText(String.valueOf(current));
            }
        });

        subTrader.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addEngineer.setEnabled(true);
                addFighter.setEnabled(true);
                addPilot.setEnabled(true);
                addTrader.setEnabled(true);
                int current = Integer.parseInt(skillTraderLevel.getText().toString());
                if (current > 0) {
                    current--;
                    user.setTrader(current);
                    if (current == 0) {
                        subTrader.setEnabled(false);
                    }
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
                user.setName(playerName.getText().toString());
                Universe universe = new Universe();
                ssvm.addSolarSystemList(universe.getSolarSystems());
                ppvm.setCurrentPlanet(new Planet());
                pvm.addPlayer(user);
                user.setShip(new Ship(100, ShipType.Gnat));
                user.setLocation(new Location(0, 0));
                user.setCredits(5000);
                if (user.getPilot() + user.getTrader() + user.getEngineer() + user.getFighter()
                        != 16) {
                    Toast.makeText(getApplication(), "You still have " +
                                    (16 - (user.getPilot() + user.getTrader()
                                    + user.getEngineer() + user.getFighter())) + " Skill Points left.",
                            Toast.LENGTH_LONG).show();
                } else {
                    final String playerInformation = "\nPlayer Name: " + user.getName()
                            + "\nDifficulty: " + s.getSelectedItem()
                            + "\nPilot Skill: " + user.getPilot()
                            + "\nFighter Skill: " + user.getFighter()
                            + "\nTrader Skill: " + user.getTrader()
                            + "\nEngineer Skill: " + user.getEngineer();
//                    Log.w(TAG, playerInformation);
                    Intent intent = new Intent(getBaseContext(), ConfigureCompleteActivity.class);
                    intent.putExtra("playerName", user.getName());
                    intent.putExtra("playerPilotSkill", user.getPilot());
                    intent.putExtra("playerFighterSkill", user.getFighter());
                    intent.putExtra("playerTraderSkill", user.getTrader());
                    intent.putExtra("playerEngineerSkill", user.getEngineer());
                    intent.putExtra("playerShip", user.getShip().toString());
                    intent.putExtra("playerLocation", user.getLocation().toString());
                    intent.putExtra("playerCredits", user.getCredits());
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

    void serialize() {
//        FileOutputStream file = new FileOutputStream("/../entity/player.ser");
    }

}
