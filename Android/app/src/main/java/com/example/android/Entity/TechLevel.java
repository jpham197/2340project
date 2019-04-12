package com.example.android.Entity;

public enum TechLevel {
    AGRICULTURE(1),
    EARLYINDUSTRIAL(4),
    HITECH(7),
    INDUSTRIAL(5),
    MEDIEVAL(2),
    POSTINDUSTRIAL(6),
    PREAGRICULTURE(0),
    RENAISSANCE(3);

    // --Commented out by Inspection (4/11/19, 11:35 PM):private final int index;

    TechLevel(int index) {
        this.index = index;
    }

// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    private TechLevel[] getTechLevels() {
//        return TechLevel.values();
//    }
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

}
