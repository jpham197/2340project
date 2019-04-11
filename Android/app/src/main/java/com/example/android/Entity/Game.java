package com.example.android.Entity;

import android.support.annotation.Nullable;

public class Game {
    private Player player;
    private Universe universe;
    private GameDifficulty difficulty;

    public Game() {
        this(GameDifficulty.EASY, null);
    }

    /**
     * Main constructor of Game
     * @param difficulty
     * @param player
     */
    public Game(@Nullable GameDifficulty difficulty, @Nullable Player player) {
        this.player = player;
        this.difficulty = difficulty;
        universe = new Universe();
    }

    /**
     *
     * @return player's pilot skill
     */
    public int getPilot() {
        return player.getPilot();
    }

    /**
     *
     * @return player's fighter skill
     */
    public int getFighter() {
        return player.getFighter();
    }

    /**
     *
     * @return player's trader skill
     */
    public int getTrader() {
        return player.getTrader();
    }

    /**
     *
     * @return player's engineer skill
     */
    public int getEngineer() {
        return player.getEngineer();
    }

    /**
     *
     * @return player instance
     */
    public Player getPlayer() {
        return player;
    }

    public Universe getUniverse() {
        return universe;
    }

    public GameDifficulty getDifficulty() {
        return difficulty;
    }
}