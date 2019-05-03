package com.java.programming.classic;

import java.util.Scanner;

public class FactorialIterative {

	public int findFactorial(int n) {

		if (n <= 1)
			return 1;
		else {
			int temp=1;
			for(int i=2;i<=n;i++) {
				temp*=i;
			}
			return temp;
		}
			
	}

	public static void main(String[] args) {
		Scanner scanner = null;
		FactorialIterative factorialIterative = new FactorialIterative();
		try {
			scanner = new Scanner(System.in);
			int n = scanner.nextInt();

			int factorial = factorialIterative.findFactorial(n);
			System.out.println(factorial);
		} finally {
			scanner.close();
		}

	}

}
