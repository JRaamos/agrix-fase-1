package com.betrybe.agrix.service;

import com.betrybe.agrix.exeptions.FarmsException;
import com.betrybe.agrix.models.entities.Farms;
import com.betrybe.agrix.models.repositories.FamsRepositorie;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service farm.
 */
@Service
public class FarmsService {

  private final FamsRepositorie famsRepositorie;

  @Autowired
  public FarmsService(FamsRepositorie famsRepositorie) {
    this.famsRepositorie = famsRepositorie;
  }

  public Farms createFarm(Farms farm) {
    return famsRepositorie.save(farm);
  }

  public List<Farms> findAllFarms() {
    return famsRepositorie.findAll();
  }

  /**
   * Metodo para buscar por id.
   */
  public Farms findByFarmId(Long id) {
    Optional<Farms> searchedFarmById = famsRepositorie.findById(id);
    if (searchedFarmById.isPresent()) {
      return searchedFarmById.get();
    }
    throw new FarmsException();
  }
}
