package arraylist;

/*
 * Class to represent generic arrays that can be added to
 * with any object.
 * @author Adam Winders
 *
 */

import java.util.Arrays;
public class ArrayList<T> {
	
	/*
	 * Instance fields for this class.
	 */
	private final int DEFAULT_SIZE = 10;
   	private int currentItem = 0;
   	private T arList [];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
   	/*
   	 * Empty-argument constructor.	
   	 */
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

   	
   	/*
   	 * Preferred constructor for this object.
   	 */
  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
    }//end preferred constructor
	
  
  /*
   * Adds an item of any type to the arraylist, ar.List
   */
  	public boolean addItem (T item) {
  		currentItem = 0;
  		if (currentItem <= arList.length) {
  				currentItem = currentItem ++;
  				return true;
  		}
  		else {
  			return false;
  		}
  	}	// end addItem

  	/*
  	 * Prints a string of the toString methods from PointThreeD and Square classes,
  	 * and iterates through the internal array.
  	 */
	@Override
	public String toString() {
		return "ArrayList [DEFAULT_SIZE=" + DEFAULT_SIZE + ", currentItem=" + currentItem + ", arList="
				+ Arrays.toString(arList) + ", toString()=" + super.toString() + "]";
	}	// end toString

	
  	
  	
  
}//end class
