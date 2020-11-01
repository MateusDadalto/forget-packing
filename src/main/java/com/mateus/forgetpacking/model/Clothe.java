package com.mateus.forgetpacking.model;

import com.mateus.forgetpacking.enums.ClotheType;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class Clothe extends TravelItem{
    
    private ClotheType type;
    private int quantity;
}
