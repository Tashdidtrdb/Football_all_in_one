package com.example.football_all_in_one.model.fixture_lineup_response;

import java.util.ArrayList;

public class FixtureLineupResponseList {
    private String formation;
    private ArrayList<StartXI> startXI;
    private ArrayList<Substitutes> substitutes;

    public FixtureLineupResponseList(String formation, ArrayList<StartXI> startXI, ArrayList<Substitutes> substitutes) {
        this.formation = formation;
        this.startXI = startXI;
        this.substitutes = substitutes;
    }

    public String getFormation() { return formation; }

    public ArrayList<StartXI> getStartXI() { return startXI; }

    public ArrayList<Substitutes> getSubstitutes() { return substitutes; }
}
