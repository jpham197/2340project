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
     * @param name name of the Solar System
     * @param techLevel the overall tech level of the solar system
     * @param numOfPlanets the number of planets in the solar system
     */
    SolarSystem(String name, TechLevel techLevel, int numOfPlanets){
        this(name, techLevel, numOfPlanets, new Planet[numOfPlanets]
                ,(int) Math.random() * 100, (int) Math.random() * 100);
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
