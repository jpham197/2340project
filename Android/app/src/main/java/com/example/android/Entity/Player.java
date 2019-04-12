package com.example.android.Entity;

public class Player {
    private String name;
    private int credits;
    private int pilot;
    private int fighter;
    private int trader;
    private int engineer;
    private Ship ship;
    private Location location;
    private final Inventory inventory;

    /**
     *  @param name player name
     * @param pilot pilot skill
     * @param fighter fighter skill
     * @param trader trader skill
     * @param engineer engineer skill
     * @param credits number
     * @param ship player ship
     */
    public Player(String name, int pilot, int fighter, int trader, int engineer
            , int credits, Ship ship) {
        this.name = name;
        this.pilot = pilot;
        this.fighter = fighter;
        this.trader = trader;
        this.engineer = engineer;
        this.credits = credits;
        this.ship = ship;
        this.inventory = new Inventory();
    }

    /**
     * this constructor initializes the default values for the player
     * @param name name of the commander
     * @param pilot number of skill points in pilot
     * @param fighter number of skill points in fighter
     * @param trader number of skill points in trader
     * @param engineer number of skill points in engineer
     */
    public Player(String name, int pilot, int fighter, int trader, int engineer) {
        this(name, pilot, fighter, trader, engineer, 1000
                , new Ship(100, ShipType.Gnat));
    }
    public Player() {
        this(null, 0, 0,
                0, 0, 0, null);
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @param name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return current ship
     */
    public Ship getShip() {
        return this.ship;
    }

    /**
     *
     * @param upgrade dog
     */
    public void setShip(Ship upgrade) {
        this.ship = upgrade;
    }

    public Inventory getInventory() { return this.inventory; }

    /**
     *
     * @return dog
     */
    public int getCredits() {
        return this.credits;
    }

    /**
     *
     * @param credit dog
     */
    public void setCredits(int credit) {
        this.credits = credit;
    }

//    /**
//     * Checks to see if a player has a certain amount of credits
//     * @param credits dog
//     * @return dog
//     */
//    public boolean checkCredits(int credits) {
//        return this.credits >= credits;
//    }

    /**
     *
     * @return dog
     */
    public int getPilot() {
        return this.pilot;
    }

    /**
     *
     * @param pilot dog
     */
    public void setPilot(int pilot) {
        this.pilot = pilot;
    }

    /**
     *
     * @return dog
     */
    public int getFighter() {
        return this.fighter;
    }

    /**
     *
     * @param fighter dog
     */
    public void setFighter(int fighter) {
        this.fighter = fighter;
    }

    /**
     *
     * @return dog
     */
    public int getTrader() {
        return  this.trader;
    }

    /**
     *
     * @param trader dog
     */
    public void setTrader(int trader) {
        this.trader = trader;
    }

    /**
     *
     * @return dog
     */
    public int getEngineer() {
        return this.engineer;
    }

    /**
     *
     * @param engineer dog
     */
    public void setEngineer(int engineer) {
        this.engineer = engineer;
    }

// --Commented out by Inspection START (4/11/19, 11:23 PM):
//    /**
//     *
//     * @return
//     */
//    public int getSkillpointsavailible() {
//        return this.skillPointsAvailable;
//    }
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }

//    public boolean travel(Location destination) {
//        if (ship.travel(this.location, destination) != null) {
//            location = destination;
//            return true;
//        } else {
//            return false;
//        }
//    }
}
