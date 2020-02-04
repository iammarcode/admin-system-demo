package com.example.bill.controller;

import com.example.bill.entities.Bill;
import com.example.bill.entities.BillVendor;
import com.example.bill.entities.Vendor;
import com.example.bill.mapper.BillMapper;
import com.example.bill.mapper.VendorMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class BillController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    VendorMapper vendorMapper;

    @Autowired
    BillMapper billMapper;

    @GetMapping("/bills")
    public String list(Map<String, Object> map, Bill bill) {

        List<BillVendor> billVendors = billMapper.getBills(bill);

        List<Vendor> vendors = vendorMapper.getVendors(null);

        map.put("billVendors", billVendors);
        map.put("vendors", vendors);

        map.put("vid", bill.getVid());
        map.put("paid", bill.getPaid());

        return "bill/list";
    }


    @GetMapping("/bill/{bid}")
    public String view(@PathVariable("bid") Integer bid,
                       @RequestParam(value = "type", defaultValue = "view") String type,
                       Map<String, Object> map) {

        BillVendor billVendor = billMapper.getBillByBid(bid);

        if ("update".equals(type)) {
            List<Vendor> vendors = vendorMapper.getVendors(null);
            map.put("vendors",vendors);
        }

        map.put("billVendor", billVendor);

        return "bill/" + type;
    }

    @PutMapping("/bill")
    public String update(Bill bill) {

        System.out.println("update--------");

        billMapper.updateBill(bill);


        return "redirect:bills";
    }



    @DeleteMapping("/bill/{bid}")
    public String delete(@PathVariable("bid") Integer bid) {
        billMapper.deleteBillByBid(bid);
        return "redirect:/bills";
    }

    @GetMapping("/bill")
    public String toAddPage(Map<String, Object> map) {

        List<Vendor> vendors = vendorMapper.getVendors(null);
        map.put("vendors", vendors);

        return "bill/add";
    }

    @PostMapping("/bill")
    public String add(Bill bill) {

        System.out.println("add--------");

        billMapper.addBill(bill);



        return "redirect:bills";
    }



}
