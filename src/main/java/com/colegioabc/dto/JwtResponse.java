package com.colegioabc.dto;

public class JwtResponse {
    private String token;
    private String nombre;

    public JwtResponse(String token, String nombre) {
        this.token = token;
        this.nombre = nombre;
    }

    public String getToken() {
        return token;
    }

    public String getNombre() {
        return nombre;
    }
}
