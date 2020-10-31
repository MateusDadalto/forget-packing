package com.mateus.forgetpacking.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ClotheType {
    
    BATHING_SUIT("bathing suit"),
    BERMUDA("bermuda"),
    COAT("coat"),
    JACKET("jacket"),
    PANTS("pants"),
    RAINCOAT("raincoat"),
    SHIRT("shirt"),
    SHORTS("shorts"),
    SOCKS("socks"),
    TSHIRT("tshirt"),
    UNDERWEAR("underwear");

    private String value;
}
