package com.example.android.Entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Market {
    //MapEntry is <stock, price>
    HashMap<String, Map.Entry<Integer, Integer>> storage;


    public Market() {
        storage = new HashMap<>();
    }

    //To do: Make constructor to create market from collection
    //public Market(Collection)

    /**
     * Method within market for market interactor to use in its buy()
     *
     * @param item
     * @return the item removed
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
}
