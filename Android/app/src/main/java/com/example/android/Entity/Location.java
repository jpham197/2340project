package com.example.android.Entity;

import androidx.annotation.RecentlyNonNull;

public class Location {
    private final int x;
    private final int y;

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

// --Commented out by Inspection START (4/11/19, 11:23 PM):
// --Commented out by Inspection START (4/11/19, 11:23 PM):
////    public void setX(int x) {
////        this.x = x;
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)
//    }
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)

// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    public void setY(int y) {
//        this.y = y;
//    }
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

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

    @RecentlyNonNull
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
