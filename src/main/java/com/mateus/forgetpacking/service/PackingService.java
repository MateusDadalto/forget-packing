package com.mateus.forgetpacking.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mateus.forgetpacking.enums.ClotheType;
import com.mateus.forgetpacking.model.Accessory;
import com.mateus.forgetpacking.model.Clothe;
import com.mateus.forgetpacking.model.TravelItem;

import org.springframework.stereotype.Service;

@Service
public class PackingService {

    public List<? extends TravelItem> calculateItems(int days) {
        return Stream.concat(calculateClothes(days).stream(), calculateAccessories(days).stream())
                .collect(Collectors.toList());
    }

    private List<? extends TravelItem> calculateClothes(int days) {
        Clothe underwear, shirts, pants, socks;

        underwear = Clothe.builder().type(ClotheType.UNDERWEAR).quantity(days + 1).build();
        shirts = Clothe.builder().type(ClotheType.SHIRT).quantity(days + 1).build();
        pants = Clothe.builder().type(ClotheType.PANTS).quantity(days).build();

        if (days <= 5) {
            socks = Clothe.builder().type(ClotheType.SOCKS).quantity(days).build();
        } else {
            socks = Clothe.builder().type(ClotheType.SOCKS).quantity(5).build();
        }

        return Arrays.asList(underwear, shirts, pants, socks);
    }

    private List<? extends TravelItem> calculateAccessories(int days) {
        return Accessory.getAllAccessories();
    }
}
