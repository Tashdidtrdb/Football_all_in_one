package com.example.football_all_in_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class StandingsActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_standings);

    Intent intent = getIntent();
    int leagueId = intent.getIntExtra(MainActivity.EXTRA + "leagueId", 0);
    int season = intent.getIntExtra(MainActivity.EXTRA + "season", 0);

    setLeagueImg(leagueId);

    List<StandingListItem> standingListItems = new ArrayList<>();
    standingListItems.add(new StandingListItem(1,"1","Athletico Madrid", "https://media.api-sports.io/football/teams/530.png", "32", "N/A"));
    standingListItems.add(new StandingListItem(1,"2","Real Madrid", "https://media.api-sports.io/football/teams/541.png", "32", "N/A"));
    standingListItems.add(new StandingListItem(1, "3","Real Sociedad", "https://media.api-sports.io/football/teams/548.png", "26", "N/A"));
    standingListItems.add(new StandingListItem(1,"4","Villarreal", "https://media.api-sports.io/football/teams/533.png", "26", "N/A"));
    standingListItems.add(new StandingListItem(1,"5","Barcelona", "https://media.api-sports.io/football/teams/529.png", "24", "N/A"));
    standingListItems.add(new StandingListItem(1,"6","Sevilla", "https://media.api-sports.io/football/teams/536.png", "23", "N/A"));
    standingListItems.add(new StandingListItem(1,"7","Granada CF", "https://media.api-sports.io/football/teams/715.png", "21", "N/A"));
    standingListItems.add(new StandingListItem(1,"8","Celta Vigo", "https://media.api-sports.io/football/teams/538.png", "20", "N/A"));
    standingListItems.add(new StandingListItem(1,"9","Real Betis", "https://media.api-sports.io/football/teams/543.png", "19", "N/A"));
    standingListItems.add(new StandingListItem(1,"10","Athletic Club", "https://media.api-sports.io/football/teams/531.png", "18", "N/A"));

    standingListItems.add(new StandingListItem(1,"1","Athletico Madrid", "https://media.api-sports.io/football/teams/530.png", "32", "N/A"));
    standingListItems.add(new StandingListItem(1,"2","Real Madrid", "https://media.api-sports.io/football/teams/541.png", "32", "N/A"));
    standingListItems.add(new StandingListItem(1, "3","Real Sociedad", "https://media.api-sports.io/football/teams/548.png", "26", "N/A"));
    standingListItems.add(new StandingListItem(1,"4","Villarreal", "https://media.api-sports.io/football/teams/533.png", "26", "N/A"));
    standingListItems.add(new StandingListItem(1,"5","Barcelona", "https://media.api-sports.io/football/teams/529.png", "24", "N/A"));
    standingListItems.add(new StandingListItem(1,"6","Sevilla", "https://media.api-sports.io/football/teams/536.png", "23", "N/A"));
    standingListItems.add(new StandingListItem(1,"7","Granada CF", "https://media.api-sports.io/football/teams/715.png", "21", "N/A"));
    standingListItems.add(new StandingListItem(1,"8","Celta Vigo", "https://media.api-sports.io/football/teams/538.png", "20", "N/A"));
    standingListItems.add(new StandingListItem(1,"9","Real Betis", "https://media.api-sports.io/football/teams/543.png", "19", "N/A"));
    standingListItems.add(new StandingListItem(1,"10","Athletic Club", "https://media.api-sports.io/football/teams/531.png", "18", "N/A"));

    standingListItems.add(new StandingListItem(1,"1","Athletico Madrid", "https://media.api-sports.io/football/teams/530.png", "32", "N/A"));
    standingListItems.add(new StandingListItem(1,"2","Real Madrid", "https://media.api-sports.io/football/teams/541.png", "32", "N/A"));
    standingListItems.add(new StandingListItem(1, "3","Real Sociedad", "https://media.api-sports.io/football/teams/548.png", "26", "N/A"));
    standingListItems.add(new StandingListItem(1,"4","Villarreal", "https://media.api-sports.io/football/teams/533.png", "26", "N/A"));
    standingListItems.add(new StandingListItem(1,"5","Barcelona", "https://media.api-sports.io/football/teams/529.png", "24", "N/A"));
    standingListItems.add(new StandingListItem(1,"6","Sevilla", "https://media.api-sports.io/football/teams/536.png", "23", "N/A"));
    standingListItems.add(new StandingListItem(1,"7","Granada CF", "https://media.api-sports.io/football/teams/715.png", "21", "N/A"));
    standingListItems.add(new StandingListItem(1,"8","Celta Vigo", "https://media.api-sports.io/football/teams/538.png", "20", "N/A"));
    standingListItems.add(new StandingListItem(1,"9","Real Betis", "https://media.api-sports.io/football/teams/543.png", "19", "N/A"));
    standingListItems.add(new StandingListItem(1,"10","Athletic Club", "https://media.api-sports.io/football/teams/531.png", "18", "N/A"));

    RecyclerView standingList = findViewById(R.id.standing_list);
    standingList.setLayoutManager(new LinearLayoutManager(this));
    standingList.setAdapter(new StandingListAdapter(this, standingListItems, leagueId, season));
  }

  private void setLeagueImg(int leagueId) {
    IdMap idMap = new IdMap();
    ImageView leagueHighlight = findViewById(R.id.league_highlight);
    leagueHighlight.setImageResource(idMap.getImgOfLeague(leagueId));
  }
}