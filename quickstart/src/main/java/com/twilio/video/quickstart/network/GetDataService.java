package com.twilio.video.quickstart.network;

import com.twilio.video.quickstart.model.RetroToken;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface GetDataService {
    @GET("/apis/token.php")
    Call<RetroToken> getVideoToken(@QueryMap Map<String, String> params);
}
