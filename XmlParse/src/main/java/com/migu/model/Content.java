package com.migu.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.ArrayList;
import java.util.List;

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
    private String isupdating;
    private String PRDPACK_ID;
    private String BC_ID;
    private String SP_ID;
    private String PRODUCT_ID;
    private String AccessPlatFormType;

    //促销
    private List<SalesPromotion> salesPromotions = new ArrayList<SalesPromotion>();
    //客户端类型 促销
    private List<ClientTypeSale> clientTypeSales = new ArrayList<ClientTypeSale>();
    //渠道计费
    private List<Pkg> channelPkgsProduct = new ArrayList<Pkg>();
    //电影票
    private List<Ticket> tickets = new ArrayList<Ticket>();
    //流量限免
    private FreeFlow freeFlow;
    //角标
    private List<Footer> footers = new ArrayList<Footer>();
    //只输出节目单中不能回看的节目
    private List<Program> playBill = new ArrayList<Program>();

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

    public String getIsupdating() {
        return isupdating;
    }

    public void setIsupdating(String isupdating) {
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

    public List<SalesPromotion> getSalesPromotions() {
        return salesPromotions;
    }

    public void setSalesPromotions(List<SalesPromotion> salesPromotions) {
        this.salesPromotions = salesPromotions;
    }

    public List<ClientTypeSale> getClientTypeSales() {
        return clientTypeSales;
    }

    public void setClientTypeSales(List<ClientTypeSale> clientTypeSales) {
        this.clientTypeSales = clientTypeSales;
    }

    public List<Pkg> getChannelPkgsProduct() {
        return channelPkgsProduct;
    }

    public void setChannelPkgsProduct(List<Pkg> channelPkgsProduct) {
        this.channelPkgsProduct = channelPkgsProduct;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public FreeFlow getFreeFlow() {
        return freeFlow;
    }

    public void setFreeFlow(FreeFlow freeFlow) {
        this.freeFlow = freeFlow;
    }

    public List<Footer> getFooters() {
        return footers;
    }

    public void setFooters(List<Footer> footers) {
        this.footers = footers;
    }

    public List<Program> getPlayBill() {
        return playBill;
    }

    public void setPlayBill(List<Program> playBill) {
        this.playBill = playBill;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }
}
