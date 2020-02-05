package com.example.bill.mapper;


import com.example.bill.entities.Vendor;

import java.util.List;

public interface VendorMapper {

    List<Vendor> getVendors(Vendor vendor);

    Vendor getVendorByPid(Integer vid);

    int addVendor(Vendor vendor);

    int deleteVendorByPid(Integer vid);

    int updateVendor(Vendor vendor);
}
