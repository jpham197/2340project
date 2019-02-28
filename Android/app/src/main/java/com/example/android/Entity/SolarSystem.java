package com.example.android.Entity;

public class SolarSystem {

    private String name;
    private TechLevel techLevel;
    private int numOfPlanets;
    private Planet[] planets;
    private int Xcoordinate;
    private int Ycoordinate;


    SolarSystem(String name, TechLevel techLevel, int numOfPlanets, Planet[] planets
        , int Xcoordinate, int Ycoordinate) {

        this.name = name;
        this.techLevel = techLevel;
        this.numOfPlanets = numOfPlanets;
        this.planets = planets;
        this.Xcoordinate = Xcoordinate;
        this.Ycoordinate = Ycoordinate;
    }

    /**
     * Default values if not entered has:
     *          Array of Planets
     *          Xcoordinate should be between 0 - 100
     *          Ycoordinate should be between 0 - 100
     * @param name
     * @param techLevel
     * @param numOfPlanets
     */
    SolarSystem(String name, TechLevel techLevel, int numOfPlanets){
        this(name, techLevel, numOfPlanets, new Planet[numOfPlanets]
                ,(int) Math.random() * 100, (int) Math.random() * 100);
    }

}
