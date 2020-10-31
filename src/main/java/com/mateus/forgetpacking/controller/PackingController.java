package com.mateus.forgetpacking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackingController {

    @RequestMapping("/v1/pack")
    public String getPackingInfo() {
        return "packing info";
    }
    
}
