package com.example.football_all_in_one.model.fixtures_response;

public class Fulltime {
    private int home;
    private int away;

    public Fulltime(int home, int away) {
        this.home = home;
        this.away = away;
    }

    public int getHome() { return home; }

    public int getAway() { return away; }
}
