package com.example.android.Entity;

import java.util.HashMap;
import java.util.Objects;

import androidx.annotation.RecentlyNonNull;

public class Market {
    //Price of items are set to base price
    //<Item, Stock>
    private final HashMap<String, Integer> storage;
    private final TechLevel techLevel;
    //    private RandomEvent RE = new RandomEvent();

    /**
     * Plain constructor for Market, sets everything to base price and stock to 0
     */
    public Market(TechLevel techLevel) {
        storage = new HashMap<>();
        this.techLevel = techLevel;
        switch (techLevel.ordinal()) {
            case 7:
            case 6:
                storage.put("water", 100);
                storage.put("furs", 100);
                storage.put("food", 100);
                storage.put("ores", 100);
                storage.put("games", 100);
                storage.put("firearms", 100);
                storage.put("medicine", 100);
                storage.put("machines", 100);
                storage.put("narcotics", 100);
                storage.put("robots", 100);
                break;
            case 5:
                storage.put("water", 100);
                storage.put("furs", 100);
                storage.put("food", 100);
                storage.put("ores", 100);
                storage.put("games", 100);
                storage.put("firearms", 100);
                storage.put("medicine", 100);
                storage.put("machines", 100);
                storage.put("narcotics", 100);
                storage.put("robots", 0);
                break;
            case 4:
                storage.put("water", 100);
                storage.put("furs", 100);
                storage.put("food", 100);
                storage.put("ores", 100);
                storage.put("games", 100);
                storage.put("firearms", 100);
                storage.put("medicine", 100);
                storage.put("machines", 100);
                storage.put("narcotics", 0);
                storage.put("robots", 0);
                break;
            case 3:
                storage.put("water", 100);
                storage.put("furs", 100);
                storage.put("food", 100);
                storage.put("ores", 100);
                storage.put("games", 100);
                storage.put("firearms", 100);
                storage.put("medicine", 0);
                storage.put("machines", 0);
                storage.put("narcotics", 0);
                storage.put("robots", 0);
                break;
            case 2:
                storage.put("water", 100);
                storage.put("furs", 100);
                storage.put("food", 100);
                storage.put("ores", 100);
                storage.put("games", 0);
                storage.put("firearms", 0);
                storage.put("medicine", 0);
                storage.put("machines", 0);
                storage.put("narcotics", 0);
                storage.put("robots", 0);
                break;
            case 1:
                storage.put("water", 100);
                storage.put("furs", 100);
                storage.put("food", 100);
                storage.put("ores", 0);
                storage.put("games", 0);
                storage.put("firearms", 0);
                storage.put("medicine", 0);
                storage.put("machines", 0);
                storage.put("narcotics", 0);
                storage.put("robots", 0);
                break;
            case 0:
                storage.put("water", 100);
                storage.put("furs", 100);
                storage.put("food", 0);
                storage.put("ores", 0);
                storage.put("games", 0);
                storage.put("firearms", 0);
                storage.put("medicine", 0);
                storage.put("machines", 0);
                storage.put("narcotics", 0);
                storage.put("robots", 0);
                break;
        }

    }

    /**
     * Removes item from the storage
     * @throws java.util.NoSuchElementException when item stock is 0
     */
    public void removeItem() {
//        if (storage != null) {
//            if (storage.get(item) < 0) {
//                throw new NoSuchElementException(item + " is not in stock");
//            } else {
//                storage.put(item, storage.get(item) - times);
//            }
//        }
        int x = 10;
    }

    /**
     * Increases the stock of the given item by 1
     */
//    public void addItem() {
//        if (storage != null) {
//            storage.put(item, storage.get(item) + times);
//        }
//    }

    public int calculatePrice(Item item) {
        int randomizer = (int) (Math.random() * item.getVariance());
        boolean coin = Math.random() < 0.5;
        int price;
        if (coin) {
            price = item.getBasePrice() +
                    ((item.getIPL() * (techLevel.ordinal() - item.getMTLP()) + randomizer));
        } else {
            price = item.getBasePrice() +
                    ((item.getIPL() * (techLevel.ordinal() - item.getMTLP()) - randomizer));
        }
        return price;
    }

    public Integer getStock(String item) {
        return storage.get(item);
    }

    /**
     * Shows all items inside the storage
     * @return all items, stock, and price as a string
     */

    @RecentlyNonNull
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (String i : storage.keySet()) {
            result.append(i).append(" ").append(Objects.requireNonNull(storage.get(i)).toString()).append("\n");
        }

        return result.toString();
    }
}
