package com.example.acessoapi.domain.ports.out;

import com.example.acessoapi.domain.entities.UserDomain;

import java.util.List;

public interface UserRepositoryPortOUT {

    UserDomain create (UserDomain userDomain);

    List<UserDomain> getAllUsers ();
}
