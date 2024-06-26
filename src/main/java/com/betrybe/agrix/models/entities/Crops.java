package com.betrybe.agrix.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *  entidade crops.
 */
@Entity
@Table(name = "crops")
public class Crops {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Double plantedArea;

  @ManyToOne
  @JoinColumn(name = "farm_id")
  private Farms farm;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getPlantedArea() {
    return plantedArea;
  }

  public void setPlantedArea(Double plantedArea) {
    this.plantedArea = plantedArea;
  }

  public Farms getFarm() {
    return farm;
  }

  public void setFarm(Farms farm) {
    this.farm = farm;
  }
}
