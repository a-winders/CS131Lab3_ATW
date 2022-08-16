package arraylist;

/*
 * Class to represent different points on a three dimensional grid.
 */
public class PointThreeD {

	/*
	 * Instantiates our three direction variables.
	 */
	private double xPoint;
	private double yPoint;
	private double zPoint;
	// end instance fields
	
	/*
	 * Empty-argument constructor.
	 */
	public PointThreeD () {
	}	// end empty-argument constructor
	
	/*
	 * Preferred constructor for this object.
	 */
	public PointThreeD (double x, double y, double z) {
	}	// end preferred constructor

	/*
	 * Prints the toString method that contains data from our three variables.
	 */
	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
		
	}	// end toString
		
}	// end class
