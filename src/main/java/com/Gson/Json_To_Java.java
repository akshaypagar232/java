package com.Gson;

import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class Json_To_Java {

	public static void main(String[] args) throws IOException {
		
		FileReader f = new FileReader("c_file");
		
		Gson gson = new Gson();
		Customer customer = gson.fromJson(f, Customer.class);
//		Customer customer = gson.fromJson(new FileReader("c_file"), Customer.class);

		f.close();
		
		System.out.println(customer);
		
	}

}
