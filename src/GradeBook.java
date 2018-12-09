/**
 * This is a simple GradeBook program that reads in an student grade information from an input file. 
 * It is menu driven to execute.
 * 
 * @author Phong Vang
 * @version 1.0
 * @since 2019-11-30
 * 
 */

import java.io.*;
import java.util.Scanner;


public class GradeBook {

	public static void main(String[] args) throws FileNotFoundException {
		
		/** 
		 * An array of StudentData with length of 10
		 */
		StudentData [] list = new StudentData[10];
		
		/**
		 * A scanner object associated with the input data file
		 */
		Scanner inFile = new Scanner(new FileReader("student_data.txt"));
		
		int id;
		String first, last;
		double midterm, finalExam, homework;
		
		/** 
		 * For loop to read the input file, create list objects and populate the array.
		 */
		for(int i=0; i<list.length; i++) {
			id = inFile.nextInt();
			first = inFile.next();
			last = inFile.next();
			midterm = inFile.nextDouble();
			finalExam = inFile.nextDouble();
			homework = inFile.nextDouble();
			
			list[i] = new StudentData(id, first, last, midterm, finalExam, homework);
		}
		
		inFile.close();
		
		for(int i=0; i<list.length; i++) {
			System.out.println( list[i].toString() );
		}
		
		//---ENTER MENU DRIVEN CASE STATEMENTS HERE---
		boolean flag = true;
		int userInput;
		Scanner console = new Scanner(System.in);
		
		while(flag) {
			
			System.out.println("\n"
					+ "1. Output student information. \n"
					+ "2. Output the class average. \n"
					+ "3. Get the highest scoring student. \n"
					+ "4. Get students with an 'A' grade. \n"
					+ "5. Exit program.");
			
			System.out.println("--Enter your command: ");
			
			userInput = console.nextInt();
			
			/**
			 * switch statements to retrieve user's requests.
			 */
			switch(userInput) {
				case 1: //output student information
					System.out.println("--- Student information ---");
					System.out.println("ID    First	 Last	    Midterm    Final	 Homework"
							+"  Average Grade");
					
					for(int i=0; i<list.length; i++) {
						System.out.println( list[i].toString() );
					}
					
					break;
					
				case 2: //output the class average
					System.out.println("--- Class Average ---");
					double sum = 0;
					double classAvg = 0;
					int count = 0;
					
					for(int i=0; i<list.length; i++) {
						sum += list[i].calculateAverage();
						count ++;
					}
					
					classAvg = sum / count;
					
					System.out.printf("%.2f\n", classAvg);
					
					break;
					
				case 3: //output highest average scoring student
					System.out.println("--- Highest Average Score ---");
					int highIndex = 0;
					
					for(int i=1; i<list.length; i++) {
						if(list[highIndex].calculateAverage() < list[i].calculateAverage())
							highIndex = i;
					}
					System.out.println("ID    First	 Last	    Midterm    Final	 Homework"
							+"  Average Grade");
					System.out.println(list[highIndex]);
					
					break;
					
				case 4: //output all students with an 'A' grade
					System.out.println("--- Students with 'A' grades ---");
					System.out.println("ID    First	 Last	    Midterm    Final	 Homework"
							+"  Average Grade");
					
					for(int i=0; i<list.length; i++) {
						if(list[i].calculateGrade() == 'A')
							System.out.println(list[i]);
					}
					
					
					break;
				case 5: 
					System.out.println("Program Terminated.");
					flag = false;
					break;
				
				default:
					System.out.println("Invalid command, try again");
					break;
					
			}//end switch
			
		}//end while
		
		
	}

}
