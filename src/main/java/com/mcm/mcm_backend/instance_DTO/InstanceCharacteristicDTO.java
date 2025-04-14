package com.mcm.mcm_backend.instance_DTO;

import lombok.Data;

@Data
public class InstanceCharacteristicDTO {
    private String entityType_code;
    private String characteristic_code;
    private String modelEntityId;
    private String value;
    private String predecessorRepetitionIndex;
}
