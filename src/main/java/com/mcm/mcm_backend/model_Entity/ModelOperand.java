package com.mcm.mcm_backend.model_Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModelOperand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String operandType;
    private String value;
    private String description;

    @ManyToOne
    @JoinColumn(name = "mcm_id")
    private MeasurementConceptModel mcm;
}