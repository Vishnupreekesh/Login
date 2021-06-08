package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;
import java.util.Scanner;

public class Md5 {

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
	// write your code here
        Scanner sc=new Scanner(System.in);
        Properties properties=new Properties();
        FileInputStream file=new FileInputStream("File.txt");
        properties.load(file);
        properties.setProperty("vishnu@gmail.com",dohashing("Vishnu123#"));
        properties.setProperty("preeekesh@gmail.com",dohashing("Preekesh123#"));
        FileOutputStream fos=new FileOutputStream("File.txt");
        properties.store(fos,"update");
        System.out.println("Enter the Email");
        String email=sc.nextLine();
        System.out.println("Enter the Password");
        String password = sc.nextLine();

        String check= properties.getProperty(email);
        if(!(check==null)){
            if (check.compareTo(dohashing(password))==0) {
                System.out.println("Login Successfully");
            } else {
                System.out.println("Enter valid Password");
            }
        }
        else {
            System.out.println("Enter the Valid Email");
        }

    }

    private static String dohashing(String s) throws NoSuchAlgorithmException {
        MessageDigest ms = MessageDigest.getInstance("SHA-224");
        ms.update(s.getBytes());
        byte[] result=ms.digest();
        StringBuilder sb =new StringBuilder();

        for(byte b:result){
            sb.append(String.format("%02x",b));
        }
        return sb.toString();
    }
}
