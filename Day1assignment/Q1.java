package Day1assignment;

public class Q1 {

	public static void main(String[] args) {

		int n = 20;
		double average;
		System.out.println("The first 20 Fibonacci numbers are:");
		average = fibonacci(n);
		System.out.println("The average is " + average);
	}

	private static double fibonacci(int n) {
		double average;
		int f1 = 1;
		int f2 = 1;
		int sum = 0;
		int fn;
		System.out.print(f1 + " " + f2 + " ");
		for (int i = 1; i < 19; i++) {
			fn = f1 + f2;
			sum += f1 + f2;
			System.out.print(fn + " ");
			f1 = f2;
			f2 = fn;
		}
		System.out.println();
		average = (double) sum / n;
		return average;
	}

}
