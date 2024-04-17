package com.apispring.apispring.repository;

import com.apispring.apispring.entities.OrderDetail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, Long> {
    @Query(value = "SELECT * FROM detallespedido WHERE id_estado != 3", nativeQuery = true)
    List<OrderDetail> findAllPersonalized();

}
