package com.devsuperior.dsvendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_sellers")
@NoArgsConstructor
public class Seller {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  private Long id;
  @Getter
  @Setter
  private String name;
  @OneToMany(mappedBy = "seller")
  @Getter
  private List<Sale> sales = new ArrayList<>();

  public Seller(Long id, String name) {
    this.id = id;
    this.name = name;
  }

}
