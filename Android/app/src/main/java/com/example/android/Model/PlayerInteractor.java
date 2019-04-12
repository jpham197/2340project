package com.example.android.Model;

import com.example.android.Entity.Player;

import java.util.List;

public class PlayerInteractor extends Interactor{

    public PlayerInteractor(Repository  repo) { super(repo); }

    public List<Player> getAllPlayers() { return getRepository().getAllPlayers(); }

    public Player getPlayer() {
        return getRepository().getPlayer();
    }

// --Commented out by Inspection START (4/11/19, 11:23 PM):
// --Commented out by Inspection START (4/11/19, 11:24 PM):
////    // --Commented out by Inspection (4/11/19, 11:23 PM):public void addPlayer (Player p) { getRepository().addPlayer(p); }
////
////    public void updatePlayer(Player p) {
////        ArrayList <Player> saved = new ArrayList<>();
////        saved.add(p);
//// --Commented out by Inspection (4/11/19, 11:24 PM): out by Inspection STOP (4/11/19, 11:23 PM)
//        getRepository().setAllPlayers(saved);
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)
    }

// --Commented out by Inspection START (4/11/19, 11:24 PM):
//    public void deletePlayer(Player p) {
//        getRepository().deletePlayer(p);
//    }
// --Commented out by Inspection STOP (4/11/19, 11:24 PM)

//}
