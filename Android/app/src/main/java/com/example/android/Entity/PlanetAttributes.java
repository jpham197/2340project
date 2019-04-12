package com.example.android.Entity;

import androidx.annotation.RecentlyNonNull;

public enum PlanetAttributes {
    NOSPECIALRESOURCES(),
    MINERALRICH(),
    MINERALPOOR(),
    DESERT(),
    LOTSOFWATER(),
    RICHSOIL(),
    POORSOIL(),
    RICHFAUNA(),
    LIFELESS(),
    WEIRDMUSHROOMS(),
    LOTSOFHERBS(),
    ARTISTIC(),
    WARLIKE();

    /**
     * Constructor for planet attributes
     *
     */
    PlanetAttributes() {
    }

// --Commented out by Inspection START (4/11/19, 11:23 PM):
//    public PlanetAttributes[] getResource() {
//        return PlanetAttributes.values();
//    }
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)

    @RecentlyNonNull
    @Override
    public String toString() {
        return name();
    }
}
