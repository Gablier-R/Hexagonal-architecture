package com.example.acessoapi.infrastructure;

import com.example.acessoapi.domain.ports.in.UserServicePort;
import com.example.acessoapi.domain.ports.out.UserRepositoryPort;
import com.example.acessoapi.domain.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public UserServicePort userServicePort(UserRepositoryPort port) {
        return new UserService(port);
    }
}
