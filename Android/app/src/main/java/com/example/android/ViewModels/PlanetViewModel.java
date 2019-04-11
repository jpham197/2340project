package com.example.android.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.example.android.Entity.Planet;
import com.example.android.Model.Model;
import com.example.android.Model.PlanetInteractor;

import java.util.ArrayList;
import java.util.List;

public class PlanetViewModel extends AndroidViewModel {
    private PlanetInteractor interactor;
    private List<Planet> planets;
    private Planet planet;

    public PlanetViewModel(@NonNull Application application) {
        super(application);
        planets = interactor.getAllPlanets();
    }

    public void setCurrentPlanet(Planet planet) {
        interactor.setPlanet(planet);
    }

    public Planet getCurrentPlanet() {
        return interactor.getCurrentPlanet();
    }

    public Planet getPlanet() {
        return planets.get(0);
    }

    public Planet getSpecificPlanet(int n) {
        return planets.get(n);
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
        planets = interactor.getAllPlanets();
    }

    public List<Planet> getAllPlanets() {
        return planets;
    }

}
