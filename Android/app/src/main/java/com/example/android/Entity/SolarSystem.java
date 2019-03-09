package com.example.android.Entity;

public class SolarSystem {

    private String name;
    private TechLevel techLevel;
    private int numOfPlanets;
    private Planet[] planets;
    private int xCoordinate = 0;
    private int yCoordinate = 0;
    static int count = 0;
    static String[] names = {"Earth" ,"Mars", "Bars", "Stars", "Combinatorics",
            "Optimus Prime", "BTS", "GOT7", "Qiu", "Hang"};
    private PlanetAttributes resource;

    SolarSystem(String name, TechLevel techLevel, int numOfPlanets, Planet[] planets
        , int xCoordinate, int yCoordinate) {

        this.name = name;
        this.techLevel = techLevel;
        this.numOfPlanets = numOfPlanets;
        this.planets = planets;
        this.resource = PlanetAttributes.values()[(int) (Math.random() * 13)];
    }

    /**
     * Default values if not entered has:
     *          Array of Planets
     *          xCoordinate should be between 0 - 100
     *          yCoordinate should be between 0 - 100
     * @param name
     * @param techLevel
     * @param numOfPlanets
     */
    SolarSystem(String name, TechLevel techLevel, int numOfPlanets){
        this(name, techLevel, numOfPlanets, new Planet[numOfPlanets]
                ,(int) (Math.random() * 1001), (int) (Math.random() * 1001));
    }

    public SolarSystem() {
//        this(new Planet().getName(), TechLevel.values()[(int)Math.random()*8], 1);
        this(names[count], TechLevel.values()[(int)(Math.random()*8)], 1);
        count++;
        this.xCoordinate = (int)(Math.random() * 1001);
        this.yCoordinate = (int)(Math.random() * 1001);
        this.techLevel = TechLevel.values()[(int) (Math.random() * 8)];
    }

    public String toString() {
        return "\nSolar System: " + name + " at (" + xCoordinate + ", " + yCoordinate
                + ") with planet " + name + " containing resources: " + this.resource + " with tech level: " + techLevel;
    }

}
