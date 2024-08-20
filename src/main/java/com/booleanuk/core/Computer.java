package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Game> installedGames;
    private PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
        this.installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalledGames) {
        this.psu = psu;
        this.installedGames = preInstalledGames;
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(Game newGame) {
        this.installedGames.add(newGame);
    }

    public String playGame(String gameName) {
        for (Game g : this.installedGames) {
            if (g.name.equals(gameName)) {
                return g.start();
            }
        }
        return "Game not installed";
    }

    public ArrayList<Game> getInstalledGames() {
        return this.installedGames;
    }
}
