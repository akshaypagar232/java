package com.Gson;

import java.io.FileWriter;

import java.io.IOException;
import com.google.gson.Gson;

public class Java_To_Json {
	
    public static void main( String[] args ) throws IOException {

    	Customer c1 = new Customer(1, "akshay", 20);
    	Customer c2 = new Customer(2, "ram", 23);
    	
    	Gson gson=new Gson();
		String json = gson.toJson(c1);
		FileWriter f = new FileWriter("c_file");
		f.write(json);
		f.close();
		System.out.println(json);
		
    	
    }
}
