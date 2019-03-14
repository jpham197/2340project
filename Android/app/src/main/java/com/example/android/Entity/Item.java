package com.example.android.Entity;

public class Item {
    private ItemType name;

    /**
     * Main constructor for Item, manually set name, stock, and price
     * @param type
     */
    public Item(ItemType type) {
        this.name = type;
    }

    public int getBasePrice() {
        return name.getBasePrice();
    }

    public int getIPL() {
        return name.getIPL();
    }

    public int getVariance() {
        return name.getVariance();
    }

    public int getTTP() {
        return name.getTTP();
    }

    public int getMTLP() {
        return name.getMTLP();
    }

    public int getMTLU() {
        return name.getMTLU();
    }

    @Override
    public String toString() {
        return String.format("Item: %s", name.toString());
    }
}
