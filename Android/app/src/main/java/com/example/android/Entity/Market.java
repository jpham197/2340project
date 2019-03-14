package com.example.android.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Market {
    //Price of items are set to base price
    private HashMap<Item, Integer> storage;
    private TechLevel techLevel;

    /**
     * Plain constructor for Market, sets everything to base price and stock to 0
     */
    public Market(TechLevel techLevel) {
        storage = new HashMap<>();
        this.techLevel = techLevel;
        switch (techLevel.ordinal()) {
            case 6:
                storage.put(new Item(ItemType.water), 100);
                storage.put(new Item(ItemType.furs), 100);
                storage.put(new Item(ItemType.food), 100);
                storage.put(new Item(ItemType.ores), 100);
                storage.put(new Item(ItemType.games), 100);
                storage.put(new Item(ItemType.firearms), 100);
                storage.put(new Item(ItemType.medicine), 100);
                storage.put(new Item(ItemType.machines), 100);
                storage.put(new Item(ItemType.narcotics), 100);
                storage.put(new Item(ItemType.robots), 100);
                break;
            case 5:
                storage.put(new Item(ItemType.water), 100);
                storage.put(new Item(ItemType.furs), 100);
                storage.put(new Item(ItemType.food), 100);
                storage.put(new Item(ItemType.ores), 100);
                storage.put(new Item(ItemType.games), 100);
                storage.put(new Item(ItemType.firearms), 100);
                storage.put(new Item(ItemType.medicine), 100);
                storage.put(new Item(ItemType.machines), 100);
                storage.put(new Item(ItemType.narcotics), 100);
                storage.put(new Item(ItemType.robots), 0);
                break;
            case 4:
                storage.put(new Item(ItemType.water), 100);
                storage.put(new Item(ItemType.furs), 100);
                storage.put(new Item(ItemType.food), 100);
                storage.put(new Item(ItemType.ores), 100);
                storage.put(new Item(ItemType.games), 100);
                storage.put(new Item(ItemType.firearms), 100);
                storage.put(new Item(ItemType.medicine), 100);
                storage.put(new Item(ItemType.machines), 100);
                storage.put(new Item(ItemType.narcotics), 0);
                storage.put(new Item(ItemType.robots), 0);
                break;
            case 3:
                storage.put(new Item(ItemType.water), 100);
                storage.put(new Item(ItemType.furs), 100);
                storage.put(new Item(ItemType.food), 100);
                storage.put(new Item(ItemType.ores), 100);
                storage.put(new Item(ItemType.games), 100);
                storage.put(new Item(ItemType.firearms), 100);
                storage.put(new Item(ItemType.medicine), 0);
                storage.put(new Item(ItemType.machines), 0);
                storage.put(new Item(ItemType.narcotics), 0);
                storage.put(new Item(ItemType.robots), 0);
                break;
            case 2:
                storage.put(new Item(ItemType.water), 100);
                storage.put(new Item(ItemType.furs), 100);
                storage.put(new Item(ItemType.food), 100);
                storage.put(new Item(ItemType.ores), 100);
                storage.put(new Item(ItemType.games), 0);
                storage.put(new Item(ItemType.firearms), 0);
                storage.put(new Item(ItemType.medicine), 0);
                storage.put(new Item(ItemType.machines), 0);
                storage.put(new Item(ItemType.narcotics), 0);
                storage.put(new Item(ItemType.robots), 0);
                break;
            case 1:
                storage.put(new Item(ItemType.water), 100);
                storage.put(new Item(ItemType.furs), 100);
                storage.put(new Item(ItemType.food), 100);
                storage.put(new Item(ItemType.ores), 0);
                storage.put(new Item(ItemType.games), 0);
                storage.put(new Item(ItemType.firearms), 0);
                storage.put(new Item(ItemType.medicine), 0);
                storage.put(new Item(ItemType.machines), 0);
                storage.put(new Item(ItemType.narcotics), 0);
                storage.put(new Item(ItemType.robots), 0);
                break;
            case 0:
                storage.put(new Item(ItemType.water), 100);
                storage.put(new Item(ItemType.furs), 100);
                storage.put(new Item(ItemType.food), 0);
                storage.put(new Item(ItemType.ores), 0);
                storage.put(new Item(ItemType.games), 0);
                storage.put(new Item(ItemType.firearms), 0);
                storage.put(new Item(ItemType.medicine), 0);
                storage.put(new Item(ItemType.machines), 0);
                storage.put(new Item(ItemType.narcotics), 0);
                storage.put(new Item(ItemType.robots), 0);
                break;
        }

    }

    /**
     * Removes item from the storage
     * @param item The item to be removed
     * @return the item that is passed in
     * @throws java.util.NoSuchElementException when item stock is 0
     */
    public Item removeItem(Item item) {
        if (storage.get(item) <= 0) {
            throw new NoSuchElementException(item + " is not in stock");
        } else {
            storage.put(item, storage.get(item) - 1);
            return item;
        }
    }

    /**
     * Increases the stock of the given item by 1
     * @param item The item whose stock to increase
     */
    public void addItem(Item item) {
        storage.put(item, storage.get(item) + 1);
    }

    public int calculatePrice(Item item) {
        int randomizer = (int) Math.random() * item.getVariance();
        boolean coin = Math.random() < 0.5 ? true : false;
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

    /**
     * Shows all items inside the storage
     * @return all items, stock, and price as a string
     */
    public String toString() {
        String result = "";

        for (Item i : storage.keySet()) {
            result += i + " " + storage.get(i).toString() + "\n";
        }

        return result;
    }
}
