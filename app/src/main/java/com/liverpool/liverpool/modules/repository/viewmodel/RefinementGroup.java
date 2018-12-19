package com.liverpool.liverpool.modules.repository.viewmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RefinementGroup {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("refinement")
    @Expose
    private List<Refinement> refinement = null;
    @SerializedName("multiSelect")
    @Expose
    private Boolean multiSelect;
    @SerializedName("dimensionName")
    @Expose
    private String dimensionName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Refinement> getRefinement() {
        return refinement;
    }

    public void setRefinement(List<Refinement> refinement) {
        this.refinement = refinement;
    }

    public Boolean getMultiSelect() {
        return multiSelect;
    }

    public void setMultiSelect(Boolean multiSelect) {
        this.multiSelect = multiSelect;
    }

    public String getDimensionName() {
        return dimensionName;
    }

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }
}
