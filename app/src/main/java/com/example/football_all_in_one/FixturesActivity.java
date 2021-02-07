package com.example.football_all_in_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.football_all_in_one.model.fixture_lineup_response.Player;
import com.example.football_all_in_one.model.fixtures_response.Fixture;
import com.example.football_all_in_one.model.fixtures_response.Goals;
import com.example.football_all_in_one.model.fixtures_response.Status;
import com.example.football_all_in_one.model.fixtures_response.Team;
import com.example.football_all_in_one.model.fixtures_response.Teams;
import com.example.football_all_in_one.model.fixtures_response.Venue;
import com.example.football_all_in_one.model.team_statistics_for_a_fixture_response.Statistics;

import java.util.ArrayList;
import java.util.List;

public class FixturesActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fixtures);

    Intent intent = getIntent();
    int leagueId = intent.getIntExtra(MainActivity.EXTRA + "leagueId", 0);
    int season = intent.getIntExtra(MainActivity.EXTRA + "season", 0);

    setLeagueImg(leagueId);

    List<FixtureListItem> fixtureListItems = new ArrayList<>();
    Fixture fixture = new Fixture(1, "tmp", 1, "2020-12-29 : 18:00", new Venue(1, "Camp Nou", "Barcelona"), new Status("Match Finished", 90));
    Teams teams = new Teams(new Team(1, "Barcelona", "https://media.api-sports.io/football/teams/529.png"),
                            new Team(1, "Real Madrid", "https://media.api-sports.io/football/teams/541.png"));
    Goals goals = new Goals(1, 1);

    ArrayList<Statistics> homeStats = new ArrayList<>();
    ArrayList<Statistics> awayStats = new ArrayList<>();

    for (int i = 0; i < 16; i++) {
      homeStats.add(new Statistics("Type " + String.valueOf(i), (int) (Math.random() * 15)));
      awayStats.add(new Statistics("Type " + String.valueOf(i), (int) (Math.random() * 15)));
    }

    String formation = "4-3-3-1";
    Player p = new Player(1, "Player Name", 1, "P");
    ArrayList<Player> homeStartingXI = new ArrayList<>(), awayStartingXI = new ArrayList<>();
    ArrayList<Player> homeSubstitutes = new ArrayList<>(), awaySubstitutes = new ArrayList<>();

    for (int i = 0; i < 11; i++) {
      homeStartingXI.add(p);
      awayStartingXI.add(p);
    }

    for (int i = 0; i < 7; i++) {
      homeSubstitutes.add(p);
      awaySubstitutes.add(p);
    }

    fixtureListItems.add(new FixtureListItem(fixture, teams, goals, homeStats, awayStats, formation, formation, homeStartingXI, awayStartingXI, homeSubstitutes, awaySubstitutes));
    fixtureListItems.add(new FixtureListItem(fixture, teams, goals, homeStats, awayStats, formation, formation, homeStartingXI, awayStartingXI, homeSubstitutes, awaySubstitutes));
    fixtureListItems.add(new FixtureListItem(fixture, teams, goals, homeStats, awayStats, formation, formation, homeStartingXI, awayStartingXI, homeSubstitutes, awaySubstitutes));
    fixtureListItems.add(new FixtureListItem(fixture, teams, goals, homeStats, awayStats, formation, formation, homeStartingXI, awayStartingXI, homeSubstitutes, awaySubstitutes));

    RecyclerView fixtureList = findViewById(R.id.fixture_list);
    fixtureList.setLayoutManager(new LinearLayoutManager(this));
    fixtureList.setHasFixedSize(true);
    fixtureList.setAdapter(new FixtureListAdapter(this, fixtureListItems, leagueId, season));
  }

  private void setLeagueImg(int leagueId) {
    IdMap idMap = new IdMap();
    ImageView leagueHighlight = findViewById(R.id.league_highlight);
    leagueHighlight.setImageResource(idMap.getImgOfLeague(leagueId));
  }
}