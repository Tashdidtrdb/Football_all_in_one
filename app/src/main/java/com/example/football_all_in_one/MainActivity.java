package com.example.football_all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  int leagueId[] = new int[11];
  String id[] = new String[11];
  Button leagueButton[] = new Button[11];
  Button teamsButton[] = new Button[11];
  Button standingsButton[] = new Button[11];
  View group[] = new View[11];
  boolean groupVisible[] = new boolean[11];

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    initialize();
    hideAllGroups(-1);
    createOnclickListeners();
  }

  void initialize() {
    id[0] = "champions_league";
    id[1] = "la_liga";
    id[2] = "premier_league";
    id[3] = "fa_cup";
    id[4] = "europa_league";
    id[5] = "serie_a";
    id[6] = "ligue1";
    id[7] = "bundesliga";
    id[8] = "copa_del_rey";
    id[9] = "copa_america";
    id[10] = "world_cup";

    for (int i = 0; i < 11; i++) {
      String idString = id[i] + "_btn";
      int idInt = getResources().getIdentifier(idString, "id", getPackageName());
      leagueButton[i] = findViewById(idInt);

      idString = id[i] + "_teams_btn";
      idInt = getResources().getIdentifier(idString, "id", getPackageName());
      teamsButton[i] = findViewById(idInt);

      idString = id[i] + "_standings_btn";
      idInt = getResources().getIdentifier(idString, "id", getPackageName());
      standingsButton[i] = findViewById(idInt);

      idString = id[i] + "_group";
      idInt = getResources().getIdentifier(idString, "id", getPackageName());
      group[i] = findViewById(idInt);
    }
  }

  void visitTeamsPage(int leagueId) {

  }

  void visitStandingsPage(int leagueId) {

  }

  void createOnclickListeners() {
    for (int i = 0; i < 11; i++) {
      final int buttonId = i;

      leagueButton[i].setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          hideAllGroups(buttonId);
          if (groupVisible[buttonId]) {
            group[buttonId].setVisibility(View.GONE);
          } else {
            group[buttonId].setVisibility(View.VISIBLE);
          }
          groupVisible[buttonId] ^= true;
        }
      });

      teamsButton[i].setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          visitTeamsPage(leagueId[buttonId]);
        }
      });

      standingsButton[i].setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          visitStandingsPage(leagueId[buttonId]);
        }
      });
    }
  }

  void hideAllGroups(int except) {
    for (int i = 0; i < 11; i++) {
      if (i == except) continue;
      group[i].setVisibility(View.GONE);
      groupVisible[i] = false;
    }
  }
}