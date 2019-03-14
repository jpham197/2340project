package com.example.android.Entity;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Market {
    //Price of items are set to base price
    private Item[] storage;
    Item water = new Item("Water", 0, 30);
    Item furs = new Item("Water", 0, 250);
    Item food = new Item("Water", 0, 100);
    Item ores = new Item("Water", 0, 350);
    Item games = new Item("Water", 0, 250);
    Item firearms = new Item("Water", 0, 1250);
    Item medicine = new Item("Water", 0, 650);
    Item machines = new Item("Water", 0, 900);
    Item narcotics = new Item("Water", 0, 3500);
    Item robots = new Item("Water", 0, 9000);
    /**
     * Plain constructor for Market, sets everything to base price
     */
    public Market() {
        storage = new Item[10];
        storage[0] = water;
        storage[1] = furs;
        storage[2] = food;
        storage[3] = ores;
        storage[4] = games;
        storage[5] = firearms;
        storage[6] = medicine;
        storage[7] = machines;
        storage[8] = narcotics;
        storage[9] = robots;
    }

    /**
     * Removes item from the storage
     * @param item The item to be removed
     * @return the item that is passed in
     * @throws java.util.NoSuchElementException when item stock is 0
     */
    public Item removeItem(String item) {
        int index = getIndex(item);
        if (storage[index].getStock() == 0) {
            throw new NoSuchElementException(storage[index].getName() + " is out of stock.");
        } else {
            Item result = storage[getIndex(item)];
            result.minusStock();
            storage[index].minusStock();
            return result;
        }
    }

    /**
     * Increases the stock of the given item by 1
     * @param item The item whose stock to increase
     */
    public void addItem(String item) {
        storage[getIndex(item)].addStock();
    }

    /**
     * Shows all items inside the storage
     * @return all items, stock, and price as a string
     */
    public String toString() {
        String result = "";

        for (Item i : storage) {
            result += i.toString() + "\n";
        }

        return result;
    }

    /**
     * Gets index of item based on string input
     */
    private int getIndex(String item) {
        int index;
        switch (item) {
            case "water":
                index = 0;
                break;
            case "furs":
                index = 1;
                break;
            case "food":
                index = 2;
                break;
            case "ore":
                index = 3;
                break;
            case "games":
                index = 4;
                break;
            case "firearms":
                index = 5;
                break;
            case "medicine":
                index = 6;
                break;
            case "machines":
                index = 7;
                break;
            case "narcotics":
                index = 8;
                break;
            case "robots":
                index = 9;
                break;
            default:
                index = -1;
                break;
        }
        return index;
    }
}
