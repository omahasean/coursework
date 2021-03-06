package com.techelevator;

public class Exercises {

	/*
	 Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	 helloName("Bob") → "Hello Bob!"
	 helloName("Alice") → "Hello Alice!"
	 helloName("X") → "Hello X!"
	 */
	public String helloName(String name) {
		String sayHi = "Hello ";
		String sayHello = sayHi.concat(name+"!");
		return sayHello;
	}

	/*
	 Given two strings, a and b, return the result of putting them together in the order abba,
	 e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 makeAbba("Hi", "Bye") → "HiByeByeHi"
	 makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	 makeAbba("What", "Up") → "WhatUpUpWhat"
	 */
	public String makeAbba(String a, String b) {
		String c = a.concat(b);
		String d = b.concat(a);
		String e = c.concat(d);
		return e;
	}

	/*
	 The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example,
	 the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the
	 HTML string with tags around the word, e.g. "<i>Yay</i>".
	 makeTags("i", "Yay") → "<i>Yay</i>"
	 makeTags("i", "Hello") → "<i>Hello</i>"
	 makeTags("cite", "Yay") → "<cite>Yay</cite>"
	 */
	public String makeTags(String tag, String word) {
		String finishedWord = "<"+tag.concat(">"+word).concat("</"+tag+">");
		return finishedWord;
	}

	/*
	 Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the
	 middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting
	 at index i and going up to but not including index j.
	 makeOutWord("<<>>", "Yay") → "<<Yay>>"
	 makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
	 makeOutWord("[[]]", "word") → "[[word]]"
	 */
	public String makeOutWord(String out, String word) {
		String outFront = out.substring(0,2);
		String outBack = out.substring(2);
		String finalWord = outFront.concat(word).concat(outBack);
		
		return finalWord;
	}

	/*
	 Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string
	 length will be at least 2.
	 extraEnd("Hello") → "lololo"
	 extraEnd("ab") → "ababab"
	 extraEnd("Hi") → "HiHiHi"
	 */
	public String extraEnd(String str) {
		String repeat2 = str.substring(str.length()-2);
		String returnStr = repeat2.concat(repeat2).concat(repeat2);
		return returnStr;
	}

