package com.betrybe.agrix.service;

import com.betrybe.agrix.dtos.FarmRequestDTO;
import com.betrybe.agrix.dtos.FarmResponseDTO;
import com.betrybe.agrix.models.entities.Farms;
import com.betrybe.agrix.models.repositories.FamsRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service farm
 */
@Service
public class FarmsService {

  private final FamsRepositorie famsRepositorie;

  @Autowired
  public FarmsService(FamsRepositorie famsRepositorie) {
    this.famsRepositorie = famsRepositorie;
  }

  public Farms createFarm(Farms farm){
    return famsRepositorie.save(farm);
  }

}
