package com.betrybe.agrix.models.repositories;

import com.betrybe.agrix.models.entities.Crops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropsRepositorie extends JpaRepository<Crops, Long > {
}
