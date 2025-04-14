package com.mcm.mcm_backend.instance_Entity;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProcessData {
    private String customerRequestDate;
    private String leadingConnectionOwner;
    private String leadingConnectionUser;
    private String note;
}
