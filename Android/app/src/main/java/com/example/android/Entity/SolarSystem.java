package com.example.android.Entity;

public class SolarSystem {

    private String name;
    private TechLevel techLevel;
    private int numOfPlanets;
    private Planet[] planets;


    SolarSystem(String name, TechLevel techLevel, int numOfPlanets, Planet[] planets) {
        this.name = name;
        this.techLevel = techLevel;
        this.numOfPlanets = numOfPlanets;
        this.planets = planets;
    }

    SolarSystem(String name, TechLevel techLevel, int numOfPlanets){
        this(name, techLevel, numOfPlanets, new Planet[numOfPlanets]);
    }

}
