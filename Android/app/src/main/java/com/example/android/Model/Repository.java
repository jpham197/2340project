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
    private Planet currentPlanet;

    public Repository() {
        allPlayers = new ArrayList<>();
        allSolarSystems = new ArrayList<>();
        allPlanets = new ArrayList<>();
        currentPlanet = null;
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

    public void deletePlayer(Player input) {
        allPlayers.remove(input);
    }

    public void addSolarSystem(SolarSystem input) {
        allSolarSystems.add(input);
    }

    public void addSolarSystemList(SolarSystem[] list) {
        for (SolarSystem ss : list) {
            addSolarSystem(ss);
        }
    }

    public void deleteSolarSystem(SolarSystem input) {
        allSolarSystems.remove(input);
    }

    public void addPlanet(Planet input) {
        allPlanets.add(input);
    }

    public void deletePlanet(Planet input) {
        allPlanets.remove(input);
    }

    public void setCurrentPlanet(Planet currentPlanet) {
        this.currentPlanet = currentPlanet;
    }

    public Planet getCurrentPlanet() {
        return currentPlanet;
    }
}
