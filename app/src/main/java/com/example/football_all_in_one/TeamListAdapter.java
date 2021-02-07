package com.example.football_all_in_one;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class TeamListAdapter extends RecyclerView.Adapter<TeamListAdapter.TeamListViewHolder> {
  public static final String EXTRA = "com.example.football_all_in_one_";

  private Context context;
  private List<TeamListItem> teamListItems;
  private int leagueId, season;

  public TeamListAdapter(Context context, List<TeamListItem> teamListItems, int leagueId, int season) {
    this.context = context;
    this.teamListItems = teamListItems;
    this.leagueId = leagueId;
    this.season = season;
  }

  @NonNull
  @Override
  public TeamListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    LayoutInflater inflater = LayoutInflater.from(context);
    View view = inflater.inflate(R.layout.team_list_item, parent, false);
    return new TeamListViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull TeamListViewHolder holder, int position) {
    TeamListItem teamListItem = teamListItems.get(position);
    holder.teamName.setText(teamListItem.getTeamName());
    holder.founded.setText(teamListItem.getFounded());
    holder.country.setText(teamListItem.getCountry());
    holder.national.setText(teamListItem.getNational());
    holder.venueName.setText(teamListItem.getVenueName());
    holder.venueAddress.setText(teamListItem.getVenueAddress());
    holder.venueCity.setText(teamListItem.getVenueCity());
    holder.venueCapacity.setText(teamListItem.getVenueCapacity());
    Glide.with(context).load(teamListItem.getTeamLogo()).into(holder.teamLogo);

    holder.itemView.setOnClickListener(v -> {
      if (holder.detailsGroup.getVisibility() == View.VISIBLE) {
        holder.detailsGroup.setVisibility(View.GONE);
        holder.constraintLayout.setBackground(ContextCompat.getDrawable(context,R.drawable.collapsed_team_item_bg));
      } else {
        holder.detailsGroup.setVisibility(View.VISIBLE);
        holder.constraintLayout.setBackground(ContextCompat.getDrawable(context,R.drawable.expanded_team_item_bg));
      }
    });

    holder.statsButton.setOnClickListener(v -> visitStatisticsPage(teamListItem.getTeamId(), leagueId, season));

    holder.fixturesButton.setOnClickListener(v -> visitFixturesPage(teamListItem.getTeamId(), leagueId, season));
  }

  @Override
  public int getItemCount() {
    return teamListItems.size();
  }

  public class TeamListViewHolder extends RecyclerView.ViewHolder {
    ImageView teamLogo;
    TextView teamName, founded, country, national, venueName, venueAddress, venueCity, venueCapacity;
    Button statsButton, fixturesButton, playersButton;
    View detailsGroup;
    ConstraintLayout constraintLayout;

    public TeamListViewHolder(@NonNull View itemView) {
      super(itemView);
      teamLogo = itemView.findViewById(R.id.team_logo);
      teamName = itemView.findViewById(R.id.team_name);
      founded = itemView.findViewById(R.id.founded);
      country = itemView.findViewById(R.id.country);
      national = itemView.findViewById(R.id.national);
      venueName = itemView.findViewById(R.id.venue_name);
      venueAddress = itemView.findViewById(R.id.venue_address);
      venueCity = itemView.findViewById(R.id.venue_city);
      venueCapacity = itemView.findViewById(R.id.venue_capacity);
      statsButton = itemView.findViewById(R.id.stats_button);
      fixturesButton = itemView.findViewById(R.id.fixtures_button);
      playersButton = itemView.findViewById(R.id.players_button);
      detailsGroup = itemView.findViewById(R.id.details_group);
      constraintLayout = itemView.findViewById(R.id.card_bg);
    }
  }

  private void visitStatisticsPage(int teamId, int leagueId, int season) {
    Intent intent = new Intent(context, StatisticsActivity.class);
    intent.putExtra(EXTRA + "leagueId", leagueId);
    intent.putExtra(EXTRA + "season", season);
    context.startActivity(intent);
  }

  private void visitFixturesPage(int teamId, int leagueId, int season) {
    Intent intent = new Intent(context, FixturesActivity.class);
    intent.putExtra(EXTRA + "leagueId", leagueId);
    intent.putExtra(EXTRA + "season", season);
    context.startActivity(intent);
  }
}
