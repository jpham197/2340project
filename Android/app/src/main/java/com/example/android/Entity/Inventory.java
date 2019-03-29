package com.example.android.Entity;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class Inventory {
    private final int inventorySize; //capacity
    private final HashMap<String, Integer> inventory;

    Inventory(int inventorySize) {
        this.inventorySize = inventorySize;
        inventory = new HashMap<>();
        inventory.put("water", 0);
        inventory.put("furs", 0);
        inventory.put("food", 0);
        inventory.put("ores", 0);
        inventory.put("games", 0);
        inventory.put("firearms", 0);
        inventory.put("medicine", 0);
        inventory.put("machines", 0);
        inventory.put("narcotics", 0);
        inventory.put("robots", 0);
    }

    public void add(String item) {
        inventory.put(item, inventory.get(item) + 1);
    }

    public void add(String item, int times) {
        for (int i = 1; i <= times; i++) {
            add(item);
        }
    }

    public void removeItem(String item) {
        if (inventory.get(item) == 0) {
            throw new NoSuchElementException("No " + item + " is in inventory");
        } else {
            inventory.put(item, inventory.get(item) - 1);
        }
    }
    public int getNumOfItem(String item) {
        return inventory.get(item);
    }

    @Override
    public String toString() {
        String result = "";
        for (String i : inventory.keySet()) {
            result += i + " " + inventory.get(i).toString() + "\n";
        }
        return result;
    }
}
