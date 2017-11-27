package com.migu.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("content")
public class Content {
    private String version;
    private String contid;
    private String name;
    private String name1;
    private String name2;
    private String levelval;
    private String rankval;
   /* private Date createtime;
    private Date updatetime;
    private Date publishtime;*/
    private String createtime;
    private String updatetime;
    private String publishtime;
    private boolean ispublished;
    private boolean issupwap;
    private boolean issuprms;
    private boolean issuph264;
    private boolean issupwww;
    private boolean issuprchd;
    private boolean isupdating;
    private String PRDPACK_ID;
    private String BC_ID;
    private String SP_ID;
    private String PRODUCT_ID;
    private String AccessPlatFormType;

    //促销
    private String salesPromotions;
    //客户端类型 促销
    private String clientTypeSales;
    //渠道计费
    private String channelPkgsProduct;
    //电影票
    private String tickets;
    //流量限免
    private String freeFlow;
    //角标
    private String footers;
    //只输出节目单中不能回看的节目
    private String playBill;

    private Fields fields;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getContid() {
        return contid;
    }

    public void setContid(String contid) {
        this.contid = contid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getLevelval() {
        return levelval;
    }

    public void setLevelval(String levelval) {
        this.levelval = levelval;
    }

    public String getRankval() {
        return rankval;
    }

    public void setRankval(String rankval) {
        this.rankval = rankval;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
    }

    public boolean isIspublished() {
        return ispublished;
    }

    public void setIspublished(boolean ispublished) {
        this.ispublished = ispublished;
    }

    public boolean isIssupwap() {
        return issupwap;
    }

    public void setIssupwap(boolean issupwap) {
        this.issupwap = issupwap;
    }

    public boolean isIssuprms() {
        return issuprms;
    }

    public void setIssuprms(boolean issuprms) {
        this.issuprms = issuprms;
    }

    public boolean isIssuph264() {
        return issuph264;
    }

    public void setIssuph264(boolean issuph264) {
        this.issuph264 = issuph264;
    }

    public boolean isIssupwww() {
        return issupwww;
    }

    public void setIssupwww(boolean issupwww) {
        this.issupwww = issupwww;
    }

    public boolean isIssuprchd() {
        return issuprchd;
    }

    public void setIssuprchd(boolean issuprchd) {
        this.issuprchd = issuprchd;
    }

    public boolean isIsupdating() {
        return isupdating;
    }

    public void setIsupdating(boolean isupdating) {
        this.isupdating = isupdating;
    }

    public String getPRDPACK_ID() {
        return PRDPACK_ID;
    }

    public void setPRDPACK_ID(String PRDPACK_ID) {
        this.PRDPACK_ID = PRDPACK_ID;
    }

    public String getBC_ID() {
        return BC_ID;
    }

    public void setBC_ID(String BC_ID) {
        this.BC_ID = BC_ID;
    }

    public String getSP_ID() {
        return SP_ID;
    }

    public void setSP_ID(String SP_ID) {
        this.SP_ID = SP_ID;
    }

    public String getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public void setPRODUCT_ID(String PRODUCT_ID) {
        this.PRODUCT_ID = PRODUCT_ID;
    }

    public String getAccessPlatFormType() {
        return AccessPlatFormType;
    }

    public void setAccessPlatFormType(String accessPlatFormType) {
        AccessPlatFormType = accessPlatFormType;
    }

    public String getSalesPromotions() {
        return salesPromotions;
    }

    public void setSalesPromotions(String salesPromotions) {
        this.salesPromotions = salesPromotions;
    }

    public String getClientTypeSales() {
        return clientTypeSales;
    }

    public void setClientTypeSales(String clientTypeSales) {
        this.clientTypeSales = clientTypeSales;
    }

    public String getChannelPkgsProduct() {
        return channelPkgsProduct;
    }

    public void setChannelPkgsProduct(String channelPkgsProduct) {
        this.channelPkgsProduct = channelPkgsProduct;
    }

    public String getTickets() {
        return tickets;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }

    public String getFreeFlow() {
        return freeFlow;
    }

    public void setFreeFlow(String freeFlow) {
        this.freeFlow = freeFlow;
    }

    public String getFooters() {
        return footers;
    }

    public void setFooters(String footers) {
        this.footers = footers;
    }

    public String getPlayBill() {
        return playBill;
    }

    public void setPlayBill(String playBill) {
        this.playBill = playBill;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }
}
