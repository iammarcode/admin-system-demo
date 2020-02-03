package com.example.bill.entities;

import java.io.Serializable;
import java.util.Date;

public class Vendor implements Serializable {
    private Integer vid;
    private String vendorName;
    private String people;
    private String telephone;
    private String address;
    private String fax;
    private String describe;
    private Date createdDate;

    public Vendor() {
    }

    public Vendor(Integer vid, String vendorCode, String vendorName, String people, String telephone, String address, String fax, String describe) {
        this.vid = vid;
        this.vendorName = vendorName;
        this.people = people;
        this.telephone = telephone;
        this.address = address;
        this.fax = fax;
        this.describe = describe;
        this.createdDate = new Date();
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vid=" + vid +
                ", vendorName='" + vendorName + '\'' +
                ", people='" + people + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", fax='" + fax + '\'' +
                ", describe='" + describe + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
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
}
