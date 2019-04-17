package com.example.android;


import com.example.android.Entity.Location;
import com.example.android.Entity.Player;
import com.example.android.Entity.Ship;
import com.example.android.Entity.ShipType;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JimmyJUnit {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("Waters", 4, 4, 4, 4,
                new Ship(100, ShipType.Gnat));
        player.setCredits(300);
        player.getShip().setCurrentFuel(0);
        player.getShip().refuel(player);
    }

    @Test
    public void refuel() {
        Assert.assertSame(100, player.getShip().getFuel());
    }

    @Test
    public void travel() {
        Assert.assertSame(true, player.travel(new Location(100, 100)));
    }

    @Test
    public void fuelDecreased() {
        player.getShip().setCurrentFuel(100);
        player.travel(new Location(300, 300));
        Assert.assertNotEquals(100, player.getShip().getFuel());
    }

}
