package com.example.android.Views;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.Entity.Inventory;
import com.example.android.Entity.Player;
import com.example.android.R;

public class PlayerInventoryLaunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_inventory_launch);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final PlayerViewModel playervm = ViewModelProviders.of(this).get(PlayerViewModel.class);

        final TextView availableWater = findViewById(R.id.Player_Inventory_Amount_Owned_Water);
        final TextView availableFurs = findViewById(R.id.Player_Inventory_Amount_Owned_Furs);
        final TextView availableFood = findViewById(R.id.Player_Inventory_Amount_Owned_Food);
        final TextView availableOre = findViewById(R.id.Player_Inventory_Amount_Owned_Ore);
        final TextView availableGames = findViewById(R.id.Player_Inventory_Amount_Owned_Games);
        final TextView availableFirearms= findViewById(R.id.Player_Inventory_Amount_Owned_Firearms);
        final TextView availableMedicine = findViewById(R.id.Player_Inventory_Amount_Owned_Medicine);
        final TextView availableMachines = findViewById(R.id.Player_Inventory_Amount_Owned_Machines);
        final TextView availableNarcotics = findViewById(R.id.Player_Inventory_Amount_Owned_Narcotics);
        final TextView availableRobots = findViewById(R.id.Player_Inventory_Amount_Owned_Robots);

        final Player player = playervm.getPlayer();
        final Inventory inventory = player.getInventory();

        availableWater.setText(String.valueOf(inventory.getNumOfItem("water")));
        availableFurs.setText(String.valueOf(inventory.getNumOfItem("furs")));
        availableFood.setText(String.valueOf(inventory.getNumOfItem("food")));
        availableOre.setText(String.valueOf(inventory.getNumOfItem("ores")));
        availableGames.setText(String.valueOf(inventory.getNumOfItem("games")));
        availableFirearms.setText(String.valueOf(inventory.getNumOfItem("firearms")));
        availableMedicine.setText(String.valueOf(inventory.getNumOfItem("medicine")));
        availableMachines.setText(String.valueOf(inventory.getNumOfItem("machines")));
        availableNarcotics.setText(String.valueOf(inventory.getNumOfItem("narcotics")));
        availableRobots.setText(String.valueOf(inventory.getNumOfItem("robots")));

        Button back = findViewById(R.id.back_button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (PlayerInventoryLaunch.this, CreatePlayerActivity.class);
                startActivity(intent);
            }
        });
    }

}
