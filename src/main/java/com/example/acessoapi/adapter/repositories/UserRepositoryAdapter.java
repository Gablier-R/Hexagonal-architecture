package com.example.acessoapi.adapter.repositories;

import com.example.acessoapi.adapter.mappers.UserMapper;
import com.example.acessoapi.domain.entities.UserDomain;
import com.example.acessoapi.domain.ports.out.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserRepository repository;
    private final UserMapper map;

    @Override
    public UserDomain create(UserDomain userDomain) {

        var entity = map.toEntity(userDomain);
        var userSavedEntity = repository.save(entity);

        return map.toDomain(userSavedEntity);
    }
}
