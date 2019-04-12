package com.example.android.Entity;


import java.util.Arrays;

import androidx.annotation.RecentlyNonNull;

public class Universe {

    private final SolarSystem[] solarSystems;

    public Universe() {
        solarSystems = new SolarSystem[10];
        for (int a = 0; a < solarSystems.length; a++) {
            solarSystems[a] = new SolarSystem();
        }
    }

// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    /**
//     *
//     * @param solarSystems
//     */
//    public Universe(SolarSystem[] solarSystems) {
//        this.solarSystems = solarSystems;
//    }
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

    /**
     *
     * @return dog
     */
    public SolarSystem[] getSolarSystems() {
        return solarSystems;
    }

// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    /**
//     *
//     * @param solarSystems
//     */
//    public void setSolarSystems(SolarSystem[] solarSystems) {
//        this.solarSystems = solarSystems;
//    }
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    /**
//     *
//     */
//    public SolarSystem getSolarSystem(SolarSystem name) {
//
//        for (int i = 0; i < this.solarSystems.length; i++) {
//            if (this.solarSystems[i] == name) {
//                return solarSystems[i];
//            }
//        }
//        return null;
//    }
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

    @RecentlyNonNull
    public String toString() {
        return Arrays.toString(solarSystems);
    }
}

