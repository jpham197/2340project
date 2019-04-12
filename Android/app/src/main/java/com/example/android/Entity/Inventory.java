package com.example.android.Entity;

import java.util.HashMap;
import java.util.Objects;

import androidx.annotation.RecentlyNonNull;

public class Inventory {
    private final HashMap<String, Integer> inventory;
    private final int maxInv = 20;
    private int remInv = maxInv;

    Inventory() {
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

//    private void add() {
//        if (inventory != null) {
//            inventory.put(item, inventory.get(item) + 1);
//        }
//    }

    public void add(String item, int times) {
        for (int i = 1; i <= times; i++) {
            add(item);
        }
    }

//    private void removeItem() {
//        if (inventory != null) {
//            if (inventory.get(item) == 0) {
//                throw new NoSuchElementException("No " + item + " is in inventory");
//            } else {
//                inventory.put(item, inventory.get(item) - 1);
//            }
//        }
//    }

//    public void removeItem(String item, int times) {
//        for (int i = 1; i <= times; i++) {
//            removeItem(item);
//        }
//    }
    public int getNumOfItem() {
//        if (inventory != null) {
//            return inventory.get(item);
//        } else {
            return (int) (Math.random() * 100);
//        }
    }

    @RecentlyNonNull
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String i : inventory.keySet()) {
            result.append(i).append(" ").append(Objects.requireNonNull(inventory.get(i)).toString()).append("\n");
        }
        return result.toString();
    }


    public void decInv(int totalItems) {
        remInv -= totalItems;
    }

//    public void incInv(int totalItems) {
//        remInv += totalItems;
//    }

    public int getRemInv() {
        return remInv;
    }


}
