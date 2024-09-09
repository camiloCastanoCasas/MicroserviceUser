package com.microservice.user.infraestructure.out.jpa.adapter;

import com.microservice.user.domain.model.Role;
import com.microservice.user.domain.spi.IRolePersistencePort;
import com.microservice.user.infraestructure.out.jpa.entity.RoleEntity;
import com.microservice.user.infraestructure.out.jpa.mapper.IRoleEntityMapper;
import com.microservice.user.infraestructure.out.jpa.repository.IRoleRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RoleJpaAdapter implements IRolePersistencePort {

    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleEntityMapper;

    @Override
    public void createRole(Role role) {
        RoleEntity roleEntity = roleEntityMapper.toEntity(role);
        roleRepository.save(roleEntity);
    }
}
