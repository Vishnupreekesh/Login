package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

public class Md5 {

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
	// write your code here
        Properties properties=new Properties();
        FileInputStream file=new FileInputStream("File.txt");
        properties.load(file);
        properties.setProperty("vishnu@gmail.com",dohashing("Vishnu123#"));
        properties.setProperty("preeekesh@gmail.com",dohashing("Preekesh123#"));
        FileOutputStream fos=new FileOutputStream("File.txt");
        properties.store(fos,"update");
    }

    private static String dohashing(String s) throws NoSuchAlgorithmException {
        MessageDigest ms = MessageDigest.getInstance("MD5");
        ms.update(s.getBytes());
        byte[] result=ms.digest();
        StringBuilder sb =new StringBuilder();

        for(byte b:result){
            sb.append(String.format("%02x",b));
        }
        return sb.toString();
    }
}
