package com.example.android.Views;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.Entity.Item;
import com.example.android.Entity.ItemType;
import com.example.android.Entity.Market;
import com.example.android.Entity.Planet;
import com.example.android.Model.Repository;
import com.example.android.R;
import com.example.android.ViewModels.PlanetViewModel;
import com.example.android.ViewModels.SolarSystemViewModel;

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

        Button buy = findViewById(R.id.Marketplace_buy);
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
        final TextView credits = findViewById(R.id.Marketplace_Player_Credits_Num);
        final TextView cargoSpace = findViewById(R.id.textView);

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
        final TextView selectedNaroctics = findViewById(R.id.Item_Narcotics_Selected_counter);
        final TextView selectedRobots = findViewById(R.id.Item_Robots_Selected_counter);
        final TextView selectedMachines = findViewById(R.id.Item_Machines_Selected_counter);

//        final Planet planet = ssvm.getSolarSystems().get(0).getPlanets()[0];
        final Planet planet = pvm.getPlanet();
        final Market market = planet.getWholeMarket();

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

        credits.setText(String.valueOf(1000));
        cargoSpace.setText(String.valueOf(15));
        waterInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem("water");
                availableWater.setText(String.valueOf(market.getStock(("water"))));
                int x = Integer.parseInt(selectedWater.getText().toString());
                x++;
                selectedWater.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.water));
                total.setText(String.valueOf(totalPrice));
            }
        });

        foodInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem("food");
                availableFood.setText(String.valueOf(market.getStock(("food"))));
                int x = Integer.parseInt(selectedFood.getText().toString());
                x++;
                selectedFood.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.food));
                total.setText(String.valueOf(totalPrice));
            }
        });

        fursInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem("furs");
                availableFurs.setText(String.valueOf(market.getStock(("furs"))));
                int x = Integer.parseInt(selectedFurs.getText().toString());
                x++;
                selectedFurs.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.furs));
                total.setText(String.valueOf(totalPrice));
            }
        });

        oreInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem("ores");
                availableOre.setText(String.valueOf(market.getStock(("ores"))));
                int x = Integer.parseInt(selectedOre.getText().toString());
                x++;
                selectedOre.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.ores));
                total.setText(String.valueOf(totalPrice));
            }
        });

        gamesInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem("games");
                availableGames.setText(String.valueOf(market.getStock(("games"))));
                int x = Integer.parseInt(selectedGames.getText().toString());
                x++;
                selectedGames.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.games));
                total.setText(String.valueOf(totalPrice));
            }
        });

        firearmsInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem("firearms");
                availableFirearms.setText(String.valueOf(market.getStock(("firearms"))));
                int x = Integer.parseInt(selectedFirearms.getText().toString());
                x++;
                selectedFirearms.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.firearms));
                total.setText(String.valueOf(totalPrice));
            }
        });

        medicineInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem("medicine");
                availableMedicine.setText(String.valueOf(market.getStock(("medicine"))));
                int x = Integer.parseInt(selectedMedicine.getText().toString());
                x++;
                selectedMedicine.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.medicine));
                total.setText(String.valueOf(totalPrice));
            }
        });

        machinesInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem("machines");
                availableMachines.setText(String.valueOf(market.getStock(("machines"))));
                int x = Integer.parseInt(selectedMachines.getText().toString());
                x++;
                selectedMachines.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.machines));
                total.setText(String.valueOf(totalPrice));
            }
        });

        narcoticsInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem("narcotics");
                availableNarcotics.setText(String.valueOf(market.getStock(("narcotics"))));
                int x = Integer.parseInt(selectedNaroctics.getText().toString());
                x++;
                selectedNaroctics.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.narcotics));
                total.setText(String.valueOf(totalPrice));
            }
        });

        robotsInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                market.removeItem("robots");
                availableRobots.setText(String.valueOf(market.getStock(("robots"))));
                int x = Integer.parseInt(selectedRobots.getText().toString());
                x++;
                selectedRobots.setText(String.valueOf(x));
                int totalPrice = Integer.parseInt(total.getText().toString());
                totalPrice += market.calculatePrice(new Item(ItemType.robots));
                total.setText(String.valueOf(totalPrice));
            }
        });

        waterDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedWater.getText().toString());
                if (x > 0) {
                    x--;
                    market.addItem("water");
                    selectedWater.setText(String.valueOf(x));
                    int y = Integer.parseInt(availableWater.getText().toString());
                    y++;
                    availableWater.setText(String.valueOf(y));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.water));
                    total.setText(String.valueOf(totalPrice));
                }
            }
        });

        fursDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedFurs.getText().toString());
                if (x > 0) {
                    x--;
                    market.addItem("furs");
                    selectedFurs.setText(String.valueOf(x));
                    int y = Integer.parseInt(availableFurs.getText().toString());
                    y++;
                    availableFurs.setText(String.valueOf(y));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.furs));
                    total.setText(String.valueOf(totalPrice));
                }
            }
        });

        foodDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedFood.getText().toString());
                if (x > 0) {
                    x--;
                    market.addItem("food");
                    selectedFood.setText(String.valueOf(x));
                    int y = Integer.parseInt(availableFood.getText().toString());
                    y++;
                    availableFood.setText(String.valueOf(y));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.food));
                    total.setText(String.valueOf(totalPrice));
                }
            }
        });

        oreDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedOre.getText().toString());
                if (x > 0) {
                    x--;
                    market.addItem("ores");
                    selectedOre.setText(String.valueOf(x));
                    int y = Integer.parseInt(availableOre.getText().toString());
                    y++;
                    availableOre.setText(String.valueOf(y));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.ores));
                    total.setText(String.valueOf(totalPrice));
                }
            }
        });

        gamesDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedGames.getText().toString());
                if (x > 0) {
                    x--;
                    market.addItem("games");
                    selectedGames.setText(String.valueOf(x));
                    int y = Integer.parseInt(availableGames.getText().toString());
                    y++;
                    availableGames.setText(String.valueOf(y));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.games));
                    total.setText(String.valueOf(totalPrice));
                }
            }
        });

        firearmsDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedFirearms.getText().toString());
                if (x > 0) {
                    x--;
                    market.addItem("firearms");
                    selectedFirearms.setText(String.valueOf(x));
                    int y = Integer.parseInt(availableFirearms.getText().toString());
                    y++;
                    availableFirearms.setText(String.valueOf(y));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.firearms));
                    total.setText(String.valueOf(totalPrice));
                }
            }
        });

        medicineDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedMedicine.getText().toString());
                if (x > 0) {
                    x--;
                    market.addItem("medicine");
                    selectedMedicine.setText(String.valueOf(x));
                    int y = Integer.parseInt(availableMedicine.getText().toString());
                    y++;
                    availableMedicine.setText(String.valueOf(y));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.medicine));
                    total.setText(String.valueOf(totalPrice));
                }
            }
        });

        machinesDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedMachines.getText().toString());
                if (x > 0) {
                    x--;
                    market.addItem("machines");
                    selectedMachines.setText(String.valueOf(x));
                    int y = Integer.parseInt(availableMachines.getText().toString());
                    y++;
                    availableMachines.setText(String.valueOf(y));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.machines));
                    total.setText(String.valueOf(totalPrice));
                }
            }
        });

        narcoticsDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedNaroctics.getText().toString());
                if (x > 0) {
                    x--;
                    market.addItem("narcotics");
                    selectedNaroctics.setText(String.valueOf(x));
                    int y = Integer.parseInt(availableNarcotics.getText().toString());
                    y++;
                    availableNarcotics.setText(String.valueOf(y));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.narcotics));
                    total.setText(String.valueOf(totalPrice));
                }
            }
        });

        robotsDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x  = Integer.parseInt(selectedRobots.getText().toString());
                if (x > 0) {
                    x--;
                    market.addItem("robots");
                    selectedRobots.setText(String.valueOf(x));
                    int y = Integer.parseInt(availableRobots.getText().toString());
                    y++;
                    availableRobots.setText(String.valueOf(y));
                    int totalPrice = Integer.parseInt(total.getText().toString());
                    totalPrice -= market.calculatePrice(new Item(ItemType.robots));
                    total.setText(String.valueOf(totalPrice));
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
                                + Integer.parseInt(selectedNaroctics.getText().toString())
                                + Integer.parseInt(selectedRobots.getText().toString());

                if (Integer.parseInt(total.getText().toString()) < playerAvailableCredits && playerInventorySpace >= totalSelected) {
                    playerAvailableCredits -= Integer.parseInt(total.getText().toString());
                    credits.setText(String.valueOf(playerAvailableCredits));
                    playerInventorySpace -= totalSelected;
                    cargoSpace.setText(String.valueOf(playerInventorySpace));
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






    }

}
