package com.betrybe.agrix.service;

import com.betrybe.agrix.models.entities.Crops;
import com.betrybe.agrix.models.repositories.CropsRepositorie;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service Crops.
 */
@Service
public class CropsService {
  @Autowired
  private CropsRepositorie cropsRepositorie;
  public List<Crops> findAllCrops() {
    return cropsRepositorie.findAll();
  }
}
