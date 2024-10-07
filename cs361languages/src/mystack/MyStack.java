/**
 * 
 */
package mystack;

/**
 * @author Jonathan Lee
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO (DONE) To complete
		if (theStack != null) {
			T val = theStack.val;
			theStack = theStack.next;
			return val;
		}
		return null;
	}

	public void push(T v) {
		// TODO (DONE) To complete
		theStack = new MyNode<T>(v, theStack);
	}

	public void printStack() {
		MyNode<T> nextNode = theStack;
		while (nextNode != null) {
			System.out.println(nextNode.val);
			nextNode = nextNode.next;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO (DONE) To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		
		MyStack<Integer> intStack = new MyStack<Integer>();
		
		intStack.push(1);
		intStack.push(2);
		System.out.println("Push 1 and 2:");
		intStack.printStack();
		System.out.println();
		
		intStack.pop();
		System.out.println("Pop:");
		intStack.printStack();
		System.out.println();
		
		intStack.push(5);
		System.out.println("Push 5:");
		intStack.printStack();
		System.out.println();
		
		// TODO (DONE) To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		
		MyStack<Person> personStack = new MyStack<Person>();
		
		personStack.push(new Person("Jonathan", "Lee"));
		System.out.println("Push my name:");
		personStack.printStack();
		System.out.println();
		
		personStack.push(new Person("Christelle", "Scharffc"));
		System.out.println("Push my name:");
		personStack.printStack();
		System.out.println();
	}

}
