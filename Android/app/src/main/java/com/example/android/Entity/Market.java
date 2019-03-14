package com.example.android.Entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Market {
    //MapEntry is <stock, price>
    //Hashmap<item name, mapEntry>
    HashMap<String, Map.Entry<Integer, Integer>> storage;


    public Market() {
        storage = new HashMap<>();
    }

    //To do: Make constructor to create market from collection
    //public Market(Collection)

    /**
     * Method within market for market interactor to use in its buy()
     *
     * @param item the item looking to be removed
     * @return the item removed
     * @throws NoSuchElementException when the item cannot be found
     */
    public Map.Entry<Integer, Integer> removeItem(String item) {
        if (storage.containsKey(item)) {
            return storage.remove(item);
        } else {
            throw new NoSuchElementException("Item not in storage");
        }
    }

    /**
     * Method within market for market interactor to use in its sell()
     * @param item the item being added
     */
    public void addItem(String item) {
        Map.Entry<Integer,Integer> itemObject = storage.get(item);
        Integer stock = itemObject.getKey();
        Integer price = itemObject.getValue();
        storage.put(item, Map.Entry<stock, price>);
    }

    /**
     * to string all items in market
     */
    public String toString() {
        String items = "";
        Object[] keys = storage.keySet().toArray();
        for (int a = 0; a < storage.size(); a++) {
            items += "Item: " + keys[a] + ", stock: " + storage.get(keys[a]).getKey() + ", price:"
                    + storage.get(keys[a]).getValue();
        }
        return items;
    }
}
