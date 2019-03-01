package com.example.android.Model;

import com.example.android.Entity.Planet;
import com.example.android.Entity.Player;
import com.example.android.Entity.SolarSystem;

import java.util.ArrayList;
import java.util.List;

public class Repository {


    private List<Player> allPlayers;
    private List<SolarSystem> allSolarSystems;
    private List<Planet> allPlanets;

    public Repository() {
        allPlayers = new ArrayList<>();
        allSolarSystems = new ArrayList<>();
        allPlanets = new ArrayList<>();
    }

    public List<Player> getAllPlayers() {return allPlayers;}
    public List<SolarSystem> getAllSolarSystems() { return allSolarSystems; }
    public List<Planet> getAllPlanets() { return allPlanets; }

    public Player getPlayer() {
        return allPlayers.get(0);
    }

    public void addPlayer(Player input) {
        allPlayers.add(input);
    }
    public void addSolarSystem(SolarSystem input) {
        allSolarSystems.add(input);
    }
    public void addPlanet(Planet input) {
        allPlanets.add(input);
    }
}
