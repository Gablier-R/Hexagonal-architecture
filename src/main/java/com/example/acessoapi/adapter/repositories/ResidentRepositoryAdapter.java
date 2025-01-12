package com.example.acessoapi.adapter.repositories;

import com.example.acessoapi.adapter.mappers.ResidentMapper;
import com.example.acessoapi.domain.entities.ResidentDomain;
import com.example.acessoapi.domain.ports.out.ResidentRepositoryPortOUT;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ResidentRepositoryAdapter implements ResidentRepositoryPortOUT {

    private final ResidentMapper map;
    private final ResidentRepository repository;

    @Override
    public ResidentDomain create(ResidentDomain doamin) {
        var entity = map.toEntity(doamin);
        var saved = repository.save(entity);
        return map.toDomain(saved);
    }
}
