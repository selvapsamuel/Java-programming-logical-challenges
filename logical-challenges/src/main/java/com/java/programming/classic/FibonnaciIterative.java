package com.java.programming.classic;

import java.util.Scanner;

public class FibonnaciIterative {
	int n1 = 0, n2 = 1, n3 = 0;

	private void fibonnaci(int n) {
		if (n < 2) {
			System.out.print(n1 + " "+n2);
			return;
		}

		for (int i = 2; i <= n; i++) {
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = null;
		FibonnaciIterative fibonnaciIterative = new FibonnaciIterative();
		try {
			scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			fibonnaciIterative.fibonnaci(n);
		} finally {
			scanner.close();
		}

	}

}
