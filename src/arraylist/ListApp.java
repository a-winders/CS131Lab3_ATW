package arraylist;
/*
 * Tests objects and methods from other classes in package.
 */
public class ListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Instantiates an array list that only accepts String-type objects.
		 */
		ArrayList<String> stringList = new ArrayList <String>();
		stringList.addItem("Adam");
		stringList.addItem("Nikki");
		stringList.addItem("Hei-Hei");
		stringList.addItem("Sophie");
		System.out.println(stringList.toString());
		/*
		 * Instantiates an array list that only accepts Square-type objects.
		 */
		ArrayList<Square> squareList = new ArrayList <Square>(2);
		squareList.addItem(null);
		squareList.addItem(null);
		System.out.println(squareList.toString());
		/*
		 * Instantiates an array list that only accepts PointThreeD-type objects.
		 */
		ArrayList<PointThreeD> pointList = new ArrayList <PointThreeD>(3);
		pointList.addItem(null);
		pointList.addItem(null);
		pointList.addItem(null);
		System.out.println(pointList.toString());
		
	}	// end main

}	// end class
