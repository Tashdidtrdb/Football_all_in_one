package com.example.football_all_in_one.model.fixtures_response;

import java.util.ArrayList;

public class Score {
    private Halftime halftime;
    private Fulltime fulltime;
    private Extratime extratime;
    private Penalty penalty;

    public Score(Halftime halftime, Fulltime fulltime, Extratime extratime, Penalty penalty) {
        this.halftime = halftime;
        this.fulltime = fulltime;
        this.extratime = extratime;
        this.penalty = penalty;
    }

    public Halftime getHalftime() { return halftime; }

    public Fulltime getFulltime() { return fulltime; }

    public Extratime getExtratime() { return extratime; }

    public Penalty getPenalty() { return penalty; }
}
