package com.microservice.user.domain.usecase;

import com.microservice.user.domain.api.IUserServicePort;
import com.microservice.user.domain.model.User;
import com.microservice.user.domain.spi.IUserPersistencePort;
import com.microservice.user.domain.util.ValidateUser;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void createUser(User user) {
        ValidateUser.validateFields(user);
        userPersistencePort.createUser(user);
    }
}
