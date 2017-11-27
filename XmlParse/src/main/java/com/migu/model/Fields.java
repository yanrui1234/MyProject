package com.migu.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.ArrayList;
import java.util.List;

@XStreamAlias("field")
public class Fields {
    private String SubSerial_IDS;
    private String SubAlbum_IDS;
    private boolean IsSubAlbum;
    private String Album_IDS;
    private String DISPLAYFILELISTS;
    private String MMS_ID;
    private String CDuration;
    private String CPID;
    private String ECID;
    private String UDID;
    private String AssetID;
    private String Assist;
    private String Author;
    private String CATEGORY;
    private String COPYRIGHTID;
    private String CopyRightType;
   /* private Date CreateTime;
    private Date ModifyTime;*/
    private String CreateTime;
    private String ModifyTime;
    private String CreatorID;
    private String Detail;
    private String TwDetail;
    private String DirectRecFlag;
    private String DISPLAYTYPE;
    private String DisplayName;
    private String FORMTYPE;   //
    private String MediaLevel;
    private String N_CPID;  //
    private String Name;
    private String Sequence;
    private String SerialContentID;
    private String SerialCount;   //
    private String SerialSequence;
    private String SerialTrailingSequence;  //
    private String SHORTNAME;
    private String TYPE;
    private String LiveType;
    private String MTV_ID;   //
    private String HasMedia;
    private String MiguRank;  //
    private String doubanID;
    private String Recommendation;

    private String KeywordsCopy;   //
    private String RecommendationCopy;
    private String DetailCopy;  //
    private String NameCopy;

    private String ContentLists;

    private String SCENEFILES;
    //版权（类）
    private CopyRight CopyRight;

    //关键字（类）
    private List<KeyWord> KEYWORDS = new ArrayList<KeyWord>();

    private List<Label> LABELS = new ArrayList<Label>();

    //媒体文件（类）
    private List<MediaFile> mediafiles = new ArrayList<MediaFile>();

    //图片文件（类）
    private List<DisplayFile> displayFileLists = new ArrayList<DisplayFile>();

    //内容展示类型属性（类）
    private List<PropertyFile> propertyFileLists = new ArrayList<PropertyFile>();

    //运营参数信息（类）
    private BarrageActivity BarrageActivity;

    public String getSubSerial_IDS() {
        return SubSerial_IDS;
    }

    public void setSubSerial_IDS(String subSerial_IDS) {
        SubSerial_IDS = subSerial_IDS;
    }

    public String getSubAlbum_IDS() {
        return SubAlbum_IDS;
    }

    public void setSubAlbum_IDS(String subAlbum_IDS) {
        SubAlbum_IDS = subAlbum_IDS;
    }

    public boolean isSubAlbum() {
        return IsSubAlbum;
    }

    public void setSubAlbum(boolean subAlbum) {
        IsSubAlbum = subAlbum;
    }

    public String getAlbum_IDS() {
        return Album_IDS;
    }

    public void setAlbum_IDS(String album_IDS) {
        Album_IDS = album_IDS;
    }

    public String getDISPLAYFILELISTS() {
        return DISPLAYFILELISTS;
    }

    public void setDISPLAYFILELISTS(String DISPLAYFILELISTS) {
        this.DISPLAYFILELISTS = DISPLAYFILELISTS;
    }

    public String getMMS_ID() {
        return MMS_ID;
    }

    public void setMMS_ID(String MMS_ID) {
        this.MMS_ID = MMS_ID;
    }

    public String getCDuration() {
        return CDuration;
    }

    public void setCDuration(String CDuration) {
        this.CDuration = CDuration;
    }

    public String getCPID() {
        return CPID;
    }

    public void setCPID(String CPID) {
        this.CPID = CPID;
    }

    public String getECID() {
        return ECID;
    }

    public void setECID(String ECID) {
        this.ECID = ECID;
    }

    public String getUDID() {
        return UDID;
    }

    public void setUDID(String UDID) {
        this.UDID = UDID;
    }

    public String getAssetID() {
        return AssetID;
    }

    public void setAssetID(String assetID) {
        AssetID = assetID;
    }

    public String getAssist() {
        return Assist;
    }

