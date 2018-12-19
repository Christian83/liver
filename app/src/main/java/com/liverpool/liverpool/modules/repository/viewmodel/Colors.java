package com.liverpool.liverpool.modules.repository.viewmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Colors {

    @SerializedName("colorName")
    @Expose
    private String colorName;
    @SerializedName("colorHex")
    @Expose
    private String colorHex;
    @SerializedName("colorImageURL")
    @Expose
    private String colorImageURL;

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorHex() {
        return colorHex;
    }

    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }

    public String getColorImageURL() {
        return colorImageURL;
    }

    public void setColorImageURL(String colorImageURL) {
        this.colorImageURL = colorImageURL;
    }
}
