package com.twilio.video.quickstart.model;

import com.google.gson.annotations.SerializedName;

public class RetroToken {
    @SerializedName("identity")
    private String identity;
    @SerializedName("token")
    private String token;

    public RetroToken(String identity, String token) {
        this.identity = identity;
        this.token = token;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
