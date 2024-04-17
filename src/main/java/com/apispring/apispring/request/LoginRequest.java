package com.apispring.apispring.request;


public class LoginRequest {

    private String usuario;
    private String Password;

    public LoginRequest(String usuario, String password) {
        this.usuario = usuario;
        Password = password;
    }

    public LoginRequest() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "usuario='" + usuario + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
