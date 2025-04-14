package com.mcm.mcm_backend.instance_DTO;

import lombok.Data;

@Data
public class AddressDTO {
    private String country_code;
    private String cityID;
    private String cityName;
    private String postalCode;
    private String streetID;
    private String streetName;
    private String houseNumber;
    private String floorNumber;
    private String supplement;
    private Double latitude;
    private Double longitude;
    private String timeZone;
}
