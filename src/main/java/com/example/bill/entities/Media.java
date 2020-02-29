package com.example.bill.entities;

import java.io.Serializable;
import java.util.Date;

public class Media implements Serializable {
    private Integer vid;
    private String mediaName;
    private String telephone;
    private String address;
    private String fax;
    private String describe;
    private Date createdDate;

    public Media(Integer vid, String mediaName, String telephone, String address, String fax, String describe, Date createdDate) {
        this.vid = vid;
        this.mediaName = mediaName;
        this.telephone = telephone;
        this.address = address;
        this.fax = fax;
        this.describe = describe;
        this.createdDate = createdDate;
    }

    public Media() {
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Media{" +
                "vid=" + vid +
                ", mediaName='" + mediaName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", fax='" + fax + '\'' +
                ", describe='" + describe + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
