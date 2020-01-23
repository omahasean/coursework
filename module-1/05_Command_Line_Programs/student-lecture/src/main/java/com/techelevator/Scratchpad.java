package com.techelevator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.HashMap;
public class Scratchpad {
	public static void main(String[] args) {

	//List
	List<String> names = new ArrayList<String>();
	
	//add to our list
	names.add("Sean");
	names.add("Joe");
	names.add("Stephen");
	names.add("Mike");
	names.add("Bubba");
	System.out.println(names.size());
	
	if (names.size() !=0) {
		System.out.println(names.get(0));
	}
	
	for (int i =0; i<names.size(); i++) {
		System.out.println(names.get(i));
	}
	//or using for each loop OBJECTS ONLY
	for (String name: names) {
		if (name.equals("Bubba")) {
			System.out.println(name);
		}
		else {
		System.out.println(name + " is not Bubba");
	}
	}
	//also works with Primitives
	int [] scores = new int[] {12,33,44,55,66,45,67};
	for (int score: scores) {
		System.out.println("Score is: "+score);
	}
	//Queues
	Queue<String> priorities = new LinkedList<String>();
	
	priorities.offer("Clean the dishes");
	priorities.offer("Wash the counters");
	priorities.offer("Sweep the floor");
	priorities.offer("Scrub the floor");
	//Processing items in queue
	while (priorities.size()>0) {
		String nextPriority = priorities.poll();
		System.out.println("Next Priority: " + nextPriority);
	}
	//STACK
	Stack<String> browserStack = new Stack<String>();
	browserStack.push("http://www.cnn.com");
	browserStack.push("https://www.google.com");
	browserStack.push("https://techelevator.com");
	browserStack.push("https://wwww.si.com");
	
	//Popping the stack
	while (browserStack.size()>0) {
		String previousPage = browserStack.pop();
		System.out.println("Previous page: " + previousPage);
	}
	
	//****MAPS AND SETS****
	Integer one = new Integer(1);
	Map<Integer,String> myNewMap = new HashMap<Integer,String>();
	myNewMap.put(one, "myValue1");
	myNewMap.put(new Integer(2), "myValue2");
	
	String rs = myNewMap.get(1);
	System.out.print(rs);
	
	
	
}
}