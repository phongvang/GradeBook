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
		 * A scanner object associated with the data file
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
		
		//test print
		System.out.println("---No Errors---");
		
	}

}
