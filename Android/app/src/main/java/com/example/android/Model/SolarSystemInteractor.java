package com.example.android.Model;

import com.example.android.Entity.SolarSystem;

import java.util.List;

public class SolarSystemInteractor extends Interactor {

    public SolarSystemInteractor(Repository repo){
        super(repo);
    }

    public List<SolarSystem> getAllSolarSystems() {
        return getRepository().getAllSolarSystems();
    }

}
