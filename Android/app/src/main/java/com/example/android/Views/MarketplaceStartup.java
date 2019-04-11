package com.example.android.Views;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.Entity.Inventory;
import com.example.android.Entity.Item;
import com.example.android.Entity.ItemType;
import com.example.android.Entity.Market;
import com.example.android.Entity.Planet;
import com.example.android.Entity.Player;
import com.example.android.R;

public class MarketplaceStartup extends AppCompatActivity {
    Repository repo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketplace_startup);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final SolarSystemViewModel ssvm = ViewModelProviders.of(this).get(SolarSystemViewModel.class);
        final PlanetViewModel pvm = ViewModelProviders.of(this).get(PlanetViewModel.class);
        final PlayerViewModel playervm = ViewModelProviders.of(this).get(PlayerViewModel.class);

        Button buy = findViewById(R.id.Marketplace_buy);
        Button sell = findViewById(R.id.Marketplace_sell);
        Button back = findViewById(R.id.back_button);
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
        final TextView credits = findViewById(R.id.Marketplace_Player_Credits_Num);
        final TextView cargoSpace = findViewById(R.id.BuyInvSpace);
        final TextView SelectedTotal = findViewById(R.id.Total_Amount_Items_Counter);

        final TextView availableWater = findViewById(R.id.Item_Water_Available_counter);
        final TextView availableFurs = findViewById(R.id.Item_Furs_Available_counter);
        final TextView availableFood = findViewById(R.id.Item_Food_Available_counter);
        final TextView availableOre = findViewById(R.id.Item_Ore_Available_counter);
        final TextView availableGames = findViewById(R.id.Item_Games_Available_counter);
        final TextView availableFirearms= findViewById(R.id.Item_Firearms_Available_counter);
        final TextView availableMedicine = findViewById(R.id.Item_Medicine_Available_counter);
        final TextView availableMachines = findViewById(R.id.Item_Machines_Available_counter);
        final TextView availableNarcotics = findViewById(R.id.Item_Narcotics_Available_counter);
        final TextView availableRobots = findViewById(R.id.Item_Robots_Available_counter);

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

//        final Planet planet = ssvm.getSolarSystems().get(0).getPlanets()[0];
        final Planet planet = pvm.getCurrentPlanet();
//        final Market market = planet.getWholeMarket();
        final Market market = planet.getWholeMarket();
        final Player player = playervm.getPlayer();
        final Inventory inventory = player.getInventory();

        availableWater.setText(String.valueOf(market.getStock("water")));
        availableFurs.setText(String.valueOf(market.getStock("furs")));
        availableFood.setText(String.valueOf(market.getStock("food")));
        availableOre.setText(String.valueOf(market.getStock("ores")));
        availableGames.setText(String.valueOf(market.getStock("games")));
        availableFirearms.setText(String.valueOf(market.getStock("firearms")));
        availableMedicine.setText(String.valueOf(market.getStock("medicine")));
        availableMachines.setText(String.valueOf(market.getStock("machines")));
        availableNarcotics.setText(String.valueOf(market.getStock("narcotics")));
        availableRobots.setText(String.valueOf(market.getStock("robots")));
