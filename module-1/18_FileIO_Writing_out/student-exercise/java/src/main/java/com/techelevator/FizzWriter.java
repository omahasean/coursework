package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {
		File fizzBuzz = new File("FizzBuzz");
		try {
			PrintWriter writer = new PrintWriter(fizzBuzz);{
				for (int i=1; i<301 ; i++ ) {
					if (i%3==0 && i%5==0) {
						writer.println("FizzBuzz");
					}
					else if(i%5==0) {
						writer.println("Buzz");
					}
					else if (i%3==0) {
						writer.println("Fizz");
					}
					else {
						writer.println(i);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
