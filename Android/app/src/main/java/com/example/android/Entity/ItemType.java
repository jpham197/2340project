package com.example.android.Entity;

public enum ItemType {
    water(30, 3, 4, 2, 0, 0),
    furs(250, 10, 10, 0, 0, 0),
    food(100, 5, 5, 1, 1, 0),
    ores(350, 20, 10, 3, 2, 2),
    games(250, -10, 5, 6, 3, 1),
    firearms(1250, -75, 100, 5, 3, 1),
    medicine(650, -20, 10, 6, 4, 1),
    machines(900, -30, 5, 5, 4, 3),
    narcotics(3500, -125, 150, 5, 5, 0),
    robots(9000, -150, 100, 7, 6, 4);

    private final int basePrice;
    private final int IPL;
    private final int MTLP;
    private final int variance;
    private final int TTP;
    private final int MTLU;

    /*
     * baseprice: starting cost
     * IPL: The price increase per tech level, given in item class
     * variance: how much the price can change
     * TTP: tech level that produces the most of this item
     * MTLP: Minimum tech level to buy the item
     * MTLU: minimum tech level to sell the item
     */
    ItemType(int basePrice, int IPL, int variance, int TTP, int MTLP, int MTLU) {
        this.basePrice = basePrice;
        this.IPL = IPL;
        this.variance = variance;
        this.TTP = TTP;
        this.MTLP = MTLP;
        this.MTLU = MTLU;
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

    public int getTTP() {
        return TTP;
    }

    public int getMTLP() {
        return MTLP;
    }

    public int getMTLU() {
        return MTLU;
    }

    @Override
    public String toString() {
        return name();
    }
}
