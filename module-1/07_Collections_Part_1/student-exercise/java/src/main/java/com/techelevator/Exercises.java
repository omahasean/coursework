package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
	 */
	public List<String> array2List(String[] stringArray) {
		
		List<String> resultList = new ArrayList<String>();
		
		//do work here
		for(String s : stringArray) {
			resultList.add(s);
		}
		
//		for (int i = 0; i< stringArray.length; i++) {
//			resultList.add(stringArray[i]);
//		}
		
	
		return resultList;
	}

	/*
	 Given a list of Strings, return an array containing the same Strings in the same order
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList) {
		
		String[] stringArray = new String[stringList.size()];
		
			for (int i=0; i<stringList.size(); i++) {
				stringArray[i]=stringList.get(i);
			}
		
		
		return stringArray;
	}

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	public List<String> no4LetterWords(String[] stringArray) {
		List<String> returnList = new ArrayList<String>();
		for(int i=0; i<stringArray.length; i++) {
			if (stringArray[i].length()!=4) {
				returnList.add(stringArray[i]);
			}
		}
		return returnList;
	}

	/*
	 Given a List of Strings, return a new list in reverse order of the original. One obvious solution is to
	 simply loop through the original list in reverse order, but see if you can come up with an alternative
	 solution. (Hint: Think LIFO (i.e. stack))
	 reverseList( ["purple", "green", "blue", "yellow", "green" ])  -> ["green", "yellow", "blue", "green", "purple" ]
	 reverseList( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"} )
		-> ["way", "the", "all", "jingle", "bells", "jingle", "bells", "jingle"]
	 */
	public List<String> reverseList(List<String> stringList) {
		Stack<String> stringStack = new Stack<String>();
		List<String> resultList = new ArrayList<String>();
		
		for(int i = 0; i<stringList.size(); i++) {
			stringStack.push(stringList.get(i));
//			System.out.print(stringStack);
		}
		for (int i = 0; i<stringList.size(); i++) {
				resultList.add(stringStack.pop());
		}
		return resultList;
		
	}

	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public List<Double> arrayInt2ListDouble(int[] intArray) {
		List <Double> returnDouble = new ArrayList<Double>();
		int dividedNum = 0;
			for (int i = 0; i<intArray.length; i++) {
				dividedNum = (intArray[i]/2);
				returnDouble.add((double) dividedNum);
			}
		return returnDouble;
	}

	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 64362
	 */
	public Integer findLargest(List<Integer> integerList) {
		int largestNum = 0;
		for (int i = integerList.size()-1; i>0; i--) {
			largestNum = integerList.get(i);
			for (int x = 0; x<integerList.size(); x++) {
				if (largestNum<=integerList.get(x)) {
					
				}
				else {
					largestNum = integerList.get(i);
				}
			}
			
		}
		
		return largestNum;
		}


	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]
	 */
	public List<Integer> oddOnly(Integer[] integerArray) {
		List <Integer> listOddsOnly = new ArrayList<Integer>();
		for(int i = 0; i<integerArray.length; i++) {
			if (integerArray[i]%2 != 0) {
				listOddsOnly.add(integerArray[i]);
			}
		}
		return listOddsOnly;
	}

	/*
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 23, 44, 2, 88, 44], 44) -> true
	 */
	public boolean foundIntTwice(List<Integer> integerList, int intToFind) {
		int checkTwice = 0;
		for (int i = 0; i<integerList.size(); i++) {
			int numCheck = integerList.get(i);
			if (numCheck == intToFind) {
				checkTwice++;
			}
		}
		if (checkTwice>=2) {
			return true;
		}
		return false;
	}

	/*
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
	should be replaced by the String "Fizz", any multiple of 5 should be replaced by the String "Buzz",
	and any multiple of both 3 and 5 should be replaced by the String "FizzBuzz"
	** INTERVIEW QUESTION **
	
	fizzBuzzList( {1, 2, 3} )  ->  [1, 2, "Fizz"]
	 fizzBuzzList( {4, 5, 6} )  ->  [4, "Buzz", 6]
	 fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
	
	 HINT: To convert an integer x to a string you can call x.toString() in your code (e.g. if x = 1 then x.ToString()
	 equals "1")
	 */
	public List<String> fizzBuzzList(Integer[] integerArray) {
		List<String> fizzBuzzOut = new ArrayList<String>();
		
		for (int i=0; i<integerArray.length; i++) {
			if(integerArray[i]%3==0 && integerArray[i]%5==0) {
				fizzBuzzOut.add("FizzBuzz");
			}
			else if(integerArray[i]%3==0) {
				fizzBuzzOut.add("Fizz");
			}
			else if(integerArray[i]%5==0) {
				fizzBuzzOut.add("Buzz");
			}
			else {
				fizzBuzzOut.add(integerArray[i].toString());
			}
		}
		return fizzBuzzOut;
	}

	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
		List<Integer> comboArray = new ArrayList<Integer>();
			if (listOne.size()<1) {
				return listTwo;
			}
			else if(listTwo.size()<1) {
				return listOne;
			}
			else if (listOne.size()==listTwo.size()) {
				for (int i=0; i<listOne.size(); i++) {
					comboArray.add(listOne.get(i));
					comboArray.add(listTwo.get(i));
					System.out.print(comboArray);
				}
			}
			else if (listOne.size()>listTwo.size()) {
				for(int i=0; i< listTwo.size(); i++) {
					comboArray.add(listOne.get(i));
					comboArray.add(listTwo.get(i));
				}
				int differenceInSize = listOne.size()-listTwo.size();
				comboArray.add(differenceInSize, listOne.size()-1);
				System.out.print(comboArray);
			}
			else if (listTwo.size()>listOne.size()) {
				for(int i=0; i< listOne.size(); i++) {
					comboArray.add(listOne.get(i));
					comboArray.add(listTwo.get(i));
					
				}
				int differenceInSize = listTwo.size()-listOne.size();
				comboArray.add(differenceInSize, listTwo.size()-1);
				System.out.print(comboArray);
			}
		
		return comboArray;
	}

	/*
	 Given a list of Integers representing seat numbers, group them into ranges 1-10, 11-20, and 21-30.
	 (Any seat number less than 1, or greater than 30 is invalid, and can be ignored.) Preserve the order
	 in which the seat number entered their associated group. Return a list of the grouped Integers 1-10,
	 11-20, and 21-30. (Hint: Think multiple queues)
	 boardingGate( [1, 13, 43, 22, 8, 11, 30, 2, 4, 14, 21] ) -> [1, 8, 2, 4, 13, 11, 14, 22, 30, 21]
	 boardingGate( [29, 19, 9, 21, 11, 1, 0, 25, 15, 5, 31] ) -> [9, 1, 5, 19, 11, 15, 29, 21, 25]
	 boardingGate( [0, -1, 44, 31, 17, 7, 27, 16, 26, 6] ) -> [7, 6, 17, 16, 27, 26]
	 */
	public List<Integer> boardingGate(List<Integer> seatNumberList) {
		List<Integer> boardingOrder = new ArrayList<Integer>();
		Queue<Integer> firstTen = new LinkedList<Integer>();
		Queue<Integer> elevenTwenty = new LinkedList<Integer>();
		Queue<Integer> twentyOneThirty = new LinkedList<Integer>();
			for(int i=0; i<seatNumberList.size(); i++) {
				if (seatNumberList.get(i)<1 || seatNumberList.get(i)>30) {
					
				}
				else if(seatNumberList.get(i)>=1 && seatNumberList.get(i)<=10) {
					firstTen.add(seatNumberList.get(i));
				}
				else if(seatNumberList.get(i)>=11 && seatNumberList.get(i)<=20) {
					elevenTwenty.add(seatNumberList.get(i));
				}
				else {
					twentyOneThirty.add(seatNumberList.get(i));
				}
			}
			for (int i=firstTen.size(); i!=0; i--) {
				boardingOrder.add(firstTen.poll());
			}
			for (int i=elevenTwenty.size(); i!=0; i--) {
				boardingOrder.add(elevenTwenty.poll());
			}
			for (int i=twentyOneThirty.size(); i!=0; i--) {
				boardingOrder.add(twentyOneThirty.poll());
			}
		return boardingOrder;
	}

}
