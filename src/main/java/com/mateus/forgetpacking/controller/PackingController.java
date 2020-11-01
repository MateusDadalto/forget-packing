package com.mateus.forgetpacking.controller;

import java.util.List;

import com.mateus.forgetpacking.model.TravelItem;
import com.mateus.forgetpacking.service.PackingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackingController {

    private final PackingService packingService;

    @Autowired
    public PackingController(PackingService service) {
        this.packingService = service;
    }

    @GetMapping("/v1/pack/{days}")
    public List<? extends TravelItem> getPackingInfo(@PathVariable int days) {
        return packingService.calculateItems(days);
    }
    
}
