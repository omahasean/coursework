package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)){
			System.out.println("What number in the sequence are you looking for?");
			String fibonacciNumber = in.nextLine();
			int sequenceNumber = Integer.parseInt(fibonacciNumber);{
				//declare an array
				int [] fibSequence = new int [sequenceNumber];
				int firstNum = 0;
				int secondNum = 1;
				int sumNums = firstNum+secondNum;
				System.out.print("0, 1, 1");
				for (int i = 0; sumNums<=sequenceNumber; i++) {
					fibSequence[i+1]= firstNum+secondNum;
					fibSequence[i+2]= fibSequence[i+1]+secondNum;
					firstNum=fibSequence[i+1];
					secondNum=fibSequence[i+2];
					sumNums=firstNum+secondNum;
					if(sumNums<=sequenceNumber) {
					System.out.print(", "+secondNum+", "+sumNums);
					}
					else {
						break;
					}
				}
			}
		}
	}

}
