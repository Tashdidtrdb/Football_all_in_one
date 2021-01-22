package com.example.football_all_in_one.model.fixtures_response;

public class Penalty {
    private int home;
    private int away;

    public Penalty(int home, int away) {
        this.home = home;
        this.away = away;
    }

    public int getHome() { return home; }

    public int getAway() { return away; }
}
