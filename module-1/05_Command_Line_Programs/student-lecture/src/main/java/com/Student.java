package com;

import java.util.ArrayList;
import java.util.List;

public class Student {


	private String firstName;
	private String lastName;

	public Student (String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	//create a List of Grades
	private List <Integer> scores= new ArrayList<Integer>();
	

	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}

	public String getOverallGrade() {
		//put calculate score logic here
		int sum = 0;
		for (int i : scores) {
			sum+=i;
		}
		double avg = sum / scores.size();
		if (avg>50) {
			return "A";
		}
		else {
			return "F";
		}

	}
	
	public void addStudentScore(Integer score) {
		this.scores.add(score);
	}
	
}
