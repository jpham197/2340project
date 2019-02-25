package com.example.android.Entity;

public enum Resources {
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
     * makes Resource types
     * @param index numbers to be randomly chosen
     * @param name name of the resource
     */
    Resources(int index, String name) {

    }

    public Resources[] getResource() {
        return Resources.values();
    }

    public Resources getRandomResource() {
        int randomNum = (int) Math.random() * 13;
        return getResource()[randomNum];
    }

}
