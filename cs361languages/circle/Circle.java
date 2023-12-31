/**
 * 
 */
package circle;

/**
 * @author ADD YOUR NAME
 *
 */

// TODO Complete the code

public class Circle extends GraphicObject {

	// No use of encapsulation
	public double centerX, centerY;
	public double radius;
	public int windowNumber;

	/**
	 * 
	 */
	public Circle() { //Just curious why is there no constructor, why is it constructed in main? Isn't this bad practice?
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	@Override
	void moveTo(int newX, int newY) {
		this.centerX = newX;
		this.centerY = newY;
	}

	// TODO To complete
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
	@Override
	public String toString() {
		return "center X = " + this.centerX + " centerY = " + this.centerY + " radius = " + this.radius;
	}

	// TODO To complete
	// TODO Be sure that you understand the difference between equals and ==
	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
	@Override
	public boolean equals(Object obj) {
		String thisStr = this.toString();
		String objStr = obj.toString();
		return thisStr == objStr;
	}
	
	
	// TODO To complete
	/**
	 * @return an exact copy of the Circle that is a new instance 
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Circle clone = new Circle();
		clone.centerX = this.centerX;
		clone.centerY = this.centerY;
		clone.radius = this.radius;
		return clone;
    }

}
