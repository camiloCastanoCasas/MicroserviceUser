package com.microservice.user.domain.api;

import com.microservice.user.domain.model.User;

public interface IUserServicePort {
    void createUser(User user);
}
