package com.example.acessoapi.adapter.dto;

public record ResidentDTO(
        Long id,
        String name,
        String cpf,
        String adress,
        String phone
) {}
