/**
 * 
 */
package Question3;

/**
 * @author j
 *
 */
public class GenericCircle <T extends Number> extends GeometricFigure3 {//  CLASS
	
	// VARIABLES
	private T radius;
	private T area;
	// end VARIABLES

	GenericCircle(T radius) { // CONSTRUCTOR
		this.radius = radius;
	} // end CONSTRUCTOR

	/**
	 * @return the radius
	 */
	public T getRadius() {
		return radius;
	}

	/**
	 * @return the area
	 */
	public T getArea() {
		return area;
	}
	/**
	 * @param the radius to set
	 */
	public void setRadius(T radius) {
		this.radius = radius;
	}
	
	// METHODS
	
	public NumberDouble calcArea() { // CALCAREA()
    	double area;
		area = PI * (Math.pow(radius.getNumber(), 2));
    	return new NumberDouble(area);// TODO Auto-generated method stub
    } // end CALCAREA
	
	 public void display() {  // DISPLAY()
	    	System.out.println("This is a circle with a radius of " +radius.getNumber()+ " and an area of " + calcArea().getNumber()); 
	    } // end DISPLAY
	 // end METHODS
	 
} // end CLASS
