package com.bridgelabz.day23;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * day23 user registration program@FunctionalInterface
 * validating all user inputs with patterninterface FunctionalInterfaceEx {
 * author: padmaja eknarayan    abstract Boolean validate(String input, String pattern);
 */
@FunctionalInterface
interface UserRegistration {
    boolean validate(String input, String validPattern);
}
public class Validator {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{3,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{3,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_.-]+@+[a-zA-z0-9]+[.]+[comaunet]+$";
    private static final String PHONE_PATTERN = "^91+[1-9]{10}$";
    private static final String PASSWORD_PATTERN = "^[[A-Z0-9a-z][@$._-]{1}]{8,}$";


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserRegistration input = (data, pattern) -> {
            return Pattern.matches(pattern, data);
        };

        System.out.println("enter first name :");
        System.out.println(input.validate(sc.next(), FIRST_NAME_PATTERN));

        System.out.println("enter password :");
        System.out.println(input.validate(sc.next(), LAST_NAME_PATTERN));

        System.out.println("enter email :");
        System.out.println(input.validate(sc.next(), EMAIL_PATTERN));

        System.out.println("enter mobile number :");
        System.out.println(input.validate(sc.next(), PHONE_PATTERN));

        System.out.println("enter password :");
        System.out.println(input.validate(sc.next(), PASSWORD_PATTERN));
    }
}