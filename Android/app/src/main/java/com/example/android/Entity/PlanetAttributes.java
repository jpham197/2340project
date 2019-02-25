package com.example.android.Entity;

public enum PlanetAttributes {
    NOSPECIALRESOURCES(0, "No Special Resources"),
    MINERALRICH(1, "Mineral Rich"),
    MINERALPOOR(2, "Mineral Poor"),
    DESERT(3, "Desert"),
    LOTSOFWATER(4, "Lots of Water"),
    RICHSOIL(5, "Rich Soil"),
    POORSOIL(6, "Poor Soil"),
    RICHFAUNA(7, "Rich Fauna"),
    LIFELESS(8, "Lifeless"),
    WEIRDMUSHROOMS(9, "Weird Mushrooms"),
    LOTSOFHERBS(10, "Lots of Herbs"),
    ARTISTIC(11, "Artistic"),
    WARLIKE(12, "Warlike");

    /**
     * Constructor for planet attributes
     *
     * @param index numbers to be randomly chosen
     * @param name name of the resource
     */
    PlanetAttributes(int index, String name) {

    }

    public PlanetAttributes[] getResource() {
        return PlanetAttributes.values();
    }

    public PlanetAttributes getRandomResource() {
        int randomNum = (int) Math.random() * 12;
        return getResource()[randomNum];
    }

}
