package com.apispring.apispring.services;

import com.apispring.apispring.dto.UserDTO;
import com.apispring.apispring.entities.Users;
import com.apispring.apispring.request.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IUsersServices {
    List<UserDTO> getAll();

    Users getById(Long id);

    void remove (Long id);

    void save(Users users);

    ResponseEntity<?> login(@RequestBody LoginRequest userLogin);
}
