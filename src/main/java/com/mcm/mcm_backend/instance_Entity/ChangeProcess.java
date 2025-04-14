package com.mcm.mcm_backend.instance_Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChangeProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String externalOrderId;

    @Embedded
    private ProcessData processData;

    @OneToMany(mappedBy = "changeProcess", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InstanceCharacteristic> instanceCharacteristics;

    @ManyToOne
    @JoinColumn(name = "instance_id")
    private MeasurementConceptInstance instance;
}
