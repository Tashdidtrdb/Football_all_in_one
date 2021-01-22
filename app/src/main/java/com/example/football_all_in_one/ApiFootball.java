package com.example.football_all_in_one;

import com.example.football_all_in_one.model.fixture_lineup_response.FixtureLineupResponse;
import com.example.football_all_in_one.model.fixtures_response.FixturesResponse;
import com.example.football_all_in_one.model.players_response.PlayersResponse;
import com.example.football_all_in_one.model.players_statistics_for_a_fixture_response.PlayerFixtureStatisticsResponse;
import com.example.football_all_in_one.model.standing_response.StandingResponse;
import com.example.football_all_in_one.model.statistics_response.StatisticsResponse;
import com.example.football_all_in_one.model.team_statistics_for_a_fixture_response.TeamFixtureStatisticsResponse;
import com.example.football_all_in_one.model.teams_response.TeamsResponse;
import com.example.football_all_in_one.model.teams_response.TeamsResponseList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiFootball {

    // Get all standings of a league
    @Headers({"x-rapidapi-host: v3.football.api-sports.io", "x-rapidapi-key: 55fc6fac69d061f5bc16a9cd189751f5"})
    @GET("standings")
    Call<StandingResponse> getStandingResponse(
            @Query("league") int league_id,
            @Query("season") int season_id
    );

    // Get statistics of a team in a league
    @Headers({"x-rapidapi-host: v3.football.api-sports.io", "x-rapidapi-key: 55fc6fac69d061f5bc16a9cd189751f5"})
    @GET("teams/statistics")
    Call<StatisticsResponse> getStatisticsResponse(
            @Query("league") int league_id,
            @Query("season") int season_id,
            @Query("team") int team_id
    );

    //Get teams list in a given league
    @Headers({"x-rapidapi-host: v3.football.api-sports.io", "x-rapidapi-key: 55fc6fac69d061f5bc16a9cd189751f5"})
    @GET("teams")
    Call<TeamsResponse> getTeamsResponse(
            @Query("league") int league_id,
            @Query("season") int season_id
    );

    //Get all the players for one team in a league
    @Headers({"x-rapidapi-host: v3.football.api-sports.io", "x-rapidapi-key: 55fc6fac69d061f5bc16a9cd189751f5"})
    @GET("players")
    Call<PlayersResponse> getPlayersResponse(
            @Query("league") int league_id,
            @Query("season") int season_id,
            @Query("team") int team_id
    );

    //Get last 2 fixtures for one team in a league
    //Get next 2 fixtures for one team in a league
    @Headers({"x-rapidapi-host: v3.football.api-sports.io", "x-rapidapi-key: 55fc6fac69d061f5bc16a9cd189751f5"})
    @GET("fixtures")
    Call<FixturesResponse> getFixturesResponse(
            @Query("league") int league_id,
            @Query("season") int season_id,
            @Query("team") int team_id,
            @Query("last") Integer last,
            @Query("next") Integer next
    );

    //Get the lineups for a fixture given the fixture id
    @Headers({"x-rapidapi-host: v3.football.api-sports.io", "x-rapidapi-key: 55fc6fac69d061f5bc16a9cd189751f5"})
    @GET("fixtures/lineups")
    Call<FixtureLineupResponse> getFixtureLineupResponse(
            @Query("fixture") int fixture_id
    );

    //Get the players statistics for a fixture given the fixture id
    @Headers({"x-rapidapi-host: v3.football.api-sports.io", "x-rapidapi-key: 55fc6fac69d061f5bc16a9cd189751f5"})
    @GET("fixtures/players")
    Call<PlayerFixtureStatisticsResponse> getPlayerFixtureStatisticsResponse(
            @Query("fixture") int fixture_id
    );

    //Get the teams statistics for a fixture given the fixture id
    @Headers({"x-rapidapi-host: v3.football.api-sports.io", "x-rapidapi-key: 55fc6fac69d061f5bc16a9cd189751f5"})
    @GET("fixtures/statistics")
    Call<TeamFixtureStatisticsResponse> getTeamFixtureStatisticsResponse(
            @Query("fixture") int fixture_id
    );




}
