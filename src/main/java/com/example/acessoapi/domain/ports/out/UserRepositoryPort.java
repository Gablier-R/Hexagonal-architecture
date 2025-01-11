package com.example.acessoapi.domain.ports.out;

import com.example.acessoapi.domain.entities.UserDomain;

public interface UserRepositoryPort {

    UserDomain create (UserDomain userDomain);
}
