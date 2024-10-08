/**
 * 
 */
package employee;

/**
 * @author Jonathan Lee
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO (DONE) To complete
		// emp3.whoAmI(); // prints EMPLOYEE because they are a standard employee
		// emp3.getHourlyRate(); // returns syntax error because Employee class don't have the field hourlyRate

		// TODO (DONE) To complete
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
		} else {
			System.out.println("emp3 not instance of part time employee");
		}

		// Downcasting 1
		// TODO (DONE) Uncomment and run the code
		PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		// TODO (DONE) To complete
		// This instruction compiles, but gets a runtime error
		// This instruction returns a ClassCastException at run time
		// because it is trying to cast a parent class to a child class which has an extra field that the parent class doesn't have
		// The Employee class doesn't have the hourlyRate field that the PartTimeEmployee class has

		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// TODO (DONE) Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
