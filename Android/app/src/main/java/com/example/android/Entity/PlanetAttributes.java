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
