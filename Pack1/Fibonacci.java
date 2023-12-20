package Pack1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//

		Scanner kb = new Scanner(System.in);
		System.out.println("give me a number:");
		int n = kb.nextInt();
		long result = fibonacci(n);
		System.out.println("The " + n + "th term in the Fibonacci sequence is: " + result);
	}

	public static long fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
