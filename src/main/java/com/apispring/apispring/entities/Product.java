package com.apispring.apispring.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "productos")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id_producto;

    @Column(name = "cod_prod")
    private String codPro;

    @Column(name = "nombre")
    private String nomPro;

    @Column(name = "precio")
    private double preUni;
}
