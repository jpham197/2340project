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

<<<<<<< HEAD:Android/app/src/main/java/com/example/android/Entity/Resources.java
    public Resources getRandomResource() {
        int randomNum = (int) Math.random() * 13;
=======
    public PlanetAttributes getRandomResource() {
        int randomNum = (int) Math.random() * 12;
>>>>>>> 57dece1ad13108e3a7396ddc402415d55ff54ca7:Android/app/src/main/java/com/example/android/Entity/PlanetAttributes.java
        return getResource()[randomNum];
    }

}
