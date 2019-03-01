package com.example.android.Model;

public abstract class Interactor {

    private Repository myRepository;

    protected Interactor(Repository repo) {
        myRepository = repo;
    }

    protected Repository getRepository() {
        return myRepository;
    }
}
