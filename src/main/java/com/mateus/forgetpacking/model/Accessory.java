package com.mateus.forgetpacking.model;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

import com.mateus.forgetpacking.enums.AccessoryType;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class Accessory extends TravelItem {

    private AccessoryType accessoryType;

    public static List<Accessory> getAllAccessories() {
        EnumSet<AccessoryType> accessoryTypes = EnumSet.allOf(AccessoryType.class);
        List<Accessory> accessories = accessoryTypes.stream()
                .map(accessoryType -> Accessory.builder().accessoryType(accessoryType).build())
                .collect(Collectors.toList());

        return accessories;
    }
}
