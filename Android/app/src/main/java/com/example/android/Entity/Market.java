package com.example.android.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

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
     * @param item The item to be removed
     * @return the item that is passed in
     * @throws java.util.NoSuchElementException when item stock is 0
     */
    public String removeItem(String item, int times) {
        if (storage.get(item) < 0) {
            throw new NoSuchElementException(item + " is not in stock");
        } else {
            storage.put(item, storage.get(item) - times);
            return item;
        }
    }

    public String removeItem(String item) {
        return removeItem(item, 1);
    }

    /**
     * Increases the stock of the given item by 1
     * @param item The item whose stock to increase
     */
    public void addItem(String item, int times) {
        storage.put(item, storage.get(item) + times);
    }

    public void addItem(String item) {
        addItem(item, 1);
    }

    public int calculatePrice(Item item) {
        int randomizer = (int) Math.random() * item.getVariance();
        boolean coin = Math.random() < 0.5;
        int price = 0;
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
    public String toString() {
        String result = "";

        for (String i : storage.keySet()) {
            result += i + " " + storage.get(i).toString() + "\n";
        }

        return result;
    }
}
