package com.techelevator;

public class HomeworkAssignment {
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}

	public int getEarnedMarks() {
		return earnedMarks;
	}

	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	public String getLetterGrade() {
		double letterGrade = (double)earnedMarks/(double)possibleMarks;
		if (letterGrade>.9) {
			return "A";
		}
		else if (letterGrade>.8 && letterGrade<.9) {
			return "B";
		}
		else if (letterGrade>.7 && letterGrade<.8) {
			return "C";
		}
		else if (letterGrade>.6 && letterGrade<.7) {
			return "D";
		}
		else {
			return "F";
		}
	}

}
