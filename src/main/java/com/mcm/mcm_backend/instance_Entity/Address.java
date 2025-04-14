package com.mcm.mcm_backend.instance_Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String country_code;
    private String cityID;
    private String cityName;
    private String postalCode;
    private String streetID;
    private String streetName;
    private String houseNumber;
    private String floorNumber;
    private String supplement;
    private double latitude;
    private double longitude;
    private String timeZone;

    @ManyToOne
    @JoinColumn(name = "instance_id")
    private MeasurementConceptInstance instance;
}
