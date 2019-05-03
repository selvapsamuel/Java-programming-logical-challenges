package com.java.programming.classic;

import java.util.Scanner;

public class FibonnaciRecursive {

	private int fibonnaci(int n) {
		if (n<=1) {
			return n;
		}
		else {
			return fibonnaci(n-1) +fibonnaci(n-2);
		}
		 
	}
	public static void main(String[] args) {
		Scanner scanner=null;
		FibonnaciRecursive fibonnaciRecursive = new FibonnaciRecursive ();
		try {
			scanner = new Scanner (System.in);
			int n = scanner.nextInt();
			System.out.println(fibonnaciRecursive.fibonnaci(n));
		}finally {
		 scanner.close();
		}

	}

}
