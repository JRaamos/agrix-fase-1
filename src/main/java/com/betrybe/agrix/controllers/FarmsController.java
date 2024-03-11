package com.betrybe.agrix.controllers;


import static com.betrybe.agrix.util.FarmsUtil.farmResponseconvert;
import static com.betrybe.agrix.util.FarmsUtil.farmsDtoCreateConvert;

import com.betrybe.agrix.dtos.FarmRequest;
import com.betrybe.agrix.dtos.FarmResponse;
import com.betrybe.agrix.models.entities.Farms;
import com.betrybe.agrix.service.FarmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller com respostar para o cliente.
 */
@RestController
@RequestMapping("/farms")
public class FarmsController {

  /**
   * FarmsService com motodos de serviço.
   */
  @Autowired
  private FarmsService farmsService;

  /**
   * Metodo para criação de um farm.
   */
  @PostMapping
  public ResponseEntity<FarmResponse> createFarm(@RequestBody FarmRequest farmRequest) {
    Farms farmsServiceFarm = farmsService.createFarm(farmsDtoCreateConvert(farmRequest));
    FarmResponse farmResponse = farmResponseconvert(farmsServiceFarm);
    return ResponseEntity.status(HttpStatus.CREATED).body(farmResponse);
  }

}
