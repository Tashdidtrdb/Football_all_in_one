package com.example.football_all_in_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class TeamsActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_teams);

    Intent intent = getIntent();
    int leagueId = intent.getIntExtra(MainActivity.EXTRA + "leagueId", 0);
    int season = intent.getIntExtra(MainActivity.EXTRA + "season", 0);

    setLeagueImg(leagueId);

    List<TeamListItem> teamListItems = new ArrayList<>();
    teamListItems.add(new TeamListItem(1,"Manchester United", "https://media.api-sports.io/football/teams/33.png", "Founded: 1878", "Country: England", "National: No", "Name: Old Trafford", "Address: Sir Matt Busby Way", "City: Manchester", "Capacity: 76212"));
    teamListItems.add(new TeamListItem(1,"Manchester United", "https://media.api-sports.io/football/teams/33.png", "Founded: 1878", "Country: England", "National: No", "Name: Old Trafford", "Address: Sir Matt Busby Way", "City: Manchester", "Capacity: 76212"));
    teamListItems.add(new TeamListItem(1,"Manchester United", "https://media.api-sports.io/football/teams/33.png", "Founded: 1878", "Country: England", "National: No", "Name: Old Trafford", "Address: Sir Matt Busby Way", "City: Manchester", "Capacity: 76212"));
    teamListItems.add(new TeamListItem(1,"Manchester United", "https://media.api-sports.io/football/teams/33.png", "Founded: 1878", "Country: England", "National: No", "Name: Old Trafford", "Address: Sir Matt Busby Way", "City: Manchester", "Capacity: 76212"));
    teamListItems.add(new TeamListItem(1,"Manchester United", "https://media.api-sports.io/football/teams/33.png", "Founded: 1878", "Country: England", "National: No", "Name: Old Trafford", "Address: Sir Matt Busby Way", "City: Manchester", "Capacity: 76212"));
    teamListItems.add(new TeamListItem(1,"Manchester United", "https://media.api-sports.io/football/teams/33.png", "Founded: 1878", "Country: England", "National: No", "Name: Old Trafford", "Address: Sir Matt Busby Way", "City: Manchester", "Capacity: 76212"));
    teamListItems.add(new TeamListItem(1,"Manchester United", "https://media.api-sports.io/football/teams/33.png", "Founded: 1878", "Country: England", "National: No", "Name: Old Trafford", "Address: Sir Matt Busby Way", "City: Manchester", "Capacity: 76212"));

    RecyclerView teamList = findViewById(R.id.team_list);
    teamList.setLayoutManager(new LinearLayoutManager(this));
    teamList.setAdapter(new TeamListAdapter(this, teamListItems, leagueId, season));
  }

  private void setLeagueImg(int leagueId) {
    IdMap idMap = new IdMap();
    ImageView leagueHighlight = findViewById(R.id.league_highlight);
    leagueHighlight.setImageResource(idMap.getImgOfLeague(leagueId));
  }
}