
public class InnermostOutermost {
	public static int evaluation(int n, int m) {
		if (n == 0) {
			return 0;
		}
		return evaluation(n-1,evaluation(n,m));
	}
	
	public static void main(String[] args) {
		//If Java uses innermost evaluation it will enter an infinite loop and cause a stack overflow. Otherwise if everything works fine it indicates that Java uses outermost evaluation.
		try {
			System.out.println(evaluation(1,1));
			System.out.println("Java uses outermost evaluation.");
		}
		catch (StackOverflowError e) {
			System.out.println(e);
			System.out.println("Java uses innermost evaluation.");
		}
	}
}
