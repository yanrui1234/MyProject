package com.migu.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("displayFile")
public class DisplayFile {
    private String dpFileID;
    private String dpFileName;
    private String dpFileDetail;
    private String dpFileType;
    private String dpUsageCode;
    private String dpUseType;
    private String dpAdapType;
    private String pixel;


    public String getDpFileID() {
        return dpFileID;
    }

    public void setDpFileID(String dpFileID) {
        this.dpFileID = dpFileID;
    }

    public String getDpFileName() {
        return dpFileName;
    }

    public void setDpFileName(String dpFileName) {
        this.dpFileName = dpFileName;
    }

    public String getDpFileDetail() {
        return dpFileDetail;
    }

    public void setDpFileDetail(String dpFileDetail) {
        this.dpFileDetail = dpFileDetail;
    }

    public String getDpFileType() {
        return dpFileType;
    }

    public void setDpFileType(String dpFileType) {
        this.dpFileType = dpFileType;
    }

    public String getDpUsageCode() {
        return dpUsageCode;
    }

    public void setDpUsageCode(String dpUsageCode) {
        this.dpUsageCode = dpUsageCode;
    }

    public String getDpUseType() {
        return dpUseType;
    }

    public void setDpUseType(String dpUseType) {
        this.dpUseType = dpUseType;
    }

    public String getDpAdapType() {
        return dpAdapType;
    }

    public void setDpAdapType(String dpAdapType) {
        this.dpAdapType = dpAdapType;
    }

    public String getPixel() {
        return pixel;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }
}
