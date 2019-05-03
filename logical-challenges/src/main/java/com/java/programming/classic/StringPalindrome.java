package com.java.programming.classic;

import java.util.Scanner;

public class StringPalindrome {

	public boolean isPalindrome(String str) {

		if(str.length()==1)
			return true;
		
		int pointer = str.length()-1;
		
		for(int i=0;i<=str.length()/2;i++) {
			if(str.charAt(i) == str.charAt(pointer)) {
				pointer--;
			}else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringPalindrome stringPalindrome = new StringPalindrome();
		try {
			String str = scanner.nextLine();
			System.out.println(stringPalindrome.isPalindrome(str));
		}finally {
			scanner.close();
		}

	}

}
