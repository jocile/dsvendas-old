package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_sales")
public class Sale {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  private Long id;
  @Getter
  @Setter
  private Integer visited;
  @Getter
  @Setter
  private Integer deals;
  @Getter
  @Setter
  private Double amount;
  @Getter
  @Setter
  private LocalDate date;

  @ManyToOne
  @JoinColumn(name = "seller_id")
  @Getter
  @Setter
  private Seller seller;

}
