package com.migu.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "cinema_data")
public class CinemaData implements Serializable {
    @Id
    @Column(name = "contId")
    private String contid;

    private String fields;

    @Column(name = "packId")
    private String packid;

    @Column(name = "limitDate")
    private String limitdate;

    @Column(name = "contDisplayType")
    private String contdisplaytype;

    @Column(name = "contAssist")
    private String contassist;

    @Column(name = "mediaType")
    private String mediatype;

    @Column(name = "mediaShape")
    private String mediashape;

    @Column(name = "mediaYear")
    private String mediayear;

    @Column(name = "mediaMing")
    private String mediaming;

    @Column(name = "mediaChu")
    private String mediachu;

    @Column(name = "mediaArea")
    private String mediaarea;

    @Column(name = "mediaGkzp")
    private String mediagkzp;

    @Column(name = "mediaMovieForm")
    private String mediamovieform;

    @Column(name = "mediaPlat")
    private String mediaplat;

    @Column(name = "mediaProj")
    private String mediaproj;

    @Column(name = "mediaIsDubi")
    private String mediaisdubi;

    @Column(name = "mediaDirector")
    private String mediadirector;

    @Column(name = "mediaScore")
    private String mediascore;

    @Column(name = "mediaVideoName")
    private String mediavideoname;

    @Column(name = "mediaTime")
    private String mediatime;

    @Column(name = "mediaNianling")
    private String medianianling;

    @Column(name = "isUpdating")
    private String isupdating;

    @Column(name = "contFormType")
    private String contformtype;

    @Column(name = "mediaGkhd")
    private String mediagkhd;

    @Column(name = "mediaReportArea")
    private String mediareportarea;

    @Column(name = "contDuration")
    private Integer contduration;

    @Column(name = "contMediaLevel")
    private String contmedialevel;

    @Column(name = "keywordsCopy")
    private String keywordscopy;

    @Column(name = "recomCopy")
    private String recomcopy;

    @Column(name = "nameCopy")
    private String namecopy;

    @Column(name = "detailCopy")
    private String detailcopy;

    @Column(name = "mediaMiaoshud")
    private String mediamiaoshud;

    @Column(name = "copyrightTerminal")
    private String copyrightterminal;

    @Column(name = "mediaMovieFormNot")
    private String mediamovieformnot;

    @Column(name = "mediaLaiYuan")
    private String medialaiyuan;

    @Column(name = "mediaActor")
    private String mediaactor;

    @Column(name = "programId")
    private Integer programid;

    @Column(name = "pyFirst")
    private String pyfirst;

    @Column(name = "salesCategory")
    private String salescategory;

    @Column(name = "salesStartTime")
    private Date salesstarttime;

    @Column(name = "salesEndTime")
    private Date salesendtime;

    private String name;

    @Column(name = "publishTime")
    private Date publishtime;

    @Column(name = "contName")
    private String contname;

    @Column(name = "contDetail")
    private String contdetail;

    @Column(name = "shortName")
    private String shortname;

    @Column(name = "doubanScore")
    private String doubanscore;

    private static final long serialVersionUID = 1L;

    /**
     * @return contId
     */
    public String getContid() {
        return contid;
    }

    /**
     * @param contid
     */
    public void setContid(String contid) {
        this.contid = contid;
    }

    /**
     * @return fields
     */
    public String getFields() {
        return fields;
    }

    /**
     * @param fields
     */
    public void setFields(String fields) {
        this.fields = fields;
    }

    /**
     * @return packId
     */
    public String getPackid() {
        return packid;
    }

    /**
     * @param packid
     */
    public void setPackid(String packid) {
        this.packid = packid;
    }

    /**
     * @return limitDate
     */
    public String getLimitdate() {
        return limitdate;
    }

    /**
     * @param limitdate
     */
    public void setLimitdate(String limitdate) {
        this.limitdate = limitdate;
    }

    /**
     * @return contDisplayType
     */
    public String getContdisplaytype() {
        return contdisplaytype;
    }

    /**
     * @param contdisplaytype
     */
    public void setContdisplaytype(String contdisplaytype) {
        this.contdisplaytype = contdisplaytype;
    }

    /**
     * @return contAssist
     */
    public String getContassist() {
        return contassist;
    }

    /**
     * @param contassist
     */
    public void setContassist(String contassist) {
        this.contassist = contassist;
    }

    /**
     * @return mediaType
     */
    public String getMediatype() {
        return mediatype;
    }

    /**
     * @param mediatype
     */
    public void setMediatype(String mediatype) {
        this.mediatype = mediatype;
    }

    /**
     * @return mediaShape
     */
    public String getMediashape() {
        return mediashape;
    }

