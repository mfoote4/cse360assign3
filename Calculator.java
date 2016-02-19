package cse360assign3;

/** Ordered list which allows for deletion, searching, and size change.
 * @author Michaela Foote
 * 		Pin: 312
 * @version February 18, 2016
 * 
 */
public class Calculator {

	private int total;
	public String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
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
		history = history + " + " + value;
	}
	
	/** Subtract the parameter from the total variable 
	 *  @param value	value subtracted from total
	 */
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;
	}
	
	/** Multiply the total by the total by the parameter 
	 *  @param value	value multiplied by the total
	 */
	public void multiply (int value) {
		total *= value;
		history = history + " * " + value;
	}
	
	/** Divide the total by the parameter
	 *  @param value	value to divide the total by
	 */
	public void divide (int value) {
		if(value == 0) {
			total = 0;
			history = history + " / " + 0;
		}
		else {
			total = total/value;
			history = history + " / " + value;
		}
	}
	
	/** Return a history of all actions as a String
	 * 
	 */
	public String getHistory () {
		return history;
	}
}
