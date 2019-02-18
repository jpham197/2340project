package com.example.android.Entity;

public class Player {
    private String Name;
    private int credits = 1000;
    private int pilot;
    private int fighter;
    private int trader;
    private int engineer;
    private int skillpointsavailible = 16;
    private Ship n;


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
        return this.skillpointsavailible;
    }
}
