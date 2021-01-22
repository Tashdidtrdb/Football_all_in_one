package com.example.football_all_in_one.model.fixtures_response;

public class Away_teams {
    private int id;
    private String name;
    private boolean winner;

    public Away_teams(int id, String name, boolean winner) {
        this.id = id;
        this.name = name;
        this.winner = winner;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public boolean isWinner() { return winner; }
}
