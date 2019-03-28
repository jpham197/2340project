package com.example.android.Entity;

public class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }


    public void setY(int y) {
        this.y = y;
    }

    public int calcDistance(Location LOne, Location LTwo) {
        int distX = (LOne.getX() - LTwo.getX()) * (LOne.getX() - LTwo.getX());
        int distY = (LOne.getY() - LTwo.getY()) * (LOne.getY() - LTwo.getY());
        return (int) Math.floor(Math.sqrt(distX + distY));
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
