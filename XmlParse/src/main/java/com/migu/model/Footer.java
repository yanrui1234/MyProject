package com.migu.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("footer")
public class Footer {
    private String footerVal;
    private String startTime;
    private String endTime;

    public String getFooterVal() {
        return footerVal;
    }

    public void setFooterVal(String footerVal) {
        this.footerVal = footerVal;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
