package com.example.bill.controller;

import com.example.bill.entities.Vendor;
import com.example.bill.mapper.VendorMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class VendorController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    VendorMapper vendorMapper;

    @GetMapping("/vendors")
    public String list(Vendor vendor, Map<String, Object> map) {

        List<Vendor> vendors = vendorMapper.getVendors(vendor);

        map.put("vendors", vendors);

        return "vendor/list";
    }

    @GetMapping("/vendor/{vid}")
    public String view(@PathVariable("vid") Integer vid,
                       @RequestParam(value = "type", defaultValue = "view") String type,
                       Map<String, Object> map) {


        Vendor vendor = vendorMapper.getVendorByPid(vid);

        map.put("vendor", vendor);

        return "vendor/" + type;
    }

    @PostMapping("/vendor")
    public String add(Vendor vendor) {

        vendorMapper.addVendor(vendor);

        return "redirect:/vendors";
    }

    @GetMapping("/vendor")
    public String toAddPage() {
        return "vendor/add";
    }

    @DeleteMapping("/vendor/{vid}" )
    public String delete(@PathVariable("vid") Integer vid) {

        logger.info("_del_vendorById_:" + vid);

        vendorMapper.deleteVendorByPid(vid);

        return "redirect:/vendors";
    }

    @PutMapping("/vendor")
    public String update(Vendor vendor) {

        logger.info("_update_vendor_:" + vendor);

        vendorMapper.updateVendor(vendor);

        return "redirect:vendors";
    }
}
