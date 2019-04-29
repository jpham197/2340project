package com.example.android;

import com.example.android.Entity.Player;
import com.example.android.Entity.Ship;
import com.example.android.Entity.ShipType;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SookJiJUnit {
    Ship ship = new Ship(100, ShipType.Gnat);
    Player player = new Player("Sook Ji", 4,4,4,4, ship);

    @Before
    public void setUp() {
        ship.increaseFuel(player);
    }
    @Test
    public void increaseFuel() {
        assertEquals(200, ship.getMaxFuel());
    }

    @Test
    public void increaseFuelFail() {
        player.setCredits(0);
        Assert.assertSame(false, ship.increaseFuel(player));
    }
}
