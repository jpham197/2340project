package com.example.android.Model;

import com.example.android.Entity.SolarSystem;

import java.util.List;

public class SolarSystemInteractor extends  {

    public SolarSystemInteractor(Repository repo){
        super(repo);
    }

    public List<SolarSystem> getSolarSystems() {
        return getRepository().getAllSolarSystems();
    }

    public void addSolarSystem(SolarSystem s) {
        getRepository().addSolarSystem(s);
    }

    public void updateSolarSystem(SolarSystem s) {
        getRepository().updateSolarSystem(s);
    }
 }
