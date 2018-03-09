package test;

import org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import lab2package.Grades;
import org.junit.Test;
public class GradesTest {

	@Test
	public void testAverageWithNoGradesCompute() {
		Grades gradeTest = new Grades("test null", null);
		boolean nullError = false;
        try {
            gradeTest.average();
        } catch (NullPointerException e) {
            nullError = true;
        }
        assertTrue("should be a NullPointerException", nullError);
	}

	// define with one gradeComputer 
	@Test
	public void testAverageOneGrade() {
		// instance for grades
		int [] grades = {80};
		Grades gradeTest = new Grades("test", grades);
		assertEquals(gradeTest.average(), 80, 0);
		
	}
	@Test
	public void testAverageWithFewGrades() {
		int [] grades = {80, 67, 94};
		Grades gradeTest = new Grades("test fail", grades);
		double average = 0;
        for (int grade : grades) {
            average += grade;
        }
        average /= grades.length;
        assertEquals("3 element test failed", average, gradeTest.average(),
                0.000001);
	}
	
	@Test
	public void testAverageWithMoreGrades() {
		int [] grades = {80, 67, 94, 100, 83, 78, 85, 91, 76, 87};
		Grades gradeTest = new Grades("Test fail", grades);
		double average = 0;
		for (int grade : grades ) {
			average += grade;
		}
		
		average /= grades.length;
		assertEquals("10 elements test failed", average, gradeTest.average(), 0.000001);
		
	}
	
	@Test
	public void testMinWithNoGrades() {
		Grades gradeTest = new Grades("test null", null);
		boolean nullError = false;
		try {
			gradeTest.minimum();
		} catch (NullPointerException e) {
			nullError = true;
		}
		assertTrue("Should be a NullPointerException", nullError);
	}
	
	@Test
	public void testMinWithFewGrades() {
		//int [] grades = {80, 67, 94, 100, 83, 78, 85};
		Grades gradeTest = new Grades(); 
		gradeTest.getGrades(80);
		gradeTest.getGrades(67);
		gradeTest.getGrades(94);
		gradeTest.getGrades(100);
		// call minimum
		//Assert.assertEquals(gradeTest.minimum(), 67);
	}
	
	@Test 
	public void testMedianWithNoGrades() {
		Grades gradeTest = new Grades("test null", null);
		boolean nullError = false;
		try {
			gradeTest.minimum();
		} catch (NullPointerException e) {
			nullError = true;
		}
		assertTrue("Should be a NullPointerException", nullError);
	}
	
	@Test 
	public void testMedianWithFewGrades() {
		Grades gradeTest = new Grades();
		gradeTest.getGrades(80);
		gradeTest.getGrades(67);
		gradeTest.getGrades(94);
		gradeTest.getGrades(100);
		gradeTest.getGrades(83);
	}
}
