/**
 * 
 */
package reflection;
import circle.ColoredCircle;

/**
 * @author Jonathan Lee
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO (DONE) To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		Class<?> current = o.getClass();
		while (current != null) {
			System.out.println(current.getName());
			current = current.getSuperclass();
		}
		System.out.println("\n");
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO (DONE) To complete
		// Print each method on one line
		// Use this EXACT format
		for (Method s : m) {
			System.out.println(s.toString());
		}
		System.out.println("\n");
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an objet of type String
		// TODO (DONE) To complete
		System.out.println("Methods of type String:");
		String s = new String();
		r.listMethods(s);
		
		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO (DONE) To complete
		System.out.println("Methods of type ColoredCircle:");
		ColoredCircle c = new ColoredCircle();
		r.listMethods(c);
		
	}

}
