package com.microservice.user.application.dto.response;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserResponse {
    private Long id;
    private String name;
    private String lastName;
    private String identityDocument;
    private String cellphoneNumber;
    private LocalDate birthdate;
    private String email;
    private String password;
    private Long roleId;
}
