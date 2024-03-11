package com.betrybe.agrix.controllers;


import static com.betrybe.agrix.util.FarmsUtil.farmResponseconvert;
import static com.betrybe.agrix.util.FarmsUtil.farmsDtoCreateConvert;

import com.betrybe.agrix.dtos.FarmRequestDTO;
import com.betrybe.agrix.dtos.FarmResponseDTO;
import com.betrybe.agrix.models.entities.Farms;
import com.betrybe.agrix.service.FarmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/farms")
public class FarmsController {

  @Autowired
  private FarmsService farmsService;

  @PostMapping
  public ResponseEntity<FarmResponseDTO> createFarm(@RequestBody FarmRequestDTO farmRequestDTO) {
    Farms farmsServiceFarm = farmsService.createFarm(farmsDtoCreateConvert(farmRequestDTO));
    FarmResponseDTO farmResponse = farmResponseconvert(farmsServiceFarm);
    return ResponseEntity.status(HttpStatus.CREATED).body(farmResponse);
  }

}
