package lab2package;

import java.util.Scanner;
import java.io.File;
import java.util.*; 
/**
 * Lab 2 reads a file, store the data into objects, and process
 * the objects. 
 * @author Irfan Syed 
 *
 */
public class Lab2 {
	/**
	 * In the main method, file is opened data.txt and in the first while 
	 * loop it creates a name of the student, reads in the name and copy 
	 * the array grade to the gradelist whic is an int. 
	 * @param args
	 */
	public static void main(String[] args) {
		// Reading file data.txt 
		Scanner in = null; 
		try {
			in = new Scanner(new File ("data.txt"));
		} catch (Exception FileNotFoundException) {
			System.err.println("failed to open data.txt");
			System.exit(1);
		}
		while (in.hasNext()) {
			// creating the array list to store the values 
			ArrayList<Integer> arrayGrade = new ArrayList<Integer>();
			int[] gradeList;
			String name = in.next();
			while (in.hasNextInt()) {
				int grade = in.nextInt();
				arrayGrade.add(grade);
			
			}
			// copy arrayGrade to the gradeList 
			gradeList = new int[arrayGrade.size()];
			for(int index = 0; index < arrayGrade.size(); index++) {
				gradeList[index] = arrayGrade.get(index);
			}
			Grades student = new Grades(name, gradeList); 
			testGrades(student); // calling testgrade method
		
		}
		// closes the file 
		in.close();
	}
	/**
	 * 
	 * @param each grade object is tested with the following static method 
	 */
		
		public static void testGrades(Grades grades) {
		    System.out.printf("%s ",grades.getName());
		    System.out.println(Arrays.toString(grades.getGrades(0)));
		    System.out.printf("\tName:    %s\n", grades.getName());
		    System.out.printf("\tLength:  %d\n", grades.length());
	        System.out.printf("\tAverage: %.2f\n", grades.average());
	        System.out.printf("\tMedian:  %.1f\n", grades.median());
		    System.out.printf("\tMaximum: %d\n", grades.maximum());
		    System.out.printf("\tMininum: %d\n", grades.minimum());
		}
	}
	