    public void setAssist(String assist) {
        Assist = assist;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getCATEGORY() {
        return CATEGORY;
    }

    public void setCATEGORY(String CATEGORY) {
        this.CATEGORY = CATEGORY;
    }

    public String getCOPYRIGHTID() {
        return COPYRIGHTID;
    }

    public void setCOPYRIGHTID(String COPYRIGHTID) {
        this.COPYRIGHTID = COPYRIGHTID;
    }

    public String getCopyRightType() {
        return CopyRightType;
    }

    public void setCopyRightType(String copyRightType) {
        CopyRightType = copyRightType;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getModifyTime() {
        return ModifyTime;
    }

    public void setModifyTime(String modifyTime) {
        ModifyTime = modifyTime;
    }

    public String getCreatorID() {
        return CreatorID;
    }

    public void setCreatorID(String creatorID) {
        CreatorID = creatorID;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public String getTwDetail() {
        return TwDetail;
    }

    public void setTwDetail(String twDetail) {
        TwDetail = twDetail;
    }

    public String getDirectRecFlag() {
        return DirectRecFlag;
    }

    public void setDirectRecFlag(String directRecFlag) {
        DirectRecFlag = directRecFlag;
    }

    public String getDISPLAYTYPE() {
        return DISPLAYTYPE;
    }

    public void setDISPLAYTYPE(String DISPLAYTYPE) {
        this.DISPLAYTYPE = DISPLAYTYPE;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String displayName) {
        DisplayName = displayName;
    }

    public String getFORMTYPE() {
        return FORMTYPE;
    }

    public void setFORMTYPE(String FORMTYPE) {
        this.FORMTYPE = FORMTYPE;
    }

    public String getMediaLevel() {
        return MediaLevel;
    }

    public void setMediaLevel(String mediaLevel) {
        MediaLevel = mediaLevel;
    }

    public String getN_CPID() {
        return N_CPID;
    }

    public void setN_CPID(String n_CPID) {
        N_CPID = n_CPID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSequence() {
        return Sequence;
    }

    public void setSequence(String sequence) {
        Sequence = sequence;
    }

    public String getSerialContentID() {
        return SerialContentID;
    }

    public void setSerialContentID(String serialContentID) {
        SerialContentID = serialContentID;
    }

    public String getSerialCount() {
        return SerialCount;
    }

    public void setSerialCount(String serialCount) {
        SerialCount = serialCount;
    }

    public String getSerialSequence() {
        return SerialSequence;
    }

    public void setSerialSequence(String serialSequence) {
        SerialSequence = serialSequence;
    }

    public String getSerialTrailingSequence() {
        return SerialTrailingSequence;
    }

    public void setSerialTrailingSequence(String serialTrailingSequence) {
        SerialTrailingSequence = serialTrailingSequence;
    }

    public String getSHORTNAME() {
        return SHORTNAME;
    }

    public void setSHORTNAME(String SHORTNAME) {
        this.SHORTNAME = SHORTNAME;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getLiveType() {
        return LiveType;
    }

    public void setLiveType(String liveType) {
        LiveType = liveType;
    }

    public String getMTV_ID() {
        return MTV_ID;
    }

    public void setMTV_ID(String MTV_ID) {
        this.MTV_ID = MTV_ID;
    }

    public String getHasMedia() {
        return HasMedia;
    }

    public void setHasMedia(String hasMedia) {
        HasMedia = hasMedia;
    }

    public String getMiguRank() {
        return MiguRank;
    }

    public void setMiguRank(String miguRank) {
        MiguRank = miguRank;
    }

    public String getDoubanID() {
        return doubanID;
    }

    public void setDoubanID(String doubanID) {
        this.doubanID = doubanID;
    }

    public String getRecommendation() {
        return Recommendation;
    }

    public void setRecommendation(String recommendation) {
        Recommendation = recommendation;
    }

    public String getKeywordsCopy() {
        return KeywordsCopy;
    }

    public void setKeywordsCopy(String keywordsCopy) {
        KeywordsCopy = keywordsCopy;
    }

    public String getRecommendationCopy() {
        return RecommendationCopy;
    }

    public void setRecommendationCopy(String recommendationCopy) {
        RecommendationCopy = recommendationCopy;
    }

    public String getDetailCopy() {
        return DetailCopy;
    }

    public void setDetailCopy(String detailCopy) {
        DetailCopy = detailCopy;
    }

    public String getNameCopy() {
        return NameCopy;
    }

    public void setNameCopy(String nameCopy) {
        NameCopy = nameCopy;
    }

    public String getContentLists() {
        return ContentLists;
    }

    public void setContentLists(String contentLists) {
        ContentLists = contentLists;
    }

    public String getSCENEFILES() {
        return SCENEFILES;
    }

    public void setSCENEFILES(String SCENEFILES) {
        this.SCENEFILES = SCENEFILES;
    }

    public com.migu.model.CopyRight getCopyRight() {
        return CopyRight;
    }

    public void setCopyRight(com.migu.model.CopyRight copyRight) {
        CopyRight = copyRight;
    }

    public List<KeyWord> getKEYWORDS() {
        return KEYWORDS;
    }

    public void setKEYWORDS(List<KeyWord> KEYWORDS) {
        this.KEYWORDS = KEYWORDS;
    }

    public List<Label> getLABELS() {
        return LABELS;
    }

    public void setLABELS(List<Label> LABELS) {
        this.LABELS = LABELS;
    }

    public List<MediaFile> getMediafiles() {
        return mediafiles;
    }

    public void setMediafiles(List<MediaFile> mediafiles) {
        this.mediafiles = mediafiles;
    }

    public List<DisplayFile> getDisplayFileLists() {
        return displayFileLists;
    }

    public void setDisplayFileLists(List<DisplayFile> displayFileLists) {
        this.displayFileLists = displayFileLists;
    }

    public List<PropertyFile> getPropertyFileLists() {
        return propertyFileLists;
    }

    public void setPropertyFileLists(List<PropertyFile> propertyFileLists) {
        this.propertyFileLists = propertyFileLists;
    }

    public BarrageActivity getBarrageActivity() {
        return BarrageActivity;
    }

    public void setBarrageActivity(BarrageActivity barrageActivity) {
        this.BarrageActivity = barrageActivity;
    }
}
