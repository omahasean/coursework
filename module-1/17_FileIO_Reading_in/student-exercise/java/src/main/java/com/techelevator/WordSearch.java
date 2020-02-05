package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		try (Scanner inputScan = new Scanner(System.in)) {
			System.out.println("Please enter a file or file path to search: ");
			String fileInput = inputScan.nextLine();
			File fileFinal = new File(fileInput);
			System.out.println("Please enter a keyword to search: ");
			String keyWord = inputScan.nextLine();
			
			try (Scanner fileScanner = new Scanner(fileFinal)){
				int lineNumber = 1;
				while (fileScanner.hasNextLine()) {
					lineNumber++;
					String lineAt = fileScanner.nextLine();
					if (lineAt.toString().contains(keyWord)) {
						System.out.println(lineNumber+" "+lineAt);
					}
					else {
						
					}
					
					
				}
				
			}
		}
		catch (Exception e) {
			e.getMessage();
		}


	}

}
