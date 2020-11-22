package DynamicProgramming;

public class Fibonacci {

	public int calculateFibonacci(int n) {

		int[] fib = new int[n + 1];
		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		return fib[n];

	}

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		System.out.println(fib.calculateFibonacci(10));
	}

}
