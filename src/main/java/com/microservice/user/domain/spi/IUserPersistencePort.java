package com.microservice.user.domain.spi;

import com.microservice.user.domain.model.User;

public interface IUserPersistencePort {
    void createUser(User user);
}
