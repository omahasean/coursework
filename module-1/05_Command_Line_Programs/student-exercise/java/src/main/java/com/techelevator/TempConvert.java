package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	//
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			// Return correct temperature and ask if they would like to do again.
			boolean goAgain = true;
			while (goAgain == true) {
				// Ask user for temperature in float (decimal format)
				System.out.println("What is the temperature? (Enter just the number)");
				String tempInput = in.nextLine();
				double tempActual = Double.parseDouble(tempInput);
				// Ask user for temperature measurement (F or C)
				System.out.println("(C)elsius or (F)arenheit? Or type another character to escape.");
				String tempType = in.nextLine();
				// Put temperature through correct function
				if (tempType.equalsIgnoreCase("C")) { // Tc = (Tf - 32) / 1.8
					double tempFarenheit = tempActual * 1.8 + 32;
					System.out.println("It is " + tempActual + "C or " + tempFarenheit + "F");
					continue;
				} else if (tempType.equalsIgnoreCase("F")) {
					double tempCelsius = ((tempActual - 32) / 1.8);
					System.out.println("It is" + tempActual + "F or " + tempCelsius + "C");
				}else{
					System.out.println("Invalid input, would you like to try again? (Y/N)");
						String tryAgain = in.nextLine();
						if(tryAgain.equalsIgnoreCase("Y")) {
							goAgain=true;
						}
						else {
							goAgain=false;
							break;
						}
					
				}
				

			}

		}

	}
}
