package com.example.football_all_in_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.football_all_in_one.model.players_response.Birth;
import com.example.football_all_in_one.model.players_response.Cards;
import com.example.football_all_in_one.model.players_response.Games;
import com.example.football_all_in_one.model.players_response.Goals;
import com.example.football_all_in_one.model.players_response.Penalty;
import com.example.football_all_in_one.model.players_response.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayersActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_players);

    Intent intent = getIntent();
    int leagueId = intent.getIntExtra(MainActivity.EXTRA + "leagueId", 0);
    int teamId = intent.getIntExtra(MainActivity.EXTRA + "teamId", 0);
    String teamLogo = intent.getStringExtra(MainActivity.EXTRA + "teamLogo");
    int season = intent.getIntExtra(MainActivity.EXTRA + "season", 0);

    setLeagueImg(leagueId);
    setTeamImg(teamLogo);

    Player player = new Player(1, "Diogo Dalot", 21, "https://media.api-sports.io/football/players/886.png", "Portugal", "183 cm", "76 kg", false, new Birth("1999-03-18", "Braga", "portugal"));
    Games games = new Games(0, 0, 3, "Defender", "0.0", false);
    Goals goals = new Goals(0, 0, 0);
    Cards cards = new Cards(0, 0, 0);
    Penalty penalty = new Penalty(0, 0, 0);

    PlayerListItem playerListItem = new PlayerListItem(player, games, goals, cards, penalty);

    List<PlayerListItem> playerListItems = new ArrayList<>();
    playerListItems.add(playerListItem);
    playerListItems.add(playerListItem);
    playerListItems.add(playerListItem);
    playerListItems.add(playerListItem);
    playerListItems.add(playerListItem);
    playerListItems.add(playerListItem);
    playerListItems.add(playerListItem);
    playerListItems.add(playerListItem);
    playerListItems.add(playerListItem);
    playerListItems.add(playerListItem);

    RecyclerView playerList = findViewById(R.id.player_list);
    playerList.setLayoutManager(new LinearLayoutManager(this));
    playerList.setAdapter(new PlayerListAdapter(this, playerListItems));
  }

  private void setLeagueImg(int leagueId) {
    IdMap idMap = new IdMap();
    ImageView leagueHighlight = findViewById(R.id.league_highlight);
    leagueHighlight.setImageResource(idMap.getImgOfLeague(leagueId));
  }

  private void setTeamImg(String teamLogo) {
    ImageView teamImg = findViewById(R.id.team_logo);
    Glide.with(this).load(teamLogo).into(teamImg);
  }
}