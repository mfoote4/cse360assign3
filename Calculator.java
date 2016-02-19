package cse360assign3;

/** Ordered list which allows for deletion, searching, and size change.
 * @author Michaela Foote
 * 		Pin: 312
 * @version February 18, 2016
 * 
 */
public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** Returns the correct total
	 * 
	 */
	public int getTotal () {
		return total;
	}
	
	/** Add the parameter to the total variable
	 *  @param value	value added to total
	 */
	public void add (int value) {
		total += value;
	}
	
	/** Subtract the parameter from the total variable 
	 *  @param value	value subtracted from total
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/** Multiply the total by the total by the parameter 
	 *  @param value	value multiplied by the total
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/** Divide the total by the parameter
	 *  @param value	value to divide the total by
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total/value;
	}
	
	/** Return a history of all actions as a String
	 * 
	 */
	public String getHistory () {
		return "";
	}
}
