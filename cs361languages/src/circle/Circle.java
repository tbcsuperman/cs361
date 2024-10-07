/**
 * 
 */
package circle;

/**
 * @author Jonathan Lee
 *
 */

// TODO (DONE) Complete the code

public class Circle extends GraphicObject implements Cloneable {

	// No use of encapsulation
	public double centerX, centerY;
	public double radius;
	public int windowNumber;

	/**
	 * 
	 */
	public Circle() {
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
		centerX = newX;
		centerY = newY;
	}

	// TODO (DONE) To complete
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
	@Override
	public String toString() {
		return "Circle: centerX = " + centerX + " centerY = " + centerY + " radius = " + radius;
	}

	// TODO (DONE) To complete
	// TODO (DONE) Be sure that you understand the difference between equals and ==
	// equals checks if the object has the same values while == checks if they are the same object in memory
	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
	public boolean equals(Circle obj) {
		if (centerX == obj.centerX || centerY == obj.centerY || radius == obj.radius) {
			return true;
		}
		return false;
	}

	// TODO (DONE) To complete
	/**
	 * @return an exact copy of the Circle that is a new instance 
	 */
	protected Circle clone() {
		Circle clone = new Circle();
		clone.centerX = centerX;
		clone.centerY = centerY;
		clone.radius = radius;
		return clone;
	}

}
