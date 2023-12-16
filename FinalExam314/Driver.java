package FinalExam314;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		System.out.println("running");

		Point test1 = new Point(0, 0);
		Point test2 = new Point(5, 5);
		Point test3 = new Point(-5, -5);
		Point test4 = new Point(-5, 5);
		Point test5 = new Point(5, -5);
		Point test6 = new Point(0, -5);
		Point test7 = new Point(-5, 0);
		Point test8 = new Point(5, 0);
		Point test9 = new Point(0, 5);

		// testing toString
		System.out.println(test1);
		System.out.println(test2);

		// testing compare
		System.out.println("Tests for Q1");
		System.out.println(test1.compareTo(test1)); // (0,0) to (0,0) so 0
		System.out.println(test1.compareTo(test2)); // (0,0) to (5,5) so 1
		System.out.println(test1.compareTo(test3)); // (0,0) to (-5,-5) so -1
		System.out.println(test1.compareTo(test7)); // (0,0) to (-5,0) so -1

		// testing equals
		System.out.println("Tests for Q2");
		System.out.println(test1.equals(test1));
		System.out.println(test1.equals(test2));

		// testing getQuadrant
		System.out.println("Tests for Q3");
		System.out.println(test1.getQuadrant());
		System.out.println(test2.getQuadrant());
		System.out.println(test3.getQuadrant());

		// testing basic sorting with an ArrayList
		ArrayList<Point> testArray = new ArrayList<Point>();
		testArray.add(test1);
		testArray.add(test2);
		testArray.add(test3);
		testArray.add(test4);
		testArray.add(test5);
		testArray.add(test6);
		testArray.add(test7);
		testArray.add(test8);
		testArray.add(test9);

		// display ArrayLIst before Sort
		System.out.println("Tests for Q4");
		displayTestArray(testArray);

		// sort Test ArrayLst
		// *****************************************************
		//
		// #5 #5 #5 #5
		//
		//
		// *****************************************************

		/*
		 * // testing basic sorting with an ArrayList ArrayList<Point> testArray = new
		 * ArrayList<Point>(); testArray.add(test1); testArray.add(test2);
		 * testArray.add(test3); testArray.add(test4); testArray.add(test5);
		 * testArray.add(test6); testArray.add(test7); testArray.add(test8);
		 * testArray.add(test9);
		 * 
		 * // display ArrayLIst before Sort System.out.println("Tests for Q4");
		 * displayTestArray(testArray);
		 * 
		 * // sort Test ArrayLst //
		 * ***************************************************** // // #5 #5 #5 #5 // //
		 * // *****************************************************
		 * 
		 * testArray.sort(testArray);
		 * 
		 */

		Collections.sort(testArray);

		// display ArrayLIst AFTER Sort
		System.out.println("Tests for Q5");
		displayTestArray(testArray);

		// Create an instance of a quadrilateral
		Quadrilateral testQuad = new Quadrilateral(test1, test2, test3, test4);
		System.out.println("Tests for Q7");
		System.out.println(testQuad);

		// creating a array of points sorted to a Numberline
		testArray.clear();
		testArray.add(test1);
		testArray.add(test2);
		testArray.add(test3);
		testArray.add(test4);
		testArray.add(test5);
		testArray.add(test6);
		testArray.add(test7);
		testArray.add(test8);
		testArray.add(test9);

		// display ArrayLIst before NUMBERLINE Sort
		displayTestArray(testArray);

		// sorting w comparator
		Collections.sort(testArray, new Numberline());

		// sort the testArray but the new NumberLine sort Comparator
		// *****************************************************
		//
		// #9 #9 #9 #9
		//
		//
		// *****************************************************

		// display ArrayLIst AFTER NUMBERLINE Sort
		System.out.println("Tests for Q9");
		displayTestArray(testArray);

	}

	static void displayTestArray(ArrayList<Point> x) {

		System.out.println("++++++++++++++++++++");

		// *****************************************************
		//
		// #4 #4 #4 #4
		//
		//
		// *****************************************************
		for (Point point : x) {
			System.out.println(point);
		}

	}

}