    /**
     * @param mediashape
     */
    public void setMediashape(String mediashape) {
        this.mediashape = mediashape;
    }

    /**
     * @return mediaYear
     */
    public String getMediayear() {
        return mediayear;
    }

    /**
     * @param mediayear
     */
    public void setMediayear(String mediayear) {
        this.mediayear = mediayear;
    }

    /**
     * @return mediaMing
     */
    public String getMediaming() {
        return mediaming;
    }

    /**
     * @param mediaming
     */
    public void setMediaming(String mediaming) {
        this.mediaming = mediaming;
    }

    /**
     * @return mediaChu
     */
    public String getMediachu() {
        return mediachu;
    }

    /**
     * @param mediachu
     */
    public void setMediachu(String mediachu) {
        this.mediachu = mediachu;
    }

    /**
     * @return mediaArea
     */
    public String getMediaarea() {
        return mediaarea;
    }

    /**
     * @param mediaarea
     */
    public void setMediaarea(String mediaarea) {
        this.mediaarea = mediaarea;
    }

    /**
     * @return mediaGkzp
     */
    public String getMediagkzp() {
        return mediagkzp;
    }

    /**
     * @param mediagkzp
     */
    public void setMediagkzp(String mediagkzp) {
        this.mediagkzp = mediagkzp;
    }

    /**
     * @return mediaMovieForm
     */
    public String getMediamovieform() {
        return mediamovieform;
    }

    /**
     * @param mediamovieform
     */
    public void setMediamovieform(String mediamovieform) {
        this.mediamovieform = mediamovieform;
    }

    /**
     * @return mediaPlat
     */
    public String getMediaplat() {
        return mediaplat;
    }

    /**
     * @param mediaplat
     */
    public void setMediaplat(String mediaplat) {
        this.mediaplat = mediaplat;
    }

    /**
     * @return mediaProj
     */
    public String getMediaproj() {
        return mediaproj;
    }

    /**
     * @param mediaproj
     */
    public void setMediaproj(String mediaproj) {
        this.mediaproj = mediaproj;
    }

    /**
     * @return mediaIsDubi
     */
    public String getMediaisdubi() {
        return mediaisdubi;
    }

    /**
     * @param mediaisdubi
     */
    public void setMediaisdubi(String mediaisdubi) {
        this.mediaisdubi = mediaisdubi;
    }

    /**
     * @return mediaDirector
     */
    public String getMediadirector() {
        return mediadirector;
    }

    /**
     * @param mediadirector
     */
    public void setMediadirector(String mediadirector) {
        this.mediadirector = mediadirector;
    }

    /**
     * @return mediaScore
     */
    public String getMediascore() {
        return mediascore;
    }

    /**
     * @param mediascore
     */
    public void setMediascore(String mediascore) {
        this.mediascore = mediascore;
    }

    /**
     * @return mediaVideoName
     */
    public String getMediavideoname() {
        return mediavideoname;
    }

    /**
     * @param mediavideoname
     */
    public void setMediavideoname(String mediavideoname) {
        this.mediavideoname = mediavideoname;
    }

    /**
     * @return mediaTime
     */
    public String getMediatime() {
        return mediatime;
    }

    /**
     * @param mediatime
     */
    public void setMediatime(String mediatime) {
        this.mediatime = mediatime;
    }

    /**
     * @return mediaNianling
     */
    public String getMedianianling() {
        return medianianling;
    }

    /**
     * @param medianianling
     */
    public void setMedianianling(String medianianling) {
        this.medianianling = medianianling;
    }

    /**
     * @return isUpdating
     */
    public String getIsupdating() {
        return isupdating;
    }

    /**
     * @param isupdating
     */
    public void setIsupdating(String isupdating) {
        this.isupdating = isupdating;
    }

    /**
     * @return contFormType
     */
    public String getContformtype() {
        return contformtype;
    }

    /**
     * @param contformtype
     */
    public void setContformtype(String contformtype) {
        this.contformtype = contformtype;
    }

    /**
     * @return mediaGkhd
     */
    public String getMediagkhd() {
        return mediagkhd;
    }

    /**
     * @param mediagkhd
     */
    public void setMediagkhd(String mediagkhd) {
        this.mediagkhd = mediagkhd;
    }

    /**
     * @return mediaReportArea
     */
    public String getMediareportarea() {
        return mediareportarea;
    }

    /**
     * @param mediareportarea
     */
    public void setMediareportarea(String mediareportarea) {
        this.mediareportarea = mediareportarea;
    }

    /**
     * @return contDuration
     */
    public Integer getContduration() {
        return contduration;
    }

    /**
     * @param contduration
     */
    public void setContduration(Integer contduration) {
        this.contduration = contduration;
    }

