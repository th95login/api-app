package com.apispring.apispring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private String nombre;
    private String apellidos;
    private String cargo;
    private String usuario;
    private String Password;
}
