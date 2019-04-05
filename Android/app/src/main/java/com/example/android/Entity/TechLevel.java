package com.example.android.Entity;

public enum TechLevel {
    PREAGRICULTURE(0, "Pre-Agriculture"),
    AGRICULTURE(1, "Agriculture"),
    MEDIEVAL(2, "Medieval"),
    RENAISSANCE(3, "Renaissance"),
    EARLYINDUSTRIAL(4, "Early Industrial"),
    INDUSTRIAL(5, "Industrial"),
    POSTINDUSTRIAL(6, "Post-Industrial"),
    HITECH(7, "Hi-Tech");

    private final int index;
    private final String techLV;

    TechLevel(int index, String techLV) {
        this.index = index;
        this.techLV = techLV;
    }
    public TechLevel[] getTechLevels() {
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
