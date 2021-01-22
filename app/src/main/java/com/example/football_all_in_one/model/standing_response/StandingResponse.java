package com.example.football_all_in_one.model.standing_response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class StandingResponse {
    @SerializedName("response")
    ArrayList<ResponseList> responseList;


    // Constructor
    public StandingResponse(ArrayList<ResponseList> responseList) {
        this.responseList = responseList;
    }

    public ArrayList<ResponseList> getResponseList() {
        return responseList;
    }
}
