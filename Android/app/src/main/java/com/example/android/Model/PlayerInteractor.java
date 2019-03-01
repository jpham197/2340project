package com.example.android.Model;

import com.example.android.Entity.Player;

import java.util.List;

public class PlayerInteractor extends Interactor{

    public PlayerInteractor(Repository  repo) { super(repo); }

    public List<Player> getAllPlayers() { return getRepository().getAllPlayers(); }

    public void addPlayer (Player p) { getRepository().addPlayer(p); }

    public void updatePlayer(Player p) {

    }

}
