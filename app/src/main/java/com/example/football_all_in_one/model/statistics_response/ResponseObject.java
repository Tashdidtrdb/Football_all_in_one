package com.example.football_all_in_one.model.statistics_response;

import com.google.gson.annotations.SerializedName;

public class ResponseObject {
    @SerializedName("fixtures")
    private Fixture fixture;
    private Goals goals;

    // Constructor
    public ResponseObject(Fixture fixture, Goals goals) {
        this.fixture = fixture;
        this.goals = goals;
    }

    public Fixture getFixture() {
        return fixture;
    }

    public Goals getGoals() {
        return goals;
    }
}
