package com.example.android.Entity;

public class Ship {
    private int currentFuel;
    private int maxFuel;
    private ShipType type;
    public Ship(int maxFuel, ShipType type) {
        this.maxFuel = maxFuel;
        this.currentFuel = maxFuel;
        this.type = type;

    }

    public ShipType getShipType() {
        return this.type;
    }

    public String toString() {
        return type + ": " + currentFuel + "/" + maxFuel + " kgal";
    }

    public int getFuel() {
        return this.currentFuel;
    }

    /**
     * @param origin Where you're leaving from
     * @param destination Where you're going to
     * @return Returns the destination location object if fuel is sufficient, else return null
     */
    public Location travel(Location origin, Location destination) {
        int distance = origin.calcDistance(destination);
        if (currentFuel > 0 && currentFuel > (distance / 100)) {
            currentFuel -= 20;
            return destination;
        } else {
            return null;
        }
    }


    /**
     * Method to refuel player's ship
     * @param player
     * @return
     */
    public boolean refuel(Player player) {
        if (player.checkCredits(maxFuel - currentFuel)) {
            currentFuel = maxFuel;
            //TODO: Subtract player credits
            return true;
        }
        return false;
    }

    /**
     * Method to upgrade player's ship
     * @param player
     * @return
     */
    public boolean increaseFuel(Player player) {
        if (player.checkCredits(100)) {
            maxFuel += 100;
            //TODO: Subtract player credits
            return true;
        }
        return false;
    }
}
