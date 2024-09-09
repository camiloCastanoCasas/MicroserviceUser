package com.microservice.user.domain.util;

import com.microservice.user.domain.exceptions.ValidationException;
import com.microservice.user.domain.model.User;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class ValidateUser {

    private static final ArrayList<String> errors = new ArrayList<>();

    private ValidateUser(){
        throw new IllegalStateException("Validation class");
    }

    public static void validateFields(User user){
        validateName(user.getName());
        validateLastName(user.getLastName());
        validateIdentifyDocument(user.getIdentityDocument());
        validateCellPhoneNumber(user.getCellphoneNumber());
        validateBirthdate(user.getBirthdate());
        validateEmail(user.getEmail());
        validatePassword(user.getPassword());
        validateRole(user.getRole().getId());
        if (!errors.isEmpty()) {
            throw new ValidationException(errors);
        }
    }

    private static void validateName(String name){
        if(name == null || name.isEmpty()){
            errors.add(DomainConstants.FIELD_NAME_NULL_MESSAGE);
        }
    }

    private static void validateLastName(String lastName){
        if(lastName == null || lastName.isEmpty()){
            errors.add(DomainConstants.FIELD_LASTNAME_NULL_MESSAGE);
        }
    }

    private static void validateIdentifyDocument(String identityDocument){
        if(!Pattern.matches(DomainConstants.IDENTITY_DOCUMENT_REGEX, identityDocument)){
            errors.add(DomainConstants.FIELD_IDENTITY_DOCUMENT_INVALID_MESSAGE);
        }
        if(identityDocument == null || identityDocument.isEmpty()){
            errors.add(DomainConstants.FIELD_IDENTITY_DOCUMENT_NULL_MESSAGE);
        }
    }

    private static void validateCellPhoneNumber(String cellPhoneNumber){
        if(!Pattern.matches(DomainConstants.PHONE_REGEX, cellPhoneNumber)){
            errors.add(DomainConstants.FIELD_PHONE_NUMBER_INVALID_MESSAGE );
        }
        if(cellPhoneNumber ==  null || cellPhoneNumber.isEmpty()){
            errors.add(DomainConstants.FIELD_PHONE_NUMBER_NULL_MESSAGE);
        }
    }

    private static void validateBirthdate(LocalDate birthdate){
        if(birthdate == null){
            errors.add(DomainConstants.FIELD_BIRTHDATE_NULL_MESSAGE );
        } else if(birthdate.isAfter(LocalDate.now())){
            errors.add(DomainConstants.FIELD_BIRTHDATE_FUTURE_MESSAGE);
        } else if(Period.between(birthdate, LocalDate.now()).getYears() < 18){
            errors.add(DomainConstants.FIELD_BIRTHDATE_UNDERAGE_MESSAGE);
        }
    }

    private static void validateEmail(String email){
        if(email == null || email.isEmpty()){
            errors.add(DomainConstants.FIELD_EMAIL_NULL_MESSAGE );
        }
        else if(!Pattern.matches(DomainConstants.EMAIL_REGEX, email)){
            errors.add(DomainConstants.FIELD_EMAIL_INVALID_MESSAGE);
        }

    }

    private static void validatePassword(String password) {
        if(password == null || password.isEmpty()){
            errors.add(DomainConstants.FIELD_PASSWORD_NULL_MESSAGE);
        }
    }

    private static void validateRole(Long id) {
        if(id == null){
            errors.add(DomainConstants.FIELD_ROLE_ID_NULL_MESSAGE);
        } else if(id < DomainConstants.ROLE_ID_MINIMUM_VALUE){
            errors.add(DomainConstants.FIELD_ROLE_ID_MINIMUM_VALUE_MESSAGE);
        }
    }
}
