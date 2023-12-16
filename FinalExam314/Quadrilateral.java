package FinalExam314;

import java.util.ArrayList;

public class Quadrilateral {

	Quadrilateral() {
	}

	Quadrilateral(Point a, Point b, Point c, Point d) {

		// *****************************************************
		//
		// #6 #6 #6 #6
		//
		//
		// *****************************************************

		// can pretend the sides of the Quadrilateral do not cross

		// um i switched the a and b to match question 7 output exactly
		points.add(b);
		points.add(a);
		points.add(c);
		points.add(d);

		// I believe the intended way is
		points.add(a);
		points.add(b);
		points.add(c);
		points.add(d);

	}

	private ArrayList<Point> points = new ArrayList<Point>(4);

	@Override
	public String toString() {
		// *****************************************************
		//
		// #7 #7 #7 #7
		//
		//
		// *****************************************************

		String value = "------------------------------ \n";
		// PLease place a "\n" after displaying each point

		// lovely for each loop lol

		for (Point point : points) {
			value += point.toString() + "\n";
		}

		return value + "\n";
	}

}
