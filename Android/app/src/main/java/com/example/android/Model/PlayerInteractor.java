package com.example.android.Model;

import android.widget.ArrayAdapter;

import com.example.android.Entity.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerInteractor extends Interactor{

    public PlayerInteractor(Repository  repo) { super(repo); }

    public List<Player> getAllPlayers() { return getRepository().getAllPlayers(); }

    public Player getPlayer() {
        return getRepository().getPlayer();
    }

    public void addPlayer (Player p) { getRepository().addPlayer(p); }

    public void updatePlayer(Player p) {
        ArrayList <Player> saved = new ArrayList<>();
        saved.add(p);
        getRepository().setAllPlayers(saved);
    }

    public void deletePlayer(Player p) {
        getRepository().deletePlayer(p);
    }

}