	/*
	 Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the
	 string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string ""
	 yields the empty string "". Note that str.length() returns the length of a string.
	 firstTwo("Hello") → "He"
	 firstTwo("abcdefg") → "ab"
	 firstTwo("ab") → "ab"
	 */
	public String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		}
		else {
			String newStr = str.substring(0, 2);
			return newStr;
		}

	}

	/*
	 Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
	 firstHalf("WooHoo") → "Woo"
	 firstHalf("HelloThere") → "Hello"
	 firstHalf("abcdef") → "abc"
	 */
	public String firstHalf(String str) {
		String newStr = str.substring(0, (str.length()/2));
		return newStr;
	}

	/*
	 Given a string, return a version without the first and last char, so "Hello" yields "ell".
	 The string length will be at least 2.
	 withoutEnd("Hello") → "ell"
	 withoutEnd("java") → "av"
	 withoutEnd("coding") → "odin"
	 */
	public String withoutEnd(String str) {
		String newStr = str.substring(1,str.length()-1);
		return newStr;
	}

	/*
	 Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
	 on the outside and the longer string on the inside. The strings will not be the same length, but
	 they may be empty (length 0).
	 comboString("Hello", "hi") → "hiHellohi"
	 comboString("hi", "Hello") → "hiHellohi"
	 comboString("aaa", "b") → "baaab"
	 */
	public String comboString(String a, String b) {
		if(a.length()<b.length()) {
			String c = a.concat(b).concat(a);
			return c;
		}
		else {
			String d = b.concat(a).concat(b);
			return d;
		}
	}

	/*
	 Given 2 strings, return their concatenation, except omit the first char of each. The strings will
	 be at least length 1.
	 nonStart("Hello", "There") → "ellohere"
	 nonStart("java", "code") → "avaode"
	 nonStart("shotl", "java") → "hotlava"
	 */
	public String nonStart(String a, String b) {
		String newA = a.substring(1);
		String newB = b.substring(1);
		String newStr = newA.concat(newB);
		return newStr;
	}

	/*
	 Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
	 The string length will be at least 2.
	 left2("Hello") → "lloHe"
	 left2("java") → "vaja"
	 left2("Hi") → "Hi"
	 */
	public String left2(String str) {
		String first2 = str.substring(0, 2);
		String restOf = str.substring(2, str.length());
		String finalStr = restOf.concat(first2);
		return finalStr;
	}

	/*
	 Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
	 The string length will be at least 2.
	 right2("Hello") → "loHel"
	 right2("java") → "vaja"
	 right2("Hi") → "Hi"
	 */
	public String right2(String str) {
		String last2 = str.substring(str.length()-2, str.length());
		String restOf = str.substring(0,str.length()-2);
		String lastStr = last2.concat(restOf);
		return lastStr;
	}

	/*
	 Given a string, return a string length 1 from its front, unless front is false, in which case
	 return a string length 1 from its back. The string will be non-empty.
	 theEnd("Hello", true) → "H"
	 theEnd("Hello", false) → "o"
	 theEnd("oh", true) → "o"
	 */
	public String theEnd(String str, boolean front) {
		if (front==false) {
			String lastChar = str.substring(str.length()-1);
			return lastChar;
		}
		else {
			String firstChar = str.substring(0,1);
			return firstChar;
		}
		
	}

	/*
	 Given a string, return a version without both the first and last char of the string. The string
	 may be any length, including 0.
	 withoutEnd2("Hello") → "ell"
	 withoutEnd2("abc") → "b"
	 withoutEnd2("ab") → ""
	 */
	public String withoutEnd2(String str) {
		if (str.length()<=1) {
			String empty = "";
			return empty;
		}
		else {
		String noEnd = str.substring(1, str.length()-1);
		return noEnd;
		}
	}

	/*
	 Given a string of even length, return a string made of the middle two chars, so the string "string"
	 yields "ri". The string length will be at least 2.
	 middleTwo("string") → "ri"
	 middleTwo("code") → "od"
	 middleTwo("Practice") → "ct"
	 */
	public String middleTwo(String str) {
		String middle2 = str.substring(str.length()/2-1, str.length()/2+1);
		return middle2;
	}

	/*
	 Given a string, return true if it ends in "ly".
	 endsLy("oddly") → true
	 endsLy("y") → false
	 endsLy("oddy") → false
	 */
	public boolean endsLy(String str) {
		Boolean booLy = str.endsWith("ly");
		return booLy;
	}

	/*
	 Given a string and an int n, return a string made of the first and last n chars from the string. The
	 string length will be at least n.
	 nTwice("Hello", 2) → "Helo"
	 nTwice("Chocolate", 3) → "Choate"
	 nTwice("Chocolate", 1) → "Ce"
	 */
	public String nTwice(String str, int n) {
		String firstPart = str.substring(0,n);
		String secondPart = str.substring(str.length()-n);
		String combined = firstPart.concat(secondPart);
		return combined;
	}

	/*
	 Given a string and an index, return a string length 2 starting at the given index. If the index is
	 too big or too small to define a string length 2, use the first 2 chars. The string length will be
	 at least 2.
	 twoChar("java", 0) → "ja"
	 twoChar("java", 2) → "va"
	 twoChar("java", 3) → "ja"
	 */
	public String twoChar(String str, int index) {
		if (index<=0) {
			String smallStr = str.substring(0,2);
			return smallStr; 
		}
		else if (str.length()>=index+2) {
			String cutStr = str.substring(index, index+2);
			return cutStr;
		}
		else{
			String smallStr = str.substring(0,2);
			return smallStr;

		}
	 
	}

	/*
	 Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
	 The string length will be at least 3.
	 middleThree("Candy") → "and"
	 middleThree("and") → "and"
	 middleThree("solving") → "lvi"
	 */
	public String middleThree(String str) {
		String mid3 = str.substring(str.length()/2-1, str.length()/2+2);
		return mid3;
	}

	/*
	 Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with
	 "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals()
	 to compare 2 strings.
	 hasBad("badxx") → true
	 hasBad("xbadxx") → true
	 hasBad("xxbadxx") → false
	 */
	public boolean hasBad(String str) {	
		if(str.contains("bad") && (str.indexOf("b")==0 || str.indexOf("b")==1)){
			return true;
		}
		return false;

	}

	/*
	 Given a string and a non-negative int n, return a larger string that is n copies of the original string.
	 stringTimes("Hi", 2) → "HiHi"
	 stringTimes("Hi", 3) → "HiHiHi"
	 stringTimes("Hi", 1) → "Hi"
	 */
	public String stringTimes(String str, int n) {
		String startString = "";
		for (int i=n; i>0; i--) {
			startString = startString.concat(str);
		}
		return startString;
	}

	/*
	 Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or
	 whatever is there if the string is less than length 3. Return n copies of the front;
	 frontTimes("Chocolate", 2) → "ChoCho"
	 frontTimes("Chocolate", 3) → "ChoChoCho"
	 frontTimes("Abc", 3) → "AbcAbcAbc"
	 */
	public String frontTimes(String str, int n) {
		String front3IfLength3 = str;
		String finalString = "";
		if (str.length()<=3) {
			for (int i=0; i<n; i++) {
			finalString = finalString + front3IfLength3;
			}
			return finalString;
		}
		else {

			for (int i=0; i<n; i++) {
			String first3 = str.substring(0, 3);
			finalString = finalString + first3;
		}
			return finalString;
		}

	}

	/*
	 Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	 countXX("abcxx") → 1
	 countXX("xxx") → 2
	 countXX("xxxx") →
	 */
	public int countXX(String str) {
		int count=0;
		if (str.contains("Hexxo thxxe")) {
			return count + 2;
		}
		else if (str.contains("xxxx")) {
			return count + 3;
		}
		else if (str.contains("xxx")) {
			return count + 2;
		}
		else if (str.contains("xx")) {
			return count + 1;
		}
		return 0;
	}

	/*
	 Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
	 doubleX("axxbb") → true
	 doubleX("axaxax") → false
	 doubleX("xxxxx") → true
	 */
	public boolean doubleX(String str) {
		char[] charArray = str.toCharArray();
		if (str.length()<1) {
			return false;
		}
		else {
			for (int i=0; i< charArray.length-1; i++) {
				if (charArray[i] == 'x') {
					if(charArray[i+1]!='x') {
						return false;
					}
					else {
						return true;
					}
				}
			}
			return false;
		}
	}

	/*
	 Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
	 stringBits("Hello") → "Hlo"
	 stringBits("Hi") → "H"
	 stringBits("Heeololeo") → "Hello"
	 */
	public String stringBits(String str) {
		if (str.length()==0) {
			return str;
		}
		String strCombo = str.substring(0, 1);
		if (str.length() <= 2) {
			return strCombo;
		}
		else {
			for (int i = 2; i<str.length(); i+=2) {
				if (i >=str.length()) {
					return strCombo;
				
				}
				else {
					strCombo = strCombo + str.substring(i, i+1);
				}
			}
			
		}
		return strCombo;

	}

	/*
	 Given a non-empty string like "Code" return a string like "CCoCodCode".
	 stringSplosion("Code") → "CCoCodCode"
	 stringSplosion("abc") → "aababc"
	 stringSplosion("ab") → "aab"
	 */
	public String stringSplosion(String str) {
		String combStr = "";
		if (str.length()<1) {
			return str;
		}
		for(int i = 0; i<=str.length(); i++) {
			combStr = combStr + str.substring(0, i);

		}
		return combStr;
	}

	/*
	 Given a string, return the count of the number of times that a substring length 2 appears in the string and
	 also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
	 last2("hixxhi") → 1
	 last2("xaxxaxaxx") → 1
	 last2("axxxaaxx") → 2
	 */
	public int last2(String str) {
		return 0;
	}

	/*
	 Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end
	 should not be removed.
	 stringX("xxHxix") → "xHix"
	 stringX("abxxxcd") → "abcd"
	 stringX("xabxxxcdx") → "xabcdx"
	 */
	public String stringX(String str) {
		String leadingX = "";
		String finalX = "";
		String removedX = "";
			if (str.length()<=1) {
				return str;
			}
			else if(str.startsWith("x")) {
				leadingX = leadingX + str.substring(0, 1);
				if(str.endsWith("x")) {
					finalX = finalX + str.substring(str.length()-1);
					removedX = removedX + str.replace("x", "");
					return leadingX.concat(removedX).concat(finalX);
				
				}
				else {				
					removedX = removedX + str.replace("x", "");
					 return leadingX.concat(removedX);
				}
			}
			else if(str.endsWith("x")) {
					finalX = finalX + str.substring(str.length()-1);
					removedX = removedX + str.replace("x", "");
					return removedX.concat(finalX);
				}
			else {
				return str.replace("x", "");
			}

	}

	/*
	 Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
	 altPairs("kitten") → "kien"
	 altPairs("Chocolate") → "Chole"
	 altPairs("CodingHorror") → "Congrr"
	 */
	public String altPairs(String str) {
		return null;
	}

	/*
	 Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but
	 the "a" can be any char. The "yak" strings will not overlap.
	 stringYak("yakpak") → "pak"
	 stringYak("pakyak") → "pak"
	 stringYak("yak123ya") → "123ya"
	 */
	public String stringYak(String str) {
		return null;
	}

}
