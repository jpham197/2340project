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

    /**
     * Gets current fuel level
     * @return
     */
    public int getFuel() {
        return this.currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    /**
     * Gets max fuel level
     * @return
     */
    public int getMaxFuel() {
        return this.maxFuel;
    }

    /**
     * @param origin Where you're leaving from
     * @param destination Where you're going to
     * @return Returns the destination location object if fuel is sufficient, else return null
     */
    public Location travel(Location origin, Location destination) {
        int distance = origin.calcDistance(destination);
        int fuelCost = fuelCost(origin, destination);
        if ((currentFuel - fuelCost) >= 0) {
            currentFuel -= fuelCost;
            return destination;
        } else {
            return null;
        }
    }


    /**
     * Method to refuel player's ship
     * @return
     */
    public void refuel() {
//        if (player.checkCredits(3 * (maxFuel - currentFuel))) {
//            int cost = 3 * (maxFuel - currentFuel);
//            currentFuel = maxFuel;
//            player.setCredits(player.getCredits() - cost);
//            return true;
//        }
//        return false;
        currentFuel = maxFuel;
    }

    /** LMAO DON'T USE THIS I DON'T THINK WE'R
     * Method to upgrade player's ship
     * @param player
     * @return if the fuel was increased
     */
    public boolean increaseFuel(Player player) {
        if (player.checkCredits(100)) {
            maxFuel += 100;
            //TODO: Subtract player credits
            return true;
        }
        return false;
    }

    /**
     * Calculate fuel cost of traveling from one place to another
     * @param origin
     * @param destination
     * @return cost of travel
     */
    public int fuelCost(Location origin, Location destination){
        int distance = origin.calcDistance(destination);
        int fuelCost = ((100 + distance) / 100);
        return fuelCost;
    }
}
