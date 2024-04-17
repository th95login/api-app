package com.apispring.apispring.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "detallespedido")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detalle;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Orders orders;

    @ManyToOne
    @JoinColumn (name="id_producto")
    private Product product;

    @Column(name="precio_venta")
    private double preVenta;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "subtotal")
    private double subtotal;

    @ManyToOne
    @JoinColumn(name="id_estado")
    private OrderStatus status;
}
