package com.example.android.Views;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

import com.example.android.Entity.Planet;
import com.example.android.Entity.Player;
import com.example.android.Entity.RandomEvent;
import com.example.android.Entity.Ship;
import com.example.android.Entity.SolarSystem;
import com.example.android.Model.Repository;
import com.example.android.R;
import com.example.android.ViewModels.PlanetViewModel;
import com.example.android.ViewModels.PlayerViewModel;
import com.example.android.ViewModels.SolarSystemViewModel;

public class Travel_Launch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final PlayerViewModel pvm = ViewModelProviders.of(this).get(PlayerViewModel.class);
        final SolarSystemViewModel ssvm = ViewModelProviders.of(this).get(SolarSystemViewModel.class);
        final PlanetViewModel planetViewModel
                = ViewModelProviders.of(this).get(PlanetViewModel.class);
        final Player player = pvm.getPlayer();
        final Ship ship = pvm.getPlayer().getShip();
//        LayoutInflater layoutInflater = LayoutInflater.from(this);
//        View rootView = layoutInflater.inflate(R.layout.activity_travel__launch, null);
        setContentView(R.layout.content_travel__launch);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel__launch);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /* WIP–Attempt to declutter all this garbage
        TextView[] distances = new TextView[10];
        int[] ids = {R.id.Travel_Distance1,
                     R.id.Travel_Distance2,
                     R.id.Travel_Distance3,
                     R.id.Travel_Distance4,
                     R.id.Travel_Distance5,
                     R.id.Travel_Distance6,
                     R.id.Travel_Distance7,
                     R.id.Travel_Distance8,
                     R.id.Travel_Distance9,
                     R.id.Travel_Distance10};

        for (int a = 0; a < distances.length; a++) {
            distances[a] = findViewById(ids[a]);
        }

        for (int a = 0; a < distances.length; a++) {

        }
        */
        final TextView distance1 = findViewById(R.id.Travel_Distance1);
        final TextView fuel1 = findViewById(R.id.Fuel_Used1);
        final TextView destination1 = findViewById(R.id.Travel_Destination1);

        final TextView distance2 = findViewById(R.id.Travel_Distance2);
        final TextView fuel2 = findViewById(R.id.Fuel_Used2);
        final TextView destination2 = findViewById(R.id.Travel_Destination2);

        final TextView distance3 = findViewById(R.id.Travel_Distance3);
        final TextView fuel3 = findViewById(R.id.Fuel_Used3);
        final TextView destination3 = findViewById(R.id.Travel_Destination3);

        final TextView distance4 = findViewById(R.id.Travel_Distance4);
        final TextView fuel4 = findViewById(R.id.Fuel_Used4);
        final TextView destination4 = findViewById(R.id.Travel_Destination4);

        final TextView distance5 = findViewById(R.id.Travel_Distance5);
        final TextView fuel5 = findViewById(R.id.Fuel_Used5);
        final TextView destination5 = findViewById(R.id.Travel_Destination5);

        final TextView distance6 = findViewById(R.id.Travel_Distance6);
        final TextView fuel6 = findViewById(R.id.Fuel_Used6);
        final TextView destination6 = findViewById(R.id.Travel_Destination6);

        final TextView distance7 = findViewById(R.id.Travel_Distance7);
        final TextView fuel7 = findViewById(R.id.Fuel_Used7);
        final TextView destination7 = findViewById(R.id.Travel_Destination7);

        final TextView distance8 = findViewById(R.id.Travel_Distance8);
        final TextView fuel8 = findViewById(R.id.Fuel_Used8);
        final TextView destination8 = findViewById(R.id.Travel_Destination8);

        final TextView distance9 = findViewById(R.id.Travel_Distance9);
        final TextView fuel9 = findViewById(R.id.Fuel_Used9);
        final TextView destination9 = findViewById(R.id.Travel_Destination9);

        final TextView distance10 = findViewById(R.id.Travel_Distance10);
        final TextView fuel10 = findViewById(R.id.Fuel_Used10);
        final TextView destination10 = findViewById(R.id.Travel_Destination10);

        distance1.setText(String.valueOf(player.getLocation().calcDistance(ssvm.getSolarSystems().get(0).getPlanets()[0].getLocation())));
        fuel1.setText("20");

        distance2.setText(String.valueOf(player.getLocation().calcDistance(ssvm.getSolarSystems().get(1).getPlanets()[0].getLocation())));
        fuel2.setText("20");

        distance3.setText(String.valueOf(player.getLocation().calcDistance(ssvm.getSolarSystems().get(2).getPlanets()[0].getLocation())));

        distance4.setText(String.valueOf(player.getLocation().calcDistance(ssvm.getSolarSystems().get(3).getPlanets()[0].getLocation())));

        distance5.setText(String.valueOf(player.getLocation().calcDistance(ssvm.getSolarSystems().get(4).getPlanets()[0].getLocation())));

        distance6.setText(String.valueOf(player.getLocation().calcDistance(ssvm.getSolarSystems().get(5).getPlanets()[0].getLocation())));

        distance7.setText(String.valueOf(player.getLocation().calcDistance(ssvm.getSolarSystems().get(6).getPlanets()[0].getLocation())));

        distance8.setText(String.valueOf(player.getLocation().calcDistance(ssvm.getSolarSystems().get(7).getPlanets()[0].getLocation())));

        distance9.setText(String.valueOf(player.getLocation().calcDistance(ssvm.getSolarSystems().get(8).getPlanets()[0].getLocation())));

        distance10.setText(String.valueOf(player.getLocation().calcDistance(ssvm.getSolarSystems().get(9).getPlanets()[0].getLocation())));

        destination1.setText(ssvm.getSolarSystems().get(0).getPlanets()[0].getName());
        destination2.setText(ssvm.getSolarSystems().get(1).getPlanets()[0].getName());
        destination3.setText(ssvm.getSolarSystems().get(2).getPlanets()[0].getName());
        destination4.setText(ssvm.getSolarSystems().get(3).getPlanets()[0].getName());
        destination5.setText(ssvm.getSolarSystems().get(4).getPlanets()[0].getName());
        destination6.setText(ssvm.getSolarSystems().get(5).getPlanets()[0].getName());
        destination7.setText(ssvm.getSolarSystems().get(6).getPlanets()[0].getName());
        destination8.setText(ssvm.getSolarSystems().get(7).getPlanets()[0].getName());
        destination9.setText(ssvm.getSolarSystems().get(8).getPlanets()[0].getName());
        destination10.setText(ssvm.getSolarSystems().get(9).getPlanets()[0].getName());


        final Button go1 = findViewById(R.id.Travel_Destination1_button);
        final Button go2 = findViewById(R.id.Travel_Destination2_button);
        final Button go3 = findViewById(R.id.Travel_Destination3_button);
        final Button go4 = findViewById(R.id.Travel_Destination4_button);
        final Button go5 = findViewById(R.id.Travel_Destination5_button);
        final Button go6 = findViewById(R.id.Travel_Destination6_button);
        final Button go7 = findViewById(R.id.Travel_Destination7_button);
        final Button go8 = findViewById(R.id.Travel_Destination8_button);
        final Button go9 = findViewById(R.id.Travel_Destination9_button);
        final Button go10 = findViewById(R.id.Travel_Destination10_button);
        final Intent moved = new Intent(Travel_Launch.this, ConfigureCompleteActivity.class);

        final RandomEvent RE = new RandomEvent();

        go1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            Boolean event = RE.eventOccured();
            Boolean event2 = RE.eventOccured();
                player.setCredits(RE.randomMoney(player.getCredits(), event));
                ship.setCurrentFuel(RE.randomFuel(player.getShip().getFuel(), event2));
                if (player.travel(ssvm.getSolarSystems().get(0).getPlanets()[0].getLocation()) && (event || event2)) {
                    Toast.makeText(getApplication(), "Your current credits are now " + RE.randomMoney(player.getCredits(), event) + " and lost an extra " + RE.randomFuel(player.getShip().getFuel(), event2) + " fuel ",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else if (player.travel(ssvm.getSolarSystems().get(0).getPlanets()[0].getLocation())) {
                    Toast.makeText(getApplication(), "You have traveled successfully",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else {
                    Toast.makeText(getApplication(), "Not enough fuel",
                            Toast.LENGTH_LONG).show();
                }
            }


        });

        go2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean event = RE.eventOccured();
                Boolean event2 = RE.eventOccured();
                    player.setCredits(RE.randomMoney(player.getCredits(), event));
                    ship.setCurrentFuel(RE.randomFuel(player.getShip().getFuel(), event2));
                if (player.travel(ssvm.getSolarSystems().get(1).getPlanets()[0].getLocation()) && (event || event2)) {
                    Toast.makeText(getApplication(), "Your current credits are now " + RE.randomMoney(player.getCredits(), event) + " and lost an extra " + RE.randomFuel(player.getShip().getFuel(), event2) + " fuel ",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(1).getPlanets()[0]);
                    distance3.setText(String.valueOf(player.getLocation().calcDistance(ssvm.getSolarSystems().get(2).getPlanets()[0].getLocation())));
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else if (player.travel(ssvm.getSolarSystems().get(1).getPlanets()[0].getLocation())) {
                    Toast.makeText(getApplication(), "You have moved successfully",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(1).getPlanets()[0]);
                    distance3.setText(String.valueOf(player.getLocation().calcDistance(ssvm.getSolarSystems().get(2).getPlanets()[0].getLocation())));
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else {
                    Toast.makeText(getApplication(), "Not enough fuel", Toast.LENGTH_LONG).show();
                }
            }
        });



        go3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean event = RE.eventOccured();
                Boolean event2 = RE.eventOccured();
                    player.setCredits(RE.randomMoney(player.getCredits(), event));
                    ship.setCurrentFuel(RE.randomFuel(player.getShip().getFuel(), event2));
                if (player.travel(ssvm.getSolarSystems().get(2).getPlanets()[0].getLocation()) && (event || event2)) {
                    Toast.makeText(getApplication(), "Your current credits are now " + RE.randomMoney(player.getCredits(), event) + " and lost an extra " + RE.randomFuel(player.getShip().getFuel(), event2) + " fuel ",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else if (player.travel(ssvm.getSolarSystems().get(2).getPlanets()[0].getLocation())) {
                    Toast.makeText(getApplication(), "You have traveled successfully!",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else {
                    Toast.makeText(getApplication(), "Not enough fuel",
                            Toast.LENGTH_LONG).show();
                }
            }
        });



        go4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean event = RE.eventOccured();
                Boolean event2 = RE.eventOccured();
                    player.setCredits(RE.randomMoney(player.getCredits(), event));
                    ship.setCurrentFuel(RE.randomFuel(player.getShip().getFuel(), event2));
                if (player.travel(ssvm.getSolarSystems().get(3).getPlanets()[0].getLocation()) && (event || event2)) {
                    Toast.makeText(getApplication(), "Your current credits are now " + RE.randomMoney(player.getCredits(), event) + " and lost an extra " + RE.randomFuel(player.getShip().getFuel(), event2) + " fuel ",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else if (player.travel(ssvm.getSolarSystems().get(3).getPlanets()[0].getLocation())) {
                    Toast.makeText(getApplication(), "You have traveled successfully!",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else {
                    Toast.makeText(getApplication(), "Not enough fuel",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        go5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean event = RE.eventOccured();
                Boolean event2 = RE.eventOccured();
                player.setCredits(RE.randomMoney(player.getCredits(), event));
                ship.setCurrentFuel(RE.randomFuel(player.getShip().getFuel(), event2));
                if (player.travel(ssvm.getSolarSystems().get(4).getPlanets()[0].getLocation()) && (event || event2)) {
                    Toast.makeText(getApplication(), "Your current credits are now " + RE.randomMoney(player.getCredits(), event) + " and lost an extra " + RE.randomFuel(player.getShip().getFuel(), event2) + " fuel ",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else if (player.travel(ssvm.getSolarSystems().get(4).getPlanets()[0].getLocation())) {
                    Toast.makeText(getApplication(), "You have traveled successfully!",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else {
                    Toast.makeText(getApplication(), "Not enough fuel",
                            Toast.LENGTH_LONG).show();
                }
            }
        });



        go6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean event = RE.eventOccured();
                Boolean event2 = RE.eventOccured();
                player.setCredits(RE.randomMoney(player.getCredits(), event));
                ship.setCurrentFuel(RE.randomFuel(player.getShip().getFuel(), event2));
                if (player.travel(ssvm.getSolarSystems().get(5).getPlanets()[0].getLocation()) && (event || event2)) {
                    Toast.makeText(getApplication(), "Your current credits are now " + RE.randomMoney(player.getCredits(), event) + " and lost an extra " + RE.randomFuel(player.getShip().getFuel(), event2) + " fuel ",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else if (player.travel(ssvm.getSolarSystems().get(5).getPlanets()[0].getLocation())) {
                    Toast.makeText(getApplication(), "You have traveled successfully!",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else {
                    Toast.makeText(getApplication(), "Not enough fuel",
                            Toast.LENGTH_LONG).show();
                }
            }
        });




        go7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean event = RE.eventOccured();
                Boolean event2 = RE.eventOccured();
                player.setCredits(RE.randomMoney(player.getCredits(), event));
                ship.setCurrentFuel(RE.randomFuel(player.getShip().getFuel(), event2));
                if (player.travel(ssvm.getSolarSystems().get(6).getPlanets()[0].getLocation()) && (event || event2)) {
                    Toast.makeText(getApplication(), "Your current credits are now " + RE.randomMoney(player.getCredits(), event) + " and lost an extra " + RE.randomFuel(player.getShip().getFuel(), event2) + " fuel ",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else if (player.travel(ssvm.getSolarSystems().get(6).getPlanets()[0].getLocation())) {
                    Toast.makeText(getApplication(), "You have traveled successfully!",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else {
                    Toast.makeText(getApplication(), "Not enough fuel",
                            Toast.LENGTH_LONG).show();
                }
            }
        });



        go8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean event = RE.eventOccured();
                Boolean event2 = RE.eventOccured();
                player.setCredits(RE.randomMoney(player.getCredits(), event));
                ship.setCurrentFuel(RE.randomFuel(player.getShip().getFuel(), event2));
                if (player.travel(ssvm.getSolarSystems().get(7).getPlanets()[0].getLocation()) && (event || event2)) {
                    Toast.makeText(getApplication(), "Your current credits are now " + RE.randomMoney(player.getCredits(), event) + " and lost an extra " + RE.randomFuel(player.getShip().getFuel(), event2) + " fuel ",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else if (player.travel(ssvm.getSolarSystems().get(7).getPlanets()[0].getLocation())) {
                    Toast.makeText(getApplication(), "You have traveled successfully!",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else {
                    Toast.makeText(getApplication(), "Not enough fuel",
                            Toast.LENGTH_LONG).show();
                }
            }
        });



        go9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean event = RE.eventOccured();
                Boolean event2 = RE.eventOccured();
                player.setCredits(RE.randomMoney(player.getCredits(), event));
                ship.setCurrentFuel(RE.randomFuel(player.getShip().getFuel(), event2));
                if (player.travel(ssvm.getSolarSystems().get(8).getPlanets()[0].getLocation()) && (event || event2)) {
                    Toast.makeText(getApplication(), "Your current credits are now " + RE.randomMoney(player.getCredits(), event) + " and lost an extra " + RE.randomFuel(player.getShip().getFuel(), event2) + " fuel ",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else if (player.travel(ssvm.getSolarSystems().get(8).getPlanets()[0].getLocation())) {
                    Toast.makeText(getApplication(), "You have traveled successfully!",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else {
                    Toast.makeText(getApplication(), "Not enough fuel",
                            Toast.LENGTH_LONG).show();
                }
            }
        });



        go10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean event = RE.eventOccured();
                Boolean event2 = RE.eventOccured();
                player.setCredits(RE.randomMoney(player.getCredits(), event));
                ship.setCurrentFuel(RE.randomFuel(player.getShip().getFuel(), event2));
                if (player.travel(ssvm.getSolarSystems().get(9).getPlanets()[0].getLocation()) && (event || event2)) {
                    Toast.makeText(getApplication(), "Your current credits are now " + RE.randomMoney(player.getCredits(), event) + " and lost an extra " + RE.randomFuel(player.getShip().getFuel(), event2) + " fuel ",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else if (player.travel(ssvm.getSolarSystems().get(9).getPlanets()[0].getLocation())) {
                    Toast.makeText(getApplication(), "You have traveled successfully!",
                            Toast.LENGTH_LONG).show();
                    planetViewModel.setCurrentPlanet(ssvm.getSolarSystems().get(0).getPlanets()[0]);
                    moved.putExtra("x", player.getLocation().getX());
                    moved.putExtra("y", player.getLocation().getY());
                    moved.putExtra("fuel", player.getShip().getFuel());
                    startActivity(moved);
                } else {
                    Toast.makeText(getApplication(), "Not enough fuel",
                            Toast.LENGTH_LONG).show();
                }
            }
        });




    }

    private void updateViews() {

    }

}
