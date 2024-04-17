package com.apispring.apispring.repository;

import com.apispring.apispring.entities.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {

    @Query("SELECT u FROM Users u WHERE u.user = ?1")
    Users findByUsername(String user);
}
