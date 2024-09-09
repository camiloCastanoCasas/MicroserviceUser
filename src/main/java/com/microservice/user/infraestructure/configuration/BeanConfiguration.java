package com.microservice.user.infraestructure.configuration;

import com.microservice.user.domain.api.IUserServicePort;
import com.microservice.user.domain.spi.IUserPersistencePort;
import com.microservice.user.domain.usecase.UserUseCase;
import com.microservice.user.infraestructure.out.jpa.adapter.UserJpaAdapter;
import com.microservice.user.infraestructure.out.jpa.mapper.IRoleEntityMapper;
import com.microservice.user.infraestructure.out.jpa.mapper.IUserEntityMapper;
import com.microservice.user.infraestructure.out.jpa.repository.IRoleRepository;
import com.microservice.user.infraestructure.out.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;
    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleEntityMapper;

    @Bean
    public IUserPersistencePort userPersistencePort() {
        return new UserJpaAdapter(userRepository, userEntityMapper);
    }

    @Bean
    public IUserServicePort userServicePort() {
        return new UserUseCase(userPersistencePort());
    }
}
