package com.example.android.Entity;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import static java.lang.String.valueOf;

public class Planet {
    private final PlanetAttributes resource;
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
