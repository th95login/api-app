package com.apispring.apispring.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "estado_pedido")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_estado;

    @Column(name = "nombre_estado")
    private String nomEstado;
}
