package com.bridgelabz.day20;

import java.util.regex.Pattern;

/**
 *  validating ing all user inputs with pattern
 */
public class Validator extends User {
    static String firstName;
    /* defining pattern for inputs */
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{3,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Za-z]\\w{3,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_.-]+@+[a-zA-z0-9]+[.]+[comaunet]+$";
    private static final String PHONE_PATTERN = "^91+[1-9]{10}$";
    private static final String PASSWORD_PATTERN = "^[[A-Z0-9a-z][@$._-]{1}]{8,}$";

    public static boolean firstNameValidation(String firstName) {
        return Pattern.matches(FIRST_NAME_PATTERN, firstName);
    }

    public static boolean lastNameValidation(String lastName) {
        return Pattern.matches(LAST_NAME_PATTERN, lastName);
    }

    public static boolean emailValidation(String email) {
        return Pattern.matches(EMAIL_PATTERN, email);
    }

    public static boolean phoneValidation(String phone) {
        return Pattern.matches(PHONE_PATTERN, phone);
    }

    public static boolean passwordValidation(String password) {
        return Pattern.matches(PASSWORD_PATTERN, password);
    }
}
