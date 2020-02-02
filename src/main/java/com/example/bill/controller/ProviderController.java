package com.example.bill.controller;

import com.example.bill.entities.Provider;
import com.example.bill.mapper.ProviderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class ProviderController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ProviderMapper providerMapper;

    @GetMapping("/providers")
    public String list(Provider provider, Map<String, Object> map) {

        List<Provider> providers = providerMapper.getProviders(provider);

        map.put("providers", providers);

        return "provider/list";
    }

    @GetMapping("/provider/{pid}")
    public String view(@PathVariable("pid") Integer pid,
                       @RequestParam(value = "type", defaultValue = "view") String type,
                       Map<String, Object> map) {


        Provider provider = providerMapper.getProviderByPid(pid);

        logger.info("_test_providerById_:" + provider);

        map.put("provider", provider);

        return "provider/" + type;
    }

    @PostMapping("/provider")
    public String add(Provider provider) {
        logger.info("_add_provider_:" + provider);

        providerMapper.addProvider(provider);

        return "redirect:/providers";
    }

    @GetMapping("/provider")
    public String toAddPage() {
        return "provider/add";
    }

    @DeleteMapping("/provider/{pid}" )
    public String delete(@PathVariable("pid") Integer pid) {

        logger.info("_del_providerById_:" + pid);

        providerMapper.deleteProviderByPid(pid);

        return "redirect:/providers";
    }

    @PutMapping("/provider")
    public String update(Provider provider) {

        logger.info("_update_provider_:" + provider);

        providerMapper.updateProvider(provider);

        return "redirect:providers";
    }
}
