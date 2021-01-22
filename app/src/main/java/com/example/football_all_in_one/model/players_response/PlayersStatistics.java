package com.example.football_all_in_one.model.players_response;


import java.util.ArrayList;

public class PlayersStatistics {
    private Games games;
    private Goals goals;
    private Penalty penalty;
    private Cards cards;

    public PlayersStatistics(Games games) { this.games = games; }

    public PlayersStatistics(Cards cards) { this.cards = cards; }

    public PlayersStatistics(Goals goals) { this.goals = goals; }

    public PlayersStatistics(Penalty penalty) { this.penalty = penalty; }

    public Games getGames() { return games; }

    public Cards getCards() { return cards; }

    public Goals getGoals() { return goals; }

    public Penalty getPenalty() { return penalty; }
}
