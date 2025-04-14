package com.mcm.mcm_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mcm.mcm_backend.model_Entity.MeasurementConceptModel;
import com.mcm.mcm_backend.service.MeasurementConceptModelService;

import java.util.List;

@RestController
@RequestMapping("/api/models")
public class MeasurementConceptModelController {

    @Autowired
    private MeasurementConceptModelService modelService;

    @PostMapping
    public ResponseEntity<MeasurementConceptModel> createModel(@RequestBody MeasurementConceptModel model) {
        return ResponseEntity.ok(modelService.createMeasurementConceptModel(model));
    }

    @GetMapping
    public ResponseEntity<List<MeasurementConceptModel>> getAllModels() {
        return ResponseEntity.ok(modelService.getAllMeasurementConceptModels());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MeasurementConceptModel> getModelById(@PathVariable Long id) {
        MeasurementConceptModel model = modelService.getMeasurementConceptModelById(id);

        if (model == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(model);

    }

    @PutMapping("/{id}")
    public ResponseEntity<MeasurementConceptModel> updateModel(@PathVariable Long id,
            @RequestBody MeasurementConceptModel model) {
        return ResponseEntity.ok(modelService.updateMeasurementConceptModel(id, model));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModel(@PathVariable Long id) {
        modelService.deleteMeasurementConceptModel(id);
        return ResponseEntity.noContent().build();
    }
}