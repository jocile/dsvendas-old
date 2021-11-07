package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SaleSuccessDTO implements Serializable {

  private static final long serialVersionUID = 1L;
  private String sellerName;
  private Long visited;
  private Long deals;

  public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
    sellerName = seller.getName();
    this.visited = visited;
    this.deals = deals;
  }

}
