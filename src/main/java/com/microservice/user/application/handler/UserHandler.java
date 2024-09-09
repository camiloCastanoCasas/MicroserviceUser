package com.microservice.user.application.handler;

import com.microservice.user.application.dto.request.UserRequest;
import com.microservice.user.application.mapper.IUserRequestMapper;
import com.microservice.user.domain.api.IUserServicePort;
import com.microservice.user.domain.model.User;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class UserHandler implements IUserHandler {

    private final IUserServicePort userServicePort;
    private final IUserRequestMapper userRequestMapper;

    @Override
    public void createUser(UserRequest userRequest) {
        User user = userRequestMapper.toUser(userRequest);
        userServicePort.createUser(user);
    }
}
