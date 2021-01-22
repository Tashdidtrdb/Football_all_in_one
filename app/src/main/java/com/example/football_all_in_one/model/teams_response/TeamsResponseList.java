package com.example.football_all_in_one.model.teams_response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TeamsResponseList {
    @SerializedName("team")
    private Teams teams;
    private Venue venue;

    public TeamsResponseList(Teams teams, Venue venue) {
        this.teams = teams;
        this.venue = venue;
    }

    public Teams getTeams() { return teams; }

    public Venue getVenue() { return venue; }

}
