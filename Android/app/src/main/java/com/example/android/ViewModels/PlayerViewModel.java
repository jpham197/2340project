package com.example.android.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

public class PlayerViewModel extends AndroidViewModel {

    private String toast;

    /**
     * Android studio wanted this constructor to be here lmao idk what it does
     * @param app
     */
    public PlayerViewModel(@NonNull Application app) {
        super(app);
    }

    public boolean validatePlayer()
}
