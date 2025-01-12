package com.example.acessoapi.domain.services;

import com.example.acessoapi.domain.entities.ResidentDomain;
import com.example.acessoapi.domain.ports.in.ResidentServicePortIN;
import com.example.acessoapi.domain.ports.out.ResidentRepositoryPortOUT;

public class ResidentService implements ResidentServicePortIN {

    private final ResidentRepositoryPortOUT repository;

    public ResidentService(ResidentRepositoryPortOUT repository) {
        this.repository = repository;
    }

    @Override
    public ResidentDomain create(ResidentDomain doamin) {
        return repository.create(doamin);
    }
}
