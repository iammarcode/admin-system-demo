package com.example.bill.mapper;


import com.example.bill.entities.Bill;
import com.example.bill.entities.BillVendor;

import java.util.List;

public interface BillMapper {

    List<BillVendor> getBills(Bill bill);

    BillVendor getBillByBid(Integer bid);

    int addBill(Bill bill);

    int deleteBillByBid(Integer bid);

    int updateBill(Bill bill);
}


