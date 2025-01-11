package com.example.acessoapi.domain.services;

import com.example.acessoapi.domain.entities.UserDomain;
import com.example.acessoapi.domain.ports.in.UserServicePortIN;
import com.example.acessoapi.domain.ports.out.UserRepositoryPortOUT;

import java.util.List;

public class UserService implements UserServicePortIN {

    private final UserRepositoryPortOUT repository;

    public UserService(UserRepositoryPortOUT userRepositoryPortOUT) {
        this.repository = userRepositoryPortOUT;
    }

    @Override
    public UserDomain createUser(UserDomain userDomain) {
        return repository.create(userDomain);
    }

    @Override
    public List<UserDomain> getUsers() {
        return repository.getAllUsers();
    }
}
