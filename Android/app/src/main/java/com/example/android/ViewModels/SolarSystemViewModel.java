package com.example.android.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.example.android.Entity.SolarSystem;
import com.example.android.Model.Model;
import com.example.android.Model.SolarSystemInteractor;

import java.util.List;

public class SolarSystemViewModel extends AndroidViewModel {
    private final List<SolarSystem> solarSystems;

    public SolarSystemViewModel(@NonNull Application application) {
        super(application);
        SolarSystemInteractor interactor = Model.getInstance().getSolarSystemInteractor();
        solarSystems = interactor.getAllSolarSystems();
    }

    public void addSolarSystemList(SolarSystem[] list) {
        for (SolarSystem ss : list) {
            solarSystems.add(ss);
        }
    }

    public List<SolarSystem> getSolarSystems() {
        return solarSystems;
    }
}
