package com.example.acessoapi.domain.ports.in;

import com.example.acessoapi.domain.entities.UserDomain;

public interface UserServicePort {

    UserDomain createUser(UserDomain userDomain);
}
