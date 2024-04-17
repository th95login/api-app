package com.apispring.apispring.services;

import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.SecretKey;
import java.util.Date;

@Service
public class SecurityUserServices implements ISecurityUserServices{

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }

    @Override
    public boolean matchesPassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }


    public String generateToken(Long id_user,String nombre, String apellidos, String cargo, String user){
        long expirationTime = 30000;
        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);

        return Jwts.builder()
                .claim("id_user", id_user)
                .claim("nombre", nombre)
                .claim("apellidos", apellidos)
                .claim("cargo", cargo)
                .claim("user", user)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(SignatureAlgorithm.HS512, secretKey)
                .compact();
    }
}
