package com.liverpool.liverpool.modules.repository.viewmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product {

    @SerializedName("productId")
    @Expose
    private String productId;
    @SerializedName("skuRepositoryId")
    @Expose
    private String skuRepositoryId;
    @SerializedName("productDisplayName")
    @Expose
    private String productDisplayName;
    @SerializedName("productType")
    @Expose
    private String productType;
    @SerializedName("productRatingCount")
    @Expose
    private Integer productRatingCount;
    @SerializedName("productAvgRating")
    @Expose
    private Integer productAvgRating;
    @SerializedName("listPrice")
    @Expose
    private Integer listPrice;
    @SerializedName("minimumListPrice")
    @Expose
    private Integer minimumListPrice;
    @SerializedName("maximumListPrice")
    @Expose
    private Integer maximumListPrice;
    @SerializedName("promoPrice")
    @Expose
    private Double promoPrice;
    @SerializedName("minimumPromoPrice")
    @Expose
    private Double minimumPromoPrice;
    @SerializedName("maximumPromoPrice")
    @Expose
    private Double maximumPromoPrice;
    @SerializedName("isHybrid")
    @Expose
    private Boolean isHybrid;
    @SerializedName("isMarketPlace")
    @Expose
    private Boolean isMarketPlace;
    @SerializedName("smImage")
    @Expose
    private String smImage;
    @SerializedName("lgImage")
    @Expose
    private String lgImage;
    @SerializedName("xlImage")
    @Expose
    private String xlImage;
    @SerializedName("groupType")
    @Expose
    private String groupType;
    @SerializedName("plpFlags")
    @Expose
    private List<Flag> plpFlags = null;
    @SerializedName("variantsColor")
    @Expose
    private List<Colors> variantsColor = null;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSkuRepositoryId() {
        return skuRepositoryId;
    }

    public void setSkuRepositoryId(String skuRepositoryId) {
        this.skuRepositoryId = skuRepositoryId;
    }

    public String getProductDisplayName() {
        return productDisplayName;
    }

    public void setProductDisplayName(String productDisplayName) {
        this.productDisplayName = productDisplayName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getProductRatingCount() {
        return productRatingCount;
    }

    public void setProductRatingCount(Integer productRatingCount) {
        this.productRatingCount = productRatingCount;
    }

    public Integer getProductAvgRating() {
        return productAvgRating;
    }

    public void setProductAvgRating(Integer productAvgRating) {
        this.productAvgRating = productAvgRating;
    }

    public Integer getListPrice() {
        return listPrice;
    }

    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    public Integer getMinimumListPrice() {
        return minimumListPrice;
    }

    public void setMinimumListPrice(Integer minimumListPrice) {
        this.minimumListPrice = minimumListPrice;
    }

    public Integer getMaximumListPrice() {
        return maximumListPrice;
    }

    public void setMaximumListPrice(Integer maximumListPrice) {
        this.maximumListPrice = maximumListPrice;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public Double getMinimumPromoPrice() {
        return minimumPromoPrice;
    }

    public void setMinimumPromoPrice(Double minimumPromoPrice) {
        this.minimumPromoPrice = minimumPromoPrice;
    }

    public Double getMaximumPromoPrice() {
        return maximumPromoPrice;
    }

    public void setMaximumPromoPrice(Double maximumPromoPrice) {
        this.maximumPromoPrice = maximumPromoPrice;
    }

    public Boolean getHybrid() {
        return isHybrid;
    }

    public void setHybrid(Boolean hybrid) {
        isHybrid = hybrid;
    }

    public Boolean getMarketPlace() {
        return isMarketPlace;
    }

    public void setMarketPlace(Boolean marketPlace) {
        isMarketPlace = marketPlace;
    }

    public String getSmImage() {
        return smImage;
    }

    public void setSmImage(String smImage) {
        this.smImage = smImage;
    }

    public String getLgImage() {
        return lgImage;
    }

    public void setLgImage(String lgImage) {
        this.lgImage = lgImage;
    }

    public String getXlImage() {
        return xlImage;
    }

    public void setXlImage(String xlImage) {
        this.xlImage = xlImage;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public List<Flag> getPlpFlags() {
        return plpFlags;
    }

    public void setPlpFlags(List<Flag> plpFlags) {
        this.plpFlags = plpFlags;
    }

    public List<Colors> getVariantsColor() {
        return variantsColor;
    }

    public void setVariantsColor(List<Colors> variantsColor) {
        this.variantsColor = variantsColor;
    }
}
