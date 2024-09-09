package com.microservice.user.application.handler;

import com.microservice.user.application.dto.request.UserRequest;

public interface IUserHandler {
    void createUser(UserRequest userRequest);
}
