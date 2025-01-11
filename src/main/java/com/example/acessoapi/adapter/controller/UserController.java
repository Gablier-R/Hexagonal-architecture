package com.example.acessoapi.adapter.controller;

import com.example.acessoapi.adapter.dto.UserDTO;
import com.example.acessoapi.adapter.mappers.UserMapper;
import com.example.acessoapi.domain.ports.in.UserServicePortIN;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServicePortIN servicePort;
    private final UserMapper map;

    @PostMapping
    public ResponseEntity<UserDTO> create (@RequestBody UserDTO userDTO){

        var entity = map.toClass(userDTO);

        var userSaved = servicePort.createUser(entity);

        var userResponse = map.toDTO(userSaved);

        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> get (){
        var dto = servicePort.getUsers().stream().map(map::toDTO).toList();
        return ResponseEntity.ok(dto);
    }
}
