package com.liverpool.liverpool.modules.repository.viewmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PLPResponse {

    @SerializedName("status")
    @Expose
    private StatusPLP status;
    @SerializedName("pageType")
    @Expose
    private String pageType;
    @SerializedName("plpResults")
    @Expose
    private Results plpResults;

    public StatusPLP getStatus() {
        return status;
    }

    public void setStatus(StatusPLP status) {
        this.status = status;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public Results getPlpResults() {
        return plpResults;
    }

    public void setPlpResults(Results plpResults) {
        this.plpResults = plpResults;
    }
}
