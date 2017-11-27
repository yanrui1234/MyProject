package com.migu.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("mediafile")
public class MediaFile {

    private String mediaFileID;
    private String mediaFileName;
    private String sourceFileName;
    private String visitPath;
    private String mediaType;
    private String mediaSize;
    private String duration;
    private String mediaUsageCode;
    private String mediaCodeFormat;
    private String mediaContainFormat;
    private String mediaCodeRate;
    private String mediaNetType;
    private String mediaMimeType;
    private String mediaResolution;
    private String mediaProfile;
    private String mediaLevel;
    private String mediaFilePath;
    private String mediaFilePreviewPath;
    private String mediaFileAction;

    public String getMediaFileID() {
        return mediaFileID;
    }

    public void setMediaFileID(String mediaFileID) {
        this.mediaFileID = mediaFileID;
    }

    public String getMediaFileName() {
        return mediaFileName;
    }

    public void setMediaFileName(String mediaFileName) {
        this.mediaFileName = mediaFileName;
    }

    public String getSourceFileName() {
        return sourceFileName;
    }

    public void setSourceFileName(String sourceFileName) {
        this.sourceFileName = sourceFileName;
    }

    public String getVisitPath() {
        return visitPath;
    }

    public void setVisitPath(String visitPath) {
        this.visitPath = visitPath;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getMediaSize() {
        return mediaSize;
    }

    public void setMediaSize(String mediaSize) {
        this.mediaSize = mediaSize;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMediaUsageCode() {
        return mediaUsageCode;
    }

    public void setMediaUsageCode(String mediaUsageCode) {
        this.mediaUsageCode = mediaUsageCode;
    }

    public String getMediaCodeFormat() {
        return mediaCodeFormat;
    }

    public void setMediaCodeFormat(String mediaCodeFormat) {
        this.mediaCodeFormat = mediaCodeFormat;
    }

    public String getMediaContainFormat() {
        return mediaContainFormat;
    }

    public void setMediaContainFormat(String mediaContainFormat) {
        this.mediaContainFormat = mediaContainFormat;
    }

    public String getMediaCodeRate() {
        return mediaCodeRate;
    }

    public void setMediaCodeRate(String mediaCodeRate) {
        this.mediaCodeRate = mediaCodeRate;
    }

    public String getMediaNetType() {
        return mediaNetType;
    }

    public void setMediaNetType(String mediaNetType) {
        this.mediaNetType = mediaNetType;
    }

    public String getMediaMimeType() {
        return mediaMimeType;
    }

    public void setMediaMimeType(String mediaMimeType) {
        this.mediaMimeType = mediaMimeType;
    }

    public String getMediaResolution() {
        return mediaResolution;
    }

    public void setMediaResolution(String mediaResolution) {
        this.mediaResolution = mediaResolution;
    }

    public String getMediaProfile() {
        return mediaProfile;
    }

    public void setMediaProfile(String mediaProfile) {
        this.mediaProfile = mediaProfile;
    }

    public String getMediaLevel() {
        return mediaLevel;
    }

    public void setMediaLevel(String mediaLevel) {
        this.mediaLevel = mediaLevel;
    }

    public String getMediaFilePath() {
        return mediaFilePath;
    }

    public void setMediaFilePath(String mediaFilePath) {
        this.mediaFilePath = mediaFilePath;
    }

    public String getMediaFilePreviewPath() {
        return mediaFilePreviewPath;
    }

    public void setMediaFilePreviewPath(String mediaFilePreviewPath) {
        this.mediaFilePreviewPath = mediaFilePreviewPath;
    }

    public String getMediaFileAction() {
        return mediaFileAction;
    }

    public void setMediaFileAction(String mediaFileAction) {
        this.mediaFileAction = mediaFileAction;
    }
}
