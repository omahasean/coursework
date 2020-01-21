package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			//ask for decimal integers separated by spaces
			System.out.println("Please enter numbers seperated by spaces:");
			String numInput = in.nextLine();
			String[] numInputArray = numInput.split (" ");
			String placeHolder = "";
				for (int i = 0 ; i<numInputArray.length; i++) {
					int numOutput = Integer.parseInt(numInputArray[i]);
						String binaryString = "";
						System.out.println("\r" + "The number "+numOutput+" in Binary is:");
						while (numOutput != 0) {
								if (numOutput % 2 == 0) {
								binaryString = "0" + binaryString;
								} else {
								binaryString = "1" + binaryString;
								}
								numOutput = numOutput / 2;
								}
//							int remainder = numOutput%2;
//							String binaryOut = remainder + placeHolder;
//							String binaryFinal = placeHolder +binaryOut;
							System.out.print(binaryString);
//							numOutput = numOutput / 2;
						}
				}
		}
	}


