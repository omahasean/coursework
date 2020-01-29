package com.techelevator.ShippingExercise;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PostageCalculator {

	public static void main (String[] args) {
		
		List<DeliveryDriver> postageRates = new ArrayList<DeliveryDriver>();
		FexEd fexEd = new FexEd();
		PostalServiceFirstClass firstClass = new PostalServiceFirstClass();
		PostalServiceSecondClass secondClass = new PostalServiceSecondClass();
		PostalServiceThirdClass thirdClass = new PostalServiceThirdClass();
		SPUFourDayGround fourDayGround = new SPUFourDayGround();
		SPUNextDay nextDay = new SPUNextDay();
		SPUTwoDayBusiness twoDay = new SPUTwoDayBusiness();
		postageRates.add(firstClass);
		postageRates.add(secondClass);
		postageRates.add(thirdClass);
		postageRates.add(fexEd);
		postageRates.add(fourDayGround);
		postageRates.add(twoDay);
		postageRates.add(nextDay);
		
		try (Scanner in = new Scanner(System.in)) {
			
			System.out.println("Please enter the weight of the package: ");
			String weightInput = in.nextLine();
			double weight = Double.parseDouble(weightInput);
			System.out.println("(P)ounds or (O)unces?");
			String weightType = in.nextLine();
				if (weightType.toLowerCase() == "p") {
					weight = weight*16;
				}
			System.out.println("What distance will it be traveling?");
			String distanceIn = in.nextLine();
			int distance = Integer.parseInt(distanceIn);
			
			
			
			System.out.println(String.format("%-40s | %-40s", "Delivery Method", "$ cost"));
			for (DeliveryDriver d: postageRates) {
				System.out.println(String.format("%-40s | %-40s", d.getName(), d.calculateRate(distance, weight)));
			}
		}
		
	}

}
