package com.example.android.Model;

import com.example.android.Entity.Game;
import com.example.android.Entity.GameDifficulty;
import com.example.android.Entity.Player;
import com.example.android.Entity.SolarSystem;
import com.example.android.Entity.Universe;

import java.util.HashMap;
import java.util.Map;

public class Model {

    private Game game;

    /** Singleton Pattern Code
     *  this allows us to get access to this class
     *  anywhere, which will allow our View models to access
     *  the "back end"  more easily
     */
    private static  Model instance = new Model();

    public static Model getInstance() { return instance; }

    /**
     * Generates a game instance
     * @param difficulty
     * @param name
     * @param pilot
     * @param fighter
     * @param trader
     * @param engineer
     */
    public void generateGame(GameDifficulty difficulty, String name,
                             int pilot,
                             int fighter,
                             int trader,
                             int engineer) {
        Player player = new Player(name, pilot, fighter, trader, engineer);
        game = new Game(difficulty, player);
    }


}