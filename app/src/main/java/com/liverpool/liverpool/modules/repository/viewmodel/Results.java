package com.liverpool.liverpool.modules.repository.viewmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Results {

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("plpState")
    @Expose
    private State plpState;
    @SerializedName("sortOptions")
    @Expose
    private List<SortOptions> sortOptions = null;
    @SerializedName("refinementGroups")
    @Expose
    private List<RefinementGroup> refinementGroups = null;
    @SerializedName("records")
    @Expose
    private List<Product> records = null;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public State getPlpState() {
        return plpState;
    }

    public void setPlpState(State plpState) {
        this.plpState = plpState;
    }

    public List<SortOptions> getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(List<SortOptions> sortOptions) {
        this.sortOptions = sortOptions;
    }

    public List<RefinementGroup> getRefinementGroups() {
        return refinementGroups;
    }

    public void setRefinementGroups(List<RefinementGroup> refinementGroups) {
        this.refinementGroups = refinementGroups;
    }

    public List<Product> getRecords() {
        return records;
    }

    public void setRecords(List<Product> records) {
        this.records = records;
    }
}
