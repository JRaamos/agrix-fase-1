package com.betrybe.agrix.controllers;

import com.betrybe.agrix.dtos.CropsResponse;
import com.betrybe.agrix.service.CropsService;
import com.betrybe.agrix.util.CropsUtil;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  CropsController com resposta para o cliente.
 */
@RestController
@RequestMapping("/crops")
public class CropsController {
  @Autowired
  private CropsService cropsService;

  @GetMapping
public List<CropsResponse> getAllCrops() {
    return cropsService.findAllCrops().stream()
        .map(CropsUtil::cropResponseconvert)
        .collect(Collectors.toList());
  }
}
