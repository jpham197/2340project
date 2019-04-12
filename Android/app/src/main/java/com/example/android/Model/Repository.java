package com.example.android.Model;

import com.example.android.Entity.Planet;
import com.example.android.Entity.Player;
import com.example.android.Entity.SolarSystem;

import java.util.ArrayList;
import java.util.List;

public class Repository {


    private final List<Player> allPlayers;
    private final List<SolarSystem> allSolarSystems;
    private final List<Planet> allPlanets;
    // --Commented out by Inspection (4/11/19, 11:28 PM):private final Planet currentPlanet;

    public Repository() {
        allPlayers = new ArrayList<>();
        allSolarSystems = new ArrayList<>();
        allPlanets = new ArrayList<>();
//        currentPlanet = null;
    }

    public List<Player> getAllPlayers() {return allPlayers;}
    public List<SolarSystem> getAllSolarSystems() { return allSolarSystems; }
    public List<Planet> getAllPlanets() { return allPlanets; }

    public Player getPlayer() {
        return allPlayers.get(0);
    }

// --Commented out by Inspection START (4/11/19, 11:24 PM):
// --Commented out by Inspection START (4/11/19, 11:24 PM):
////    public void addPlayer(Player input) {
////        allPlayers.add(input);
////    }
//// --Commented out by Inspection STOP (4/11/19, 11:24 PM)
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

// --Commented out by Inspection START (4/11/19, 11:27 PM):
//    public void setAllPlayers(List<Player> allPlayers) {
//// --Commented out by Inspection START (4/11/19, 11:24 PM):
////        this.allPlayers = allPlayers;
////    }
////
////    public void deletePlayer(Player input) {
////        allPlayers.remove(input);
//// --Commented out by Inspection STOP (4/11/19, 11:24 PM)
//    }
// --Commented out by Inspection STOP (4/11/19, 11:27 PM)

// --Commented out by Inspection START (4/11/19, 11:27 PM):
//    public void addSolarSystem(SolarSystem input) {
//        allSolarSystems.add(input);
//    }
// --Commented out by Inspection STOP (4/11/19, 11:27 PM)

// --Commented out by Inspection START (4/11/19, 11:23 PM):
//    public void addSolarSystemList(SolarSystem[] list) {
// --Commented out by Inspection START (4/11/19, 11:24 PM):
//// --Commented out by Inspection START (4/11/19, 11:23 PM):
//////        for (SolarSystem ss : list) {
//////            addSolarSystem(ss);
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)
////        }
////    }
//// --Commented out by Inspection STOP (4/11/19, 11:23 PM)
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)

// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    public void deleteSolarSystem(SolarSystem input) {
//        allSolarSystems.remove(input);
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)
    }

// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    public void addPlanet(Planet input) {
//        allPlanets.add(input);
//    }
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

// --Commented out by Inspection START (4/11/19, 11:27 PM):
//    public void deletePlanet(Planet input) {
//        allPlanets.remove(input);
//    }
// --Commented out by Inspection START (4/11/19, 11:27 PM):
//// --Commented out by Inspection STOP (4/11/19, 11:27 PM)
//
//    public void setCurrentPlanet(Planet currentPlanet) {
//        this.currentPlanet = currentPlanet;
// --Commented out by Inspection STOP (4/11/19, 11:27 PM)
//    }
//
//    public Planet getCurrentPlanet() {
//        return currentPlanet;
//    }
//}
