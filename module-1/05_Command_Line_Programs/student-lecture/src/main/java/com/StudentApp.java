package com;


public class StudentApp {
	
	public static void main(String[] args) {
	//create a default constructor
	
	Student johnny = new Student("John", "Wayne");
	
	johnny.addStudentScore(100);
	johnny.addStudentScore(50);
	johnny.addStudentScore(75);
	
	System.out.print(johnny.getOverallGrade());
	
	
	
	}
}
