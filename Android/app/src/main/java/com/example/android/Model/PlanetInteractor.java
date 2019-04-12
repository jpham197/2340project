package com.example.android.Model;

import com.example.android.Entity.Planet;

import java.util.List;

public class PlanetInteractor extends Interactor {

    public PlanetInteractor(Repository repository) {
        super(repository);
    }

// --Commented out by Inspection START (4/11/19, 11:23 PM):
//    public void addPlanet(Planet p) {
//        getRepository().addPlanet(p);
//    }
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)

//    public void setPlanet(Planet p) {
// --Commented out by Inspection START (4/11/19, 11:23 PM):
//        getRepository().setCurrentPlanet(p);
//    }
//
//    public Planet getCurrentPlanet() {
//        return getRepository().getCurrentPlanet();
// --Commented out by Inspection STOP (4/11/19, 11:23 PM)
//    }

// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    public void deletePlanet(Planet p) {
//        getRepository().deletePlanet(p);
//    }
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

    public List<Planet> getAllPlanets() {
        return getRepository().getAllPlanets();
    }


}
