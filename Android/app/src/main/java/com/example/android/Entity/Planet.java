package com.example.android.Entity;

import java.util.Random;

import static java.lang.String.valueOf;

public class Planet {
    private PlanetAttributes resource;
    private String name;
    private int xCor;
    private int yCor;


    public Planet() {
        PlanetAttributes[] pAS = PlanetAttributes.values();
        PlanetName[] pNames = PlanetName.values();
        Random random = new Random();
        resource = pAS[random.nextInt(pAS.length)];
        name = valueOf(pNames[random.nextInt(pNames.length)]);
        xCor = 0;
        yCor = 0;
    }
}
