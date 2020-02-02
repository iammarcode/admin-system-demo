package com.example.bill.service.impl;

import com.example.bill.entities.Provider;
import com.example.bill.service.ProviderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public List<Provider> getProviders(Provider provider) {
        return null;
    }

    @Override
    public Provider getProviderByPid(Integer pid) {
        return null;
    }

    @Override
    public int addProvider(Provider provider) {
        return 0;
    }

    @Override
    public int deleteProviderByPid(Integer pid) {
        return 0;
    }

    @Override
    public int updateProvider(Provider provider) {
        return 0;
    }
}
