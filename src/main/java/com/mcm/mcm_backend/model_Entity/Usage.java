package com.mcm.mcm_backend.model_Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usageType;
    private String usageDescription;

    @ManyToOne
    @JoinColumn(name = "mcm_id")
    private MeasurementConceptModel mcm;
}
