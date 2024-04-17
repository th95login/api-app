package com.apispring.apispring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailOrderDTO {

    private Long id_detalle;

    private String cliente;

    private String nomProducto;

    private double preVenta;

    private int cantidad;

    private double subtotal;

    private String estadoPedido;
}
