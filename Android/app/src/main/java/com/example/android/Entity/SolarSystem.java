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
<<<<<<< HEAD
     *          Xcoordinate should be between 0 - 100
     *          Ycoordinate should be between 0 - 100
     * @param name name of the Solar System
     * @param techLevel the overall tech level of the solar system
     * @param numOfPlanets the number of planets in the solar system
=======
     *          xCoordinate should be between 0 - 100
     *          yCoordinate should be between 0 - 100
     * @param name
     * @param techLevel
     * @param numOfPlanets
>>>>>>> a73f59bb8f775b87cc23efe1d817cbfe9af27c57
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

    //getters and setters for SolarSystem refs

    /**
     * gets the name of the Solar System
     * @return the name of the Solar System
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Solar System
     * @param name
     */
    //might need a legal checker for this mayber?
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the Tech level of the Solar System
     * @return Tech Level of the Solar System
     */
    public TechLevel getTechLevel(){
        return techLevel;
    }

    /**
     * Changes the Tech Level of the Solar System
     * @param techLevel techlevel to set Solar Systems Tech Level
     */
    public void setTechLevel(TechLevel techLevel) {
        this.techLevel = techLevel;
    }

    /**
     * Gets the Number of Planets in the Solar System
     * @return number of planets in the Solar System
     */
    public int getNumberOfPlanets() {
        return numOfPlanets;
    }
    /**
     * Sets the number of planers in the Solar System
     * @param numOfPlanets number of planets desired for the Solar System
     */
    public void setNumOfPlanets(int numOfPlanets) {
        this.numOfPlanets = numOfPlanets;
    }

    /**
     * Gets the arrays of planets in the Solar System
     * @return An Array of Planets
     */
    public Planet[] getPlanets() {
        return planets;
    }

    /**
     * replace old set of planets with a new set of planets
     * @param planets An Array containing a new set of planets
     */
    public void setPlanets(Planet[] planets) {
        this.planets = planets;
    }

    /**
     * Gets the Xcoordinates of the Solar System
     * @return the X coordinate of the Solar System
     */
    public int getXcoordinate() {
        return Xcoordinate;
    }

    /**
     * Set a new X coordinate for the Solar System
     * @param xcoordinate new X coordinate, takes in Int
     */
    public void setXcoordinate(int xcoordinate) {
        Xcoordinate = xcoordinate;
    }

    /**
     * Gets the Ycoordinates of the Solar System
     * @return the Y coordinate of the Solar System
     */
    public int getYcoordinate() {
        return Ycoordinate;
    }

    /**
     * Set a new Y coordinate for the Solar System
     * @param ycoordinate new Y coordinate, takes in Int
     */
    public void setYcoordinate(int ycoordinate) {
        Ycoordinate = ycoordinate;
    }
}
