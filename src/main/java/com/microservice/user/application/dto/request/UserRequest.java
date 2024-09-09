package com.microservice.user.application.dto.request;

import com.microservice.user.domain.util.DomainConstants;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class UserRequest {

    @NotBlank(message = DomainConstants.FIELD_NAME_NULL_MESSAGE)
    private String name;

    @NotBlank(message = DomainConstants.FIELD_LASTNAME_NULL_MESSAGE)
    private String lastName;

    @NotBlank(message = DomainConstants.FIELD_IDENTITY_DOCUMENT_NULL_MESSAGE)
    @Pattern(regexp = DomainConstants.IDENTITY_DOCUMENT_REGEX, message = DomainConstants.FIELD_IDENTITY_DOCUMENT_INVALID_MESSAGE)
    private String identityDocument;

    @NotBlank(message = DomainConstants.FIELD_PHONE_NUMBER_NULL_MESSAGE)
    @Pattern(regexp = DomainConstants.PHONE_REGEX, message = DomainConstants.FIELD_PHONE_NUMBER_INVALID_MESSAGE)
    private String cellphoneNumber;

    @NotBlank(message = DomainConstants.FIELD_BIRTHDATE_NULL_MESSAGE)
    @Past(message = DomainConstants.FIELD_BIRTHDATE_FUTURE_MESSAGE)
    private LocalDate birthdate;

    @NotBlank(message = DomainConstants.FIELD_EMAIL_NULL_MESSAGE)
    @Pattern(regexp = DomainConstants.EMAIL_REGEX, message = DomainConstants.FIELD_EMAIL_INVALID_MESSAGE)
    private String email;

    @NotBlank(message = DomainConstants.FIELD_PASSWORD_NULL_MESSAGE)
    private String password;

    @NotBlank(message = DomainConstants.FIELD_ROLE_ID_NULL_MESSAGE)
    @Size(min = DomainConstants.ROLE_ID_MINIMUM_VALUE, message = DomainConstants.FIELD_ROLE_ID_MINIMUM_VALUE_MESSAGE)
    private Long roleId;
}
