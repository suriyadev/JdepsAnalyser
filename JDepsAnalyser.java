
package com.data.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JDepsAnalyser {

	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					args[0]));
			String line = reader.readLine();
			
			int i = 0;
			int count = 0;
			
			while (line != null) {
				
				if(i >= 2 && !line.equals("}")) {
				
				String value = line.split("->")[1];	
					
				if(value.contains("(not found"))
					System.out.println(value);
					count++;
				}
				line = reader.readLine();
				
			   ++i;
			} 
			
			System.out.println(count+" Missing jars found");
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
