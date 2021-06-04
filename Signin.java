package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Signin {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        Map<String,String> map=new HashMap<String,String>();
        map.put("vishnu@gmail.com","Vishnu123#");
        map.put("preekesh@gmail.com","Preekesh123@");
        map.put("ravi@gmail.com","ravi123@");
        System.out.println("Enter the Email");
        String email=sc.nextLine();
        System.out.println("Enter the Password");
        String password=sc.nextLine();
        if(map.containsKey(email)){
            if(map.get(email)==password){
                System.out.println("Login Successfull");
            }
            else{
                System.out.println("Invalid Password");
            }
        }
        else {
            System.out.println("Invalid Email");
        }
    }
}
