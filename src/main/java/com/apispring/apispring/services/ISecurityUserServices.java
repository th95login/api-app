package com.apispring.apispring.services;

public interface ISecurityUserServices {
    String encodePassword(String password);
    boolean matchesPassword(String rawPassword, String encodedPassword);
}
