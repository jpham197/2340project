package com.example.android.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.example.android.Entity.Planet;
import com.example.android.Model.Model;
import com.example.android.Model.PlanetInteractor;

import java.util.List;

public class PlanetViewModel extends AndroidViewModel {
    private final PlanetInteractor interactor;
    private final List<Planet> planets;
    // --Commented out by Inspection (4/11/19, 11:23 PM):private Planet planet;

    public PlanetViewModel(@NonNull Application application) {
        super(application);
        interactor = Model.getInstance().getPlanetInteractor();
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

// --Commented out by Inspection START (4/11/19, 11:23 PM):
//    public Planet getSpecificPlanet(int n) {
//        return planets.get(n);
//    }
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)

// --Commented out by Inspection START (4/11/19, 11:23 PM):
//    public void addPlanet(Planet planet) {
// --Commented out by Inspection START (4/11/19, 11:23 PM):
////        planets.add(planet);
////        planets = interactor.getAllPlanets();
////    }
//// --Commented out by Inspection STOP (4/11/19, 11:23 PM)
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)

// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    public List<Planet> getAllPlanets() {
//        return planets;
//    }
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

}
