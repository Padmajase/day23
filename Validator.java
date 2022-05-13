package com.bridgelabz.day21;

import com.bridgelabz.day20.User;
import java.util.regex.Pattern;

/**
* validating all user inputs with pattern
**/
public class Validator extends User {

    /** defining pattern for inputs **/
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{3,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{3,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_.-]+@+[a-zA-z0-9]+[.]+[comaunet]+$";
    private static final String PHONE_PATTERN = "^91+[1-9]{10}$";
    private static final String PASSWORD_PATTERN = "^[[A-Z0-9a-z][@$._-]{1}]{8,}$";

    static boolean f = false;

    public static boolean firstNameValidation(String firstName) {
        try {
            if (!Pattern.matches(FIRST_NAME_PATTERN, firstName)) ;
            else {
                f = Pattern.matches(FIRST_NAME_PATTERN, firstName);
            }
        } catch (Exception ae) {
            System.out.println("last name is invalid" +ae);
        }
        return f;
    }

    public static boolean lastNameValidation(String lastName) {
        try {
            if (!Pattern.matches(LAST_NAME_PATTERN, lastName)) ;
            else {
                f = Pattern.matches(LAST_NAME_PATTERN, lastName);
            }
        } catch (Exception ae) {
            System.out.println("last name is invalid");
        }
        return f;
    }

    public static boolean emailValidation(String email) {
        try {
            if (!Pattern.matches(EMAIL_PATTERN, email)) ;
            else {
                f = Pattern.matches(EMAIL_PATTERN, email);
            }
        } catch (Exception ae) {
            System.out.println("last name is invalid");
        }
        return f;    }

    public static boolean phoneValidation(String phone) {
        try {
            if (!Pattern.matches(PHONE_PATTERN, phone)) ;
            else {
                f = Pattern.matches(PHONE_PATTERN, phone);
            }
        } catch (Exception ae) {
            System.out.println("last name is invalid");
        }
        return f;    }

    public static boolean passwordValidation(String password) {
        try {
            if (!Pattern.matches(PASSWORD_PATTERN, password)) ;
            else {
                f = Pattern.matches(PASSWORD_PATTERN, password);
            }
        } catch (Exception ae) {
            System.out.println("last name is invalid");
        }
        return f;
    }
}
