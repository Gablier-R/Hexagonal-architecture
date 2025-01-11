package com.example.acessoapi.domain.services;

import com.example.acessoapi.domain.entities.UserDomain;
import com.example.acessoapi.domain.ports.in.UserServicePort;
import com.example.acessoapi.domain.ports.out.UserRepositoryPort;

public class UserService implements UserServicePort {

    private final UserRepositoryPort repository;

    public UserService(UserRepositoryPort userRepositoryPort) {
        this.repository = userRepositoryPort;
    }

    @Override
    public UserDomain createUser(UserDomain userDomain) {
        return repository.create(userDomain);
    }
}
