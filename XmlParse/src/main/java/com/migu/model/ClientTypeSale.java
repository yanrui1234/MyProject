package com.migu.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("clientTypeSale")
public class ClientTypeSale {
    private String clienttype;


    public String getClienttype() {
        return clienttype;
    }

    public void setClienttype(String clienttype) {
        this.clienttype = clienttype;
    }
}
