package com.example.android.Entity;

import java.util.Random;

import static java.lang.String.valueOf;

public class Planet {
    // --Commented out by Inspection (4/11/19, 11:24 PM):private final PlanetAttributes resource;
    private final String name;
    private final Location location;
    private final TechLevel techLevel;
    private final Market market;

    public Planet() {
        PlanetAttributes[] pAS = PlanetAttributes.values();
        PlanetName[] pNames = PlanetName.values();
        Random random = new Random();
        resource = pAS[random.nextInt(pAS.length)];
        name = valueOf(pNames[(int)(Math.random() * 10)]);
        location = new Location((int) (Math.random() * 1000), (int) (Math.random() * 1000));
        techLevel = TechLevel.values()[(int)(Math.random()*7)];
        market = new Market(techLevel);
    }

    public Planet(String name) {
        Random random = new Random();
        PlanetAttributes[] pAS = PlanetAttributes.values();

        resource = pAS[random.nextInt(pAS.length)];
        this.name = name;
        location = new Location((int) (Math.random() * 1000), (int) (Math.random() * 1000));
        techLevel = TechLevel.values()[(int)(Math.random()*7)];
        market = new Market(techLevel);
    }

// --Commented out by Inspection START (4/11/19, 11:23 PM):
//    public PlanetAttributes getResource() {
//        return resource;
//    }
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return this.location;
    }

    public Market getWholeMarket() {
        return market;
    }

}
