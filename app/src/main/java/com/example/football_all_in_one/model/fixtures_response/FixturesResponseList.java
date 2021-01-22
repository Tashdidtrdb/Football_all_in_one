package com.example.football_all_in_one.model.fixtures_response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class FixturesResponseList {
    private Fixture fixture;
    private Teams teams;
    private Goals goals;
    private Score score;

    public FixturesResponseList(Fixture fixture, Teams teams, Goals goals, Score score) {
        this.fixture = fixture;
        this.teams = teams;
        this.goals = goals;
        this.score = score;
    }

    public Fixture getFixture() { return fixture; }

    public Teams getTeams() { return teams; }

    public Goals getGoals() { return goals; }

    public Score getScore() { return score; }
}
