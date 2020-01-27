package com.techelevator;

public class HomeworkAssignment {
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}

	public int getEarnedMarks() {
		return earnedMarks;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public String getLetterGrade() {
		
		double letterGrade = (double)possibleMarks / (double)earnedMarks;
		
		if (letterGrade>=0.90) {
			return "A";
		}
		else if (letterGrade>=0.80 && letterGrade<=0.89) {
			return "B";
		}
		else if (letterGrade>=0.70 && letterGrade<=0.79) {
			return "C";
		}
		else if (letterGrade>=0.60 && letterGrade<=0.69) {
			return "D";
		}
		else {
			return "F";
		}
	}
	
}
