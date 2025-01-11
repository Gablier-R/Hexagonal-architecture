package com.example.acessoapi.infrastructure;

import com.example.acessoapi.domain.ports.in.UserServicePortIN;
import com.example.acessoapi.domain.ports.out.UserRepositoryPortOUT;
import com.example.acessoapi.domain.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public UserServicePortIN userServicePort(UserRepositoryPortOUT port) {
        return new UserService(port);
    }
}
