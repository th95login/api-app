package com.apispring.apispring.services;

import com.apispring.apispring.dto.DetailOrderDTO;
import com.apispring.apispring.entities.OrderDetail;
import com.apispring.apispring.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderDetailServices implements IOrderDetailServices{

    @Autowired
    OrderDetailRepository repository;

    @Override
    public List<DetailOrderDTO> getAll() {
        //Consulta general de JPA
        //List<OrderDetail> orderDetails = (List<OrderDetail>) repository.findAll();

        //Consulta personalizada usando @Query(value = "sentencia sql", nativeQuery = true)
        //Solo se muestran los pedidos pendientes y confirmados mas no los que ya fueron entregados
        List<OrderDetail> orderDetails = repository.findAllPersonalized();
        List<DetailOrderDTO> detailOrderDTOList = new ArrayList<>();
        // Iterar sobre los detalles del pedido para obtener los nombres correspondientes
        for (OrderDetail orderDetail : orderDetails) {
            //
            DetailOrderDTO detailOrderData = new DetailOrderDTO();
            detailOrderData.setId_detalle(orderDetail.getId_detalle());
            detailOrderData.setCliente(orderDetail.getOrders().getCliente());
            detailOrderData.setNomProducto(orderDetail.getProduct().getNomPro());
            detailOrderData.setPreVenta(orderDetail.getPreVenta());
            detailOrderData.setCantidad(orderDetail.getCantidad());
            detailOrderData.setSubtotal(orderDetail.getSubtotal());
            detailOrderData.setEstadoPedido(orderDetail.getStatus().getNomEstado());

            detailOrderDTOList.add(detailOrderData);
        }
        return detailOrderDTOList;
    }
}
