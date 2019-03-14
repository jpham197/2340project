package com.example.android.Entity;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class Inventory {
    private final int inventorySize; //capacity
    private final HashMap<Item, Integer> inventory;

    Inventory(int inventorySize) {
        this.inventorySize = inventorySize;
        inventory = new HashMap<>();
    }

    public void add(Item item) {
        inventory.put(item, inventory.get(item) + 1);
    }

    public Item removeItem(Item item) {
        if (inventory.get(item) == 0) {
            throw new NoSuchElementException("No " + item + " is in inventory");
        } else {
            inventory.put(item, inventory.get(item) - 1);
            return item;
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Item i : inventory.keySet()) {
            result += i + " " + inventory.get(i).toString() + "\n";
        }
        return result;
    }
}
