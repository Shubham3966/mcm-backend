package com.mcm.mcm_backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcm.mcm_backend.model_Entity.MeasurementConceptModel;

@Repository
public interface MeasurementConceptModelRepository extends JpaRepository<MeasurementConceptModel, Long> {
}
