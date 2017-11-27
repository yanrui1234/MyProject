package com.migu.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("salesPromotion")
public class SalesPromotion {
    private String salesProductId;
    private String salesDiscount;
    private String salesCategory;
    private String salesStartTime;
    private String salesEndTime;

    public String getSalesProductId() {
        return salesProductId;
    }

    public void setSalesProductId(String salesProductId) {
        this.salesProductId = salesProductId;
    }

    public String getSalesDiscount() {
        return salesDiscount;
    }

    public void setSalesDiscount(String salesDiscount) {
        this.salesDiscount = salesDiscount;
    }

    public String getSalesCategory() {
        return salesCategory;
    }

    public void setSalesCategory(String salesCategory) {
        this.salesCategory = salesCategory;
    }

    public String getSalesStartTime() {
        return salesStartTime;
    }

    public void setSalesStartTime(String salesStartTime) {
        this.salesStartTime = salesStartTime;
    }

    public String getSalesEndTime() {
        return salesEndTime;
    }

    public void setSalesEndTime(String salesEndTime) {
        this.salesEndTime = salesEndTime;
    }
}
