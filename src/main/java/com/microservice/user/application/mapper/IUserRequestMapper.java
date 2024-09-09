package com.microservice.user.application.mapper;

import com.microservice.user.application.dto.request.UserRequest;
import com.microservice.user.domain.model.Role;
import com.microservice.user.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface IUserRequestMapper {

    @Mapping(source = "roleId", target = "role", qualifiedByName = "mapRoleIdToRole")
    @Mapping(target = "id", ignore = true)
    User toUser(UserRequest userRequest);

    @Named("mapRoleIdToRole")
    default Role mapRoleIdToRole(Long roleId) {
        return new Role(roleId, null, null);
    }
}
