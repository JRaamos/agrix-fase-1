package com.betrybe.agrix.util;

import com.betrybe.agrix.dtos.FarmRequestDTO;
import com.betrybe.agrix.dtos.FarmResponseDTO;
import com.betrybe.agrix.models.entities.Farms;

/**
 * Clase util para farm.
 */
public class FarmsUtil {

  public static FarmResponseDTO farmResponseconvert(Farms farm) {
    return new FarmResponseDTO(
        farm.getId(),
        farm.getName(),
        farm.getSize()
    );
  }
  public  static Farms farmsDtoCreateConvert(FarmRequestDTO farmRequestDTO) {
    Farms farm = new Farms();

        farm.setName(farmRequestDTO.name());
        farm.setSize(farmRequestDTO.size());
    return farm;
  }


}
