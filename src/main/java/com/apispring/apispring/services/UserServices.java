package com.apispring.apispring.services;

import com.apispring.apispring.dto.UserDTO;
import com.apispring.apispring.entities.Users;
import com.apispring.apispring.repository.UserRepository;
import com.apispring.apispring.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices implements IUsersServices {

    @Autowired
    private UserRepository repository;

    @Autowired
    private SecurityUserServices securityUser;

    @Autowired
    private ISecurityUserServices securityService;

    @Override
    public List<UserDTO> getAll() {
        List<Users> users = (List<Users>) repository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for (Users user : users) {
            // Crear un nuevo DTO y establecer los campos deseados
            UserDTO userDataDTO = new UserDTO();
            userDataDTO.setNombre(user.getNombre());
            userDataDTO.setApellidos(user.getApellidos());
            userDataDTO.setCargo(user.getCargo());
            userDataDTO.setUsuario(user.getUser());

            userDTOList.add(userDataDTO);
        }
        return userDTOList;
    }

    @Override
    public Users getById(Long id) {
        return (Users) repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Users users) {
        users.setPassword(securityUser.encodePassword(users.getPassword()));
        repository.save(users);
    }

    @Override
    public ResponseEntity<?> login(LoginRequest userLogin) {
        // Obtener el usuario por nombre de usuario
        Users user = repository.findByUsername((userLogin.getUsuario()));

        if (user != null && securityService.matchesPassword(userLogin.getPassword(), user.getPassword())) {
            String token = securityUser.generateToken(user.getId_User(), user.getNombre(), user.getApellidos(), user.getCargo(), userLogin.getUsuario());
            return ResponseEntity.ok().body(token);
        } else {
            // Nombre de usuario o contraseña incorrectos
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("usuario o contraseña incorrectos");
        }
    }


}
