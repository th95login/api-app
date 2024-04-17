package com.apispring.apispring.services;

import com.apispring.apispring.dto.DetailOrderDTO;

import java.util.List;

public interface IOrderDetailServices {
    List<DetailOrderDTO> getAll();
}
