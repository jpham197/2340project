package com.example.android.Model;

import com.example.android.Entity.Planet;

import java.util.List;

public class PlanetInteractor extends Interactor {

    public PlanetInteractor(Repository repository) {
        super(repository);
    }

    public void addPlanet(Planet p) {
        getRepository().addPlanet(p);
    }

    public void deletePlanet(Planet p) {
        getRepository().deletePlanet(p);
    }

    public List<Planet> getAllPlanets() {
        return getRepository().getAllPlanets();
    }


}
