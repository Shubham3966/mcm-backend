package com.mcm.mcm_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcm.mcm_backend.model_Entity.MeasurementConceptModel;
import com.mcm.mcm_backend.repository.MeasurementConceptModelRepository;

@Service
public class MeasurementConceptModelServiceImpl implements MeasurementConceptModelService {

    @Autowired
    private MeasurementConceptModelRepository modelRepository;

    @Override
    public MeasurementConceptModel createMeasurementConceptModel(MeasurementConceptModel model) {
        return modelRepository.save(model);
    }

    @Override
    public List<MeasurementConceptModel> getAllMeasurementConceptModels() {
        return modelRepository.findAll();
    }

    @Override
    public MeasurementConceptModel getMeasurementConceptModelById(Long id) {
        return modelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("MeasurementConceptModel not found with id: " + id));
    }

    @Override
    public MeasurementConceptModel updateMeasurementConceptModel(Long id, MeasurementConceptModel updatedModel) {
        MeasurementConceptModel existing = getMeasurementConceptModelById(id);
        existing.setModelName(updatedModel.getModelName());
        existing.setDescription(updatedModel.getDescription());
        existing.setStatus(updatedModel.getStatus());
        // Add more updates if needed

        return modelRepository.save(existing);
    }

    @Override
    public void deleteMeasurementConceptModel(Long id) {
        modelRepository.deleteById(id);
    }
}
