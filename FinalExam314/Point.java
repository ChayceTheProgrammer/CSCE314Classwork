package FinalExam314;

class Point implements Comparable<Point> {

	private float xPoint;
	private float yPoint;

	// constructors
	Point() {
	}

	Point(float newX, float newY) {
		xPoint = newX;
		yPoint = newY;
	}

	// accessors/getters
	public float getXPoint() {
		return xPoint;
	}

	public float getYPoint() {
		return yPoint;
	}

	// mutators/setters
	public void setXPoint(float newX) {
		xPoint = newX;
	}

	public void setYPoint(float newY) {
		yPoint = newY;
	}

	// Question1
	@Override
	public int compareTo(Point newPT) {
		// if compared (and printed) left to right, top to bottom in increasing value
		// fashion
		// use the chart to help provide what the results should be

		// testing compare
		// If the two points being compared are the same,
		// just return 0.

		// If the new point (newPT), compared to the original,
		// is positioned in the bottom-right direction, the function returns the value
		// 1.
		// *****************************************************
		//
		// #1 #1 #1 #1
		//
		//
		// *****************************************************

		if ((newPT.getXPoint() < this.xPoint)
				|| (newPT.getXPoint() == this.xPoint && newPT.getYPoint() > this.yPoint)) {
			return -1;
		}
		// same point
		if (newPT.getXPoint() == this.xPoint && newPT.getYPoint() == this.yPoint)
			return 0;

		// point is bottom right direction, x increases (can stay the same value too
		// apprearantly), y decreases
		if ((newPT.getXPoint() > this.xPoint)
				|| (newPT.getXPoint() == this.xPoint && newPT.getYPoint() < this.yPoint)) {
			return 1;
		} else {
			return -10; // bruh how we get here?;
		} // you may modify this line
	}

	public boolean equals(Point newPT) {
		// *****************************************************
		//
		// #2 #2 #2 #2
		//
		//
		// *****************************************************
		if (this.xPoint == newPT.xPoint && this.yPoint == newPT.yPoint)
			return true;

		return false; // you may modify this line
	}

	// toString
	@Override
	public String toString() {
		return "X: " + getXPoint() + "\t\tY: " + getYPoint();
	}

	// other methods
	public int getQuadrant() {
		// *****************************************************
		//
		// #3 #3 #3 #3
		//
		//
		// *****************************************************

		// case if lands on any axis
		if (this.getXPoint() == 0 || this.getYPoint() == 0) {
			return 0;
		}

		// x is pos, y is pos Quad 1
		if (this.getXPoint() > 0 && this.getYPoint() > 0) {
			return 1;
		}
		// x is neg, y is pos Quad 2
		if (this.getXPoint() < 0 && this.getYPoint() > 0) {
			return 2;
		}
		// x is neg, y is neg Quad 3
		if (this.getXPoint() < 0 && this.getYPoint() < 0) {
			return 3;
		}
		// x is pos, y is neg Quad 4
		if (this.getXPoint() > 0 && this.getYPoint() < 0) {
			return 4;
		}
		return 0; // you may modify this line
	}

}