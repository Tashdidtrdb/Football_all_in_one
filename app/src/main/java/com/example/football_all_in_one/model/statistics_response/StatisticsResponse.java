package com.example.football_all_in_one.model.statistics_response;

import com.google.gson.annotations.SerializedName;

public class StatisticsResponse {
    @SerializedName("response")
    private ResponseObject responseObject;

    // Constructor
    public StatisticsResponse(ResponseObject responseObject) {
        this.responseObject = responseObject;
    }

    public ResponseObject getResponseObject() {
        return responseObject;
    }
}
