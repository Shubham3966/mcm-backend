package com.mcm.mcm_backend.service;

import java.util.List;

import com.mcm.mcm_backend.model_Entity.MeasurementConceptModel;

public interface MeasurementConceptModelService {
    MeasurementConceptModel createMeasurementConceptModel(MeasurementConceptModel model);
    List<MeasurementConceptModel> getAllMeasurementConceptModels();
    MeasurementConceptModel getMeasurementConceptModelById(Long id);
    MeasurementConceptModel updateMeasurementConceptModel(Long id, MeasurementConceptModel model);
    void deleteMeasurementConceptModel(Long id);
}