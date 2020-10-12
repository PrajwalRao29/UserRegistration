package com.cg.userregistration.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidDetailsException extends Exception {
    public InvalidDetailsException() {
    }
}

public class User {
    @FunctionalInterface
    interface Validate {
        boolean Check(String str);
    }

    public boolean Operation(String str, Validate validate){
        return validate.Check(str);
    }
    public static Validate firstNameCheck = (String str) -> {
        try {
            if (!Pattern.matches("[A-Z]{1}[a-z]{2,}", str)) {
                throw new InvalidDetailsException();
            } else {
                System.out.println("Valid First Name");
                return true;
            }
        } catch (InvalidDetailsException e) {
            return false;
        }
    };
    public static Validate lastNameCheck = (String str) -> {
        try {
            if (!Pattern.matches("[A-Z]{1}[a-z]{2,}", str)) {
                throw new InvalidDetailsException();
            } else {
                System.out.println("Valid Last Name");
                return true;
            }
        } catch (InvalidDetailsException e) {
            return false;
        }
    };
    public static Validate emailCheck = (String str) -> {
        try {
            if (Pattern.matches("[\\w]{1,}([.][a-zA-Z0-9]{1,})*([-][a-zA-Z0-9]{1,})*([+][a-zA-Z0-9]{1,})*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,}([.][a-zA-Z]{2,})?",
                    str)) {
                System.out.println("Valid Email");
                return true;
            } else {
                throw new InvalidDetailsException();
            }
        } catch (InvalidDetailsException e) {
            return false;
        }
    };
    public static Validate mobileCheck = (String str) -> {
        try {
            if (Pattern.matches("[1-9]{1}[0-9]{1}[\\s]{1}[1-9]{1}[0-9]{9}", str)) {
                System.out.println("Valid mobile phone");
                return true;
            } else {
                throw new InvalidDetailsException();
            }
        } catch (InvalidDetailsException e) {
            return false;
        }
    };
    public static Validate passwordCheck = (String str) -> {
        try {
            if (Pattern.matches("(.*[A-Z].*)", str) && Pattern.matches("[\\S]{8,}", str) && Pattern.matches("(.*[0-9].*)", str)) {
                String p = "[\\W]";
                Pattern r = Pattern.compile(p);
                Matcher m = r.matcher(str);
                int count = 0;
                while (m.find()) {
                    count++;
                }
                if (count == 1) {
                    System.out.println("valid password");
                    return true;
                }
            }
            throw new InvalidDetailsException();
        } catch (InvalidDetailsException e) {
            return false;
        }
    };

    public static void main(String[] args) {
        User user = new User();
        user.Operation("Prajwal",firstNameCheck);

    }
}
