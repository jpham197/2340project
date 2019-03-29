package com.example.android.Entity;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import static java.lang.String.valueOf;

public class Planet {
    private PlanetAttributes resource;
    private String name;
    private Location location;
    private TechLevel techLevel;
    private Market market;

    public Planet() {
        PlanetAttributes[] pAS = PlanetAttributes.values();
        PlanetName[] pNames = PlanetName.values();
        Random random = new Random();
        resource = pAS[random.nextInt(pAS.length)];
        name = valueOf(pNames[(int)(Math.random() * 10)]);
        location = new Location((int) (Math.random() * 1000), (int) (Math.random() * 1000));
//        techLevel = TechLevel.HITECH;
        techLevel = TechLevel.values()[(int)(Math.random()*7)];
        market = new Market(techLevel);
    }

    public PlanetAttributes getResource() {
        return resource;
    }

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
