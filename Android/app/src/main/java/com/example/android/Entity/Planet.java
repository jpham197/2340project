package com.example.android.Entity;

import java.util.Random;

import static java.lang.String.valueOf;

public class Planet {
    private PlanetAttributes resource;
    private String name;
    private int xCoordinate;
    private int yCoordinate;


    public Planet() {
        PlanetAttributes[] pAS = PlanetAttributes.values();
        PlanetName[] pNames = PlanetName.values();
        Random random = new Random();
        resource = pAS[random.nextInt(pAS.length)];
        name = valueOf(pNames[(int)(Math.random() * 11)]);
        this.xCoordinate = (int) (Math.random() * 1000);
        this.yCoordinate = (int) (Math.random() * 1000);
    }

    public PlanetAttributes getResource() {
        return resource;
    }

    public String getName() {
        return name;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }
}
