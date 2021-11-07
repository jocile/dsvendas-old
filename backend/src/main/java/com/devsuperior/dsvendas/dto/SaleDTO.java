package com.devsuperior.dsvendas.dto;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.devsuperior.dsvendas.entities.Sale;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SaleDTO {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Setter(AccessLevel.NONE)
  private Long id;
  private Integer visited;
  private Integer deals;
  private Double amount;
  private LocalDate date;
  private SellerDTO seller;

  public SaleDTO(Sale entity) {
    id = entity.getId();
    visited = entity.getVisited();
    deals = entity.getDeals();
    amount = entity.getAmount();
    date = entity.getDate();
    seller = new SellerDTO(entity.getSeller());
  }

}
