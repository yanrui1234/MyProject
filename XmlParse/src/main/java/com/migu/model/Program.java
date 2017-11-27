package com.migu.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("program")
public class Program {
    private String programSequence;
    private String contentSequence;
    private String DirectRecFlag;

    public String getProgramSequence() {
        return programSequence;
    }

    public void setProgramSequence(String programSequence) {
        this.programSequence = programSequence;
    }

    public String getContentSequence() {
        return contentSequence;
    }

    public void setContentSequence(String contentSequence) {
        this.contentSequence = contentSequence;
    }

    public String getDirectRecFlag() {
        return DirectRecFlag;
    }

    public void setDirectRecFlag(String directRecFlag) {
        DirectRecFlag = directRecFlag;
    }
}
