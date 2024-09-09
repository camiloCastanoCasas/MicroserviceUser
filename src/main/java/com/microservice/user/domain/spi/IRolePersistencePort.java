package com.microservice.user.domain.spi;

import com.microservice.user.domain.model.Role;

public interface IRolePersistencePort {
    void createRole(Role role);
}
