package com.example.android.Entity;


import java.util.Arrays;

public class Universe {

    private SolarSystem[] solarSystems;

    public Universe() {
        solarSystems = new SolarSystem[10];
        for (int a = 0; a < solarSystems.length; a++) {
            solarSystems[a] = new SolarSystem();
        }
    }

    /**
     *
     * @param solarSystems
     */
    public Universe(SolarSystem[] solarSystems) {
        this.solarSystems = solarSystems;
    }

    /**
     *
     * @return
     */
    public SolarSystem[] getSolarSystems() {
        return solarSystems;
    }

    /**
     *
     * @param solarSystems
     */
    public void setSolarSystems(SolarSystem[] solarSystems) {
        this.solarSystems = solarSystems;
    }

    /**
     *
     */
    public SolarSystem getSolarSystem(SolarSystem name) {

        for (int i = 0; i < this.solarSystems.length; i++) {
            if (this.solarSystems[i] == name) {
                return solarSystems[i];
            }
        }
        return null;
    }

    public String toString() {
        return Arrays.toString(solarSystems);
    }
}

