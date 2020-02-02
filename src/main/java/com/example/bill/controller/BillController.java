package com.example.bill.controller;

import com.example.bill.entities.Bill;
import com.example.bill.entities.BillProvider;
import com.example.bill.entities.Provider;
import com.example.bill.mapper.BillMapper;
import com.example.bill.mapper.ProviderMapper;
import com.example.bill.service.impl.BillServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

@Controller
public class BillController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ProviderMapper providerMapper;

//    @Autowired
//    BillServiceImpl billService;

    @Autowired
    BillMapper billMapper;

    @GetMapping("/bills")
    public String list(Map<String, Object> map, Bill bill) {

        List<BillProvider> billProviders = billMapper.getBills(bill);

        List<Provider> providers = providerMapper.getProviders(null);

        map.put("billProviders", billProviders);
        map.put("providers", providers);

        map.put("billName", bill.getBillName());
        map.put("pid", bill.getPid());
        map.put("pay", bill.getPay());

        return "bill/list";
    }


    @GetMapping("/bill/{bid}")
    public String view(@PathVariable("bid") Integer bid,
                       @RequestParam(value = "type", defaultValue = "view") String type,
                       Map<String, Object> map) {

        BillProvider billProvider = billMapper.getBillByBid(bid);

        logger.info("billProvider:" + billProvider);

        if ("update".equals(type)) {
            List<Provider> providers = providerMapper.getProviders(null);
            map.put("providers",providers);
        }

        map.put("billProvider", billProvider);

        return "bill/" + type;
    }

    @PutMapping("/bill")
    public String update(Bill bill) {

        logger.info("bill:__" + bill);


        billMapper.updateBill(bill);

        return "redirect:bills";
    }



    @DeleteMapping("/bill/{bid}")
    public String delete(@PathVariable("bid") Integer bid) {
        logger.info("删除操作, bid=" + bid);
        billMapper.deleteBillByBid(bid);
        return "redirect:/bills";
    }

    @GetMapping("/bill")
    public String toAddPage(Map<String, Object> map) {

        List<Provider> providers = providerMapper.getProviders(null);
        map.put("providers", providers);

        return "bill/add";
    }

    @PostMapping("/bill")
    public String add(Bill bill) {

//        billService.addBill(bill);

        billMapper.addBill(bill);

        return "redirect:bills";
    }



}
