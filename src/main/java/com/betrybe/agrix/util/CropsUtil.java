package com.betrybe.agrix.util;

import com.betrybe.agrix.dtos.CropRequest;
import com.betrybe.agrix.dtos.CropsResponse;
import com.betrybe.agrix.dtos.FarmResponse;
import com.betrybe.agrix.models.entities.Crops;
import com.betrybe.agrix.models.entities.Farms;


/**
 *  CLasse ultil para Crops.
 */
public class CropsUtil {

  /**
   *  Metodo para DTO convert.
   */
  public static Crops cropsDtoCreateConvert(CropRequest cropRequest) {
    Crops crop = new Crops();
    crop.setName(cropRequest.name());
    crop.setPlantedArea(cropRequest.plantedArea());
    return crop;
  }

  /**
   *  Metodo para DTO convert.
   */
  public static CropsResponse cropResponseconvert(Crops crops) {
    return new CropsResponse(
        crops.getId(),
        crops.getName(),
        crops.getPlantedArea(),
        crops.getFarm().getId()
    );
  }
}
