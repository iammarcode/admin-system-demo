package com.example.bill.service.impl;

import com.example.bill.entities.Bill;
import com.example.bill.entities.BillProvider;
import com.example.bill.repository.BillRepository;
import com.example.bill.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    BillRepository billRepository;

    @Override
    public List<BillProvider> getBills(Bill bill) {
        return null;
    }

    @Override
    public BillProvider getBillByBid(Integer bid) {
        return null;
    }

    @Override
    public int addBill(Bill bill) {
        return 0;
    }

    @Override
    public int deleteBillByBid(Integer bid) {
        return 0;
    }

    @Override
    public int updateBill(Bill bill) {
        return 0;
    }
}
