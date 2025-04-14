package com.mcm.mcm_backend.model_Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MeteringLocationPurpose {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String purpose;
    private String meterType;

    @ManyToOne
    @JoinColumn(name = "mcm_id")
    private MeasurementConceptModel mcm;
}