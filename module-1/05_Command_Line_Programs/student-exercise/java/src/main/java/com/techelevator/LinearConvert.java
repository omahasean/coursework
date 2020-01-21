package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			boolean goAgain = true;
			while (goAgain == true) {
				// Ask user for Distance
				System.out.println("What is the distance? (Enter just the number)");
				String distanceInput = in.nextLine();
				double distanceActual = Double.parseDouble(distanceInput);
				// Ask user for type of measurement (Metric Imperial)
				System.out.println("(I)mperial or (M)etric units.");
				String distanceType = in.nextLine();
				// Put distance through correct function
				if (distanceType.equalsIgnoreCase("M")) { // m = f * 0.3048
					double distanceImperial = distanceActual * 0.3048;
					System.out.println("It is " + distanceActual + "m or " + distanceImperial + "ft");
					continue;
				} else if (distanceType.equalsIgnoreCase("I")) {
					double distanceMetric = distanceActual * 3.2808399;
					System.out.println("It is" + distanceActual + "ft or " + distanceMetric + "m");
				} else {
					System.out.println("Invalid input, would you like to try again? (Y/N)");
					String tryAgain = in.nextLine();
					if (tryAgain.equalsIgnoreCase("Y")) {
						goAgain = true;
					} else {
						goAgain = false;
						break;
					}
				}
			}

		}
	}
}
