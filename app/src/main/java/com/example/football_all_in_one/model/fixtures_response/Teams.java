package com.example.football_all_in_one.model.fixtures_response;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class Teams {
    @SerializedName("home")
    private Home_teams home_teams;
    @SerializedName("away")
    private Away_teams away_teams;

    public Teams(Home_teams home_teams, Away_teams away_teams) {
        this.home_teams = home_teams;
        this.away_teams = away_teams;
    }

    public Home_teams getHome_teams() { return home_teams; }

    public Away_teams getAway_teams() { return away_teams; }
}
