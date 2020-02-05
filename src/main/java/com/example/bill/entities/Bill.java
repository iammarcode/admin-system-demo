package com.example.bill.entities;

import java.util.Date;


public class Bill {

    private Integer bid;
    private Double total;
    private Integer paid;
    private Date createdDate;
    private Integer vid;

    public Bill() {
    }

    public Bill(Integer bid, Double total, Integer paid, Date createdDate, Integer vid) {
        this.bid = bid;
        this.total = total;
        this.paid = paid;
        this.createdDate = createdDate;
        this.vid = vid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }
}
