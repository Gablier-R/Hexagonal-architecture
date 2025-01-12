package com.example.acessoapi.adapter.controller;

import com.example.acessoapi.adapter.dto.ResidentDTO;
import com.example.acessoapi.adapter.mappers.ResidentMapper;
import com.example.acessoapi.domain.ports.in.ResidentServicePortIN;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/resident")
@RequiredArgsConstructor
public class ResidentController {

    private final ResidentServicePortIN service;
    private final ResidentMapper map;

    @PostMapping
    public ResponseEntity<ResidentDTO> create (@RequestBody ResidentDTO dto){
        var entity =  map.toDomain(dto);
        var residentSaved = service.create(entity);
        var residentResponse = map.toDTO(residentSaved);
        return new ResponseEntity<>(residentResponse, HttpStatus.CREATED);
    }
}
