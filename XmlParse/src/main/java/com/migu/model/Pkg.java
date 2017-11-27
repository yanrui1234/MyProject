package com.migu.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("pkg")
public class Pkg {
    private String pkgId;
    private String PRODUCT_ID;

    public String getPkgId() {
        return pkgId;
    }

    public void setPkgId(String pkgId) {
        this.pkgId = pkgId;
    }

    public String getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public void setPRODUCT_ID(String PRODUCT_ID) {
        this.PRODUCT_ID = PRODUCT_ID;
    }
}
