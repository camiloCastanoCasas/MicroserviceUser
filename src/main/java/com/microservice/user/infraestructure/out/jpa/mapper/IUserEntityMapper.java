package com.microservice.user.infraestructure.out.jpa.mapper;

import com.microservice.user.domain.model.User;
import com.microservice.user.infraestructure.out.jpa.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IUserEntityMapper {
    @Mapping(target = "role", source = "role")
    UserEntity toEntity(User user);
}
