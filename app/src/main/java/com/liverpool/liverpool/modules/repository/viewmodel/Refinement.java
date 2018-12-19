package com.liverpool.liverpool.modules.repository.viewmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Refinement {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("refinementId")
    @Expose
    private String refinementId;
    @SerializedName("selected")
    @Expose
    private Boolean selected;
    @SerializedName("colorHex")
    @Expose
    private String colorHex;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRefinementId() {
        return refinementId;
    }

    public void setRefinementId(String refinementId) {
        this.refinementId = refinementId;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public String getColorHex() {
        return colorHex;
    }

    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }
}
