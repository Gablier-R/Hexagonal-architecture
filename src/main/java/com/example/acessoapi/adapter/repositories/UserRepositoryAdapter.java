package com.example.acessoapi.adapter.repositories;

import com.example.acessoapi.adapter.mappers.UserMapper;
import com.example.acessoapi.domain.entities.UserDomain;
import com.example.acessoapi.domain.ports.out.UserRepositoryPortOUT;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepositoryPortOUT {

    private final UserRepository repository;
    private final UserMapper map;

    @Override
    public UserDomain create(UserDomain userDomain) {

        var entity = map.toEntity(userDomain);
        var userSavedEntity = repository.save(entity);

        return map.toDomain(userSavedEntity);
    }

    @Override
    public List<UserDomain> getAllUsers() {
        return repository.findAll().stream().map(map::toDomain).toList();
    }
}
