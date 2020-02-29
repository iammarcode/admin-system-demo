package com.example.bill.controller;

import com.example.bill.entities.Bill;
import com.example.bill.entities.BillMedia;
import com.example.bill.entities.Media;
import com.example.bill.mapper.BillMapper;
import com.example.bill.mapper.MediaMapper;
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
    MediaMapper mediaMapper;

    @Autowired
    BillMapper billMapper;

    @GetMapping("/bills")
    public String list(Map<String, Object> map, Bill bill) {

        List<BillMedia> billMedias = billMapper.getBills(bill);

        List<Media> medias = mediaMapper.getMedias(null);

        map.put("billMedias", billMedias);
        map.put("medias", medias);

        map.put("vid", bill.getVid());
        map.put("paid", bill.getPaid());

        return "bill/list";
    }


    @GetMapping("/bill/{bid}")
    public String view(@PathVariable("bid") Integer bid,
                       @RequestParam(value = "type", defaultValue = "view") String type,
                       Map<String, Object> map) {

        BillMedia billMedia = billMapper.getBillByBid(bid);

        if ("update".equals(type)) {
            List<Media> medias = mediaMapper.getMedias(null);
            map.put("medias",medias);
        }

        map.put("billMedia", billMedia);

        return "bill/" + type;
    }

    @PutMapping("/bill")
    public String update(Bill bill) {

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

        List<Media> medias = mediaMapper.getMedias(null);
        map.put("medias", medias);

        return "bill/add";
    }

    @PostMapping("/bill")
    public String add(Bill bill) {

        billMapper.addBill(bill);

        return "redirect:bills";
    }



}
