package com.liverpool.liverpool.modules.repository.viewmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Flag {

    @SerializedName("flagId")
    @Expose
    private String flagId;
    @SerializedName("flagMessage")
    @Expose
    private String flagMessage;

    public String getFlagId() {
        return flagId;
    }

    public void setFlagId(String flagId) {
        this.flagId = flagId;
    }

    public String getFlagMessage() {
        return flagMessage;
    }

    public void setFlagMessage(String flagMessage) {
        this.flagMessage = flagMessage;
    }


}
