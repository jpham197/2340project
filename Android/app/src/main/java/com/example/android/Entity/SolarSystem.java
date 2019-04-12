package com.example.android.Entity;

public class SolarSystem {

    private String name;
    private TechLevel techLevel;
    private int numOfPlanets;
    private Planet[] planets;
    private int xCoordinate = 0;
    private int yCoordinate = 0;
    private static int count = 0;
    private static final String[] names = {"Earth" ,"Mars", "Bars", "Stars", "Combinatorics",
            "Optimus Prime", "BTS", "GOT7", "Qiu", "Hang"};
    private final PlanetAttributes resource;

    private SolarSystem(String name, Planet[] planets) {

        this.name = name;
        this.numOfPlanets = 1;
        this.planets = planets;
        this.planets[0] = new Planet(name);
        this.resource = PlanetAttributes.values()[(int) (Math.random() * 13)];
    }

    /**
     * Default values if not entered has:
     *          Array of Planets
     *          Xcoordinate should be between 0 - 100
     *          Ycoordinate should be between 0 - 100
     */
    public SolarSystem() {
        this(names[count], new Planet[1]);
        count++;
    }

    public String toString() {
        return "\nSolar System: " + name + " at (" + xCoordinate + ", " + yCoordinate
                + ") with planet " + name + " containing resources: " + this.resource + " with tech level: " + techLevel;
    }

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
    public int getX() {
        return xCoordinate;
    }

    /**
     * Set a new X coordinate for the Solar System
     * @param xCoordinate new X coordinate, takes in Int
     */
    public void setX(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    /**
     * Gets the Ycoordinates of the Solar System
     * @return the Y coordinate of the Solar System
     */
    public int getY() {
        return yCoordinate;
    }

    /**
     * Set a new Y coordinate for the Solar System
     * @param yCoordinate new Y coordinate, takes in Int
     */
    public void setY(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
