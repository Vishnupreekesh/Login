package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Email");
        String email=sc.nextLine();
        while (email.isEmpty()){
            System.out.println("You did not Enter the Email :)\n\nEnter again");
            email=sc.nextLine();
        }
        boolean boolEmail=validEmail(email);
        while (!boolEmail){
            System.out.println("You Enter Invalid Email :) \n\nEnter Again");
            email=sc.nextLine();
            boolEmail=validEmail(email);
        }
        System.out.println("Enter the Password");
        System.out.println("(Note:Your password length must be above 8 character long\nYour password must have one Upper case letter one lowercase letter\nyour password must have one number and one Special character)");
        String password=sc.nextLine();
        while (password.isEmpty()){
            System.out.println("You did not Enter the Password :)\n\nEnter again");
            password=sc.nextLine();
        }
        boolean boolPassword=validPassword(password);
        while (!boolPassword){
            System.out.println("Your Password is Not valid :) \n\nEnter agian");
            password=sc.nextLine();
            boolPassword=validPassword(password);
        }

        System.out.println("Login Successfully :) ");
    }

    private static boolean validPassword(String password) {
        if(password.length()>7){
            boolean hasDigit=false,hasCapital=false,hasSmall=false,hasSpecial=false;
            for(int i=0;i<password.length();i++) {
                char c = password.charAt(i);
                if (Character.isDigit(c)) hasDigit = true;
                else if (Character.isLowerCase(c)) hasSmall = true;
                else if (Character.isUpperCase(c)) hasCapital = true;
                else hasSpecial = true;
            }
            if(hasDigit==true&&hasCapital==true&&hasSmall==true&&hasSpecial==true) return true;
            else return false;
        }
        return false;
    }

    private static boolean validEmail(String email) {
        String regex= "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher=emailPattern.matcher(email);
        return matcher.find();
    }
}
