package com.microservice.user.infraestructure.out.jpa.adapter;

import com.microservice.user.domain.model.User;
import com.microservice.user.domain.spi.IUserPersistencePort;
import com.microservice.user.infraestructure.out.jpa.entity.UserEntity;
import com.microservice.user.infraestructure.out.jpa.mapper.IUserEntityMapper;
import com.microservice.user.infraestructure.out.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {

    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    @Override
    public void createUser(User user) {
        UserEntity userEntity = userEntityMapper.toEntity(user);
        userRepository.save(userEntity);
    }
}
