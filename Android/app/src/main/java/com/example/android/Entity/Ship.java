package com.example.android.Entity;

public class Ship {
    private int fuel;
    private ShipType type;
    public Ship(int fuel, ShipType type) {
        this.type = type;
        this.fuel = fuel;
    }

    public ShipType getShipType() {
        return this.type;
    }

    public String toString() {
        return type + " " + fuel;
    }
}
