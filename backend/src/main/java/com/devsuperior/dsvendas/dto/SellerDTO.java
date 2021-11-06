package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class SellerDTO implements Serializable {

  private static final long serialVersionUID = 1L;
  @Getter
  private Long id;
  @Getter
  @Setter
  private String name;

  public SellerDTO(Seller entity) {
    id = entity.getId();
    name = entity.getName();
  }

}
