package com.example.football_all_in_one;

public class TeamListItem {
  private int leagueId;
  private int teamId;
  private String teamName;
  private String teamLogo;
  private String founded;
  private String country;
  private String national;
  private String venueName;
  private String venueAddress;
  private String venueCity;
  private String venueCapacity;

  public TeamListItem(int leagueId, int teamId, String teamName, String teamLogo, String founded, String country, String national, String venueName, String venueAddress, String venueCity, String venueCapacity) {
    this.leagueId = leagueId;
    this.teamId = teamId;
    this.teamName = teamName;
    this.teamLogo = teamLogo;
    this.founded = founded;
    this.country = country;
    this.national = national;
    this.venueName = venueName;
    this.venueAddress = venueAddress;
    this.venueCity = venueCity;
    this.venueCapacity = venueCapacity;
  }

  public int getLeagueId() {
    return leagueId;
  }

  public int getTeamId() {
    return teamId;
  }

  public String getTeamName() {
    return teamName;
  }

  public String getTeamLogo() {
    return teamLogo;
  }

  public String getFounded() {
    return founded;
  }

  public String getCountry() {
    return country;
  }

  public String getNational() {
    return national;
  }

  public String getVenueName() {
    return venueName;
  }

  public String getVenueAddress() {
    return venueAddress;
  }

  public String getVenueCity() {
    return venueCity;
  }

  public String getVenueCapacity() {
    return venueCapacity;
  }
}
