package com.example.football_all_in_one.model.team_statistics_for_a_fixture_response;

public class Statistics {
    private String type;
    private String value;

    public Statistics(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() { return type; }

    public String getValue() { return value; }
}
