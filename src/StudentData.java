/**
 * Student Data class
 * 
 * @author Phong Vang
 * @version 1.0
 * @since 2018-11-30
 * 
 */

import java.io.*;

public class StudentData {
	private int id;
	private String firstName;
	private String lastName;
	private double midtermScore;
	private double finalScore;
	private double homeworkScore;
	
	public StudentData() {
	}
	
	public StudentData(int id, String firstName, String lastName, double midtermScore, double finalScore, double homeworkScore) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.midtermScore = midtermScore;
		this.finalScore = finalScore;
		this.homeworkScore = homeworkScore;
	}
	
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstname() {
		this.firstName = firstName;
	}
	
	public String lastName() {
		return lastName;
	}
	public void setLastName() {
		this.lastName = lastName;
	}
	
	public double getMidtermScore() {
		return midtermScore;
	}
	public void setMidtermScore() {
		this.midtermScore = midtermScore;
	}
	
	public double getFinalScore() {
		return finalScore;
	}
	public void setFinalScore() {
		this.finalScore = finalScore;
	}
	
	public double getHomeworkScore() {
		return homeworkScore;
	}
	public void setHomeworkScore() {
		this.homeworkScore = homeworkScore;
	}
	
	public double calculateAverage() {
		return (midtermScore * 3.0 + finalScore * 0.4 + homeworkScore * 0.3);
	}
	
	public char calculateGrade() {
		char grade;
		double avgScore, aGrade = 90, bGrade = 80, cGrade = 70, dGrade = 60;
		
		avgScore = calculateAverage();
		
		if( avgScore >= aGrade)
			grade = 'A';
		else if(avgScore >= bGrade)
			grade = 'B';
		else if(avgScore >= cGrade)
			grade = 'C';
		else if(avgScore >= dGrade)
			grade = 'D';
		else
			grade = 'F';
		
		return grade;
	}
	
	@Override
	public String toString() {
		return String.format("%-5d %-12s %-14s %-5.2f %-8.2f %-9.2f %-9.2f %-13c",
				id, firstName, lastName, midtermScore, finalScore, homeworkScore,
				calculateAverage(), calculateGrade() );
	}
	
}

