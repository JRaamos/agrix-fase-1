package com.betrybe.agrix.models.repositories;

import com.betrybe.agrix.models.entities.Farms;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface Farms.
 */
public interface FamsRepositorie extends JpaRepository<Farms, Long> {
}
