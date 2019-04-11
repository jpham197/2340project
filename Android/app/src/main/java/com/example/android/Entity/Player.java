package com.example.android.Entity;

public class Player {
    private String name;
    private int credits;
    private int pilot;
    private int fighter;
    private int trader;
    private int engineer;
    private int skillPointsAvailable;
    private Ship ship;
    private Location location;
    private Inventory inventory;

    /**
     * Full constructor for player
     * @param name
     * @param pilot
     * @param fighter
     * @param trader
     * @param engineer
     * @param skillPointsAvailable
     * @param credits
     * @param ship
     */
    public Player(String name, int pilot, int fighter, int trader, int engineer,
                  int skillPointsAvailable, int credits, Ship ship) {
        this.name = name;
        this.pilot = pilot;
        this.fighter = fighter;
        this.trader = trader;
        this.engineer = engineer;
        this.skillPointsAvailable = skillPointsAvailable;
        this.credits = credits;
        this.ship = ship;
        this.inventory = new Inventory(10);
    }

    /**
     * Basic player constructor
     * @param name name of the commander
     * @param pilot number of skill points in pilot
     * @param fighter number of skill points in fighter
     * @param trader number of skill points in trader
     * @param engineer number of skill points in engineer
     */
    public Player(String name, int pilot, int fighter, int trader, int engineer) {
        this(name, pilot, fighter, trader, engineer,16, 1000,
                new Ship(100, ShipType.Gnat));
    }

    /**
     * Default constructor, everything is set to 0 and null
     */
    public Player() {
        this(null, 0, 0,
                0, 0, 0, 0, null);
    }

    /**
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public Ship getShip() {
        return this.ship;
    }

    /**
     *
     * @param upgrade
     */
    public void setShip(Ship upgrade) {
        this.ship = upgrade;
    }

    public Inventory getInventory() { return this.inventory; }

    /**
     *
     * @return
     */
    public int getCredits() {
        return this.credits;
    }

    /**
     *
     * @param credit
     */
    public void setCredits(int credit) {
        this.credits = credit;
    }

    /**
     * Checks to see if a player has a certain amount of credits
     * @param credits
     * @return
     */
    public boolean checkCredits(int credits) {
        return this.credits >= credits;
    }

    /**
     *
     * @return
     */
    public int getPilot() {
        return this.pilot;
    }

    /**
     *
     * @param pilot
     */
    public void setPilot(int pilot) {
        this.pilot = pilot;
    }

    /**
     *
     * @return
     */
    public int getFighter() {
        return this.fighter;
    }

    /**
     *
     * @param fighter
     */
    public void setFighter(int fighter) {
        this.fighter = fighter;
    }

    /**
     *
     * @return
     */
    public int getTrader() {
        return  this.trader;
    }

    /**
     *
     * @param trader
     */
    public void setTrader(int trader) {
        this.trader = trader;
    }

    /**
     *
     * @return
     */
    public int getEngineer() {
        return this.engineer;
    }

    /**
     *
     * @param engineer
     */
    public void setEngineer(int engineer) {
        this.engineer = engineer;
    }

    /**
     *
     * @return
     */
    public int getSkillpointsavailible() {
        return this.skillPointsAvailable;
    }

    /**
     *
     * @param location new location to set player to
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     *
     * @return the current location of player
     */
    public Location getLocation() {
        return this.location;
    }

    /**
     * Travel method to update player's location if enough credits
     * @param destination
     * @return
     */
    public boolean travel(Location destination) {
        if (ship.travel(this.location, destination) != null) {
            location = destination;
            return true;
        } else {
            return false;
        }
    }

    public boolean refuel() {
        int refuelCost = 3 * (ship.getMaxFuel() - ship.getFuel());

        if ()
    }
}
