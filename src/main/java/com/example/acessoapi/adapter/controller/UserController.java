package com.example.acessoapi.adapter.controller;

import com.example.acessoapi.adapter.dto.UserDTO;
import com.example.acessoapi.adapter.mappers.UserMapper;
import com.example.acessoapi.domain.ports.in.UserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServicePort servicePort;
    private final UserMapper mapper;

    @PostMapping
    public ResponseEntity<UserDTO> create (@RequestBody UserDTO userDTO){

        var entity = mapper.toClass(userDTO);

        var userSaved = servicePort.createUser(entity);

        var userResponse = mapper.toDTO(userSaved);

        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
    }
}
