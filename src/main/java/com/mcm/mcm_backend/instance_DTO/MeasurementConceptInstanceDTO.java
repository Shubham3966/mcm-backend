package com.mcm.mcm_backend.instance_DTO;


import lombok.Data;
import java.util.List;

@Data
public class MeasurementConceptInstanceDTO {
    private String measurementModel_id;
    private String description;
    private String division_code;
    private String leadingGrid_code;
    private String orderer_code;
    private List<AddressDTO> addresses;
    private List<ChangeProcessDTO> changeProcesses;
}
