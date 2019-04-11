package com.example.android.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.example.android.Entity.Player;
import com.example.android.Model.PlayerInteractor;
import com.example.android.Model.Model;

public class UpdatePlayerViewModel extends AndroidViewModel {
    private PlayerInteractor interactor;

    public UpdatePlayerViewModel(@NonNull Application application) {
        super(application);
        interactor = Model.getInstance().getPlayerInteractor();
    }

    public void updatePlayer(Player player) { interactor.updatePlayer(player); }

    public void addPlayer(Player player) { interactor.addPlayer(player); }
}
