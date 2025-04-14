package com.mcm.mcm_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcm.mcm_backend.model_Entity.Usage;

public interface UsageRepository extends JpaRepository<Usage, Long> {
}
