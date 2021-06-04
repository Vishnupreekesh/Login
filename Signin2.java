package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Signin2 {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Email");
        String email=sc.nextLine();
        System.out.println("Enter the Password");
        String password = sc.nextLine();
        Properties properties=new Properties();
        FileInputStream file=new FileInputStream("Details.txt");
        properties.load(file);
        String check= properties.getProperty(email);
        if(!(check==null)){
            if (check.compareTo(password)==0) {
                System.out.println("Login Successfully");
            } else {
                System.out.println("Enter valid Password");
            }
        }
        else {
            System.out.println("Enter the Valid Email");
        }


    }
}
