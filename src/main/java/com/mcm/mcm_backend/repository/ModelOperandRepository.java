package com.mcm.mcm_backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mcm.mcm_backend.model_Entity.ModelOperand;

public interface ModelOperandRepository extends JpaRepository<ModelOperand, Long> {
}