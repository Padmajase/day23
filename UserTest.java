package com.bridgelabz.day20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserTest {

    @Test
    public void testfirstname(){
        Assertions.assertTrue(Validator.firstNameValidation("Padmaja"));
        System.out.println("first name is valid");
    }

    @Test
    public void testlastname(){
        Assertions.assertTrue(Validator.lastNameValidation("pawar"));
        System.out.println("last name is valid");
    }

    @Test
    public void testemail(){
        Assertions.assertTrue(Validator.emailValidation("abc.z@xyz.au"));
        System.out.println("email is valid");
    }

    @Test
    public void testphone(){
        Assertions.assertTrue(Validator.phoneValidation("918946757832"));
        System.out.println("phone number is valid");
    }

    @Test
    public void testpassword(){
        Assertions.assertTrue(Validator.passwordValidation("Mypassword@21"));
        System.out.println("password is valid");
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc.xy@jl.com", "xyz.123@a.au"})
    public void testAllEmails(String email){
        Assertions.assertTrue(Validator.emailValidation(email));
        System.out.println("email is valid");
    }

//    @AfterAll
//    public void print() {
//        System.out.println("all emails are valid");
//    }

}