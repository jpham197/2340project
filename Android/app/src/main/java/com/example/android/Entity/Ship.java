package com.example.android.Entity;

import androidx.annotation.RecentlyNonNull;

public class Ship {
    private int currentFuel;
    private final int maxFuel;
    private final ShipType type;
    public Ship(int maxFuel, ShipType type) {
        this.maxFuel = maxFuel;
        this.currentFuel = maxFuel;
        this.type = type;

    }

// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    public ShipType getShipType() {
//        return this.type;
//    }
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

    @RecentlyNonNull
    public String toString() {
        return type + ": " + currentFuel + "/" + maxFuel + " kgal";
    }

    public int getFuel() {
        return this.currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    //    public Location travel(Location origin, Location destination) {
//        int distance = origin.calcDistance(destination);
//        int fuelCost = fuelCost(origin, destination);
        // --Commented out by Inspection START (4/11/19, 11:24 PM):
        //            currentFuel -= fuelCost;
        //            return destination;
        //        } else {
        //            return null;
        //        }
        //    }
        //
        //
        //    /**
        //     * Method to refuel player's ship
        //     * @param player
        //     * @return
        //     */
        //    public boolean refuel(Player player) {
        //        if (player.checkCredits(3 * (maxFuel - currentFuel))) {
        //            int cost = 3 * (maxFuel - currentFuel);
        //            currentFuel = maxFuel;
        // --Commented out by Inspection STOP (4/11/19, 11:24 PM)
        // --Commented out by Inspection START (4/11/19, 11:24 PM):
        //            player.setCredits(player.getCredits() - cost);
        //            return true;
        //        }
        //        return false;
        //    }
        //
        //    /**
        //     * Method to upgrade player's ship
        //     * @param player
        //     * @return
        //     */
        //    public boolean increaseFuel(Player player) {
        //        if (player.checkCredits(100)) {
        //            maxFuel += 100;
        // --Commented out by Inspection STOP (4/11/19, 11:24 PM)
        //TODO: Subtract player credits
//        return (currentFuel - fuelCost) >= 0;
//    }

//    private int fuelCost(Location origin, Location destination){
//        int distance = origin.calcDistance(destination);
//        return ((100 + distance) / 100);
//    }
}
