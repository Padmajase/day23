package com.bridgelabz.day21;

import com.bridgelabz.day20.Validator;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class User {
    static Logger log = Logger.getLogger(User.class);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        //Validator userinput = new Validator();

        System.out.println("enter first name :");
        String first = sc.next();
        boolean fn = Validator.firstNameValidation(first);
        //System.out.println(fn);

        System.out.println("enter last name :");
        boolean sn = Validator.lastNameValidation(sc.next());
        System.out.println(sn);

        System.out.println("enter email :");
        boolean em = Validator.emailValidation(sc.next());
        System.out.println(em);

        System.out.println("enter phone number :");
        boolean ph = Validator.phoneValidation(sc.next());
        System.out.println(ph);

        System.out.println("enter password :");
        boolean ps = Validator.passwordValidation(sc.next());
        System.out.println(ps);
    }
}




