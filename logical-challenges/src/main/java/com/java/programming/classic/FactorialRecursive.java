package com.java.programming.classic;

import java.util.Scanner;

public class FactorialRecursive {

	public  int findFactorial(int n) {

		if (n <= 1)
			return 1;
		else
			return n * findFactorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = null;
		FactorialRecursive factorialRecursive = new FactorialRecursive();
		try {
			scanner = new Scanner(System.in);
			int n = scanner.nextInt();

			int factorial = factorialRecursive.findFactorial(n);
			System.out.println(factorial);
		} finally {
			scanner.close();
		}

	}

}
