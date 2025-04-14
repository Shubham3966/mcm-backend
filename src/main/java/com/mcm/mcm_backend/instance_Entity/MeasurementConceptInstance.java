package com.mcm.mcm_backend.instance_Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MeasurementConceptInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String measurementModel_id;
    private String description;
    private String division_code;
    private String leadingGrid_code;
    private String orderer_code;

    @OneToMany(mappedBy = "instance", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses;

    @OneToMany(mappedBy = "instance", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ChangeProcess> changeProcesses;
}
