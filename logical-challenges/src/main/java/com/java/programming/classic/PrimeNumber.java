package com.java.programming.classic;

import java.util.Scanner;

public class PrimeNumber {

	public boolean isPrime(int n) {

		if (n <= 2)
			return true;
		
		if (n % 2 == 0)
			return false;

		int sqrtN = (int) (Math.sqrt(n) + 1);

		for (int i = 3; i < sqrtN; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = null;
		PrimeNumber primeNumber = new PrimeNumber();
		try {
			scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			System.out.println(primeNumber.isPrime(n));
			;
		} finally {
			scanner.close();
		}

	}

}
