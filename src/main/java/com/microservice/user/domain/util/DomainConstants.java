package com.microservice.user.domain.util;

public final class DomainConstants {

    private DomainConstants(){
        throw new IllegalStateException("Utility class");
    }

    public static final String FIELD_NAME_NULL_MESSAGE = "Field name cannot be null or empty";
    public static final String FIELD_LASTNAME_NULL_MESSAGE = "Field lastname cannot be null or empty";
    public static final String FIELD_IDENTITY_DOCUMENT_NULL_MESSAGE = "Field Identity document number cannot be null or empty";
    public static final String FIELD_IDENTITY_DOCUMENT_INVALID_MESSAGE = "Field Identity document number is not valid";
    public static final String FIELD_PHONE_NUMBER_INVALID_MESSAGE = "Field phone number is not valid";
    public static final String FIELD_PHONE_NUMBER_NULL_MESSAGE = "Field phone number cannot be null or empty";
    public static final String FIELD_BIRTHDATE_NULL_MESSAGE = "Field birthdate cannot be null or empty";
    public static final String FIELD_BIRTHDATE_FUTURE_MESSAGE = "Field birthdate cannot be in the future";
    public static final String FIELD_BIRTHDATE_UNDERAGE_MESSAGE = "User must be at least 18 years old";
    public static final String FIELD_EMAIL_NULL_MESSAGE = "Field email cannot be null or empty";
    public static final String FIELD_EMAIL_INVALID_MESSAGE = "Field email is not valid";
    public static final String FIELD_PASSWORD_NULL_MESSAGE = "Field password cannot be null or empty";
    public static final String FIELD_ROLE_ID_NULL_MESSAGE = "Field role ID cannot be null or empty";
    public static final String FIELD_ROLE_ID_MINIMUM_VALUE_MESSAGE = "Field role ID cannot be less than 1";
    public static final int ROLE_ID_MINIMUM_VALUE = 1;
    public static final String EMAIL_REGEX = "^[\\w!#$%&'*+/=?`{|}~^.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
    public static final String PHONE_REGEX = "^\\+57\\d{10}$";
    public static final String IDENTITY_DOCUMENT_REGEX = "\\d+";




}
