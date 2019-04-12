package com.example.android.Entity;

import androidx.annotation.RecentlyNonNull;

public enum ItemType {
    water(30, 3, 4, 0),
    furs(250, 10, 10, 0),
    food(100, 5, 5, 1),
    ores(350, 20, 10, 2),
    games(250, -10, 5, 3),
    firearms(1250, -75, 100, 3),
    medicine(650, -20, 10, 4),
    machines(900, -30, 5, 4),
    narcotics(3500, -125, 150, 5),
    robots(9000, -150, 100, 6);

    private final int basePrice;
    private final int IPL;
    private final int MTLP;
    private final int variance;

    /*
     * baseprice: starting cost
     * IPL: The price increase per tech level, given in item class
     * variance: how much the price can change
     * TTP: tech level that produces the most of this item
     * MTLP: Minimum tech level to buy the item
     * MTLU: minimum tech level to sell the item
     */
    ItemType(int basePrice, int IPL, int variance, int MTLP) {
        this.basePrice = basePrice;
        this.IPL = IPL;
        this.variance = variance;
        this.MTLP = MTLP;
    }

    public int getBasePrice() {
        return this.basePrice;
    }

    public int getIPL() {
        return IPL;
    }

    public int getVariance() {
        return variance;
    }

// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    public int getTTP() {
//        return TTP;
//    }
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

    public int getMTLP() {
        return MTLP;
    }

// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    public int getMTLU() {
//        return MTLU;
//    }
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

    @RecentlyNonNull
    public String toString() {
        return name();
    }
}
