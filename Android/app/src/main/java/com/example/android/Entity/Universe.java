package com.example.android.Entity;


public class Universe {

    private SolarSystem[] solarSystems;

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
}