    /**
     * @return contMediaLevel
     */
    public String getContmedialevel() {
        return contmedialevel;
    }

    /**
     * @param contmedialevel
     */
    public void setContmedialevel(String contmedialevel) {
        this.contmedialevel = contmedialevel;
    }

    /**
     * @return keywordsCopy
     */
    public String getKeywordscopy() {
        return keywordscopy;
    }

    /**
     * @param keywordscopy
     */
    public void setKeywordscopy(String keywordscopy) {
        this.keywordscopy = keywordscopy;
    }

    /**
     * @return recomCopy
     */
    public String getRecomcopy() {
        return recomcopy;
    }

    /**
     * @param recomcopy
     */
    public void setRecomcopy(String recomcopy) {
        this.recomcopy = recomcopy;
    }

    /**
     * @return nameCopy
     */
    public String getNamecopy() {
        return namecopy;
    }

    /**
     * @param namecopy
     */
    public void setNamecopy(String namecopy) {
        this.namecopy = namecopy;
    }

    /**
     * @return detailCopy
     */
    public String getDetailcopy() {
        return detailcopy;
    }

    /**
     * @param detailcopy
     */
    public void setDetailcopy(String detailcopy) {
        this.detailcopy = detailcopy;
    }

    /**
     * @return mediaMiaoshud
     */
    public String getMediamiaoshud() {
        return mediamiaoshud;
    }

    /**
     * @param mediamiaoshud
     */
    public void setMediamiaoshud(String mediamiaoshud) {
        this.mediamiaoshud = mediamiaoshud;
    }

    /**
     * @return copyrightTerminal
     */
    public String getCopyrightterminal() {
        return copyrightterminal;
    }

    /**
     * @param copyrightterminal
     */
    public void setCopyrightterminal(String copyrightterminal) {
        this.copyrightterminal = copyrightterminal;
    }

    /**
     * @return mediaMovieFormNot
     */
    public String getMediamovieformnot() {
        return mediamovieformnot;
    }

    /**
     * @param mediamovieformnot
     */
    public void setMediamovieformnot(String mediamovieformnot) {
        this.mediamovieformnot = mediamovieformnot;
    }

    /**
     * @return mediaLaiYuan
     */
    public String getMedialaiyuan() {
        return medialaiyuan;
    }

    /**
     * @param medialaiyuan
     */
    public void setMedialaiyuan(String medialaiyuan) {
        this.medialaiyuan = medialaiyuan;
    }

    /**
     * @return mediaActor
     */
    public String getMediaactor() {
        return mediaactor;
    }

    /**
     * @param mediaactor
     */
    public void setMediaactor(String mediaactor) {
        this.mediaactor = mediaactor;
    }

    /**
     * @return programId
     */
    public Integer getProgramid() {
        return programid;
    }

    /**
     * @param programid
     */
    public void setProgramid(Integer programid) {
        this.programid = programid;
    }

    /**
     * @return pyFirst
     */
    public String getPyfirst() {
        return pyfirst;
    }

    /**
     * @param pyfirst
     */
    public void setPyfirst(String pyfirst) {
        this.pyfirst = pyfirst;
    }

    /**
     * @return salesCategory
     */
    public String getSalescategory() {
        return salescategory;
    }

    /**
     * @param salescategory
     */
    public void setSalescategory(String salescategory) {
        this.salescategory = salescategory;
    }

    /**
     * @return salesStartTime
     */
    public Date getSalesstarttime() {
        return salesstarttime;
    }

    /**
     * @param salesstarttime
     */
    public void setSalesstarttime(Date salesstarttime) {
        this.salesstarttime = salesstarttime;
    }

    /**
     * @return salesEndTime
     */
    public Date getSalesendtime() {
        return salesendtime;
    }

    /**
     * @param salesendtime
     */
    public void setSalesendtime(Date salesendtime) {
        this.salesendtime = salesendtime;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return publishTime
     */
    public Date getPublishtime() {
        return publishtime;
    }

    /**
     * @param publishtime
     */
    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    /**
     * @return contName
     */
    public String getContname() {
        return contname;
    }

    /**
     * @param contname
     */
    public void setContname(String contname) {
        this.contname = contname;
    }

    /**
     * @return contDetail
     */
    public String getContdetail() {
        return contdetail;
    }

    /**
     * @param contdetail
     */
    public void setContdetail(String contdetail) {
        this.contdetail = contdetail;
    }

    /**
     * @return shortName
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * @param shortname
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    /**
     * @return doubanScore
     */
    public String getDoubanscore() {
        return doubanscore;
    }

    /**
     * @param doubanscore
     */
    public void setDoubanscore(String doubanscore) {
        this.doubanscore = doubanscore;
    }
}