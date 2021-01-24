package com.example.football_all_in_one;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class StandingListAdapter extends RecyclerView.Adapter<StandingListAdapter.StandingListViewHolder> {
  private Context context;
  private List<StandingListItem> standingListItems;

  public StandingListAdapter(Context context, List<StandingListItem> standingListItems) {
    this.context = context;
    this.standingListItems = standingListItems;
  }

  @NonNull
  @Override
  public StandingListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    LayoutInflater inflater = LayoutInflater.from(context);
    View view = inflater.inflate(R.layout.standing_list_item, parent, false);
    return new StandingListViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull StandingListViewHolder holder, int position) {
    StandingListItem standingListItem = standingListItems.get(position);
    holder.teamName.setText(standingListItem.getTeamName());
    holder.rank.setText(standingListItem.getRank());
    holder.points.setText(standingListItem.getPoints());
    holder.group.setText(standingListItem.getGroup());
    Glide.with(context).load(standingListItem.getTeamLogo()).into(holder.teamLogo);
  }

  @Override
  public int getItemCount() {
    return standingListItems.size();
  }

  public class StandingListViewHolder extends RecyclerView.ViewHolder {
    ImageView teamLogo;
    TextView teamName, rank, points, group;

    public StandingListViewHolder(@NonNull View itemView) {
      super(itemView);
      teamLogo = itemView.findViewById(R.id.team_logo);
      teamName = itemView.findViewById(R.id.team_name);
      rank = itemView.findViewById(R.id.rank);
      points = itemView.findViewById(R.id.points);
      group = itemView.findViewById(R.id.group);
    }
  }
}
