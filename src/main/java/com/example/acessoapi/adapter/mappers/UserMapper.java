package com.example.acessoapi.adapter.mappers;

import com.example.acessoapi.adapter.dto.UserDTO;
import com.example.acessoapi.adapter.entities.UserEntity;
import com.example.acessoapi.domain.entities.UserDomain;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDomain toClass(UserDTO userDTO){
        return new UserDomain.Builder()
                .name(userDTO.name())
                .email(userDTO.email())
                .password(userDTO.password())
                .admin(userDTO.admin())
                .build();
    }

    public UserDTO toDTO (UserDomain userDomain){
        return new UserDTO(
                userDomain.getId() == null ? 0 : userDomain.getId(),
                userDomain.getName(),
                userDomain.getEmail(),
                userDomain.getPassword(),
                userDomain.getAdmin()
        );
    }

    public UserEntity toEntity (UserDomain userDomain){
        return UserEntity.builder()
                .name(userDomain.getName())
                .email(userDomain.getEmail())
                .password(userDomain.getPassword())
                .admin(userDomain.getAdmin())
                .build();
    }

    public UserDomain toDomain (UserEntity userEntity){
        return new UserDomain.Builder()
                .id(userEntity.getId())
                .name(userEntity.getName())
                .email(userEntity.getEmail())
                .password(userEntity.getPassword())
                .admin(userEntity.getAdmin())
                .build();
    }
}
