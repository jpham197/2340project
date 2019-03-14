package com.example.android.Entity;

public class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX() {

    }


    public void setY() {

    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
