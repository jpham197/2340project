package com.example.android.Views;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.Entity.Inventory;
import com.example.android.Entity.Item;
import com.example.android.Entity.ItemType;
import com.example.android.Entity.Player;
import com.example.android.R;
import com.example.android.ViewModels.PlanetViewModel;
import com.example.android.ViewModels.PlayerViewModel;
import com.example.android.Entity.Market;
import com.example.android.Entity.Planet;

public class Marketplace_Sell_Startup extends AppCompatActivity {
    // --Commented out by Inspection (4/11/19, 11:23 PM):Repository repo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketplace__sell__startup);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final PlayerViewModel playervm = ViewModelProviders.of(this).get(PlayerViewModel.class);
//        final SolarSystemViewModel ssvm = ViewModelProviders.of(this).get(SolarSystemViewModel.class);
        final PlanetViewModel pvm = ViewModelProviders.of(this).get(PlanetViewModel.class);

        Button back = findViewById(R.id.back_button);
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
        Button medicineInc =  findViewById(R.id.Item_Medicine_Selected_Inc);
        Button medicineDec = findViewById(R.id.Item_Medicine_Selected_Dec);
        Button machinesInc = findViewById(R.id.Item_Machines_Selected_Inc);
        Button machinesDec = findViewById(R.id.Item_Machines_Selected_Dec);
        Button narcoticsInc = findViewById(R.id.Item_Narcotics_Selected_Inc);
        Button narcoticsDec = findViewById(R.id.Item_Narcotics_Selected_Dec);
        Button robotsInc = findViewById(R.id.Item_Robots_Selected_Inc);
        Button robotsDec = findViewById(R.id.Item_Robots_Selected_Dec);

        final TextView total = findViewById(R.id.Total_Price_Show);

        final TextView availableWater = findViewById(R.id.Item_Water_Amount_counter);
        final TextView availableFurs = findViewById(R.id.Item_Furs_Amount_counter);
        final TextView availableFood = findViewById(R.id.Item_Food_Amount_counter);
        final TextView availableOre = findViewById(R.id.Item_Ore_Amount_counter);
        final TextView availableGames = findViewById(R.id.Item_Games_Amount_counter);
        final TextView availableFirearms= findViewById(R.id.Item_Firearms_Amount_counter);
        final TextView availableMedicine = findViewById(R.id.Item_Medicine_Amount_counter);
        final TextView availableMachines = findViewById(R.id.Item_Machines_Amount_counter);
        final TextView availableNarcotics = findViewById(R.id.Item_Narcotics_Amount_counter);
        final TextView availableRobots = findViewById(R.id.Item_Robots_Amount_counter);


        final TextView selectedWater = findViewById(R.id.Item_Water_Selected_counter);
        final TextView selectedFurs = findViewById(R.id.Item_Furs_Selected_counter);
        final TextView selectedFood = findViewById(R.id.Item_Food_Selected_counter);
        final TextView selectedOre = findViewById(R.id.Item_Ore_Selected_counter);
        final TextView selectedGames = findViewById(R.id.Item_Games_Selected_counter);
        final TextView selectedFirearms = findViewById(R.id.Item_Firearms_Selected_counter);
        final TextView selectedMedicine = findViewById(R.id.Item_Medicine_Selected_counter);
        final TextView selectedNarcotics = findViewById(R.id.Item_Narcotics_Selected_counter);
        final TextView selectedRobots = findViewById(R.id.Item_Robots_Selected_counter);
        final TextView selectedMachines = findViewById(R.id.Item_Machines_Selected_counter);


        final TextView credits = findViewById(R.id.Marketplace_Player_Credits_Num);
        final TextView cargoSpace = findViewById(R.id.SellInvSpace);
        final TextView SelectedTotal = findViewById(R.id.Total_Amount_Items_Counter);

        final Player player = playervm.getPlayer();
        final Inventory inventory = player.getInventory();
        final Planet planet = pvm.getPlanet();
        final Market market = planet.getWholeMarket();
        credits.setText(String.valueOf(player.getCredits()));

