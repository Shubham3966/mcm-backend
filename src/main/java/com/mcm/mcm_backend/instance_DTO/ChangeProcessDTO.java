package com.mcm.mcm_backend.instance_DTO;

import lombok.Data;
import java.util.List;

@Data
public class ChangeProcessDTO {
    private String externalOrderId;
    private ProcessDataDTO processData;
    private List<InstanceCharacteristicDTO> instanceCharacteristics;
}
