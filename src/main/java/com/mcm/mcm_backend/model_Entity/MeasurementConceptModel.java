package com.mcm.mcm_backend.model_Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MeasurementConceptModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelName;
    private String version;
    private String description;
    private String status;


    @OneToMany(mappedBy = "mcm", cascade = CascadeType.ALL)
    private List<ModelOperand> modelOperands;

    @OneToMany(mappedBy = "mcm", cascade = CascadeType.ALL)
    private List<MarketLocation> marketLocations;

    @OneToMany(mappedBy = "mcm", cascade = CascadeType.ALL)
    private List<ActorsMapping> actorsMapping;

    @OneToMany(mappedBy = "mcm", cascade = CascadeType.ALL)
    private List<CalculationRule> calculationRules;

    @OneToMany(mappedBy = "mcm", cascade = CascadeType.ALL)
    private List<Usage> usages;

    @OneToMany(mappedBy = "mcm", cascade = CascadeType.ALL)
    private List<MeteringLocationPurpose> meteringLocationPurposes;

    public Object map(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'map'");
    }


}
