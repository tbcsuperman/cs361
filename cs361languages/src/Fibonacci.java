
public class Fibonacci {
	public static int fibonacci(int n) {
		if (n < 0 || n > 46) {
			throw new IllegalArgumentException("n out of range");
		}
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		//This loop tests out the fibonacci function throughout the entire domain
		for (int i = 0; i <= 46; i++) {
			System.out.println("n = " + i + " : " + fibonacci(i));
		}
	}
}
