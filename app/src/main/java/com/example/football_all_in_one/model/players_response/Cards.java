package com.example.football_all_in_one.model.players_response;

import com.google.gson.annotations.SerializedName;

public class Cards {
    private int yellow;
    private int red;
    private int yellowred;

    public Cards(int yellow, int red, int yellowred) {
        this.yellow = yellow;
        this.red = red;
        this.yellowred = yellowred;
    }

    public int getYellow() { return yellow; }

    public int getRed() { return red; }

    public int getYellowred() { return yellowred; }
}

