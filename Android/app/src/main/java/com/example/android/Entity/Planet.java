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
        name = valueOf(pNames[random.nextInt(pNames.length)]);
        xCoordinate = 0;
        yCoordinate = 0;
    }
}
