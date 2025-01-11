package com.example.acessoapi.domain.ports.in;

import com.example.acessoapi.domain.entities.UserDomain;

import java.util.List;

public interface UserServicePortIN {

    UserDomain createUser(UserDomain userDomain);

    List<UserDomain> getUsers();
}
