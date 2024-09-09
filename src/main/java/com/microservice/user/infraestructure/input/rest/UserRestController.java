package com.microservice.user.infraestructure.input.rest;

import com.microservice.user.application.dto.request.UserRequest;
import com.microservice.user.application.handler.IUserHandler;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserRestController {

    private final IUserHandler userHandler;

    @PostMapping("/create")
    public ResponseEntity<Void> createUser(@Valid @RequestBody UserRequest userRequest) {
        userHandler.createUser(userRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
