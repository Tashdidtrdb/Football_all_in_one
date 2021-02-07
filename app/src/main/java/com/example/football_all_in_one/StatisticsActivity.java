package com.example.football_all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class StatisticsActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_statistics);

    Intent intent = getIntent();
    int leagueId = intent.getIntExtra(MainActivity.EXTRA + "leagueId", 0);
    int season = intent.getIntExtra(MainActivity.EXTRA + "season", 0);

    setLeagueImg(leagueId);
  }

  private void setLeagueImg(int leagueId) {
    IdMap idMap = new IdMap();
    ImageView leagueHighlight = findViewById(R.id.league_highlight);
    leagueHighlight.setImageResource(idMap.getImgOfLeague(leagueId));
  }
}