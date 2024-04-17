package com.apispring.apispring.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Entity
@Table(name = "pedidos")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pedido;
    private Date fecha_pedido;
    private String cliente;
    private Double total;
    private String estado;
}