//        availableFurs.setText(market.getStock(new Item(ItemType.furs)));
//        availableFood.setText(market.getStock(new Item(ItemType.food)));
//        availableOre.setText(market.getStock(new Item(ItemType.ores)));
//        availableGames.setText(market.getStock(new Item(ItemType.games)));
//        availableFirearms.setText(market.getStock(new Item(ItemType.firearms)));
//        availableMedicine.setText(market.getStock(new Item(ItemType.medicine)));
//        availableMachines.setText(market.getStock(new Item(ItemType.machines)));
//        availableNaroctics.setText(market.getStock(new Item(ItemType.narcotics)));
//        availableRobots.setText(market.getStock(new Item(ItemType.robots)));

        credits.setText(String.valueOf(player.getCredits()));
        cargoSpace.setText(String.valueOf(inventory.getRemInv()));

        waterInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                availableWater.setText(String.valueOf(market.getStock(("water"))));
                int x = Integer.parseInt(selectedWater.getText().toString());
                x++;
                selectedWater.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.water));
                total.setText(String.valueOf(totalPrice));
                int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                incrementTotalItems++;
                SelectedTotal.setText(String.valueOf(incrementTotalItems));
            }
        });

        foodInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                availableFood.setText(String.valueOf(market.getStock(("food"))));
                int x = Integer.parseInt(selectedFood.getText().toString());
                x++;
                selectedFood.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.food));
                total.setText(String.valueOf(totalPrice));
                int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                incrementTotalItems++;
                SelectedTotal.setText(String.valueOf(incrementTotalItems));
            }
        });

        fursInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                availableFurs.setText(String.valueOf(market.getStock(("furs"))));
                int x = Integer.parseInt(selectedFurs.getText().toString());
                x++;
                selectedFurs.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.furs));
                total.setText(String.valueOf(totalPrice));
                int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                incrementTotalItems++;
                SelectedTotal.setText(String.valueOf(incrementTotalItems));
            }
        });

        oreInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                availableOre.setText(String.valueOf(market.getStock(("ores"))));
                int x = Integer.parseInt(selectedOre.getText().toString());
                x++;
                selectedOre.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.ores));
                total.setText(String.valueOf(totalPrice));
                int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                incrementTotalItems++;
                SelectedTotal.setText(String.valueOf(incrementTotalItems));
            }
        });

        gamesInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                availableGames.setText(String.valueOf(market.getStock(("games"))));
                int x = Integer.parseInt(selectedGames.getText().toString());
                x++;
                selectedGames.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.games));
                total.setText(String.valueOf(totalPrice));
                int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                incrementTotalItems++;
                SelectedTotal.setText(String.valueOf(incrementTotalItems));
            }
        });

        firearmsInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                availableFirearms.setText(String.valueOf(market.getStock(("firearms"))));
                int x = Integer.parseInt(selectedFirearms.getText().toString());
                x++;
                selectedFirearms.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.firearms));
                total.setText(String.valueOf(totalPrice));
                int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                incrementTotalItems++;
                SelectedTotal.setText(String.valueOf(incrementTotalItems));
            }
        });

        medicineInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                availableMedicine.setText(String.valueOf(market.getStock(("medicine"))));
                int x = Integer.parseInt(selectedMedicine.getText().toString());
                x++;
                selectedMedicine.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.medicine));
                total.setText(String.valueOf(totalPrice));
                int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                incrementTotalItems++;
                SelectedTotal.setText(String.valueOf(incrementTotalItems));
            }
        });

        machinesInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                availableMachines.setText(String.valueOf(market.getStock(("machines"))));
                int x = Integer.parseInt(selectedMachines.getText().toString());
                x++;
                selectedMachines.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.machines));
                total.setText(String.valueOf(totalPrice));
                int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                incrementTotalItems++;
                SelectedTotal.setText(String.valueOf(incrementTotalItems));
            }
        });

        narcoticsInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                availableNarcotics.setText(String.valueOf(market.getStock(("narcotics"))));
                int x = Integer.parseInt(selectedNarcotics.getText().toString());
                x++;
                selectedNarcotics.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.narcotics));
                total.setText(String.valueOf(totalPrice));
            }
        });

        robotsInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                availableRobots.setText(String.valueOf(market.getStock(("robots"))));
                int x = Integer.parseInt(selectedRobots.getText().toString());
                x++;
                selectedRobots.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.robots));
                total.setText(String.valueOf(totalPrice));
                int incrementTotalItems = Integer.valueOf((String) SelectedTotal.getText());
                incrementTotalItems++;
                SelectedTotal.setText(String.valueOf(incrementTotalItems));
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

        buy.setOnClickListener(new View.OnClickListener() {
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

                if (Integer.parseInt(total.getText().toString()) < playerAvailableCredits && playerInventorySpace >= totalSelected) {
                    playerAvailableCredits -= Integer.parseInt(total.getText().toString());
                    player.setCredits(playerAvailableCredits);
                    credits.setText(String.valueOf(playerAvailableCredits));
                    playerInventorySpace -= totalSelected;
                    cargoSpace.setText(String.valueOf(playerInventorySpace));
                    inventory.add("water", Integer.parseInt((String) selectedWater.getText()));
                    inventory.add("furs", Integer.parseInt((String) selectedFurs.getText()));
                    inventory.add("food", Integer.parseInt((String) selectedFood.getText()));
                    inventory.add("ores", Integer.parseInt((String) selectedOre.getText()));
                    inventory.add("games", Integer.parseInt((String) selectedGames.getText()));
                    inventory.add("firearms", Integer.parseInt((String) selectedFirearms.getText()));
                    inventory.add("medicine", Integer.parseInt((String) selectedMedicine.getText()));
                    inventory.add("machines", Integer.parseInt((String) selectedMachines.getText()));
                    inventory.add("narcotics", Integer.parseInt((String) selectedNarcotics.getText()));
                    inventory.add("robots", Integer.parseInt((String) selectedRobots.getText()));

                    market.removeItem("water",  Integer.parseInt((String) selectedWater.getText()));
                    market.removeItem("furs",  Integer.parseInt((String) selectedFurs.getText()));
                    market.removeItem("food",  Integer.parseInt((String) selectedFood.getText()));
                    market.removeItem("ores",  Integer.parseInt((String) selectedOre.getText()));
                    market.removeItem("games",  Integer.parseInt((String) selectedGames.getText()));
                    market.removeItem("firearms",  Integer.parseInt((String) selectedFirearms.getText()));
                    market.removeItem("medicine",  Integer.parseInt((String) selectedMedicine.getText()));
                    market.removeItem("machines",  Integer.parseInt((String) selectedMachines.getText()));
                    market.removeItem("narcotics",  Integer.parseInt((String) selectedNarcotics.getText()));
                    market.removeItem("robots",  Integer.parseInt((String) selectedRobots.getText()));
                    total.setText("0");
                    availableWater.setText(String.valueOf(market.getStock(("water"))));
                    selectedWater.setText("0");
                    availableFurs.setText(String.valueOf(market.getStock(("furs"))));
                    selectedFurs.setText("0");
                    availableFood.setText(String.valueOf(market.getStock(("food"))));
                    selectedFood.setText("0");
                    availableOre.setText(String.valueOf(market.getStock(("ores"))));
                    selectedOre.setText("0");
                    availableGames.setText(String.valueOf(market.getStock(("games"))));
                    selectedGames.setText("0");
                    availableFirearms.setText(String.valueOf(market.getStock(("firearms"))));
                    selectedFirearms.setText("0");
                    availableMedicine.setText(String.valueOf(market.getStock(("medicine"))));
                    selectedMedicine.setText("0");
                    availableMachines.setText(String.valueOf(market.getStock(("machines"))));
                    selectedMachines.setText("0");
                    availableNarcotics.setText(String.valueOf(market.getStock(("narcotics"))));
                    selectedNarcotics.setText("0");
                    availableRobots.setText(String.valueOf(market.getStock(("robots"))));
                    selectedRobots.setText("0");
                    inventory.decInv(totalSelected);
                    cargoSpace.setText(String.valueOf(inventory.getRemInv()));
                    SelectedTotal.setText("0");


                } else {
                    if (playerInventorySpace > totalSelected) {
                        Toast.makeText(getApplication(), "Insufficient Purchase!",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplication(), "Insufficient Purchase!",
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent
                        (MarketplaceStartup.this, Marketplace_Sell_Startup.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent
                        (MarketplaceStartup.this, ConfigureCompleteActivity.class);
                startActivity(intent);
            }
        });






    }

}
