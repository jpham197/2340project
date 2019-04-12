package com.example.android.Entity;

import androidx.annotation.RecentlyNonNull;

public class Item {
    private final ItemType name;

    /**
     * Main constructor for Item, manually set name, stock, and price
     * @param type item type from enum
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

// --Commented out by Inspection START (4/11/19, 11:23 PM):
//    public int getTTP() {
//        return name.getTTP();
//    }
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)

    public int getMTLP() {
        return name.getMTLP();
    }

// --Commented out by Inspection START (4/11/19, 11:23 PM):
//    public int getMTLU() {
//        return name.getMTLU();
//    }
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)

    @RecentlyNonNull
    public String toString() {
        return String.format("%s", name.toString());
    }
}
