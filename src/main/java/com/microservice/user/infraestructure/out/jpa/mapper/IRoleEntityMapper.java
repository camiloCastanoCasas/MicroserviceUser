package com.microservice.user.infraestructure.out.jpa.mapper;

import com.microservice.user.domain.model.Role;
import com.microservice.user.infraestructure.out.jpa.entity.RoleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IRoleEntityMapper {
    RoleEntity toEntity(Role role);
}
