package com.example.android.Entity;

import java.util.Random;

public class Planet {
    private PlanetAttributes resource;

    public Planet() {
        PlanetAttributes[] pAS = PlanetAttributes.values();
        Random random = new Random();
        resource = pAS[random.nextInt(pAS.length)];
    }
}
