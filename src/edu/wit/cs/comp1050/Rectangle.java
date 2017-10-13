package edu.wit.cs.comp1050;

//TODO: document this class
public class Rectangle extends Shape2D {
    // think about how you want to store the vertices of this rectangle
    // hint: an array might make sense
    
	/**
	 * Constructs a rectangle given two points
	 * 
	 * @param color rectangle color
	 * @param p1 point 1
	 * @param p2 point 2
	 */
	public Rectangle(String color, Point2D p1, Point2D p2) {
		super(color, ""); // replace with your code
		// note: you can't assume that the points p1 and p2 are given to you in any particular order
	}
	
	/**
	 * Returns true if provided
	 * another rectangle whose 
	 * lower-left and upper-right
	 * points are equal to this
	 * rectangle
	 * 
	 * @param o another object
	 * @return true if the same rectangle
	 */
	@Override
	public boolean equals(Object o) {
		return false; // replace with your code
	}
	
	/**
	 * Gets the lower-left corner
	 * 
	 * @return lower-left corner
	 */
	public Point2D getLowerLeft() {
		return null; // replace with your code
	}
	
	/**
	 * Gets the upper-right corner
	 * 
	 * @return upper-right corner
	 */
	public Point2D getUpperRight() {
		return null; // replace with your code
	}

    // hint: it may help to add a few private methods for distance between the two corners
    
	@Override
	public double getArea() {
		return 0; // replace with your code
	}

	@Override
	public double getPerimeter() {
		return 0; // replace with your code
	}

	@Override
	public Point2D getCenter() {
		return null; // replace with your code
	}

	@Override
	public Point2D[] getVertices() {
		return null; // replace with your code
	}

}
