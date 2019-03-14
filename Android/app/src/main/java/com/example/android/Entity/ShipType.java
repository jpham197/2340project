package com.example.android.Entity;

public enum ShipType {
    Gnat(10),
    Beetle(20),
    Dragonfly(30);

    private final int inventorySize;
    private final Item[] inventory;

    ShipType(int inventorySize) {
        this.inventorySize = inventorySize;
        inventory = new Item[inventorySize];
    }
}
