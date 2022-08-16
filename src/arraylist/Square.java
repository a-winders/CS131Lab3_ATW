package arraylist;

/*
 * Class that represents the side of a square.
 */
public class Square {

	/*
	 * Instantiates our "side" variable on the Square object.
	 */
	private double side;
	// end instance field
	
	/*
	 * Empty-argument constructor.
	 */
	public Square () {
		
	}	// end empty-argument constructor
	
	/*
	 * Preferred constructor for the Square object.
	 */
	public Square (double s) {
		
	}	// end preferred constructor

	/*
	 * Prints the toString method that contains data about which side of the square
	 * is represented.
	 */
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}	// end toString
	
	
}	//end class
