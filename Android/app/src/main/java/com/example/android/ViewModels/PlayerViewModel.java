package com.example.android.ViewModels;

import android.app.Application;
import android.support.annotation.NonNull;
import android.arch.lifecycle.AndroidViewModel;

import com.example.android.Entity.Player;
import com.example.android.Entity.Ship;
import com.example.android.Model.Model;
import com.example.android.Model.PlayerInteractor;

import java.util.List;

public class PlayerViewModel extends AndroidViewModel {
    private PlayerInteractor model;
    private List<Player> players;

    public PlayerViewModel(@NonNull Application application) {
        super(application);
        model = Model.getInstance().getPlayerInteractor();
        players = model.getAllPlayers();
    }

    public void addPlayer(Player player) {
        players.add(player);
        players = model.getAllPlayers();
    }

    public Player getPlayer() {
        return model.getPlayer();
    }

    public void deletePlayer(Player player) {
        model.deletePlayer(player);
    }


}
