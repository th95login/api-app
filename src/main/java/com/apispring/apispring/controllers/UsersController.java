package com.apispring.apispring.controllers;

import com.apispring.apispring.dto.UserDTO;
import com.apispring.apispring.entities.Users;
import com.apispring.apispring.request.LoginRequest;
import com.apispring.apispring.services.IUsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private IUsersServices services;

    @GetMapping("/api/users")
    public List<UserDTO> getUserAll(){
        return services.getAll();
    }

    @GetMapping("/api/users/{id}")
    public Users getById(@PathVariable String id){
        return services.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/users/{id}")
    public void remove (@PathVariable String id){
        services.remove(Long.parseLong(id));
    }


    @PostMapping("/api/users")
    public void save(@RequestBody Users users){
        services.save(users);
    }

    @PostMapping("/api/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest userLogin) {
        return services.login(userLogin);
    }

}

