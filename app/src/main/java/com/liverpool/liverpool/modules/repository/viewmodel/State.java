package com.liverpool.liverpool.modules.repository.viewmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class State {

    @SerializedName("categoryId")
    @Expose
    private String categoryId;
    @SerializedName("currentSortOption")
    @Expose
    private String currentSortOption;
    @SerializedName("currentFilters")
    @Expose
    private String currentFilters;
    @SerializedName("firstRecNum")
    @Expose
    private Integer firstRecNum;
    @SerializedName("lastRecNum")
    @Expose
    private Integer lastRecNum;
    @SerializedName("recsPerPage")
    @Expose
    private Integer recsPerPage;
    @SerializedName("totalNumRecs")
    @Expose
    private Integer totalNumRecs;
    @SerializedName("originalSearchTerm")
    @Expose
    private String originalSearchTerm;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCurrentSortOption() {
        return currentSortOption;
    }

    public void setCurrentSortOption(String currentSortOption) {
        this.currentSortOption = currentSortOption;
    }

    public String getCurrentFilters() {
        return currentFilters;
    }

    public void setCurrentFilters(String currentFilters) {
        this.currentFilters = currentFilters;
    }

    public Integer getFirstRecNum() {
        return firstRecNum;
    }

    public void setFirstRecNum(Integer firstRecNum) {
        this.firstRecNum = firstRecNum;
    }

    public Integer getLastRecNum() {
        return lastRecNum;
    }

    public void setLastRecNum(Integer lastRecNum) {
        this.lastRecNum = lastRecNum;
    }

    public Integer getRecsPerPage() {
        return recsPerPage;
    }

    public void setRecsPerPage(Integer recsPerPage) {
        this.recsPerPage = recsPerPage;
    }

    public Integer getTotalNumRecs() {
        return totalNumRecs;
    }

    public void setTotalNumRecs(Integer totalNumRecs) {
        this.totalNumRecs = totalNumRecs;
    }

    public String getOriginalSearchTerm() {
        return originalSearchTerm;
    }

    public void setOriginalSearchTerm(String originalSearchTerm) {
        this.originalSearchTerm = originalSearchTerm;
    }
}
