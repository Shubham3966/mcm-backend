package com.mcm.mcm_backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mcm.mcm_backend.model_Entity.MarketLocation;

public interface MarketLocationRepository extends JpaRepository<MarketLocation, Long> {
}
