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

    /**
     * @param origin Where you're leaving from
     * @param destination Where you're going to
     * @return Returns the destination location object if fuel is sufficient, else return null
     */
    public Location travel(Location origin, Location destination) {
        int distance = origin.calcDistance(destination);
        if (fuel >= distance) {
            fuel -= distance;
            return destination;
        } else {
            return null;
        }
    }
}
