package com.example.football_all_in_one.model.players_response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class PlayersResponseList {
    private Players player;
    @SerializedName("statistics")
    private ArrayList<PlayersStatistics> playersStatistics;
    public PlayersResponseList(Players player) {
        this.player = player;
    }

    public PlayersResponseList(ArrayList<PlayersStatistics> playersStatistics) { this.playersStatistics = playersStatistics; }

    public Players getPlayer() { return player; }

    public ArrayList<PlayersStatistics> getPlayersStatistics() { return playersStatistics; }
}
