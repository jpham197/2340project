package com.example.android.Entity;

public enum PlanetAttributes {
    NOSPECIALRESOURCES("No Special Resources"),
    MINERALRICH("Mineral Rich"),
    MINERALPOOR("Mineral Poor"),
    DESERT("Desert"),
    LOTSOFWATER("Lots of Water"),
    RICHSOIL("Rich Soil"),
    POORSOIL("Poor Soil"),
    RICHFAUNA("Rich Fauna"),
    LIFELESS("Lifeless"),
    WEIRDMUSHROOMS("Weird Mushrooms"),
    LOTSOFHERBS("Lots of Herbs"),
    ARTISTIC("Artistic"),
    WARLIKE("Warlike");

    /**
     * Constructor for planet attributes
     *
     * @param name name of the resource
     */
    PlanetAttributes(String name) {
    }

    public PlanetAttributes[] getResource() {
        return PlanetAttributes.values();
    }

    @Override
    public String toString() {
        return name();
    }
}
