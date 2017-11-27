package com.migu.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("label")
public class Label {
    private String LabelID;
    private String LabelName;

    public String getLabelID() {
        return LabelID;
    }

    public void setLabelID(String labelID) {
        LabelID = labelID;
    }

    public String getLabelName() {
        return LabelName;
    }

    public void setLabelName(String labelName) {
        LabelName = labelName;
    }
}
