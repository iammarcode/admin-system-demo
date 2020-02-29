package com.example.bill.mapper;


import com.example.bill.entities.Bill;
import com.example.bill.entities.BillMedia;

import java.util.List;

public interface BillMapper {

    List<BillMedia> getBills(Bill bill);

    BillMedia getBillByBid(Integer bid);

    int addBill(Bill bill);

    int deleteBillByBid(Integer bid);

    int updateBill(Bill bill);
}