        availableWater.setText(String.valueOf(inventory.getNumOfItem(("water"))));
        availableFurs.setText(String.valueOf(inventory.getNumOfItem(("furs"))));
        availableFood.setText(String.valueOf(inventory.getNumOfItem(("food"))));
        availableOre.setText(String.valueOf(inventory.getNumOfItem(("ores"))));
        availableGames.setText(String.valueOf(inventory.getNumOfItem(("games"))));
        availableFirearms.setText(String.valueOf(inventory.getNumOfItem(("firearms"))));
        availableMedicine.setText(String.valueOf(inventory.getNumOfItem(("medicine"))));
        availableMachines.setText(String.valueOf(inventory.getNumOfItem(("machines"))));
        availableNarcotics.setText(String.valueOf(inventory.getNumOfItem(("narcotics"))));
        availableRobots.setText(String.valueOf(inventory.getNumOfItem(("robots"))));

        cargoSpace.setText(String.valueOf(inventory.getRemInv()));


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Marketplace_Sell_Startup.this, MarketplaceStartup.class);
                startActivity(intent);
            }
        });

        waterInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(selectedWater.getText().toString());
                if (x < Integer.valueOf((String) availableWater.getText())) {
                    x++;
                    selectedWater.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice += market.calculatePrice(new Item(ItemType.water));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems++;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        foodInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(selectedFood.getText().toString());
                if (x < Integer.valueOf((String) availableFood.getText())) {
                    x++;
                    selectedFood.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice += market.calculatePrice(new Item(ItemType.food));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems++;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        fursInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(selectedFurs.getText().toString());
                if (x < Integer.valueOf((String) availableFurs.getText())) {
                    x++;
                    selectedFurs.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice += market.calculatePrice(new Item(ItemType.furs));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems++;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        oreInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(selectedOre.getText().toString());
                if (x < Integer.valueOf((String) availableOre.getText())) {
                    x++;
                    selectedOre.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice += market.calculatePrice(new Item(ItemType.ores));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems++;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        gamesInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(selectedGames.getText().toString());
                if (x < Integer.valueOf((String) availableGames.getText())) {
                    x++;
                    selectedGames.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice += market.calculatePrice(new Item(ItemType.games));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems++;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        firearmsInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(selectedFirearms.getText().toString());
                x++;
                if (x < Integer.valueOf((String) availableFirearms.getText())) {
                    x++;
                    selectedFirearms.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice += market.calculatePrice(new Item(ItemType.firearms));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems++;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        medicineInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(selectedMedicine.getText().toString());
                x++;
                if (x < Integer.valueOf((String) availableMedicine.getText())) {
                    x++;
                    selectedMedicine.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice += market.calculatePrice(new Item(ItemType.medicine));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems++;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        machinesInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(selectedMachines.getText().toString());
                x++;
                if (x < Integer.valueOf((String) availableMachines.getText())) {
                    x++;
                    selectedMachines.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice += market.calculatePrice(new Item(ItemType.machines));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems++;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        narcoticsInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(selectedNarcotics.getText().toString());
                x++;
                if (x < Integer.valueOf((String) availableNarcotics.getText())) {
                    x++;
                    selectedNarcotics.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice += market.calculatePrice(new Item(ItemType.narcotics));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems++;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        robotsInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(selectedRobots.getText().toString());
                x++;
                if (x < Integer.valueOf((String) availableRobots.getText())) {
                    x++;
                    selectedRobots.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice += market.calculatePrice(new Item(ItemType.robots));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems++;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        waterDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedWater.getText().toString());
                if (x > 0) {
                    x--;
                    selectedWater.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.water));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems--;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        fursDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedFurs.getText().toString());
                if (x > 0) {
                    x--;
                    selectedFurs.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.furs));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems--;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        foodDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedFood.getText().toString());
                if (x > 0) {
                    x--;
                    selectedFood.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.food));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems--;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        oreDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedOre.getText().toString());
                if (x > 0) {
                    x--;
                    selectedOre.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.ores));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems--;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        gamesDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedGames.getText().toString());
                if (x > 0) {
                    x--;
                    selectedGames.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.games));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems--;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        firearmsDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedFirearms.getText().toString());
                if (x > 0) {
                    x--;
                    selectedFirearms.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.firearms));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems--;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        medicineDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedMedicine.getText().toString());
                if (x > 0) {
                    x--;
                    selectedMedicine.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.medicine));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems--;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        machinesDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedMachines.getText().toString());
                if (x > 0) {
                    x--;
                    selectedMachines.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.machines));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems--;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        narcoticsDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedNarcotics.getText().toString());
                if (x > 0) {
                    x--;
                    selectedNarcotics.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.narcotics));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems--;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        robotsDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedRobots.getText().toString());
                if (x > 0) {
                    x--;
                    selectedRobots.setText(String.valueOf(x));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.robots));
                    total.setText(String.valueOf(totalPrice));
                    int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                    incrementTotalItems--;
                    SelectedTotal.setText(String.valueOf(incrementTotalItems));
                }
            }
        });

        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int playerAvailableCredits = Integer.parseInt(credits.getText().toString());
                int playerInventorySpace = Integer.parseInt(cargoSpace.getText().toString());
                int totalSelected = Integer.parseInt(selectedWater.getText().toString())
                        + Integer.parseInt(selectedFurs.getText().toString())
                        + Integer.parseInt(selectedFood.getText().toString())
                        + Integer.parseInt(selectedOre.getText().toString())
                        + Integer.parseInt(selectedFirearms.getText().toString())
                        + Integer.parseInt(selectedMachines.getText().toString())
                        + Integer.parseInt(selectedMedicine.getText().toString())
                        + Integer.parseInt(selectedNarcotics.getText().toString())
                        + Integer.parseInt(selectedRobots.getText().toString());


                    playerAvailableCredits += Integer.valueOf((String) total.getText());
                    player.setCredits(playerAvailableCredits);
                    credits.setText(String.valueOf(playerAvailableCredits));
                    playerInventorySpace -= totalSelected;
                    cargoSpace.setText(String.valueOf(playerInventorySpace));
                    inventory.removeItem("water", Integer.parseInt((String) selectedWater.getText()));
                    inventory.removeItem("furs", Integer.parseInt((String) selectedFurs.getText()));
                    inventory.removeItem("food", Integer.parseInt((String) selectedFood.getText()));
                    inventory.removeItem("ores", Integer.parseInt((String) selectedOre.getText()));
                    inventory.removeItem("games", Integer.parseInt((String) selectedGames.getText()));
                    inventory.removeItem("firearms", Integer.parseInt((String) selectedFirearms.getText()));
                    inventory.removeItem("medicine", Integer.parseInt((String) selectedMedicine.getText()));
                    inventory.removeItem("machines", Integer.parseInt((String) selectedMachines.getText()));
                    inventory.removeItem("narcotics", Integer.parseInt((String) selectedNarcotics.getText()));
                    inventory.removeItem("robots", Integer.parseInt((String) selectedRobots.getText()));

                    market.addItem();
                    market.addItem();
                    market.addItem();
                    market.addItem();
                    market.addItem();
                    market.addItem();
                    market.addItem();
                    market.addItem();
                    market.addItem();
                    market.addItem();
                    total.setText("0");
                    availableWater.setText(String.valueOf(inventory.getNumOfItem(("water"))));
                    selectedWater.setText("0");
                    availableFurs.setText(String.valueOf(inventory.getNumOfItem(("furs"))));
                    selectedFurs.setText("0");
                    availableFood.setText(String.valueOf(inventory.getNumOfItem(("food"))));
                    selectedFood.setText("0");
                    availableOre.setText(String.valueOf(inventory.getNumOfItem(("ores"))));
                    selectedOre.setText("0");
                    availableGames.setText(String.valueOf(inventory.getNumOfItem(("games"))));
                    selectedGames.setText("0");
                    availableFirearms.setText(String.valueOf(inventory.getNumOfItem(("firearms"))));
                    selectedFirearms.setText("0");
                    availableMedicine.setText(String.valueOf(inventory.getNumOfItem(("medicine"))));
                    selectedMedicine.setText("0");
                    availableMachines.setText(String.valueOf(inventory.getNumOfItem(("machines"))));
                    selectedMachines.setText("0");
                    availableNarcotics.setText(String.valueOf(inventory.getNumOfItem(("narcotics"))));
                    selectedNarcotics.setText("0");
                    availableRobots.setText(String.valueOf(inventory.getNumOfItem(("robots"))));
                    selectedRobots.setText("0");
                    inventory.incInv(totalSelected);
                    cargoSpace.setText(String.valueOf(inventory.getRemInv()));
                    SelectedTotal.setText("0");



                    if (inventory.getRemInv() < totalSelected || totalSelected == 0) {
                        Toast.makeText(getApplication(), "Insufficient Sale!",
                                Toast.LENGTH_LONG).show();
                    }

            }
        });
    }

}
