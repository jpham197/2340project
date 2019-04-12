package com.example.android.Entity;

//import androidx.annotation.RecentlyNonNull;

public class SolarSystem {

// --Commented out by Inspection START (4/11/19, 11:28 PM):
// --Commented out by Inspection START (4/11/19, 11:29 PM):
// --Commented out by Inspection START (4/11/19, 11:35 PM):
//////    // --Commented out by Inspection (4/11/19, 11:28 PM):private final String name;
//////    //// --Commented out by Inspection (4/11/19, 11:28 PM): --Commented out by Inspection (4/11/19, 11:24 PM):private TechLevel techLevel;
////// --Commented out by Inspect// --Commented out by Inspection (4/11/19, 11:29 PM):ion STOP (4/11/19, 11:28 PM)
////    private int xCoordinate = 0;
//// --Commented out by Inspection STOP (4/11/19, 11:29 PM)
//    private final String name;
// --Commented out by Inspection STOP (4/11/19, 11:35 PM)
    // --Commented out by Inspection (4/11/19, 11:35 PM):private static int count = 0;
    private static final String[] names = {"Earth" ,"Mars", "Bars", "Stars", "Combinatorics"};

    private SolarSystem(String name, Planet[] planets) {

        this.name = name;
        planets[0] = new Planet(name);
        // --Commented out by Inspection (4/11/19, 11:28 PM): "Optimus Prime", "BTS", "GOT7", "Qiu", "Hang"};
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

//    @RecentlyNonNull
//    public String toString() {
//        return "\nSolar System: " + name + " at (" + xCoordinate + ", " + yCoordinate
//                + ") with planet " + name + " containing resources: " + this.resource + " with tech level: " + techLevel;
//    }

// --Commented out by Inspection START (4/11/19, 11:23 PM):
//    /**
//     * gets the name of the Solar System
//     * @return the name of the Solar System
// --Commented out by Inspection START (4/11/19, 11:23 PM):
////     */
////    public String getName() {
////        return name;
////    }
//// --Commented out by Inspection STOP (4/11/19, 11:23 PM)
//
//    /**
//     * Sets the name of the Solar System
//     * @param name
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)
// --Commented out by Inspection START (4/11/19, 11:23 PM):
//// --Commented out by Inspection START (4/11/19, 11:23 PM):
////     */
////    //might need a legal checker for this mayber?
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    /**
////     * Gets the Tech level of the Solar System
//// --Commented out by Inspection STOP (4/11/19, 11:23 PM)
// --Commented out by Inspection (4/11/19, 11:24 PM):n STOP (4/11/19, 11:23 PM)
//     * @return // --Commented out// --Commented out by Inspection (4/11/19, 11:24 PM): by Inspection (4/11/19, 11:24 PM):Tech Level of the Solar System
//     */
// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    public TechLevel getTechLevel(){
//        return techLevel;
//    }
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

             ////    public void setTechLevel(TechLevel techLevel) {
////        this.techLevel = techLevel;
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)
//    }
//
//    /**
// --Commented out by Inspection START (4/11/19, 11:23 PM):
////     * Gets the Number of Planets in the Solar System
////     * @return number of planets in the Solar System
//// --Commented out by Inspection STOP (4/11/19, 11:23 PM)
//     */
// --Commented out by Inspection START (4/11/19, 11:23 PM):
////    public int getNumberOfPlanets() {
////        return numOfPlanets;
//// --Commented out by Inspection STOP (4/11/19, 11:23 PM)
//    }
//    /**
//     * Sets the number of planers in the Solar System
//     * @param numOfPlanets number of planets desired for the Solar System
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)
// --Commented out by Inspection START (4/11/19, 11:23 PM):
//     */
//    public void setNumOfPlanets(int numOfPlanets) {
//        this.numOfPlanets = numOfPlanets;
//// --Commented out by Inspection START (4/11/19, 11:23 PM):
////    }
////
////    /**
////     * Gets the arrays of planets in the Solar System
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)
//     * @return An Array of Planets
//     */
//    public Planet[] getPlanets() {
//        return planets;
//    }
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)

             //    public void setPlanets(Planet[] planets) {
//      // --Commented// --Commented out by Inspection (4/11/19, 11:24 PM): out by Inspection (4/11/19, 11:24 PM):  this.planets = planets;
//    }
//
//    /**
// --Commented out by Inspection START (4/11/19, 11:24 PM):
//// --Commented out by Inspection START (4/11/19, 11:24 PM):
//////     * Gets the Xcoordinates of the Solar System
////// --Commented out by Inspection STOP (4/11/19, 11:23 PM)
//// --Commented out by Inspection STOP (4/11/19, 11:24 PM)
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)
// --Commented out by Inspection START (4/11/19, 11:24 PM):
//     * @return the X coordinate of the Solar System
//     */
//    public int getX() {
//// --Commented out by Inspection START (4/11/19, 11:24 PM):
////        return xCoordinate;
////    }
////
////    /**
////     * Set a new X coordinate for the Solar System
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)
//     * @param xCoordinate new X coordinate, takes in Int
//     */
//    public void setX(int xCoordinate) {
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)
//        this.xCoordinate = xCoordinate
//}

// --Commented out by Inspection START (4/11/19, 11:28 PM):
//    /**
//     * Gets the Ycoordinates of the Solar System
//     * @return the Y coordinate of the Solar System
// --Commented out by Inspection START (4/11/19, 11:28 PM):
////     */
////    public int getY() {
////        return yCoordinate;
////    }
//// --Commented out by Inspection STOP (4/11/19, 11:28 PM)
//
//    /**
//     * Set a new Y coordinate for the Solar System
//     * @param yCoordinate new Y coordinate, takes in Int
// --Commented out by Inspection STOP (4/11/19, 11:28 PM)
//     */
//    public void setY(int yCoordinate) {
//        this.yCoordinate = yCoordinate;
//    }
}
