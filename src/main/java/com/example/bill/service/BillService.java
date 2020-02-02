package com.example.bill.service;

import com.example.bill.entities.Bill;
import com.example.bill.entities.BillProvider;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BillService {
    List<BillProvider> getBills(Bill bill);

    BillProvider getBillByBid(Integer bid);

    int addBill(Bill bill);

    int deleteBillByBid(Integer bid);

    int updateBill(Bill bill);
}
