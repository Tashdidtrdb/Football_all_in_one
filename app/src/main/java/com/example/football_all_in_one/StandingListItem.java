package com.example.football_all_in_one;

public class StandingListItem {
  private String rank;
  private String teamName;
  private String teamLogo;
  private String points;
  private String group;

  public StandingListItem(String rank, String teamName, String teamLogo, String points, String group) {
    this.rank = rank;
    this.teamName = teamName;
    this.teamLogo = teamLogo;
    this.points = points;
    this.group = group;
  }

  public String getRank() {
    return rank;
  }

  public String getTeamName() {
    return teamName;
  }

  public String getTeamLogo() {
    return teamLogo;
  }

  public String getPoints() {
    return points;
  }

  public String getGroup() {
    return group;
  }
}
