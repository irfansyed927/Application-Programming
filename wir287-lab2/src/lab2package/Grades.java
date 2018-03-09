package lab2package;

import java.util.Arrays;

/**
 * Lab2.java
 * Lab 2 that reads file, store the data into objects and process the obects.
 * @author Irfan Syed 
 *
 */
public class Grades {
	/**
	 * Stores the name  
	 */
	private String name; // field means each account object contain a string
	/**
	 * Stores the grades
	 * 
	 */
	private int[] grades; // field grades each object contains int 
	/**
	 * Lab2 constructor that receives two parameters 
	 * @param name
	 * 	to initialize the name field 
	 *  @param grades 
	 *  	to initialize the grades field 
	 */
	public Grades(String name, int[] grades){
		this.name = name; // student name is set 
		this.grades = grades; // student grade is set
	}
	public Grades() {
		// TODO Auto-generated constructor stub
		name = "null";
	}
	public void setName(String name) {
		this.name = name; // stores the name 
	}// end method setName 
	
	/**
	 * Method to retrieve grades 
	 * @param grade 
	 * @return The array of grades 
	 */
	public int[] getGrades(int grade){
		return grades;
	}
	
	/**
	 * Method to retrieve name 
	 * @return the name of caller 
	 */
	
	public String getName() {
		return name; // return the value of name to caller
	}
	
	/**
	 * return a String and doesnt contain any print statments 
	 */
	public String toString() {
		return String.format(name, grades); 
	}
	/**
	 * The maximum number found in the arraylist 
	 */
	public int maximum() {
		int max = 0; 
		for(int i = 0; i < grades.length; i++) {
			if (grades[i] > max) {
				max = grades[i];
			}
		}
		return max;
	}
	/**
	 * Finding and returning the minimum number found in array 
	 */
	public int minimum() {
		int min = 1000; 
		for (int i = 0; i < grades.length; i++ ) {
			if (grades[i] < min) {
				min = grades[i];
			}
		}
		return min;
	}
	/**
	 * Method to return the length of an array 
	 * return the length
	 */
	public int length() {
		int length = grades.length; // initializing to the length of grades
		return length; // returning the length 
	}
	
	/**
	 * Finding the average of the array grades provdided in data.txt
	 * @return average 
	 */
	
	public double average() {
		double average = 0;
		for (int i = 0; i < grades.length; i++) {
			average += grades[i];
		}
		return (average/grades.length);
	}
	
	/**
	 * Finding the median number in the array
	 * @return median 
	 */
	
	public double median() {
		double median = 0; 
		int length = grades.length; 
		Arrays.sort(grades);
		if(length % 2 == 1 ) {
			median = grades[grades.length / 2 -1];
		} else {
			double mid1 = grades[grades.length / 2 -1];
			double mid2 = grades[grades.length / 2];
			median = (mid1 + mid2) / 2;
		}
		return median;
	}
}


