package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DatabaseApp {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("database.properties");
		Properties p=new Properties();
        p.load(fis);
        
        System.out.println(p);
        
        String uname=p.getProperty("userName");
        String upwd=p.getProperty("pwd");
        
        System.out.println(uname+" --- "+upwd);
        
        fis.close();
	}
}
