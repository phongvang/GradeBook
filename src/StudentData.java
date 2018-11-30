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
	
}

