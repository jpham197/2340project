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

    /**
     * Calculates distance of current location and a given destination
     * @param destination where you're going
     * @return the distance but all the decimals are chopped off, not rounded
     */
    public int calcDistance(Location destination) {
        int xSquared = 0;
        int ySquared = 0;
        if (destination != null) {
            xSquared = (this.x - destination.getX()) * (this.x - destination.getX());
            ySquared = (this.y - destination.getY()) * (this.y - destination.getY());
        }
        return (int) Math.floor(Math.sqrt(xSquared + ySquared));
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
