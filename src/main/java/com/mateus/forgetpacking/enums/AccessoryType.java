package com.mateus.forgetpacking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AccessoryType {
    
    CELLPHONE("cellphone"),
    DEODORANT("deodorant"),
    DOCUMENT("document"),
    HEADPHONES("headphones"),
    KEYS("keys"),
    PHONE_CHARGER("phone charger"),
    PHONE("phone"),
    TOOTHBRUSH("toothbrush"),
    TOOTHPASTE("toothpaste");
    

    private String value;
}
