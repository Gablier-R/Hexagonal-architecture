package com.example.acessoapi.adapter.mappers;

import com.example.acessoapi.adapter.dto.ResidentDTO;
import com.example.acessoapi.adapter.entities.ResidentEntity;
import com.example.acessoapi.domain.entities.ResidentDomain;
import org.springframework.stereotype.Component;

@Component
public class ResidentMapper {

    public ResidentDomain toDomain(ResidentDTO dto){
        return new ResidentDomain.Builder()
                .name(dto.name())
                .cpf(dto.cpf())
                .adress(dto.adress())
                .phone(dto.phone())
                .build();
    }

    public ResidentDTO toDTO (ResidentDomain domain){
        return new ResidentDTO(
                domain.getId(),
                domain.getName(),
                domain.getAdress(),
                domain.getCpf(),
                domain.getPhone()
        );
    }

    public ResidentEntity toEntity (ResidentDomain domain){
        return ResidentEntity.builder()
                .name(domain.getName())
                .cpf(domain.getCpf())
                .phone(domain.getPhone())
                .adress(domain.getAdress())
                .build();
    }

    public ResidentDomain toDomain (ResidentEntity entity){
        return new ResidentDomain.Builder()
                .id(entity.getId())
                .name(entity.getName())
                .cpf(entity.getCpf())
                .phone(entity.getPhone())
                .adress(entity.getAdress())
                .build();
    }
}
