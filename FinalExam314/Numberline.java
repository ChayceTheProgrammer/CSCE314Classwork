package FinalExam314;

import java.util.Comparator;

class Numberline implements Comparator<Point> {

	@Override
	public int compare(Point p1, Point p2) {
		// need two points to make a line, says geometry (otherwise its a ray)

		if (p1.getXPoint() < p2.getXPoint()) {
			return -1; // first x is smaller
		}
		if (p1.getXPoint() == p2.getXPoint()) {
			return 0; // same x
		}
		if (p1.getXPoint() > p2.getXPoint()) {
			return 1; // first x is larger
		}

		return 9; // we broke the compare
	}

	// Comparator interface requires defining comparison method.

	// *****************************************************
	//
	// #8 #8 #8 #8
	//
	//
	// *****************************************************

}