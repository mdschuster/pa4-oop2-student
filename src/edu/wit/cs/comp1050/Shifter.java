package edu.wit.cs.comp1050;

//TODO: document this class
public class Shifter {
	
	// think about what class variables you will need here
	
	/**
	 * Number of letters in the English alphabet
	 */
	public static final int NUM_LETTERS = ('z' - 'a') + 1;
	
	/**
	 * Initializes the shifter
	 * 
	 * @param s encrypted string
	 */
	public Shifter(String s) {
		// replace with your code
	}
	
	/**
	 * Returns the result of shifting
	 * by a supplied amount
	 * 
	 * @param n number of places to shift 
	 * @return shifted string
	 */
	public String shift(int n) {
	    // hint: Math.floorMod() can be very helpful here
		return null; // replace with your code
	}
	
	/**
	 * Finds all shifts that contain
	 * the supplied substring
	 * 
	 * @param sub substring to find
	 * @return array of shifts (0-25) that contain the substring (in order)
	 */
	public int[] findShift(String sub) {
		// hint: use shift() and an ArrayList of ints
		return null; // replace with your code
	}

}
