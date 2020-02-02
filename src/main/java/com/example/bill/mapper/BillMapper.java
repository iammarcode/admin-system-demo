package com.example.bill.mapper;


import com.example.bill.entities.Bill;
import com.example.bill.entities.BillProvider;

import java.util.List;

public interface BillMapper {

    List<BillProvider> getBills(Bill bill);

    BillProvider getBillByBid(Integer bid);

    int addBill(Bill bill);

    int deleteBillByBid(Integer bid);

    int updateBill(Bill bill);
}


