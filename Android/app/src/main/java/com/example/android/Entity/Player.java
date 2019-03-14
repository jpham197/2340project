package com.example.android.Entity;

public class Player {
    private String name;
    private int credits;
    private int pilot;
    private int fighter;
    private int trader;
    private int engineer;
    private int skillPointsAvailable;
    private Ship current;


    /**
     *
     * @param name
     * @param pilot
     * @param fighter
     * @param trader
     * @param engineer
     * @param skillPointsAvailable
     * @param current
     */
    public Player(String name, int pilot, int fighter, int trader, int engineer
                  , int skillPointsAvailable, int credits, Ship current) {
        this.name = name;
        this.pilot = pilot;
        this.fighter = fighter;
        this.trader = trader;
        this.engineer = engineer;
        this.skillPointsAvailable = skillPointsAvailable;
        this.credits = credits;
        this.current = current;
    }

    /**
     * this constructor initializes the default values for the player
     * @param name name of the commander
     * @param pilot number of skill points in pilot
     * @param fighter number of skill points in fighter
     * @param trader number of skill points in trader
     * @param engineer number of skill points in engineer
     * @param current the current ship of the player. Default is Gnat
     */
    public Player(String name, int pilot, int fighter, int trader, int engineer, Ship current) {
        this(name, pilot, fighter, trader, engineer, 16, 1000
                , new Ship(100, ShipType.Gnat));
    }
    public Player() {
        this(null, 0, 0, 0, 0, 0, 0, null);
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
        return this.current;
    }

    public void setShip(Ship upgrade) {
        this.current = upgrade;
    }

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
}
