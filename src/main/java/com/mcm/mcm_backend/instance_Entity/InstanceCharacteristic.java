package com.mcm.mcm_backend.instance_Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InstanceCharacteristic {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String entityType_code;
    private String characteristic_code;
    private String modelEntityId;
    private String value;
    private String predecessorRepetitionIndex;

    @ManyToOne
    @JoinColumn(name = "change_process_id")
    private ChangeProcess changeProcess;
}
