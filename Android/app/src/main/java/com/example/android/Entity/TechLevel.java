package com.example.android.Entity;

public enum TechLevel {
    AGRICULTURE(1, "Agriculture"),
    EARLYINDUSTRIAL(4, "Early Industrial"),
    HITECH(7, "Hi-Tech"),
    INDUSTRIAL(5, "Industrial"),
    MEDIEVAL(2, "Medieval"),
    POSTINDUSTRIAL(6, "Post-Industrial"),
    PREAGRICULTURE(0, "Pre-Agriculture"),
    RENAISSANCE(3, "Renaissance");

    private final int index;

    TechLevel(int index, String techLV) {
        this.index = index;
    }

    private TechLevel[] getTechLevels() {
        return TechLevel.values();
    }

    public TechLevel getRandomTechLevel() {
        int randomNum = (int) Math.random() * 7;
        return getTechLevels()[randomNum];
    }

    public int getTechLevel() {
        return index;
    }
}
