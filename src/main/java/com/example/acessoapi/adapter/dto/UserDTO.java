package com.example.acessoapi.adapter.dto;

public record UserDTO(
        Long id,
        String name,
        String email,
        String password,
        Boolean admin
) {
}
