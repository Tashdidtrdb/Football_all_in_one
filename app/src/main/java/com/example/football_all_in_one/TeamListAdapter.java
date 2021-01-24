package com.example.football_all_in_one;

import android.content.Context;
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
  private Context context;
  private List<TeamListItem> teamListItems;

  public TeamListAdapter(Context context, List<TeamListItem> teamListItems) {
    this.context = context;
    this.teamListItems = teamListItems;
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
  }

  @Override
  public int getItemCount() {
    return teamListItems.size();
  }

  public class TeamListViewHolder extends RecyclerView.ViewHolder {
    ImageView teamLogo;
    TextView teamName, info, founded, country, national, venue, venueName, venueAddress, venueCity, venueCapacity;
    Button statsButton, playersButton;
    View detailsGroup;
    ConstraintLayout constraintLayout;

    public TeamListViewHolder(@NonNull View itemView) {
      super(itemView);
      teamLogo = itemView.findViewById(R.id.team_logo);
      teamName = itemView.findViewById(R.id.team_name);
      info = itemView.findViewById(R.id.info);
      founded = itemView.findViewById(R.id.founded);
      country = itemView.findViewById(R.id.country);
      national = itemView.findViewById(R.id.national);
      venue = itemView.findViewById(R.id.venue);
      venueName = itemView.findViewById(R.id.venue_name);
      venueAddress = itemView.findViewById(R.id.venue_address);
      venueCity = itemView.findViewById(R.id.venue_city);
      venueCapacity = itemView.findViewById(R.id.venue_capacity);
      statsButton = itemView.findViewById(R.id.stats_button);
      playersButton = itemView.findViewById(R.id.players_button);
      detailsGroup = itemView.findViewById(R.id.details_group);
      constraintLayout = itemView.findViewById(R.id.card_bg);
    }
  }

}
